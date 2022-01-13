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

WebUI.callTestCase(findTestCase('Admin Site/Login with Admin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Create User by CSV/Page_Moodle Khu vc qun tr Tm kim/span_Qun tr khu vc'))

WebUI.navigateToUrl('http://localhost/admin/search.php')

WebUI.click(findTestObject('Object Repository/Create User by CSV/Page_Moodle Khu vc qun tr Tm kim/a_Thnh vin'))

WebUI.click(findTestObject('Object Repository/Create User by CSV/Page_Moodle Khu vc qun tr Tm kim/a_Nhp danh sch thnh vin'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _cb1c9d/input_Tp tin_userfilechoose'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _cb1c9d/span_Tp tin ring t'))

WebUI.click(findTestObject('Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon Nhp danh sch thnh vin/div_Wikimedia_yui_3_17_2_1_1642067879076_656'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _cb1c9d/button_Chn tp ny'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create User by CSV/Page_Moodle Khu vc qun tr Thnh vin Ti khon _cb1c9d/select_,                                    t'), 
    'comma', true)

WebUI.click(findTestObject('Object Repository/Create User by CSV/Page_Moodle Khu vc qun tr Thnh vin Ti khon _cb1c9d/input_Xem trc cc dng_submitbutton'))

WebUI.click(findTestObject('Object Repository/Create User by CSV/Page_Moodle Khu vc qun tr Thnh vin Ti khon _cb1c9d/input_Xem trc cc dng_submitbutton'))

WebUI.click(findTestObject('Object Repository/Create User by CSV/Page_Moodle Khu vc qun tr Thnh vin Ti khon _cb1c9d/button_Tip tc'))

WebUI.click(findTestObject('Object Repository/Create User by CSV/Page_Moodle Khu vc qun tr Thnh vin Ti khon _cb1c9d/a_Qun tr Thnh vin'))

WebUI.click(findTestObject('Object Repository/Create User by CSV/Page_Moodle Khu vc qun tr Thnh vin Ti khon _cb1c9d/span_Thot'))

WebUI.click(findTestObject('Object Repository/Create User by CSV/Page_Local Moodle/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Create User by CSV/Page_Local Moodle Log in to the site/input_Username_username'), 
    'student2')

WebUI.setEncryptedText(findTestObject('Object Repository/Create User by CSV/Page_Local Moodle Log in to the site/input_Password_password'), 
    'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Create User by CSV/Page_Local Moodle Log in to the site/button_Log in'))

WebUI.verifyElementText(findTestObject('Object Repository/Create User by CSV/Page_i mt khu/h1_Student Two'), 'Student Two')

WebUI.closeBrowser()

