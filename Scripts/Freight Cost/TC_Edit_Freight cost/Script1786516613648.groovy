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

WebUI.click(findTestObject('Settings/Freight Cost/Page_Pickup Tool  Test Environment/div_Freight Cost Heading Configuration'))

String fc = GlobalVariable.FC

WebUI.setText(findTestObject("Settings/Freight Cost/Page_Pickup Tool  Test Environment/input_Search"), fc)
WebUI.delay(10)

WebUI.click(findTestObject('Settings/Freight Cost/Page_Pickup Tool  Test Environment/button_edit'))

String new_random = CustomKeywords.'random.Random_num.randomNumber'()
String new_fc = " Edited AT" + new_random 

WebUI.setText(findTestObject("Object Repository/Settings/Freight Cost/Page_Pickup Tool  Test Environment/input_e.g. Freight Charges, Handling Fee"), new_fc)

GlobalVariable.FC = new_fc

WebUI.click(findTestObject("Object Repository/Settings/Freight Cost/Page_Pickup Tool  Test Environment/button_is Active"))

WebUI.delay(5)

WebUI.click(findTestObject("Object Repository/Settings/Freight Cost/Page_Pickup Tool  Test Environment/button_Save Changes"))

WebUI.delay(5)