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

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Tm kim/a_Thnh vin'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Tm kim/a_Thm thnh vin mi'))

WebUI.navigateToUrl('http://localhost/user/editadvanced.php?id=-1')

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_Tn ti khon_username'), 
    'teacher1')

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/em_Click to enter text'))

WebUI.setEncryptedText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_Mt khu mi_newpassword'), 
    'cvW8qx4B2o1gIDzvWT+0mQ==')

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_Tn m v tn_firstname'), 
    'Giáo Viên')

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_H_lastname'), 
    'Nguyễn')

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_a ch th in t_email'), 
    'teacher1@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/select_Chn quc gia.            Afghanistan _0db63d'), 
    'VN', true)

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_a ch_submitbutton'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Tm kim/a_Qun tr khu vc'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Tm kim/a_Thnh vin'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Tm kim/a_B nhim vai tr h thng'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Cc quyn _0b75ad/a_Gio vin bin son'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Cc quyn _0b75ad/select_Cng Bnh L (lcbinhgmail.com)    Gio V_c2eab4'), 
    '15', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Cc quyn _0b75ad/select_Cng Bnh L (lcbinhgmail.com)    Gio V_c2eab4'), 
    '15', true)

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Cc quyn _0b75ad/input_Khp k t tm kim  bt c mc c hin th no_add'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Cc quyn _0b75ad/a_Qun tr Thnh vin'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Cc quyn _0b75ad/span_Thot'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Local Moodle/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Local Moodle Log in to the site/input_Username_username'), 
    'teacher1')

WebUI.setEncryptedText(findTestObject('Object Repository/Create New User/Page_Local Moodle Log in to the site/input_Password_password'), 
    'cvW8qx4B2o1gIDzvWT+0mQ==')

WebUI.click(findTestObject('Object Repository/Create New User/Page_Local Moodle Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Nh ca ti/span_Qun tr khu vc'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Tm kim/a_Thmsa cc kho hc'), 
    0)

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Tm kim/a_Gio Vin Nguyn'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Tm kim/span_Thot'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Local Moodle/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Local Moodle Log in to the site/input_Username_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Create New User/Page_Local Moodle Log in to the site/input_Password_password'), 
    'bfAykA/oWJ09FXmiKh6lyuuLu8QhG1K5')

WebUI.click(findTestObject('Object Repository/Create New User/Page_Local Moodle Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Nh ca ti/span_Qun tr khu vc'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Tm kim/a_Thnh vin'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Tm kim/a_Xem danh sch thnh vin'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _9bfdd2/i_Vit Nam_icon fa fa-trash fa-fw'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _9bfdd2/button_Xo'))

WebUI.closeBrowser()

