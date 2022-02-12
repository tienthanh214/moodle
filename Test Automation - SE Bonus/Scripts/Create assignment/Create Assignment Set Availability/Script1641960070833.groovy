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

WebUI.click(findTestObject('Object Repository/Page_Local Moodle/a_Log in (8)'))

WebUI.setText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Username_username (8)'), 'robertle')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Password_password (8)'), 
    'e0iuw4o+VG38P/PfCbIZUw==')

WebUI.click(findTestObject('Object Repository/Page_Local Moodle Log in to the site/button_Log in (8)'))

WebUI.click(findTestObject('Object Repository/Page_Nh ca ti/span_Software Engineering'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Kha Software Engineering/h1_Software Engineering'), 'Software Engineering')

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Kha Software Engineering/h1_Software Engineering'), 0)

WebUI.verifyElementNotClickable(findTestObject('Object Repository/Page_Kha Software Engineering/h1_Software Engineering'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/button_Bt ch  chnh sa (7)'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/span_Thm hot ng hoc ti nguyn (4)'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/a_Bi tp (5)'))

WebUI.setText(findTestObject('Object Repository/Page_Bin son Bi tp/input_Tn bi tp_name (7)'), 'Availability')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Bin son Bi tp/select_1        2        3        4        _45ea30'), 
    '12', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Bin son Bi tp/select_1        2        3        4        _45ea30_1'), 
    '19', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Bin son Bi tp/select_1        2        3        4        _45ea30_1_2'), 
    '20', true)

WebUI.click(findTestObject('Object Repository/Page_Bin son Bi tp/input_Upon activity completion_submitbutton2 (7)'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/a_Robert Le (7)'))

WebUI.click(findTestObject('Object Repository/Page_Kha Software Engineering/a_Thot (6)'))

WebUI.click(findTestObject('Object Repository/Page_Local Moodle/a_Log in (8)'))

WebUI.setText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Username_username (8)'), 'hocvien')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Password_password (8)'), 
    'e0iuw4o+VG38P/PfCbIZUw==')

WebUI.click(findTestObject('Object Repository/Page_Local Moodle Log in to the site/button_Log in (8)'))

WebUI.click(findTestObject('Object Repository/Page_Nh ca ti/span_Software Engineering'))

WebUI.closeBrowser()

