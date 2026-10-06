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

WebUI.click(findTestObject('Settings/Freight Warehouse/Page_Pickup Tool  Test Environment/button_Settings'))

WebUI.click(findTestObject('Settings/Freight Warehouse/Page_Pickup Tool  Test Environment/div_Freight Warehouse Configuration'))

WebUI.click(findTestObject('Settings/Freight Warehouse/Page_Pickup Tool  Test Environment/button_Add Freight Warehouse'))

//FW_AT_

String random = CustomKeywords.'random.Random_num.randomNumber'()

String code = "FW-AT_" + random
String name = "TestFW AT " + random

WebUI.setText(findTestObject("Object Repository/Settings/Freight Warehouse/Page_Pickup Tool  Test Environment/input__code"), code)

WebUI.setText(findTestObject("Object Repository/Settings/Freight Warehouse/Page_Pickup Tool  Test Environment/input__name"), name)

WebUI.setText(findTestObject("Object Repository/Settings/Freight Warehouse/Page_Pickup Tool  Test Environment/input__address_line_1"), Address1)

WebUI.setText(findTestObject("Object Repository/Settings/Freight Warehouse/Page_Pickup Tool  Test Environment/input_Address Line 2_address_line_2"), Address2)

CustomKeywords.'csc.CountryStateCity.selectByText'(
	findTestObject('Object Repository/Settings/Freight Warehouse/Page_Pickup Tool  Test Environment/button_Country'),
	'India'
)

CustomKeywords.'csc.CountryStateCity.selectByText'(
	findTestObject('Object Repository/Settings/Freight Warehouse/Page_Pickup Tool  Test Environment/button_State'),
	'Maharashtra'
)

CustomKeywords.'csc.CountryStateCity.selectByText'(
	findTestObject('Object Repository/Settings/Freight Warehouse/Page_Pickup Tool  Test Environment/button_City'),
	'Pune'
)

//String random = CustomKeywords.'random.Random_num.randomNumber'()
//String zip_code = random

WebUI.setText(findTestObject("Object Repository/Settings/Freight Warehouse/Page_Pickup Tool  Test Environment/input_zip-code"), zip_code)


WebUI.setText(findTestObject("Object Repository/Settings/Freight Warehouse/Page_Pickup Tool  Test Environment/input__responsible_person_name"), responsible_person)

WebUI.setText(findTestObject("Object Repository/Settings/Freight Warehouse/Page_Pickup Tool  Test Environment/input__mobile_no"), contact_number)

WebUI.click(findTestObject('Settings/Freight Warehouse/Page_Pickup Tool  Test Environment/button_Create AA_ASN for Inbound Orders'))

WebUI.click(findTestObject('Settings/Freight Warehouse/Page_Pickup Tool  Test Environment/button_QR Code'))
                                                                                                                     //     OR
//WebUI.click(findTestObject('Settings/Freight Warehouse/Page_Pickup Tool  Test Environment/button_1D Barcode'))
//
WebUI.click(findTestObject('Settings/Freight Warehouse/Page_Pickup Tool  Test Environment/button_Mask DID_PID on labels'))

WebUI.click(findTestObject('Settings/Freight Warehouse/Page_Pickup Tool  Test Environment/button_Create Freight Warehouse'))

