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

WebUI.click(findTestObject('Object Repository/Page_Local Moodle/a_Log in (11)'))

WebUI.setText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Username_username (11)'), 'robertle')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Password_password (11)'), 
    'e0iuw4o+VG38P/PfCbIZUw==')

WebUI.click(findTestObject('Object Repository/Page_Local Moodle Log in to the site/button_Log in (11)'))

WebUI.click(findTestObject('Object Repository/Page_Nh ca ti/span_Software Engineering'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/button_Bt ch  chnh sa (10)'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/button_Thm hot ng hoc ti nguyn (4)'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/div_Thng tin v  Bi hc hot ng_optionicon mt-_6d37dc (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Bin son Bi tp/input_Tn bi tp_name (10)'), 'B??i t???p v??n b???n')

WebUI.click(findTestObject('Object Repository/Page_Bin son Bi tp/input_Vn bn trc tuyn_assignsubmission_onlin_3ee3b4 (1)'))

WebUI.click(findTestObject('Object Repository/Page_Bin son Bi tp/input_Np tp tin_assignsubmission_file_enabled (1)'))

WebUI.click(findTestObject('Object Repository/Page_Bin son Bi tp/input_M_assignsubmission_onlinetext_wordlim_e70110 (1)'))

WebUI.setText(findTestObject('Object Repository/Page_Bin son Bi tp/input_Gii hn t_assignsubmission_onlinetext__581726 (1)'), 
    '300')

WebUI.click(findTestObject('Object Repository/Page_Bin son Bi tp/input_Upon activity completion_submitbutton2 (10)'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/a_Robert Le (10)'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/a_Thot (9)'))

WebUI.click(findTestObject('Object Repository/Page_Local Moodle/a_Log in (11)'))

WebUI.setText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Username_username (11)'), 'hocvien')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Password_password (11)'), 
    'e0iuw4o+VG38P/PfCbIZUw==')

WebUI.click(findTestObject('Object Repository/Page_Local Moodle Log in to the site/button_Log in (11)'))

WebUI.click(findTestObject('Object Repository/Page_Nh ca ti/span_Software Engineering'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/span_Bi tp vn bn'))

WebUI.verifyElementText(findTestObject('Page_SE Bi tp vn bn/h2_Bi tp vn bn'), 'B??i t???p v??n b???n')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_SE Bi tp vn bn/button_Thm bi np_1'))

WebUI.closeBrowser()

