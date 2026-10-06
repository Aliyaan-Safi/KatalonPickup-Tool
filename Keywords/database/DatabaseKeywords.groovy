package database

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows


import java.sql.Connection
import java.sql.DriverManager
import java.sql.PreparedStatement
import java.sql.ResultSet
import java.sql.Timestamp

import internal.GlobalVariable

public class DatabaseKeywords {
	
	 private static final String URL =
        "jdbc:postgresql://localhost:5432/katalon_db"

    private static final String USER =
        "postgres"

    private static final String PASSWORD =
        "tsmentity02"


    // ============================================================
    // 1. TEST DATABASE CONNECTION
    // ============================================================

    @Keyword
    def testConnection() {

        Connection connection = null

        try {

            Class.forName("org.postgresql.Driver")

            connection = DriverManager.getConnection(
                URL,
                USER,
                PASSWORD
            )

            println("=================================")
            println("POSTGRESQL CONNECTION SUCCESSFUL")
            println("=================================")

        } finally {

            if (connection != null) {
                connection.close()
            }
        }
    }


    // ============================================================
    // 2. GET OR CREATE TEST SUITE
    // ============================================================

    @Keyword
    int getOrCreateTestSuite(String suiteName) {

        Connection connection = null
        PreparedStatement selectStatement = null
        PreparedStatement insertStatement = null
        ResultSet resultSet = null

        try {

            Class.forName("org.postgresql.Driver")

            connection = DriverManager.getConnection(
                URL,
                USER,
                PASSWORD
            )


            // First check whether the suite already exists

            String selectSql = """
                SELECT suite_id
                FROM test_suite
                WHERE suite_name = ?
            """

            selectStatement =
                connection.prepareStatement(selectSql)

            selectStatement.setString(1, suiteName)

            resultSet = selectStatement.executeQuery()


            if (resultSet.next()) {

                int suiteId =
                    resultSet.getInt("suite_id")

                println("Existing test suite found")
                println("Suite Name: " + suiteName)
                println("Suite ID: " + suiteId)

                return suiteId
            }


            // Suite does not exist, so create it

            String insertSql = """
                INSERT INTO test_suite
                (suite_name)
                VALUES (?)
                RETURNING suite_id
            """

            insertStatement =
                connection.prepareStatement(insertSql)

            insertStatement.setString(1, suiteName)

            resultSet =
                insertStatement.executeQuery()


            if (resultSet.next()) {

                int suiteId =
                    resultSet.getInt("suite_id")

                println("New test suite created")
                println("Suite Name: " + suiteName)
                println("Suite ID: " + suiteId)

                return suiteId
            }

        } finally {

            if (resultSet != null) {
                resultSet.close()
            }

            if (selectStatement != null) {
                selectStatement.close()
            }

            if (insertStatement != null) {
                insertStatement.close()
            }

            if (connection != null) {
                connection.close()
            }
        }

        return -1
    }


    // ============================================================
    // 3. CREATE TEST EXECUTION
    // ============================================================

    @Keyword
    int createTestExecution(
        int suiteId,
        Timestamp startTime
    ) {

        Connection connection = null
        PreparedStatement statement = null
        ResultSet resultSet = null

        try {

            Class.forName("org.postgresql.Driver")

            connection = DriverManager.getConnection(
                URL,
                USER,
                PASSWORD
            )


            String sql = """
                INSERT INTO test_execution
                (
                    suite_id,
                    start_time,
                    overall_status
                )
                VALUES (?, ?, ?)
                RETURNING execution_id
            """

            statement =
                connection.prepareStatement(sql)

            statement.setInt(1, suiteId)
            statement.setTimestamp(2, startTime)
            statement.setString(3, "RUNNING")


            resultSet =
                statement.executeQuery()


            if (resultSet.next()) {

                int executionId =
                    resultSet.getInt("execution_id")

                println("=================================")
                println("TEST EXECUTION CREATED")
                println("Execution ID: " + executionId)
                println("Suite ID: " + suiteId)
                println("=================================")

                return executionId
            }

        } finally {

            if (resultSet != null) {
                resultSet.close()
            }

            if (statement != null) {
                statement.close()
            }

            if (connection != null) {
                connection.close()
            }
        }

        return -1
    }


    // ============================================================
    // 4. SAVE TEST CASE RESULT
    // ============================================================

    @Keyword
    def saveTestCaseResult(
        int executionId,
        String testCaseName,
        String status,
        Timestamp startTime,
        Timestamp endTime,
        BigDecimal duration
    ) {

        Connection connection = null
        PreparedStatement statement = null

        try {

            Class.forName("org.postgresql.Driver")

            connection = DriverManager.getConnection(
                URL,
                USER,
                PASSWORD
            )


            String sql = """
                INSERT INTO test_case_result
                (
                    execution_id,
                    test_case_name,
                    status,
                    start_time,
                    end_time,
                    duration_seconds
                )
                VALUES (?, ?, ?, ?, ?, ?)
            """


            statement =
                connection.prepareStatement(sql)

            statement.setInt(1, executionId)
            statement.setString(2, testCaseName)
            statement.setString(3, status)
            statement.setTimestamp(4, startTime)
            statement.setTimestamp(5, endTime)
            statement.setBigDecimal(6, duration)


            statement.executeUpdate()


            println("=================================")
            println("TEST CASE RESULT SAVED")
            println("Test Case: " + testCaseName)
            println("Status: " + status)
            println("Execution ID: " + executionId)
            println("Duration: " + duration + " seconds")
            println("=================================")

        } finally {

            if (statement != null) {
                statement.close()
            }

            if (connection != null) {
                connection.close()
            }
        }
    }


    // ============================================================
    // 5. FINISH TEST EXECUTION
    // ============================================================

    @Keyword
    def finishTestExecution(
        int executionId,
        Timestamp endTime,
        String overallStatus
    ) {

        Connection connection = null
        PreparedStatement statement = null

        try {

            Class.forName("org.postgresql.Driver")

            connection = DriverManager.getConnection(
                URL,
                USER,
                PASSWORD
            )


            String sql = """
                UPDATE test_execution
                SET
                    end_time = ?,
                    overall_status = ?
                WHERE execution_id = ?
            """


            statement =
                connection.prepareStatement(sql)

            statement.setTimestamp(1, endTime)
            statement.setString(2, overallStatus)
            statement.setInt(3, executionId)


            statement.executeUpdate()


            println("=================================")
            println("TEST EXECUTION UPDATED")
            println("Execution ID: " + executionId)
            println("Overall Status: " + overallStatus)
            println("=================================")

        } finally {

            if (statement != null) {
                statement.close()
            }

            if (connection != null) {
                connection.close()
            }
        }
    }
}
