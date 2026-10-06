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


//WebUI.click(findTestObject('Settings/Hub Config/Page_Pickup Tool  Test Environment/button_Settings'))

WebUI.click(findTestObject('Object Repository/Settings/Freight Forwarder/Page_Pickup Tool  Test Environment/div_Freight Forwarder Configuration'))

String ff = GlobalVariable.FF

WebUI.setText(findTestObject("Object Repository/Settings/Freight Forwarder/Page_Pickup Tool  Test Environment/Search"), ff)
WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Settings/Freight Forwarder/Page_Pickup Tool  Test Environment/button_edit'))

String new_random = CustomKeywords.'random.Random_num.randomNumber'()
String new_ff_name = " Edited AT" + new_random
String new_scac = " Edited AT" + new_random
String new_mc_dot = " Edited AT" + new_random

WebUI.setText(findTestObject("Object Repository/Settings/Freight Forwarder/Page_Pickup Tool  Test Environment/Freight Forwarder Name"), new_ff_name)

GlobalVariable.FF = new_ff_name

CustomKeywords.'multi_select_dropdown.Dropdown.selectByIndexes'(findTestObject
	("Object Repository/Settings/Freight Forwarder/Page_Pickup Tool  Test Environment/button_3toneSLB_US_LAND"), [5,6])

WebUI.click(findTestObject("Object Repository/Settings/Freight Forwarder/Page_Pickup Tool  Test Environment/div_Close"))

WebUI.delay(5)

WebUI.setText(findTestObject("Object Repository/Settings/Freight Forwarder/Page_Pickup Tool  Test Environment/SCAC"), new_scac)

WebUI.setText(findTestObject("Object Repository/Settings/Freight Forwarder/Page_Pickup Tool  Test Environment/MC DOT"), new_mc_dot)

WebUI.click(findTestObject("Object Repository/Settings/Freight Forwarder/Page_Pickup Tool  Test Environment/button_is Active"))

WebUI.delay(5)

WebUI.click(findTestObject("Object Repository/Settings/Freight Forwarder/Page_Pickup Tool  Test Environment/button_Save Freight Forwarder"))

WebUI.delay(5)


