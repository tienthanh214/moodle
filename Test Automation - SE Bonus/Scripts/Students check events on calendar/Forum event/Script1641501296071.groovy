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

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Local Moodle/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Students check events on calendar/Page_Local Moodle Log in to the site/input_Username_username'), 
    'gv01')

WebUI.setEncryptedText(findTestObject('Object Repository/Students check events on calendar/Page_Local Moodle Log in to the site/input_Password_password'), 
    'RigbBhfdqOBGP4y92+oMSw==')

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Local Moodle Log in to the site/button_Log in'))

WebUI.setText(findTestObject('Object Repository/Students check events on calendar/Page_Local Moodle Log in to the site/input_Username_username'), 
    'gv01')

WebUI.setEncryptedText(findTestObject('Object Repository/Students check events on calendar/Page_Local Moodle Log in to the site/input_Password_password'), 
    'RigbBhfdqOAWw2eOk0+aVg==')

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Local Moodle Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Nh ca ti/span_Nhp mn cng ngh phn mm'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Students check events on calendar/Page_Kha Nhp mn cng ngh phn mm/button_Bt ch  chnh sa'))

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Kha Nhp mn cng ngh phn mm/button_Bt ch  chnh sa'))

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Kha Nhp mn cng ngh phn mm/span_Thm hot ng hoc ti nguyn'))

WebUI.verifyElementText(findTestObject('Object Repository/Students check events on calendar/Page_Kha Nhp mn cng ngh phn mm/div_Din n'), 
    'Diễn đàn')

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Kha Nhp mn cng ngh phn mm/div_Din n'))

WebUI.setText(findTestObject('Object Repository/Students check events on calendar/Page_Bin son Din n/input_Tn  din n_name'), 
    'Bàn bạc chủ đề')

WebUI.setText(findTestObject('Object Repository/Students check events on calendar/Page_Bin son Din n/div_Bn bc ch'), 'Bàn bạc chủ đề<br><br>')

WebUI.verifyElementClickable(findTestObject('Object Repository/Students check events on calendar/Page_Bin son Din n/input_Upon activity completion_submitbutton'))

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Bin son Din n/input_Upon activity completion_submitbutton'))

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Bn bc ch/a_Van Luyen Le'))

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Bn bc ch/a_Thot'))

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Local Moodle/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Students check events on calendar/Page_Local Moodle Log in to the site/input_Username_username'), 
    'hs02')

WebUI.setEncryptedText(findTestObject('Object Repository/Students check events on calendar/Page_Local Moodle Log in to the site/input_Password_password'), 
    'RigbBhfdqOBGP4y92+oMSw==')

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Local Moodle Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Nh ca ti/span_Nhp mn cng ngh phn mm_1'))

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Kha Nhp mn cng ngh phn mm/span_Bn bc ch  Din n'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Students check events on calendar/Page_Bn bc ch/a_Thm mt ch  tho lun mi'))

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Bn bc ch/a_Thm mt ch  tho lun mi'))

WebUI.setText(findTestObject('Object Repository/Students check events on calendar/Page_Bn bc ch/input_Tiu_subject'), 'hello world')

WebUI.setText(findTestObject('Object Repository/Students check events on calendar/Page_Bn bc ch/div_Hello world'), '<p dir="ltr" style="text-align: left;">Hello world</p>')

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Bn bc ch/input_Ni dung_submitbutton'))

WebUI.closeBrowser()

