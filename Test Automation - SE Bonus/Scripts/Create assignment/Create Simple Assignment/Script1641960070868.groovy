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

WebUI.click(findTestObject('Object Repository/Page_Local Moodle/a_Log in (7)'))

WebUI.setText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Username_username (7)'), 'robertle')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Password_password (7)'), 
    'e0iuw4o+VG38P/PfCbIZUw==')

WebUI.click(findTestObject('Object Repository/Page_Local Moodle Log in to the site/button_Log in (7)'))

WebUI.click(findTestObject('Page_Nh ca ti/span_Software Engineering'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/button_Bt ch  chnh sa (6)'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/button_Thm hot ng hoc ti nguyn (2)'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/a_Bi tp (4)'))

WebUI.setText(findTestObject('Object Repository/Page_Bin son Bi tp/input_Tn bi tp_name (6)'), 'Assignment 1')

WebUI.click(findTestObject('Object Repository/Page_Bin son Bi tp/input_Upon activity completion_submitbutton2 (6)'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/a_Robert Le (6)'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/a_Thot (5)'))

WebUI.click(findTestObject('Object Repository/Page_Local Moodle/a_Log in (7)'))

WebUI.setText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Username_username (7)'), 'hocvien')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Password_password (7)'), 
    'e0iuw4o+VG38P/PfCbIZUw==')

WebUI.click(findTestObject('Object Repository/Page_Local Moodle Log in to the site/button_Log in (7)'))

WebUI.click(findTestObject('Page_Nh ca ti/span_Software Engineering'))

