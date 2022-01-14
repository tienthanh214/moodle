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

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/a_M rng tt c'))

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_Tn ti khon_username'), 
    'test_3')

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/em_Click to enter text'))

WebUI.setEncryptedText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_Mt khu mi_newpassword'), 
    'cvW8qx4B2o1gIDzvWT+0mQ==')

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_Tn m v tn_firstname'), 
    'C')

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_H_lastname'), 
    'Nguyễn')

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_a ch th in t_email'), 
    'test_3@gmail.com')

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/select_Du a ch th in t ca ti            Cho_daca4a'), 
    '1', true)

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_TnhThnh ph_city'), 
    'Hà Nội')

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/select_Chn quc gia.            Afghanistan _0db63d'), 
    'VN', true)

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/div_Simple description'), 
    '<p dir="ltr" style="text-align: left;">Simple description</p>')

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/a_- Ko th khng c h tr_yui_3_17_2_1_16414382_45899b'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/span_Tp tin ring t'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/div_Wikimedia_yui_3_17_2_1_1641438294284_1691'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/button_Chn tp ny'))

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_M s ID_idnumber'), 
    '19120036')

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_C quan_institution'))

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_KhoaPhngBan_department'), 
    'Công nghệ thông tin')

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_in thoi_phone1'), 
    '0123456789')

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_in thoi di ng_phone2'), 
    '0989989998')

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_a ch_address'), 
    'Thủ Đức')

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_a ch_submitbutton'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _9bfdd2/a_Qun tr Thnh vin'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _9bfdd2/a_Thot'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Local Moodle/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Local Moodle Log in to the site/input_Username_username'), 
    'test_3')

WebUI.setEncryptedText(findTestObject('Object Repository/Create New User/Page_Local Moodle Log in to the site/input_Password_password'), 
    'cvW8qx4B2o1gIDzvWT+0mQ==')

WebUI.click(findTestObject('Object Repository/Create New User/Page_Local Moodle Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Nh ca ti/a_C Nguyn'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Nh ca ti/span_H s'))

WebUI.verifyElementText(findTestObject('Object Repository/Create New User/Page_C Nguyn H s cng khai/h1_C Nguyn'), 'C Nguyễn')

WebUI.verifyElementText(findTestObject('Object Repository/Create New User/Page_C Nguyn H s cng khai/a_test_3gmail.com'), 
    'test_3@gmail.com')

WebUI.verifyElementText(findTestObject('Object Repository/Create New User/Page_C Nguyn H s cng khai/dd_Vit Nam'), 'Việt Nam')

WebUI.verifyElementPresent(findTestObject('Object Repository/Create New User/Page_C Nguyn H s cng khai/img_Tp tin ring t_userpicture'), 
    0)

WebUI.click(findTestObject('Object Repository/Create New User/Page_C Nguyn H s cng khai/a_C Nguyn'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_C Nguyn H s cng khai/span_Thot'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Local Moodle/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Local Moodle Log in to the site/input_Username_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Create New User/Page_Local Moodle Log in to the site/input_Password_password'), 
    'bfAykA/oWJ09FXmiKh6lyuuLu8QhG1K5')

WebUI.click(findTestObject('Object Repository/Create New User/Page_Local Moodle Log in to the site/button_Log in'))

WebUI.click(findTestObject('Create New User/Page_Nh ca ti/span_Qun tr khu vc'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Tm kim/a_Thnh vin'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Tm kim/a_Xem danh sch thnh vin'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _9bfdd2/i_Vit Nam_icon fa fa-trash fa-fw'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _9bfdd2/button_Xo'))

WebUI.closeBrowser()

