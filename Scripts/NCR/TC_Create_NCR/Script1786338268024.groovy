import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
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


WebUI.callTestCase(findTestCase("Test Cases/LoginFolder/Login"), null, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('NCR/Page_Pickup Tool  Test Environment/button_NCR'))

WebUI.click(findTestObject('NCR/Page_Pickup Tool  Test Environment/New'))

WebUI.click(findTestObject('NCR/Page_Pickup Tool  Test Environment/button_Console'))

WebUI.click(findTestObject('NCR/Page_Pickup Tool  Test Environment/button_OrderOutbound'))

WebUI.click(findTestObject('NCR/Page_Pickup Tool  Test Environment/button_Pickup Request'))

WebUI.click(findTestObject('NCR/Page_Pickup Tool  Test Environment/button_PackageLabels'))

WebUI.click(findTestObject('NCR/Page_Pickup Tool  Test Environment/button_Others'))

WebUI.click(findTestObject('NCR/Page_Pickup Tool  Test Environment/button_NCR Category _'))

WebUI.click(findTestObject('NCR/Page_Pickup Tool  Test Environment/button_NCR Type _'))

WebUI.click(findTestObject('NCR/Page_Pickup Tool  Test Environment/button_Assignee role'))

WebUI.click(findTestObject('NCR/Page_Pickup Tool  Test Environment/Remarks'))

WebUI.click(findTestObject('NCR/Page_Pickup Tool  Test Environment/div_Drop photos or browse'))

//WebUI.click(findTestObject('NCR/Page_Pickup Tool  Test Environment/span_browse'))

WebUI.click(findTestObject('NCR/Page_Pickup Tool  Test Environment/New'))

