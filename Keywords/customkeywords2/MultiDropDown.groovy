package customkeywords2

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.llm.keyword.LlmKeywords as LLM
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class MultiDropDown {
	
	@Keyword
	
	def selectMultiDropdownOptions(
	
	TestObject dropdownObject,
	
	List<String> options
	
	) {
	
	
	
	// Open dropdown
	
	WebUI.waitForElementClickable(dropdownObject, 10)
	
	WebUI.scrollToElement(dropdownObject, 5)
	
	WebUI.click(dropdownObject)
	
	
	
	WebUI.delay(1)
	
	
	
	// Select each option
	
	options.each { optionText ->
	
	
	
	WebUI.comment("Selecting: " + optionText)
	
	
	
	TestObject option = new TestObject("MultiDropdown_${optionText}")
	
	
	
	option.addProperty(
	
	'xpath',
	
	ConditionType.EQUALS,
	
	"//*[normalize-space(text())='${optionText}']"
	
	)
	
	
	
	WebUI.waitForElementVisible(option, 10)
	
	WebUI.scrollToElement(option, 3)
	
	WebUI.click(option)
	
	
	
	WebUI.delay(0.5)
	
	}
	
	
	
	// Close dropdown
	
	TestObject closeButton = new TestObject("MultiDropdown_Close")
	
	
	
	closeButton.addProperty(
	
	'xpath',
	
	ConditionType.EQUALS,
	
	"//*[normalize-space(text())='Close']"
	
	)
	
	
	
	if (WebUI.verifyElementVisible(
	
	closeButton,
	
	FailureHandling.OPTIONAL)) {
	
	
	
	WebUI.click(closeButton)
	
	}
	
	}
	
	}


