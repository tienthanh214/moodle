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

WebUI.click(findTestObject('Object Repository/Page_Local Moodle/a_Log in (24) (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Username_username (24) (1)'), 
    'robertle')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Password_password (24) (1)'), 
    'e0iuw4o+VG38P/PfCbIZUw==')

WebUI.click(findTestObject('Object Repository/Page_Local Moodle Log in to the site/button_Log in (24) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Nh ca ti/span_Trang ch h thng (3) (1)'))

WebUI.click(findTestObject('Page_Local Moodle/a_Software Engineering'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/button_Bt ch  chnh sa (13) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/span_Thm hot ng hoc ti nguyn (7) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/img_Thng tin v  Bi hc hot ng_icon icon (1) (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Bin son Bi tp/input_Tn bi tp_name (13) (1)'), 'PA1')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Bin son Bi tp/select_1        2        3        4        _45ea30 (2) (1)'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Bin son Bi tp/select_1        2        3        4        _45ea30_1 (2) (1)'), 
    '12', true)

WebUI.click(findTestObject('Object Repository/Page_Bin son Bi tp/input_M_cutoffdateenabled (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Bin son Bi tp/select_1        2        3        4        _45ea30_1_2 (2) (1)'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Bin son Bi tp/select_00        01        02        03    _f6e37b (1)'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Bin son Bi tp/select_00        01        02        03    _f6e37b_1 (1)'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Page_Bin son Bi tp/input_Vn bn trc tuyn_assignsubmission_onlin_3ee3b4 (2) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Bin son Bi tp/input_Np tp tin_assignsubmission_file_enabled (2) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Bin son Bi tp/input_M_assignsubmission_onlinetext_wordlim_e70110 (2) (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Bin son Bi tp/input_Gii hn t_assignsubmission_onlinetext__581726 (2) (1)'), 
    '300')

WebUI.click(findTestObject('Object Repository/Page_Bin son Bi tp/input_Upon activity completion_submitbutton2 (13) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/a_Robert Le (13) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/span_Thot (1) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Local Moodle/a_Log in (24) (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Username_username (24) (1)'), 
    'hocvien')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Password_password (24) (1)'), 
    'e0iuw4o+VG38P/PfCbIZUw==')

WebUI.click(findTestObject('Object Repository/Page_Local Moodle Log in to the site/button_Log in (24) (1)'))

WebUI.click(findTestObject('Object Repository/Page_Nh ca ti/span_Trang ch h thng (3) (1)'))

WebUI.click(findTestObject('Page_Local Moodle/a_Software Engineering'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/span_PA1 Bi tp (1)'))

WebUI.closeBrowser()

