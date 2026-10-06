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

CustomKeywords.'login.LoginKeywords.login'(GlobalVariable.ADMIN_USERNAME, GlobalVariable.ADMIN_PASSWORD)

WebUI.click(findTestObject('Approval Flow/Page_Pickup Tool  Test Environment/button_Pending For Approval'))

WebUI.delay(3)

WebUI.click(findTestObject('Approval Flow/Page_Pickup Tool  Test Environment/button_checkbox'))

WebUI.click(findTestObject('Approval Flow/Page_Pickup Tool  Test Environment/button_Approve'))

WebUI.click(findTestObject('Approval Flow/Page_Pickup Tool  Test Environment/button_confirm'))

WebUI.delay(3)

WebUI.click(findTestObject('Approval Flow/Page_Pickup Tool  Test Environment/button_checkbox'))

WebUI.click(findTestObject('Approval Flow/Page_Pickup Tool  Test Environment/button_Approve'))

WebUI.delay(3)

WebUI.click(findTestObject('Approval Flow/Page_Pickup Tool  Test Environment/button_Create'))

WebUI.click(findTestObject('Approval Flow/Page_Pickup Tool  Test Environment/button_Console'))

WebUI.click(findTestObject('Approval Flow/Page_Pickup Tool  Test Environment/a_CN002753'))

CustomKeywords.'basic_single_select.SS_dropdown.selectByIndex'(findTestObject
	("Object Repository/Console/Page_Pickup Tool  Test Environment/button_FF"), 5)

WebUI.setText(findTestObject("Object Repository/Console/Page_Pickup Tool  Test Environment/input__date"), "09/20/2026T10:48:PM")

WebUI.delay(3)

String random = CustomKeywords.'random.Random_num.randomNumber'()

String cw_ref = random

WebUI.setText(findTestObject("Object Repository/Console/Page_Pickup Tool  Test Environment/input__cw ref"), cw_ref)


WebUI.delay(3)

WebUI.click(findTestObject("Object Repository/Console/Page_Pickup Tool  Test Environment/button_Save Changes"))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Console/Page_Pickup Tool  Test Environment/button_Finalize Console'))

WebUI.click(findTestObject('Approval Flow/Page_Pickup Tool  Test Environment/button_confirm_FinConsole'))

WebUI.delay(3)

WebUI.click(findTestObject('Approval Flow/Page_Pickup Tool  Test Environment/button_Pickup'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Approval Flow/Page_Pickup Tool  Test Environment/button_Freight Forwarder Assignedd'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Approval Flow/Page_Pickup Tool  Test Environment/button_checkboxFF'))

WebUI.click(findTestObject('Approval Flow/Page_Pickup Tool  Test Environment/button_Picked Up'))

WebUI.delay(3)

CustomKeywords.'date.DatePicker.selectDate'(findTestObject
	("Object Repository/Approval Flow/Page_Pickup Tool  Test Environment/button_Pick a date"),'29-09-2026')

WebUI.delay(3)

WebUI.click(findTestObject('Approval Flow/Page_Pickup Tool  Test Environment/button_Save'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Approval2/Page_Pickup Tool  Test Environment/button_Pickup Completed'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Approval Flow/Page_Pickup Tool  Test Environment/button_checkbox_1'))

WebUI.delay(3)

WebUI.click(findTestObject('Approval Flow/Page_Pickup Tool  Test Environment/button_Mark As At Customs'))

WebUI.delay(3)

WebUI.click(findTestObject('Approval Flow/Page_Pickup Tool  Test Environment/button_confirm1'))


WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Approval2/Page_Pickup Tool  Test Environment/button_checkbox_AC'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Approval2/Page_Pickup Tool  Test Environment/button_Mark As Customs Cleared'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Approval2/Page_Pickup Tool  Test Environment/button_Confirm'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Approval2/Page_Pickup Tool  Test Environment/button_checkbox_AC'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Approval2/Page_Pickup Tool  Test Environment/button_Out For Delivery'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Approval2/Page_Pickup Tool  Test Environment/button_Confirm'))

WebUI.delay(3)


WebUI.click(findTestObject('Object Repository/Approval2/Page_Pickup Tool  Test Environment/button_checkbox_AC'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Approval2/Page_Pickup Tool  Test Environment/button_Mark As Delivered'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Approval2/Page_Pickup Tool  Test Environment/button_Confirm'))

WebUI.delay(3)













