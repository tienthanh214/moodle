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

WebUI.click(findTestObject('Object Repository/Page_Local Moodle/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Username_username'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Password_password'), 
    'bfAykA/oWJ09FXmiKh6lyuuLu8QhG1K5')

WebUI.click(findTestObject('Object Repository/Page_Local Moodle Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Nh ca ti/span_Qun tr khu vc'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Khu vc qun tr Tm kim/a_Thnh vin'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Khu vc qun tr Tm kim/a_Thm thnh vin mi'))

WebUI.setText(findTestObject('Object Repository/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_Tn ti khon_username'), 
    'test1')

WebUI.click(findTestObject('Object Repository/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/em_Click to enter text'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_Mt khu mi_newpassword'), 
    'x+SZwVplW7k5LzmlCHWNSA==')

WebUI.setText(findTestObject('Object Repository/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_Tn m v tn_firstname'), 
    'Test')

WebUI.setText(findTestObject('Object Repository/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_H_lastname'), 'Nguyễn')

WebUI.setText(findTestObject('Object Repository/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_a ch th in t_email'), 
    'abc@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/select_Du a ch th in t ca ti            Cho_daca4a'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_TnhThnh ph_city'), 
    'Huế')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/select_Chn quc gia.            Afghanistan _0db63d'), 
    'EG', true)

WebUI.click(findTestObject('Object Repository/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_a ch_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/i__icon fa fa-eye fa-fw'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/span_1a2B3c5D'))

WebUI.setText(findTestObject('Object Repository/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_Mt khu mi_newpassword_1'), 
    '1a2B3c5D$')

WebUI.click(findTestObject('Object Repository/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_a ch_submitbutton'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Khu vc qun tr Thnh vin Ti khon _9bfdd2/a_Qun tr Thnh vin'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Khu vc qun tr Thnh vin Ti khon _9bfdd2/a_Thot'))

WebUI.click(findTestObject('Object Repository/Page_Local Moodle/a_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Username_username'))

WebUI.setText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Username_username'), 'test1')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Password_password'), 
    'x+SZwVplW7mnGbPd4/Zybw==')

WebUI.click(findTestObject('Object Repository/Page_Local Moodle Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Page_Nh ca ti/a_Test Nguyn'))

WebUI.click(findTestObject('Object Repository/Page_Nh ca ti/span_H s'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Test Nguyn H s cng khai/h1_Test Nguyn'), 'Test Nguyễn')

WebUI.rightClick(findTestObject('Object Repository/Page_Test Nguyn H s cng khai/h1_Test Nguyn'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Test Nguyn H s cng khai/a_abcgmail.com'), 'abc@gmail.com')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Test Nguyn H s cng khai/dd_Ai Cp'), 'Ai Cập')

WebUI.verifyElementText(findTestObject('Object Repository/Page_Test Nguyn H s cng khai/dd_Hu'), 'Huế')

WebUI.closeBrowser()

