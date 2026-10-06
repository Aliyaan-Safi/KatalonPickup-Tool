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


//CustomKeywords.'login.LoginKeywords.login'()

WebUI.callTestCase(findTestCase("Test Cases/LoginFolder/Login"), null, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject("Object Repository/Settings/button_Settings"))

WebUI.click(findTestObject("Object Repository/Settings/Client Configuration/Client Configuration"))

WebUI.setText(findTestObject("Object Repository/Settings/Client Configuration/Search"), client_code)

WebUI.click(findTestObject("Object Repository/Settings/Client Configuration/link_client",
	[clientCode : client_code]))

WebUI.click(findTestObject('Object Repository/Settings/Client Configuration/Client user/button_Client Users'))

WebUI.click(findTestObject('Object Repository/Settings/Client Configuration/Client user/button_Add Client User'))

WebUI.setText(findTestObject('Settings/Client Configuration/Client user/Page_Pickup Tool  Test Environment/input_Name'),name)

WebUI.setText(findTestObject('Settings/Client Configuration/Client user/Page_Pickup Tool  Test Environment/input_Enter your username'),username)

WebUI.setEncryptedText(findTestObject('Settings/Client Configuration/Client user/Page_Pickup Tool  Test Environment/input_Enter your password'),password)

WebUI.setEncryptedText(findTestObject('Settings/Client Configuration/Client user/Page_Pickup Tool  Test Environment/input_Confirm Password'),password)

WebUI.click(findTestObject('Object Repository/Settings/Client Configuration/Client user/Select storerkey'))

WebUI.click(findTestObject('Object Repository/Settings/Client Configuration/Client user/storerkey_select'))

WebUI.click(findTestObject("Object Repository/Settings/Client Configuration/Client user/div_Close"))

WebUI.click(findTestObject('Object Repository/Settings/Client Configuration/Client user/Select supplier'))

WebUI.click(findTestObject("Object Repository/Settings/Client Configuration/Client user/div_TEST_SUPP (Test_supp)"))

WebUI.click(findTestObject("Object Repository/Settings/Client Configuration/Client user/div_Close_2nd"))

WebUI.click(findTestObject("Object Repository/Settings/Client Configuration/Client user/button_Submit_AU"))
