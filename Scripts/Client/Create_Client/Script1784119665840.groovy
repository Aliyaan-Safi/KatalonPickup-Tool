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
import java.util.Random 




WebUI.click(findTestObject('Object Repository/Settings/button_Settings'))

WebUI.click(findTestObject("Object Repository/Settings/Client Configuration/Client Configuration"))


WebUI.click(findTestObject('Settings/Client Configuration/button_Add Client'))

def random = new Random().nextInt(1000)

 String client_code = "Client_" + random
 String client_name = "Client_" + random
 
WebUI.setText(findTestObject('Settings/Client Configuration/client_code'), client_code)

WebUI.setText(findTestObject('Settings/Client Configuration/client_name1'), client_name)

WebUI.click(findTestObject('Settings/Client Configuration/button_Create Client'))

//return client_code
GlobalVariable.CLIENT = client_code


