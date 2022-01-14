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

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Kha Nhp mn cng ngh phn mm/button_Bt ch  chnh sa'))

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Kha Nhp mn cng ngh phn mm/span_Thm hot ng hoc ti nguyn'))

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Kha Nhp mn cng ngh phn mm/a_Cc hot ng'))

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Kha Nhp mn cng ngh phn mm/a_Ti nguyn'))

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Kha Nhp mn cng ngh phn mm/a_Cc hot ng'))

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Kha Nhp mn cng ngh phn mm/div_Cu hi thm d'))

WebUI.setText(findTestObject('Object Repository/Students check events on calendar/Page_Bin son Cu hi thm d/input_Tn cu hi_name'), 
    'Câu hỏi thăm dò')

WebUI.setText(findTestObject('Object Repository/Students check events on calendar/Page_Bin son Cu hi thm d/div_Ni dung cu hi'), 
    '<p dir="ltr" style="text-align: left;">Nội dung câu hỏi</p>')

WebUI.setText(findTestObject('Object Repository/Students check events on calendar/Page_Bin son Cu hi thm d/input_Phng n khng_option0'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Students check events on calendar/Page_Bin son Cu hi thm d/input_Phng n khng_option1'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Students check events on calendar/Page_Bin son Cu hi thm d/input_Phng n khng_option2'), 
    '3')

WebUI.setText(findTestObject('Object Repository/Students check events on calendar/Page_Bin son Cu hi thm d/input_Phng n khng_option3'), 
    '4')

WebUI.setText(findTestObject('Object Repository/Students check events on calendar/Page_Bin son Cu hi thm d/input_Phng n khng_option4'), 
    '5')

WebUI.selectOptionByValue(findTestObject('Object Repository/Students check events on calendar/Page_Bin son Cu hi thm d/select_Khng            C'), 
    '1', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Students check events on calendar/Page_Bin son Cu hi thm d/select_Khng            C'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Bin son Cu hi thm d/a_Hiu lc'))

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Bin son Cu hi thm d/input_M_timecloseenabled'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Students check events on calendar/Page_Bin son Cu hi thm d/select_1        2        3        4        _45ea30'), 
    '8', true)

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Bin son Cu hi thm d/input_M_timeopenenabled'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Students check events on calendar/Page_Bin son Cu hi thm d/select_1        2        3        4        _45ea30_1'), 
    '8', true)

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Bin son Cu hi thm d/input_Upon activity completion_submitbutton'))

WebUI.verifyElementText(findTestObject('Object Repository/Students check events on calendar/Page_Cu hi thm d/h2_Cu hi thm d'), 
    'Câu hỏi thăm dò')

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Cu hi thm d/a_Van Luyen Le'))

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Cu hi thm d/a_Thot'))

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Local Moodle/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Students check events on calendar/Page_Local Moodle Log in to the site/input_Username_username'), 
    'hs01')

WebUI.setEncryptedText(findTestObject('Object Repository/Students check events on calendar/Page_Local Moodle Log in to the site/input_Password_password'), 
    'o5TCnEIIWq2SeGQhIMNXLQ==')

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Local Moodle Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Nh ca ti/a_8'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Students check events on calendar/Page_Moodle Lch Xem ngy Th By, 8 Thng Ging 2022/a_i ti hot ng'))

WebUI.click(findTestObject('Object Repository/Students check events on calendar/Page_Moodle Lch Xem ngy Th By, 8 Thng Ging 2022/a_i ti hot ng'))

WebUI.verifyElementText(findTestObject('Object Repository/Students check events on calendar/Page_Cu hi thm d/h2_Cu hi thm d'), 
    'Câu hỏi thăm dò')

WebUI.closeBrowser()

