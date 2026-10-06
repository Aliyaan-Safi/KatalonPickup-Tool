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



//WebUI.click(findTestObject('Object Repository/Settings/button_Settings'))

WebUI.click(findTestObject('Settings/Cost Centre Code/Page_Pickup Tool  Test Environment/div_Cost Centre Code Configuration'))

 String cc_code = GlobalVariable.CC_CODE 
//String cc_code = WebUI.callTestCase(findTestCase("Test Cases/Cost Centre Code/TC_Create_Cost Centre"), null, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject("Object Repository/Settings/Cost Centre Code/Page_Pickup Tool  Test Environment/Searchbox"), cc_code)

WebUI.click(findTestObject("Object Repository/Settings/Cost Centre Code/Page_Pickup Tool  Test Environment/First_cc"))

 String new_random = CustomKeywords.'random.Random_num.randomNumber'()

String new_plantId = "Edited AT" + new_random
String new_centre_code= "XYZ"
String new_ccc = "Edited AT" + new_random
String new_sloc = "E" + new_random

WebUI.setText(findTestObject("Object Repository/Settings/Cost Centre Code/Page_Pickup Tool  Test Environment/input_Plant ID"), new_plantId)

WebUI.setText(findTestObject("Object Repository/Settings/Cost Centre Code/Page_Pickup Tool  Test Environment/input_Centre Code"), new_centre_code)

WebUI.setText(findTestObject("Object Repository/Settings/Cost Centre Code/Page_Pickup Tool  Test Environment/input_Cost Centre Code"), new_ccc)

WebUI.setText(findTestObject("Object Repository/Settings/Cost Centre Code/Page_Pickup Tool  Test Environment/input_SLOC"), new_sloc)

WebUI.delay(5)

WebUI.click(findTestObject("Object Repository/Settings/Cost Centre Code/Page_Pickup Tool  Test Environment/button_is Active"))

WebUI.click(findTestObject("Object Repository/Settings/Cost Centre Code/Page_Pickup Tool  Test Environment/button_Save"))

WebUI.delay(5)