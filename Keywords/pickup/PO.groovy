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

public class PO {
	
	@Keyword
	def selectPO(TestObject dropdownObject, String poNumber) {
	
		// Step 1: Open PO dropdown
		WebUI.click(dropdownObject)
	
		// Step 2: Create dynamic object for the required PO
		TestObject poOption = new TestObject('dynamicPO')
	
		poOption.addProperty(
			'xpath',
			ConditionType.EQUALS,
			"//div[contains(@data-ref,'po.components.select-input.option') and normalize-space(.)='${poNumber}']"
		)
	
		// Step 3: Wait for PO option
		WebUI.waitForElementVisible(poOption, 10)
	
		// Step 4: Click PO option
		WebUI.click(poOption)
	}

}
