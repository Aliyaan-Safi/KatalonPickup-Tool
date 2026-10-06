import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject

import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.annotation.BeforeTestSuite
import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.AfterTestSuite
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.context.TestSuiteContext
import java.sql.Timestamp

class DatabaseResultListener {
	
	// Stores the execution ID for the current suite run
	private static int executionId = -1

	// Stores start time for each test case
	private static Map<String, Timestamp> testStartTimes =
		new HashMap<String, Timestamp>()

	// Stores statuses of test cases
	private static List<String> testStatuses =
		new ArrayList<String>()


	// ============================================================
	// TEST SUITE START
	// ============================================================

	@BeforeTestSuite
	def beforeTestSuite(TestSuiteContext testSuiteContext) {

		String suiteName =
			testSuiteContext.getTestSuiteId()


		println("========================================")
		println("TEST SUITE STARTED")
		println("Suite: " + suiteName)
		println("========================================")


		int suiteId =
			CustomKeywords.'database.DatabaseKeywords.getOrCreateTestSuite'(
				suiteName
			)


		Timestamp startTime =
			new Timestamp(System.currentTimeMillis())


		executionId =
			CustomKeywords.'database.DatabaseKeywords.createTestExecution'(
				suiteId,
				startTime
			)


		testStatuses.clear()
		testStartTimes.clear()


		println("Database Execution ID: " + executionId)
	}


	// ============================================================
	// TEST CASE START
	// ============================================================

	@BeforeTestCase
	def beforeTestCase(TestCaseContext testCaseContext) {

		String testCaseId =
			testCaseContext.getTestCaseId()


		Timestamp startTime =
			new Timestamp(System.currentTimeMillis())


		testStartTimes.put(
			testCaseId,
			startTime
		)


		println("========================================")
		println("TEST CASE STARTED")
		println("Test Case: " + testCaseId)
		println("========================================")
	}


	// ============================================================
	// TEST CASE FINISH
	// ============================================================

	@AfterTestCase
	def afterTestCase(TestCaseContext testCaseContext) {

		String testCaseId =
			testCaseContext.getTestCaseId()


		String status =
			testCaseContext.getTestCaseStatus()


		String message =
			testCaseContext.getMessage()


		Timestamp endTime =
			new Timestamp(System.currentTimeMillis())


		Timestamp startTime =
			testStartTimes.get(testCaseId)


		if (startTime == null) {

			startTime = endTime
		}


		BigDecimal duration =
			(endTime.getTime() - startTime.getTime()) / 1000.0


		testStatuses.add(status)


		println("========================================")
		println("TEST CASE FINISHED")
		println("Test Case: " + testCaseId)
		println("Status: " + status)
		println("Duration: " + duration + " seconds")
		println("========================================")


		CustomKeywords.'database.DatabaseKeywords.saveTestCaseResult'(
			executionId,
			testCaseId,
			status,
			startTime,
			endTime,
			duration
		)


		testStartTimes.remove(testCaseId)
	}


	// ============================================================
	// TEST SUITE FINISH
	// ============================================================

	@AfterTestSuite
	def afterTestSuite(TestSuiteContext testSuiteContext) {

		Timestamp endTime =
			new Timestamp(System.currentTimeMillis())


		String overallStatus = "PASSED"


		// If any test case failed or had an error,
		// mark the entire execution as FAILED.

		for (String status : testStatuses) {

			if (
				status == "FAILED" ||
				status == "ERROR"
			) {

				overallStatus = "FAILED"
				break
			}
		}


		println("========================================")
		println("TEST SUITE FINISHED")
		println("Execution ID: " + executionId)
		println("Overall Status: " + overallStatus)
		println("========================================")


		CustomKeywords.'database.DatabaseKeywords.finishTestExecution'(
			executionId,
			endTime,
			overallStatus
		)


		executionId = -1
		testStatuses.clear()
		testStartTimes.clear()
	}
}