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


WebUI.click(findTestObject('Object Repository/Settings/button_Settings (1)'))

WebUI.click(findTestObject('Object Repository/Settings/GL account/Page_Pickup Tool  Test Environment/div_GL Account Configuration'))

WebUI.click(findTestObject('Object Repository/Settings/GL account/Page_Pickup Tool  Test Environment/button_Add New'))

CustomKeywords.'basic_single_select.SS_dropdown.selectByIndex'(findTestObject
	("Object Repository/Settings/GL account/Page_Pickup Tool  Test Environment/button__shipment_type"), 2)

String random = CustomKeywords.'random.Random_num.randomNumber'()
String gl_code = "AT"+ random

WebUI.setText(findTestObject("Object Repository/Settings/GL account/Page_Pickup Tool  Test Environment/input__gl_code"), gl_code)

//WebUI.click(findTestObject('Settings/MOT/Page_Pickup Tool  Test Environment/button_is Active'))

WebUI.click(findTestObject('Object Repository/Settings/GL account/Page_Pickup Tool  Test Environment/button_Submit'))

GlobalVariable.GL= gl_code
