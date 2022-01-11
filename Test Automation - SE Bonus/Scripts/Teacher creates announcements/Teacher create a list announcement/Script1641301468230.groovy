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

WebUI.setText(findTestObject('Object Repository/Teacher creates announcements/Page_Local Moodle Log in to the site/input_Username_username'), 
    'lcbinh')

WebUI.setEncryptedText(findTestObject('Object Repository/Teacher creates announcements/Page_Local Moodle Log in to the site/input_Password_password'), 
    'o5TCnEIIWq0Pz0TkrK1a2rpuWvRKVWz2')

WebUI.click(findTestObject('Object Repository/Teacher creates announcements/Page_Local Moodle Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Teacher creates announcements/Page_Nh ca ti/span_Nhp mn Cng ngh phn mm'))

WebUI.click(findTestObject('Object Repository/Teacher creates announcements/Page_Kha Nhp mn Cng ngh phn mm/span_Cc thng bo Din n'))

WebUI.click(findTestObject('Object Repository/Teacher creates announcements/Page_Cc thng bo/a_Thm mt ch  mi'))

WebUI.setText(findTestObject('Object Repository/Teacher creates announcements/Page_Cc thng bo/input_Tiu_subject'), 'Thông báo ')

WebUI.click(findTestObject('Object Repository/Teacher creates announcements/Page_Cc thng bo/input_Hu b_advancedadddiscussion'))

WebUI.setText(findTestObject('Object Repository/Teacher creates announcements/Page_NM CNPM Thm mt ch  mi/input_Tiu_subject'), 
    'Thông báo dạng bullet')

WebUI.click(findTestObject('Object Repository/Teacher creates announcements/Page_NM CNPM Thm mt ch  mi/button_Ni dung_yui_3_17_2_1_1641301275320_977'))

WebUI.setText(findTestObject('Object Repository/Teacher creates announcements/Page_NM CNPM Thm mt ch  mi/div_Thng bo 1Thng bo 2Thng bo 3'), 
    '<p dir="ltr" style="text-align: left;" id="yui_3_17_2_1_1641301275320_1445"><ul id="yui_3_17_2_1_1641301275320_988"><li id="yui_3_17_2_1_1641301275320_987" style="">Thông báo 1</li><li id="yui_3_17_2_1_1641301275320_987" style="">Thông báo 2</li><li id="yui_3_17_2_1_1641301275320_987" style="">Thông báo 3</li></ul></p>')

WebUI.setText(findTestObject('Object Repository/Teacher creates announcements/Page_NM CNPM Thm mt ch  mi/div_Thng bo 1Thng bo 2Thng bo 3'), 
    '<p dir="ltr" style="text-align: left;" id="yui_3_17_2_1_1641301275320_1445"><ul id="yui_3_17_2_1_1641301275320_988"><li id="yui_3_17_2_1_1641301275320_987" style="">Thông báo 1</li><li id="yui_3_17_2_1_1641301275320_987" style="">Thông báo 2</li><li id="yui_3_17_2_1_1641301275320_987" style="">Thông báo 3</li></ul></p>')

WebUI.click(findTestObject('Object Repository/Teacher creates announcements/Page_NM CNPM Thm mt ch  mi/input__submitbutton'))

WebUI.click(findTestObject('Object Repository/Teacher creates announcements/Page_Cc thng bo/a_Cng Bnh L'))

WebUI.click(findTestObject('Object Repository/Teacher creates announcements/Page_Cc thng bo/a_Thot'))

WebUI.click(findTestObject('Object Repository/Teacher creates announcements/Page_Local Moodle/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Teacher creates announcements/Page_Local Moodle Log in to the site/input_Username_username'), 
    'hs01')

WebUI.setEncryptedText(findTestObject('Object Repository/Teacher creates announcements/Page_Local Moodle Log in to the site/input_Password_password'), 
    'o5TCnEIIWq2SeGQhIMNXLQ==')

WebUI.click(findTestObject('Object Repository/Teacher creates announcements/Page_Local Moodle Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Teacher creates announcements/Page_Nh ca ti/span_Nhp mn Cng ngh phn mm'))

WebUI.click(findTestObject('Object Repository/Teacher creates announcements/Page_Kha Nhp mn Cng ngh phn mm/span_Cc thng bo Din n'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Teacher creates announcements/Page_Cc thng bo/a_Thng bo dng bullet'))

WebUI.click(findTestObject('Object Repository/Teacher creates announcements/Page_Cc thng bo/a_Thng bo dng bullet'))

WebUI.verifyElementText(findTestObject('Object Repository/Teacher creates announcements/Page_NM CNPM Thng bo dng bullet/h3_Thng bo dng bullet'), 
    'Thông báo dạng bullet')

WebUI.closeBrowser()

WebUI.closeBrowser()

