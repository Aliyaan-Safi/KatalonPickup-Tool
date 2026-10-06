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



//CustomKeywords.'login.LoginKeywords.login'(GlobalVariable.ADMIN_USERNAME, GlobalVariable.ADMIN_PASSWORD)

WebUI.click(findTestObject('Settings/Supplier Configuration/Page_Pickup Tool  Test Environment/button_Settings'))

WebUI.click(findTestObject('Settings/Supplier Configuration/Page_Pickup Tool  Test Environment/div_Supplier Configuration'))

WebUI.delay(3)

WebUI.click(findTestObject('Settings/Supplier Configuration/Page_Pickup Tool  Test Environment/button_Add Supplier'))

WebUI.delay(3)

String random = CustomKeywords.'random.Random_num.randomNumber'()
String supplier_code = "AT" + random
String supplier_name = "AT" + random
String supplier_address = "AT" + random + random + random

WebUI.setText(findTestObject('Object Repository/Settings/Supplier Configuration/Page_Pickup Tool  Test Environment/input__supplier_code'),supplier_code)

WebUI.setText(findTestObject('Object Repository/Settings/Supplier Configuration/Page_Pickup Tool  Test Environment/input__name'),supplier_name)

CustomKeywords.'single_select_ClientParent_dropdown.Client_Parent_dropdown.selectByText'(
	findTestObject(
		'Object Repository/Settings/Supplier Configuration/Page_Pickup Tool  Test Environment/button_Select Associated Client_Parent'
	),
	'ADES US (ADES)'
)

WebUI.delay(3)

CustomKeywords.'multi_dropdown_withoutRoleAsOption.NoRole.selectByIndexes'(
    findTestObject('Object Repository/Settings/Supplier Configuration/Page_Pickup Tool  Test Environment/button_Linked to Storerkeys'),
    [2,3]
)

WebUI.delay(3)

WebUI.click(findTestObject("Object Repository/Settings/Supplier Configuration/Page_Pickup Tool  Test Environment/button_Close"))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/Settings/Supplier Configuration/Page_Pickup Tool  Test Environment/textarea__address'),supplier_address)

WebUI.click(findTestObject('Settings/Supplier Configuration/Page_Pickup Tool  Test Environment/button_Is Active'))

WebUI.delay(3)

WebUI.click(findTestObject('Settings/Supplier Configuration/Page_Pickup Tool  Test Environment/button_Create Supplier'))

WebUI.delay(3)

GlobalVariable.SUPPLIER=  supplier_code