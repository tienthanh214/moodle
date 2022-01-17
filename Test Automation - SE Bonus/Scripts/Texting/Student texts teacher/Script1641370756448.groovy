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

WebUI.click(findTestObject('Object Repository/Texting/Page_Local Moodle/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Texting/Page_Local Moodle Log in to the site/input_Username_username'), 
    'hs01')

WebUI.setEncryptedText(findTestObject('Object Repository/Texting/Page_Local Moodle Log in to the site/input_Password_password'), 
    'o5TCnEIIWq2SeGQhIMNXLQ==')

WebUI.click(findTestObject('Object Repository/Texting/Page_Local Moodle Log in to the site/button_Log in'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Texting/Page_Nh ca ti/i_See all_icon fa fa-comment fa-fw'))

WebUI.click(findTestObject('Object Repository/Texting/Page_Nh ca ti/i_See all_icon fa fa-comment fa-fw'))

WebUI.setText(findTestObject('Object Repository/Texting/Page_Nh ca ti/input_Messages selected_form-control'), 'Lê')

WebUI.verifyElementClickable(findTestObject('Object Repository/Texting/Page_Nh ca ti/i_Messages selected_icon fa fa-search fa-fw'))

WebUI.click(findTestObject('Object Repository/Texting/Page_Nh ca ti/i_Messages selected_icon fa fa-search fa-fw'))

WebUI.click(findTestObject('Object Repository/Texting/Page_Nh ca ti/h6_Cng Bnh L'))

WebUI.setText(findTestObject('Object Repository/Texting/Page_Nh ca ti/textarea_Use enter to send_yui_3_17_2_1_164_d197e1'), 
    'Hello world')

WebUI.verifyElementClickable(findTestObject('Object Repository/Texting/Page_Nh ca ti/i__icon fa fa-paper-plane fa-fw'))

WebUI.click(findTestObject('Object Repository/Texting/Page_Nh ca ti/i__icon fa fa-paper-plane fa-fw'))

WebUI.click(findTestObject('Object Repository/Texting/Page_Nh ca ti/a_Vn A Nguyn'))

WebUI.click(findTestObject('Object Repository/Texting/Page_Nh ca ti/span_Thot'))

WebUI.click(findTestObject('Object Repository/Texting/Page_Local Moodle/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Texting/Page_Local Moodle Log in to the site/input_Username_username'), 
    'lcbinh')

WebUI.setEncryptedText(findTestObject('Object Repository/Texting/Page_Local Moodle Log in to the site/input_Password_password'), 
    'o5TCnEIIWq0Pz0TkrK1a2rpuWvRKVWz2')

WebUI.click(findTestObject('Object Repository/Texting/Page_Local Moodle Log in to the site/button_Log in'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Texting/Page_Nh ca ti/i_See all_icon fa fa-comment fa-fw'))

WebUI.click(findTestObject('Object Repository/Texting/Page_Nh ca ti/i_See all_icon fa fa-comment fa-fw'))

WebUI.setText(findTestObject('Object Repository/Texting/Page_Nh ca ti/input_Messages selected_form-control'), 'Nguyen Van A')

WebUI.verifyElementClickable(findTestObject('Object Repository/Texting/Page_Nh ca ti/i_Messages selected_icon fa fa-search fa-fw'))

WebUI.click(findTestObject('Object Repository/Texting/Page_Nh ca ti/i_Messages selected_icon fa fa-search fa-fw'))

WebUI.click(findTestObject('Object Repository/Texting/Page_Nh ca ti/a_Nguyen Van A_1'))

WebUI.verifyElementText(findTestObject('Object Repository/Texting/Page_Nh ca ti/span_Hello world'), 'Hello world')

WebUI.click(findTestObject('Object Repository/Texting/Page_Nh ca ti/span_Hello world'))

WebUI.verifyElementText(findTestObject('Object Repository/Texting/Page_Nh ca ti/p_Hello world'), 'Hello world')

WebUI.closeBrowser()

