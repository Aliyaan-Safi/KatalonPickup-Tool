package basic_single_select

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class SS_dropdown {

	
 @Keyword
def selectByIndex(TestObject dropdown, int index) {

    // Open dropdown
    WebUI.click(dropdown)

    WebUI.delay(1)

    // Create the option object dynamically
    TestObject option = new TestObject()

    option.addProperty(
        "xpath",
        ConditionType.EQUALS,
        "(//*[@role='option'])[" + index + "]"
    )

    // Wait for the option
    WebUI.waitForElementVisible(option, 5)
    WebUI.waitForElementClickable(option, 5)

    // Click the actual option
    WebUI.click(option)
}
}
