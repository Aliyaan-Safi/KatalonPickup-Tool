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

WebUI.callTestCase(findTestCase("Test Cases/LoginFolder/Login"), null)

WebUI.click(findTestObject('Object Repository/Settings/button_Settings'))

WebUI.click(findTestObject("Object Repository/Settings/Admin and Ops Configuration/Admin_Ops_Create/div_OperationsAdmin User Configuration"))

WebUI.click(findTestObject("Object Repository/Settings/Admin and Ops Configuration/Admin_Ops_Create/button_Add New"))

WebUI.click(findTestObject("Object Repository/Settings/Admin and Ops Configuration/Admin_Ops_Create/button__role"))

WebUI.waitForElementVisible(findTestObject("Object Repository/Settings/Admin and Ops Configuration/Admin_Ops_Create/div_Admin"), 5)

WebUI.click(findTestObject("Object Repository/Settings/Admin and Ops Configuration/Admin_Ops_Create/div_Operations"))

CustomKeywords.'single_select_Ops_dropdown.Single_dropdown.selectByText'(
	findTestObject(
		'Object Repository/Settings/Admin and Ops Configuration/Admin_Ops_Create/button__access_level'
	),
	'S1'
)

WebUI.setText(findTestObject("Object Repository/Settings/Admin and Ops Configuration/Admin_Ops_Create/input__name"), name)

WebUI.setText(findTestObject("Object Repository/Settings/Admin and Ops Configuration/Admin_Ops_Create/input__username"), username)

WebUI.setEncryptedText(findTestObject("Object Repository/Settings/Admin and Ops Configuration/Admin_Ops_Create/input__password"), password)

WebUI.setEncryptedText(findTestObject("Object Repository/Settings/Admin and Ops Configuration/Admin_Ops_Create/input__confirm_pass"), password)



CustomKeywords.'multi_select_dropdown.Dropdown.selectByIndexes'(
	findTestObject('Object Repository/Settings/Admin and Ops Configuration/Admin_Ops_Create/button_Select hub'),
	[3,4]
)

WebUI.click(findTestObject("Object Repository/Settings/Admin and Ops Configuration/Admin_Ops_Create/div_Close"))

CustomKeywords.'multi_select_dropdown.Dropdown.selectByIndexes'(
	findTestObject('Object Repository/Settings/Admin and Ops Configuration/Admin_Ops_Create/button_Select Storerkey'),
	[2]
)

WebUI.click(findTestObject("Object Repository/Settings/Admin and Ops Configuration/Admin_Ops_Create/div_Close"))

CustomKeywords.'multi_select_dropdown.Dropdown.selectByIndexes'(
	findTestObject('Object Repository/Settings/Admin and Ops Configuration/Admin_Ops_Create/button_Select Warehouses'),
	[2]
)

WebUI.click(findTestObject("Object Repository/Settings/Admin and Ops Configuration/Admin_Ops_Create/div_Close"))

WebUI.click(findTestObject("Object Repository/Settings/Admin and Ops Configuration/Admin_Ops_Create/button_Create User"))


