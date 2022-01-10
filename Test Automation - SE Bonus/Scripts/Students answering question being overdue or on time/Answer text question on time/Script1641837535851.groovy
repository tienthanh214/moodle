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

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Local Moodle/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Local Moodle Log in to the site/input_Username_username'), 
    'gv01')

WebUI.setEncryptedText(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Local Moodle Log in to the site/input_Password_password'), 
    'RigbBhfdqOAWw2eOk0+aVg==')

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Local Moodle Log in to the site/button_Log in'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Nh ca ti/span_Nhp mn cng ngh phn mm'))

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Nh ca ti/span_Nhp mn cng ngh phn mm'))

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Kha Nhp mn cng ngh phn mm/button_Bt ch  chnh sa'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Kha Nhp mn cng ngh phn mm/span_Thm hot ng hoc ti nguyn'))

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Kha Nhp mn cng ngh phn mm/span_Thm hot ng hoc ti nguyn'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Kha Nhp mn cng ngh phn mm/div_Bi tp'))

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Kha Nhp mn cng ngh phn mm/div_Bi tp'))

WebUI.setText(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Bin son Bi tp/input_Tn bi tp_name'), 
    'Trả lời câu hỏi trực tiếp')

WebUI.setText(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Bin son Bi tp/div_Tr li cu hi sau'), 
    '<p dir="ltr" style="text-align: left;">Trả lời câu hỏi sau</p>')

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Bin son Bi tp/input_Vn bn trc tuyn_assignsubmission_onlin_3ee3b4'))

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Bin son Bi tp/input_Upon activity completion_submitbutton'))

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_NM CNPM Tr li cu hi trc tip/a_Van A Nguyen'))

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_NM CNPM Tr li cu hi trc tip/a_Thot'))

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Local Moodle/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Local Moodle Log in to the site/input_Username_username'), 
    'hs01')

WebUI.setEncryptedText(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Local Moodle Log in to the site/input_Password_password'), 
    'RigbBhfdqOBGP4y92+oMSw==')

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Local Moodle Log in to the site/button_Log in'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Nh ca ti/span_Nhp mn cng ngh phn mm'))

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Nh ca ti/span_Nhp mn cng ngh phn mm'))

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Kha Nhp mn cng ngh phn mm/span_Tr li cu hi trc tip Bi tp'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Student answering question being overdue or on time/Page_NM CNPM Tr li cu hi trc tip/button_Thm bi np'))

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_NM CNPM Tr li cu hi trc tip/button_Thm bi np'))

WebUI.setText(findTestObject('Object Repository/Student answering question being overdue or on time/Page_NM CNPM Tr li cu hi trc tip - Sa bi lm/div_Hello world'), 
    '<p dir="ltr" style="text-align: left;">Hello world</p>')

WebUI.verifyElementClickable(findTestObject('Object Repository/Student answering question being overdue or on time/Page_NM CNPM Tr li cu hi trc tip - Sa bi lm/input_ang ti_submitbutton'))

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_NM CNPM Tr li cu hi trc tip - Sa bi lm/input_ang ti_submitbutton'))

WebUI.verifyElementText(findTestObject('Object Repository/Student answering question being overdue or on time/Page_NM CNPM Tr li cu hi trc tip/td_np  chm im'), 
    'Đã nộp để chấm điểm')

WebUI.verifyElementText(findTestObject('Object Repository/Student answering question being overdue or on time/Page_NM CNPM Tr li cu hi trc tip/td_Cha chm im'), 
    'Chưa chấm điểm')

WebUI.closeBrowser()

