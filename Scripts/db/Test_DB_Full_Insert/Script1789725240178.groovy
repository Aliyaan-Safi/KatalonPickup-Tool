import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

import java.sql.Timestamp

int suiteId =
	CustomKeywords.'database.DatabaseKeywords.getOrCreateTestSuite'(
		'Database Test Suite'
	)


Timestamp startTime =
	new Timestamp(System.currentTimeMillis())


int executionId =
	CustomKeywords.'database.DatabaseKeywords.createTestExecution'(
		suiteId,
		startTime
	)


Timestamp testStart =
	new Timestamp(System.currentTimeMillis())


// Simulate a test taking 2 seconds

WebUI.delay(2)


Timestamp testEnd =
	new Timestamp(System.currentTimeMillis())


BigDecimal duration =
	(testEnd.getTime() - testStart.getTime()) / 1000.0


CustomKeywords.'database.DatabaseKeywords.saveTestCaseResult'(
	executionId,
	'Database Test Case',
	'PASSED',
	testStart,
	testEnd,
	duration
)


Timestamp executionEnd =
	new Timestamp(System.currentTimeMillis())


CustomKeywords.'database.DatabaseKeywords.finishTestExecution'(
	executionId,
	executionEnd,
	'PASSED'
)