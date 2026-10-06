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
import com.kms.katalon.core.exception.StepFailedException

import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import com.kms.katalon.core.webui.driver.DriverFactory

import internal.GlobalVariable

public class SelectDateTime {
	
//	@Keyword
//	def selectDateTime(TestObject datePickerObject, String day, String hour, String minute) {
//
//		WebDriver driver = DriverFactory.getWebDriver()
//
//		// 1. Open date/time picker
//		WebUI.click(datePickerObject)
//
//		WebUI.delay(1)
//
//		// 2. Select DAY
//		String dayXPath =
//				"//button[@name='day' and not(@disabled) and normalize-space(text())='${day}']"
//
//		WebElement dayElement = driver.findElement(By.xpath(dayXPath))
//		dayElement.click()
//
//		WebUI.delay(1)
//
//		// 3. Select HOUR
//		String hourXPath =
//				"(//div[@data-radix-scroll-area-viewport])[1]//button[normalize-space(text())='${hour}']"
//
//		WebElement hourElement = driver.findElement(By.xpath(hourXPath))
//		hourElement.click()
//
//		WebUI.delay(1)
//		
//		// 4. Select MINUTE
//		String minuteXPath =
//				"(//div[@data-radix-scroll-area-viewport])[2]//button[normalize-space(text())='${minute}']"
//
//		WebElement minuteElement = driver.findElement(By.xpath(minuteXPath))
//		minuteElement.click()
//
//		WebUI.delay(1)
//	}
	
	@Keyword
	def selectDateTime(TestObject dateTimeObject, String day, String hour, String minute) {
	
		WebUI.click(dateTimeObject)
	
		WebUI.delay(1)
	
		TestObject dayObject = new TestObject('dynamicDay')
	
		dayObject.addProperty(
			'xpath',
			ConditionType.EQUALS,
			"//button[@name='day' and normalize-space(.)='${day}']"
		)
	
		WebUI.click(dayObject)
	}

}
