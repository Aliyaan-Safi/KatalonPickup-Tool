package pickup

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

public class PickupRequestDropdowns {
	
	@Keyword
	def selectDependentDropdown(
			TestObject dropdownObject,
			TestObject searchObject,
			String valueToSelect) {

		// Step 1: Open dropdown
		WebUI.click(dropdownObject)

		// Step 2: Wait for search box
		WebUI.waitForElementVisible(searchObject, 10)

		// Step 3: Enter value in search
		WebUI.click(searchObject)
		WebUI.setText(searchObject, valueToSelect)

		// Step 4: Create dynamic object for search result
		TestObject resultObject = new TestObject('dynamicResult')

		resultObject.addProperty(
			'xpath',
			ConditionType.EQUALS,
			"//*[normalize-space(text())='${valueToSelect}']"
		)

		// Step 5: Wait for result
		WebUI.waitForElementVisible(resultObject, 10)

		// Step 6: Click result
		WebUI.click(resultObject)

		// Step 7: Small wait for dependent dropdown to update
		WebUI.delay(1)
	}

}
