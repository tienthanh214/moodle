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

WebUI.click(findTestObject('Object Repository/Page_Local Moodle/a_Log in (13)'))

WebUI.setText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Username_username (13)'), 'robertle')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Password_password (13)'), 
    'e0iuw4o+VG38P/PfCbIZUw==')

WebUI.click(findTestObject('Object Repository/Page_Local Moodle Log in to the site/button_Log in (13)'))

WebUI.click(findTestObject('Object Repository/Page_Nh ca ti/span_Software Engineering'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Kha Software Engineering/h1_Software Engineering'), 'Software Engineering')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Kha Software Engineering/button_Bt ch  chnh sa'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Kha Software Engineering/button_Bt ch  chnh sa'), 'Bật chế độ chỉnh sửa')

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/button_Bt ch  chnh sa_1_2'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/span_Thm hot ng hoc ti nguyn (6)'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/div_Thng tin v  Bi hc hot ng_optionicon mt-_6d37dc (3)'))

WebUI.setText(findTestObject('Object Repository/Page_Bin son Bi tp/input_Tn bi tp_name (12)'), 'Assignment Full')

WebUI.setText(findTestObject('Object Repository/Page_Bin son Bi tp/div_To assignment y'), '<p dir="ltr" style="text-align: left;">Tạo assignment đầy đủ.</p>')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Bin son Bi tp/select_1        2        3        4        _45ea30 (1)'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Bin son Bi tp/select_1        2        3        4        _45ea30_1 (1)'), 
    '20', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Bin son Bi tp/select_1        2        3        4        _45ea30_1_2 (1)'), 
    '21', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Bin son Bi tp/select_1            2            3         _f84cd8 (1)'), 
    '15', true)

WebUI.click(findTestObject('Object Repository/Page_Bin son Bi tp/input_Cc loi tp tin c chp nhn_yui_3_17_2_1__c57195'))

WebUI.click(findTestObject('Object Repository/Page_Bin son Bi tp/input_All file types_yui_3_17_2_1_164191475_b6e702'))

WebUI.click(findTestObject('Object Repository/Page_Bin son Bi tp/input_tgz_yui_3_17_2_1_1641914753929_1776'))

WebUI.click(findTestObject('Object Repository/Page_Bin son Bi tp/button_Lu nhng thay i (3)'))

WebUI.click(findTestObject('Object Repository/Page_Bin son Bi tp/input_Upon activity completion_submitbutton2 (12)'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/a_Robert Le (12)'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/a_Thot (11)'))

WebUI.click(findTestObject('Object Repository/Page_Local Moodle/a_Log in (13)'))

WebUI.setText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Username_username (13)'), 'hocvien')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Password_password (13)'), 
    'e0iuw4o+VG38P/PfCbIZUw==')

WebUI.click(findTestObject('Object Repository/Page_Local Moodle Log in to the site/button_Log in (13)'))

WebUI.click(findTestObject('Object Repository/Page_Nh ca ti/span_Software Engineering'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/span_Assignment Full Bi tp'))

WebUI.closeBrowser()

