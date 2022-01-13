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

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr My ch Ch  bo tr/span_Qun tr khu vc'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Tm kim/a_Thnh vin'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Tm kim/a_Thm thnh vin mi'))

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_Tn ti khon_username'), 
    'test_1')

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/a_Click to enter text'))

WebUI.setEncryptedText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_Mt khu mi_newpassword'), 
    'cvW8qx4B2o1gIDzvWT+0mQ==')

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_Tn m v tn_firstname'), 
    'A')

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_H_lastname'), 
    'Nguyễn')

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_a ch th in t_email'), 
    'test_1@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/select_Du a ch th in t ca ti            Cho_daca4a'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_TnhThnh ph_city'), 
    'Hồ Chí Minh')

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/select_Chn quc gia.            Afghanistan _0db63d'), 
    'VN', true)

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/a_Ty bin_1'))

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_KhoaPhngBan_department'), 
    'Công nghệ thông tin')

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_a ch_submitbutton'))

WebUI.navigateToUrl('http://localhost/admin/user.php')

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _9bfdd2/a_Qun tr Thnh vin'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _9bfdd2/span_Thot'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Local Moodle/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Local Moodle Log in to the site/input_Username_username'), 
    'test_1')

WebUI.setEncryptedText(findTestObject('Object Repository/Create New User/Page_Local Moodle Log in to the site/input_Password_password'), 
    'cvW8qx4B2o1gIDzvWT+0mQ==')

WebUI.click(findTestObject('Object Repository/Create New User/Page_Local Moodle Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Nh ca ti/a_A Nguyn'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Nh ca ti/a_H s'))

WebUI.verifyElementText(findTestObject('Object Repository/Create New User/Page_A Nguyn H s cng khai/h1_A Nguyn'), 'A Nguyễn')

WebUI.verifyElementText(findTestObject('Object Repository/Create New User/Page_A Nguyn H s cng khai/a_test_1gmail.com_1'), 
    'test_1@gmail.com')

WebUI.verifyElementText(findTestObject('Object Repository/Create New User/Page_A Nguyn H s cng khai/dd_Vit Nam'), 'Việt Nam')

WebUI.verifyElementText(findTestObject('Object Repository/Create New User/Page_A Nguyn H s cng khai/dd_H Ch Minh'), 'Hồ Chí Minh')

WebUI.click(findTestObject('Object Repository/Create New User/Page_A Nguyn H s cng khai/a_A Nguyn'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_A Nguyn H s cng khai/a_Thot'))

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

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _9bfdd2/button_Xo_1'))

WebUI.closeBrowser()

