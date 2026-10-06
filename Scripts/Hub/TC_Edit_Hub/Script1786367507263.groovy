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

WebUI.click(findTestObject('Settings/Hub Config/Page_Pickup Tool  Test Environment/div_Hub Configuration'))
String code = GlobalVariable.HUB_CODE

//String hub_code = WebUI.callTestCase(findTestCase("Test Cases/Hub/TC_Create_Hub"), null, FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject("Object Repository/Settings/Hub Config/Page_Pickup Tool  Test Environment/SearchBox"), code)

WebUI.click(findTestObject("Object Repository/Settings/Hub Config/Page_Pickup Tool  Test Environment/First_hub"))

String new_random = CustomKeywords.'random.Random_num.randomNumber'()

String new_code = "Edited AT" + new_random
String new_name = "Edited AT" + new_random
String new_location = "Edited Location"

WebUI.setText(findTestObject("Object Repository/Settings/Hub Config/Page_Pickup Tool  Test Environment/input_Hub Code"), new_code)

WebUI.setText(findTestObject("Object Repository/Settings/Hub Config/Page_Pickup Tool  Test Environment/input_Hub Name"), new_name)

WebUI.setText(findTestObject("Object Repository/Settings/Hub Config/Page_Pickup Tool  Test Environment/input_Hub Location"), new_location)

WebUI.click(findTestObject("Object Repository/Settings/Hub Config/Page_Pickup Tool  Test Environment/button_is Active"))

WebUI.click(findTestObject("Object Repository/Settings/Hub Config/Page_Pickup Tool  Test Environment/button_Save Changes"))

WebUI.delay(5)

