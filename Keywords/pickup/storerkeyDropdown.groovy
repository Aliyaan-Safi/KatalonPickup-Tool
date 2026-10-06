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

public class storerkeyDropdown {
	
	@Keyword
	def selectStorerkey(TestObject dropdownObject, String storerkey) {

		// Open Storerkey dropdown
		WebUI.click(dropdownObject)

		// Create dynamic object for the required Storerkey
		TestObject storerkeyOption = new TestObject('dynamicStorerkey')

		storerkeyOption.addProperty(
			'xpath',
			ConditionType.EQUALS,
			"//div[contains(@data-ref,'storerkey.components.select-input.option') and normalize-space(.)='${storerkey}']"
		)

		// Wait for option to appear
		WebUI.waitForElementVisible(storerkeyOption, 10)

		// Select the Storerkey
		WebUI.click(storerkeyOption)
	}

}
