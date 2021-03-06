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
    'RigbBhfdqOAWw2eOk0+aVg==')

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Local Moodle Log in to the site/button_Log in'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Students check events on calendar/Page_Nh ca ti/span_Nhp mn cng ngh phn mm'))

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Nh ca ti/span_Nhp mn cng ngh phn mm'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Students check events on calendar/Page_Kha Nhp mn cng ngh phn mm/button_Bt ch  chnh sa'))

WebUI.verifyElementText(findTestObject('Object Repository/Students check events on calendar/Page_Kha Nhp mn cng ngh phn mm/button_Bt ch  chnh sa'), 
    'B???t ch??? ????? ch???nh s???a')

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Kha Nhp mn cng ngh phn mm/button_Bt ch  chnh sa'))

WebUI.verifyElementText(findTestObject('Object Repository/Students check events on calendar/Page_Kha Nhp mn cng ngh phn mm/span_Thm hot ng hoc ti nguyn'), 
    'Th??m ho???t ?????ng ho???c t??i nguy??n')

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Kha Nhp mn cng ngh phn mm/span_Thm hot ng hoc ti nguyn'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Students check events on calendar/Page_Kha Nhp mn cng ngh phn mm/div_Bi tp'))

WebUI.verifyElementText(findTestObject('Object Repository/Students check events on calendar/Page_Kha Nhp mn cng ngh phn mm/div_Bi tp'), 
    'B??i t???p')

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Kha Nhp mn cng ngh phn mm/div_Bi tp'))

WebUI.setText(findTestObject('Object Repository/Students check events on calendar/Page_Bin son Bi tp/input_Tn bi tp_name'), 
    'B??i t???p quiz')

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Bin son Bi tp/p_Kim tra tnh nng'))

WebUI.setText(findTestObject('Object Repository/Students check events on calendar/Page_Bin son Bi tp/div_Kim tra tnh nng'), 
    'Ki???m tra t??nh n??ng')

WebUI.selectOptionByValue(findTestObject('Object Repository/Students check events on calendar/Page_Bin son Bi tp/select_1        2        3        4        _45ea30'), 
    '14', true)

WebUI.verifyElementText(findTestObject('Object Repository/Students check events on calendar/Page_Bin son Bi tp/input_Upon activity completion_submitbutton'), 
    '')

WebUI.verifyElementClickable(findTestObject('Object Repository/Students check events on calendar/Page_Bin son Bi tp/input_Upon activity completion_submitbutton'))

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Bin son Bi tp/input_Upon activity completion_submitbutton'))

WebUI.verifyElementText(findTestObject('Object Repository/Students check events on calendar/Page_NM CNPM Bi tp quiz/div_Kim tra tnh nng'), 
    'Ki???m tra t??nh n??ng')

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_NM CNPM Bi tp quiz/a_Van Luyen Le'))

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_NM CNPM Bi tp quiz/span_Thot'))

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Local Moodle/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Students check events on calendar/Page_Local Moodle Log in to the site/input_Username_username'), 
    'hs01')

WebUI.setEncryptedText(findTestObject('Object Repository/Students check events on calendar/Page_Local Moodle Log in to the site/input_Password_password'), 
    'o5TCnEIIWq2SeGQhIMNXLQ==')

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Local Moodle Log in to the site/button_Log in'))

WebUI.verifyElementClickable(findTestObject('Students check events on calendar/Page_Nh ca ti/a_14'))

WebUI.click(findTestObject('Students check events on calendar/Page_Nh ca ti/a_14'))

WebUI.verifyElementText(findTestObject('Object Repository/Students check events on calendar/Page_Moodle Lch Xem ngy Th Su, 14 Thng Ging 2022/a_Thm bi np'), 
    'Th??m b??i n???p')

WebUI.verifyElementClickable(findTestObject('Object Repository/Students check events on calendar/Page_Moodle Lch Xem ngy Th Su, 14 Thng Ging 2022/a_Thm bi np'))

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Moodle Lch Xem ngy Th Su, 14 Thng Ging 2022/a_Thm bi np'))

WebUI.verifyElementText(findTestObject('Object Repository/Students check events on calendar/Page_NM CNPM Bi tp quiz - Sa bi lm/h2_Bi tp quiz'), 
    'B??i t???p quiz')

WebUI.verifyElementText(findTestObject('Object Repository/Students check events on calendar/Page_NM CNPM Bi tp quiz - Sa bi lm/div_Kim tra tnh nng'), 
    'Ki???m tra t??nh n??ng')

WebUI.closeBrowser()

