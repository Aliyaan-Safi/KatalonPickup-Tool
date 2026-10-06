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

WebUI.click(findTestObject('Object Repository/Settings/NCR Type/Page_Pickup Tool  Test Environment/div_NCR Type Configuration'))

String ncr_type= GlobalVariable.NCR_TYPE

WebUI.setText(findTestObject("Object Repository/Settings/NCR Type/Page_Pickup Tool  Test Environment/input_search"), ncr_type)
WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Settings/NCR Type/Page_Pickup Tool  Test Environment/button_edit'))

String new_random = CustomKeywords.'random.Random_num.randomNumber'()
String new_ncr_type = " Edited AT" + new_random

WebUI.setText(findTestObject("Object Repository/Settings/NCR Type/Page_Pickup Tool  Test Environment/input__ncr_type"), new_ncr_type)

GlobalVariable.NCR_TYPE = new_ncr_type

CustomKeywords.'multi_select_dropdown.Dropdown.selectByIndexes'(findTestObject
	("Object Repository/Settings/NCR Type/Page_Pickup Tool  Test Environment/button_Type to add"), [1,2])

WebUI.click(findTestObject("Object Repository/Settings/NCR Type/Page_Pickup Tool  Test Environment/div_Close"))

WebUI.click(findTestObject("Object Repository/Settings/NCR Type/Page_Pickup Tool  Test Environment/button_Pickup Request_is_active"))

WebUI.delay(5)

WebUI.click(findTestObject("Object Repository/Settings/NCR Type/Page_Pickup Tool  Test Environment/button_Save Changes"))

WebUI.delay(5)


