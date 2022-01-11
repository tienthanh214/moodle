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

WebUI.navigateToUrl('http://localhost/')

WebUI.click(findTestObject('Object Repository/Teacher creates announcements/Page_Local Moodle/a_Log in'))

WebUI.click(findTestObject('Object Repository/Teacher creates announcements/Page_Local Moodle Log in to the site/form_document.getElementById(anchor).value _70e5d4'))

WebUI.setText(findTestObject('Object Repository/Teacher creates announcements/Page_Local Moodle Log in to the site/input_Username_username'), 
    'lcbinh')

WebUI.setEncryptedText(findTestObject('Object Repository/Teacher creates announcements/Page_Local Moodle Log in to the site/input_Password_password'), 
    'o5TCnEIIWq0Pz0TkrK1a2rpuWvRKVWz2')

WebUI.click(findTestObject('Object Repository/Teacher creates announcements/Page_Local Moodle Log in to the site/button_Log in'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Teacher creates announcements/Page_Nh ca ti/span_Nhp mn Cng ngh phn mm'))

WebUI.click(findTestObject('Object Repository/Teacher creates announcements/Page_Nh ca ti/span_Nhp mn Cng ngh phn mm'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Teacher creates announcements/Page_Kha Nhp mn Cng ngh phn mm/span_Cc thng bo Din n'))

WebUI.click(findTestObject('Object Repository/Teacher creates announcements/Page_Kha Nhp mn Cng ngh phn mm/span_Cc thng bo Din n'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Teacher creates announcements/Page_Cc thng bo/a_Thm mt ch  mi'))

WebUI.click(findTestObject('Object Repository/Teacher creates announcements/Page_Cc thng bo/a_Thm mt ch  mi'))

WebUI.setText(findTestObject('Object Repository/Teacher creates announcements/Page_Cc thng bo/input_Tiu_subject'), 'Thông báo mới')

WebUI.setText(findTestObject('Object Repository/Teacher creates announcements/Page_Cc thng bo/div_Hello world'), '<p dir="ltr" style="text-align: left;">Hello world</p>')

WebUI.verifyElementClickable(findTestObject('Object Repository/Teacher creates announcements/Page_Cc thng bo/input_Ni dung_submitbutton'))

WebUI.click(findTestObject('Object Repository/Teacher creates announcements/Page_Cc thng bo/input_Ni dung_submitbutton'))

WebUI.verifyElementText(findTestObject('Object Repository/Teacher creates announcements/Page_Cc thng bo/a_Thng bo mi'), 
    'Thông báo mới')

WebUI.verifyElementClickable(findTestObject('Object Repository/Teacher creates announcements/Page_Cc thng bo/a_Thng bo mi'))

WebUI.click(findTestObject('Object Repository/Teacher creates announcements/Page_Cc thng bo/a_Thng bo mi'))

WebUI.verifyElementText(findTestObject('Object Repository/Teacher creates announcements/Page_NM CNPM Thng bo mi/h3_Thng bo mi'), 
    'Thông báo mới')

WebUI.closeBrowser()

