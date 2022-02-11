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

WebUI.click(findTestObject('Object Repository/Page_Local Moodle/a_Log in (12)'))

WebUI.setText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Username_username (12)'), 'robertle')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Password_password (12)'), 
    'e0iuw4o+VG38P/PfCbIZUw==')

WebUI.click(findTestObject('Object Repository/Page_Local Moodle Log in to the site/button_Log in (12)'))

WebUI.click(findTestObject('Object Repository/Page_Nh ca ti/span_Software Engineering'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/button_Bt ch  chnh sa (11)'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/button_Thm hot ng hoc ti nguyn (5)'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/div_Thng tin v  Bi hc hot ng_optionicon mt-_6d37dc (2)'))

WebUI.setText(findTestObject('Object Repository/Page_Bin son Bi tp/input_Tn bi tp_name (11)'), 'Type File')

WebUI.click(findTestObject('Object Repository/Page_Bin son Bi tp/input_Cc loi tp tin c chp nhn_yui_3_17_2_1__69c1f3'))

WebUI.click(findTestObject('Object Repository/Page_Bin son Bi tp/input_Cc loi tp tin c chp nhn_yui_3_17_2_1__e7c937'))

WebUI.click(findTestObject('Object Repository/Page_Bin son Bi tp/button_Lu nhng thay i (2)'))

WebUI.click(findTestObject('Object Repository/Page_Bin son Bi tp/input_Upon activity completion_submitbutton2 (11)'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/a_Robert Le (11)'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/a_Thot (10)'))

WebUI.click(findTestObject('Object Repository/Page_Local Moodle/a_Log in (12)'))

WebUI.setText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Username_username (12)'), 'hocvien')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Password_password (12)'), 
    'e0iuw4o+VG38P/PfCbIZUw==')

WebUI.click(findTestObject('Object Repository/Page_Local Moodle Log in to the site/button_Log in (12)'))

WebUI.click(findTestObject('Object Repository/Page_Nh ca ti/span_Software Engineering'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Kha Software Engineering/span_Type File Bi tp'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/span_Type File Bi tp'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_SE Type File/h2_Type File'), 'Type File')

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_SE Type File/button_Thm bi np_1'))

WebUI.click(findTestObject('Object Repository/Page_SE Type File/button_Thm bi np'))

WebUI.closeBrowser()

