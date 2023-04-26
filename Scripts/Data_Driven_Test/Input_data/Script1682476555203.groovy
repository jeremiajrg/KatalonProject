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

WebUI.openBrowser('')



for(def rowNum=2; rowNum<=findTestData("datainputform").getRowNumbers() ; rowNum++ )
{
	WebUI.navigateToUrl('https://demoqa.com/webtables')
	WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Add'))
	
	WebUI.click(findTestObject('Page_DEMOQA/input_First Name_firstName'))
	
	//WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_First Name_firstName'), FirstName)
	WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_First Name_firstName'), findTestData("datainputform").getValue(1, rowNum))
	
	
	WebUI.click(findTestObject('Page_DEMOQA/input_Last Name_lastName'))
	
	//WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Last Name_lastName'), LastName)
	WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Last Name_lastName'), findTestData("datainputform").getValue(2, rowNum))
	
	WebUI.click(findTestObject('Page_DEMOQA/input_Email_userEmail'))
	
	//WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Email_userEmail'), UserMail)
	WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Email_userEmail'), findTestData("datainputform").getValue(3, rowNum))
	
	WebUI.click(findTestObject('Page_DEMOQA/input_Age_age'))
	
	//WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Age_age'), Age)
	WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Age_age'), findTestData("datainputform").getValue(4, rowNum))
	
	WebUI.click(findTestObject('Page_DEMOQA/input_Salary_salary'))
	
	//WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Salary_salary'), Salary)
	WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Salary_salary'), findTestData("datainputform").getValue(5, rowNum))
	
	WebUI.click(findTestObject('Page_DEMOQA/input_Department_department'))
	
	//WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Department_department'), Department)
	WebUI.setText(findTestObject('Object Repository/Page_DEMOQA/input_Department_department'), findTestData("datainputform").getValue(6, rowNum))
	
	WebUI.click(findTestObject('Object Repository/Page_DEMOQA/button_Submit'))
	
}



