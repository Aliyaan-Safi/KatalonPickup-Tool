import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
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

WebUI.click(findTestObject('Pickup Request/Page_Pickup Tool  Test Environment/button_New Pickup Request'))

WebUI.delay(3)

WebUI.click(findTestObject('Pickup Request/Page_Pickup Tool  Test Environment/button_Linked to PO'))

WebUI.delay(3)

//Step 1
CustomKeywords.'pickup.PickupRequestDropdowns.selectDependentDropdown'(findTestObject('Object Repository/Pickup Request/Page_Pickup Tool  Test Environment/button_SELECT SUPPLIER'), 
    findTestObject('Object Repository/Pickup Request/Page_Pickup Tool  Test Environment/input__supplier_search'), 'BLUELINE MANUFACTURING LLC')

WebUI.delay(3)

CustomKeywords.'pickup.storerkeyDropdown.selectStorerkey'(findTestObject('Object Repository/Pickup Request/Page_Pickup Tool  Test Environment/button_SELECT STORERKEY'), 
    'SLB_US_1190_A050 - Houston Formation Eval. Center, Plant 1190')

WebUI.delay(3)

CustomKeywords.'pickup.PO.selectPO'(findTestObject('Object Repository/Pickup Request/Page_Pickup Tool  Test Environment/button_SELECT PO'), 
    '4584854506')

WebUI.delay(3)

WebUI.click(findTestObject('Pickup Request/Page_Pickup Tool  Test Environment/button_checkbox'))

WebUI.click(findTestObject('Pickup Request/Page_Pickup Tool  Test Environment/button_Next Step'))

WebUI.delay(3)

//Step 2
String random = CustomKeywords.'random.Random_num.randomNumber'()

String package_name = 'TEST AT' + random

String hs_code = random + random

String eccn = random + random

WebUI.click(findTestObject('Pickup Request/step 2/Page_Pickup Tool  Test Environment/button_Add Package'))

WebUI.delay(3)

WebUI.setText(findTestObject('Pickup Request/step 2/Page_Pickup Tool  Test Environment/input_Package Name'), package_name)

CustomKeywords.'basic_single_select.SS_dropdown.selectByIndex'(findTestObject('Object Repository/Pickup Request/step 2/Page_Pickup Tool  Test Environment/button_Package Type'), 
    1)

//WebUI.click(findTestObject('Pickup Request/Page_Pickup Tool  Test Environment/div_data-stateopen_animate-in data-stateclo'))
//
WebUI.setText(findTestObject('Pickup Request/step 2/Page_Pickup Tool  Test Environment/input_Length'), GlobalVariable.LENGTH)

WebUI.setText(findTestObject('Pickup Request/step 2/Page_Pickup Tool  Test Environment/input_Width'), GlobalVariable.WIDTH)

WebUI.setText(findTestObject('Pickup Request/step 2/Page_Pickup Tool  Test Environment/input_Height'), GlobalVariable.HEIGHT)

WebUI.delay(3)

CustomKeywords.'basic_single_select.SS_dropdown.selectByIndex'(findTestObject('Object Repository/Pickup Request/step 2/Page_Pickup Tool  Test Environment/button_UOM'), 
    3)

WebUI.delay(3)

WebUI.setText(findTestObject('Pickup Request/step 2/Page_Pickup Tool  Test Environment/input_Number of Packages to be added'), 
    '1')

WebUI.delay(3)

WebUI.click(findTestObject('Pickup Request/step 2/Page_Pickup Tool  Test Environment/button_Add Packages'))

WebUI.delay(3)

WebUI.click(findTestObject('Pickup Request/step 2/Page_Pickup Tool  Test Environment/button_Pack Lines'))

WebUI.click(findTestObject('Pickup Request/step 2/Page_Pickup Tool  Test Environment/button_checkbox_1'))

WebUI.setText(findTestObject('Pickup Request/step 2/Page_Pickup Tool  Test Environment/input_quantity'), '0.3')

WebUI.click(findTestObject('Pickup Request/step 2/Page_Pickup Tool  Test Environment/button_Add'))

WebUI.delay(3)

WebUI.click(findTestObject('Pickup Request/step 2/Page_Pickup Tool  Test Environment/button_Save'))

WebUI.delay(3)

WebUI.click(findTestObject('Pickup Request/step 2/Page_Pickup Tool  Test Environment/button_Add Details'))

WebUI.setText(findTestObject('Object Repository/Pickup Request/step 2/Page_Pickup Tool  Test Environment/input_HS Code_hs_code'), 
    hs_code)

WebUI.setText(findTestObject('Object Repository/Pickup Request/step 2/Page_Pickup Tool  Test Environment/input_ECCN_eccn'), 
    eccn)

WebUI.delay(3)

CustomKeywords.'basic_single_select.SS_dropdown.selectByIndex'(findTestObject('Object Repository/Pickup Request/step 2/Page_Pickup Tool  Test Environment/button_Country of Origin'), 
    3)

WebUI.click(findTestObject('Pickup Request/step 2/Page_Pickup Tool  Test Environment/button_Save_1'))

WebUI.delay(3)

WebUI.setText(findTestObject('Pickup Request/step 2/Page_Pickup Tool  Test Environment/input_file_weight'), '100')

WebUI.delay(3)

CustomKeywords.'basic_single_select.SS_dropdown.selectByIndex'(findTestObject('Object Repository/Pickup Request/step 2/Page_Pickup Tool  Test Environment/button_weight_units'), 
    1)

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Pickup Request/step 2/Page_Pickup Tool  Test Environment/button_Next Step_S2'))

WebUI.delay(3)

//Step 3
WebUI.uploadFile(findTestObject('Object Repository/Pickup Request/step 3/Page_Pickup Tool  Test Environment/input_commercial_inv'), 
    'C:\\Katalon documents\\Screenshot_205.png')

WebUI.delay(10)

WebUI.uploadFile(findTestObject('Object Repository/Pickup Request/step 3/Page_Pickup Tool  Test Environment/input_Packing_list'), 
    'C:\\Katalon documents\\Screenshot_204.png')

WebUI.delay(10)

WebUI.click(findTestObject('Object Repository/Pickup Request/step 3/Page_Pickup Tool  Test Environment/button_Next Step_S3'))

WebUI.delay(10)

//Step 4
WebUI.click(findTestObject('Object Repository/Pickup Request/step 4/Page_Pickup Tool  Test Environment/button_ship-from'))

WebUI.click(findTestObject('Object Repository/Pickup Request/step 4/Page_Pickup Tool  Test Environment/button_ship-to'))

WebUI.delay(3)

CustomKeywords.'date.DatePicker.selectDate'(findTestObject('Object Repository/Pickup Request/step 4/Page_Pickup Tool  Test Environment/button_dd-mm-yyyy'), 
    '29-09-2026')

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Pickup Request/step 4/Page_Pickup Tool  Test Environment/button_Next Step_S4'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Pickup Request/step 4/Page_Pickup Tool  Test Environment/button_Submit'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Pickup Request/step 4/Page_Pickup Tool  Test Environment/button_Confirm'))

WebUI.delay(3)

