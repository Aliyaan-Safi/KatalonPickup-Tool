package multi_select_dropdown

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

public class Dropdown {
	
//  @Keyword
//    def selectByIndex(TestObject dropdown, int index) {
//
//        WebUI.waitForElementClickable(dropdown, 10)
//        WebUI.click(dropdown)
//
//        WebUI.delay(1)
//
//        TestObject option = new TestObject()
//
//        option.addProperty(
//            "xpath",
//            ConditionType.EQUALS,
//            "(//div[@role='option'])[" + index + "]"
//        )
//
//        WebUI.waitForElementClickable(option, 10)
//        WebUI.click(option)
//    }
	
	@Keyword
	def selectByIndexes(TestObject dropdown, List<Integer> indexes) {
	
		WebUI.click(dropdown)
	
		for (int index : indexes) {
			TestObject option = new TestObject()
			option.addProperty(
				"xpath",
				ConditionType.EQUALS,
				"(//div[@role='option'])[" + index + "]"
			)
			WebUI.click(option)
		}
	}
}
