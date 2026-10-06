package date

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

import java.time.LocalDate
import java.time.format.DateTimeFormatter

import internal.GlobalVariable

public class DatePicker {
	
	

		
			 @Keyword
    def selectDate(TestObject dateField, String dateValue) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern('dd-MM-yyyy')
        LocalDate targetDate = LocalDate.parse(dateValue, formatter)

        // Open calendar
        WebUI.click(dateField)
        WebUI.delay(1)

        // Target month/year
        String targetMonth = targetDate.format(DateTimeFormatter.ofPattern('MMMM yyyy'))

        // Find month heading
        TestObject monthHeading = new TestObject('monthHeading')

        monthHeading.addProperty(
            'xpath',
            ConditionType.EQUALS,
            "//*[contains(text(),'${targetMonth}')]"
        )

        // Move forward until target month is displayed
        int attempts = 0
		
		while (!WebUI.verifyElementPresent(monthHeading, 1, com.kms.katalon.core.model.FailureHandling.OPTIONAL)
			&& attempts < 12) {

		TestObject nextMonth = new TestObject('nextMonth')

		nextMonth.addProperty(
			'xpath',
			ConditionType.EQUALS,
			"//button[contains(@aria-label,'next month') or contains(@aria-label,'Next month')]"
		)

		WebUI.click(nextMonth)

		WebUI.delay(0.5)

		attempts++
	}
	// Find target day dynamically
	TestObject day = new TestObject('targetDay')

	day.addProperty(
		'xpath',
		ConditionType.EQUALS,
		"//button[@name='day' and @role='gridcell' and normalize-space(text())='${targetDate.getDayOfMonth()}' and not(@disabled)]"
	)

	WebUI.waitForElementClickable(day, 10)
	WebUI.click(day)
	
	WebUI.delay(1)
	// Click hour 23
	TestObject hour = new TestObject('targetHour')
	
	hour.addProperty(
		'xpath',
		ConditionType.EQUALS,
		"//button[normalize-space(.)='12' and not(@name='day')]"
	)
	
	WebUI.waitForElementClickable(hour, 10)
	WebUI.click(hour)
	
	WebUI.delay(1)
	
	// Click minute 00
	TestObject minute = new TestObject('targetMinute')
	
	minute.addProperty(
		'xpath',
		ConditionType.EQUALS,
		"//button[normalize-space(.)='00' and not(@name='day')]"
	)
	
	WebUI.waitForElementClickable(minute, 10)
	WebUI.click(minute)
	
	WebUI.delay(1)


}
}
