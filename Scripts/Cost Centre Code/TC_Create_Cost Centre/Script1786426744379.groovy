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



WebUI.click(findTestObject('Object Repository/Settings/button_Settings'))

WebUI.click(findTestObject('Settings/Cost Centre Code/Page_Pickup Tool  Test Environment/div_Cost Centre Code Configuration'))

WebUI.click(findTestObject('Settings/Cost Centre Code/Page_Pickup Tool  Test Environment/button_Add New'))

String random = CustomKeywords.'random.Random_num.randomNumber'()

String plant_id = "AT" + random
String centre_code = "ABC"
String cost_centre_code = "AT" + random
String sloc = "B" + random

WebUI.setText(findTestObject("Object Repository/Settings/Cost Centre Code/Page_Pickup Tool  Test Environment/input_Plant ID"), plant_id)

WebUI.setText(findTestObject("Object Repository/Settings/Cost Centre Code/Page_Pickup Tool  Test Environment/input_Centre Code"), centre_code)

WebUI.setText(findTestObject("Object Repository/Settings/Cost Centre Code/Page_Pickup Tool  Test Environment/input_Cost Centre Code"), cost_centre_code)

WebUI.setText(findTestObject("Object Repository/Settings/Cost Centre Code/Page_Pickup Tool  Test Environment/input_SLOC"), sloc)

//WebUI.click(findTestObject('Settings/Cost Centre Code/Page_Pickup Tool  Test Environment/button_is Active'))

WebUI.click(findTestObject('Settings/Cost Centre Code/Page_Pickup Tool  Test Environment/button_Submit'))

GlobalVariable.CC_CODE = plant_id



