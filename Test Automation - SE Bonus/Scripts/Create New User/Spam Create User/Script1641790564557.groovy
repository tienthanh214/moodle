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

for (def index : (1..3)) {
    WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr My ch Ch  bo tr/span_Qun tr khu vc'))

    WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Tm kim/a_Thnh vin'))

    WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Tm kim/a_Thm thnh vin mi'))

    WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_Tn ti khon_username'), 
        'test_' + index.toString())

    WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/a_Click to enter text'))

    WebUI.setEncryptedText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_Mt khu mi_newpassword'), 
        'cvW8qx4B2o1gIDzvWT+0mQ==')

    WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_Tn m v tn_firstname'), 
        'Test ' + index.toString())

    WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_H_lastname'), 
        'Nguy???n')

    WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_a ch th in t_email'), 
        ('test_' + index.toString()) + '@gmail.com')

    WebUI.selectOptionByValue(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/select_Du a ch th in t ca ti            Cho_daca4a'), 
        '0', true)

    WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_TnhThnh ph_city'), 
        'H??? Ch?? Minh')

    WebUI.selectOptionByValue(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/select_Chn quc gia.            Afghanistan _0db63d'), 
        'VN', true)

    WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_a ch_submitbutton'))

    WebUI.navigateToUrl('http://localhost/admin/user.php')
}

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Tm kim/a_Qun tr Thnh vin'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Tm kim/span_Thot'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Local Moodle/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Local Moodle Log in to the site/input_Username_username'), 
    'test_2')

WebUI.setEncryptedText(findTestObject('Object Repository/Create New User/Page_Local Moodle Log in to the site/input_Password_password'), 
    'cvW8qx4B2o1gIDzvWT+0mQ==')

WebUI.click(findTestObject('Object Repository/Create New User/Page_Local Moodle Log in to the site/button_Log in'))

WebUI.verifyElementText(findTestObject('Object Repository/Create New User/Page_Nh ca ti/span_Test 2 Nguyn'), 'Test 2 Nguy???n')

WebUI.click(findTestObject('Object Repository/Create New User/Page_Nh ca ti/a_A2 Nguyn'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Nh ca ti/span_Thot'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Local Moodle/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Local Moodle Log in to the site/input_Username_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Create New User/Page_Local Moodle Log in to the site/input_Password_password'), 
    'bfAykA/oWJ09FXmiKh6lyuuLu8QhG1K5')

WebUI.click(findTestObject('Object Repository/Create New User/Page_Local Moodle Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Nh ca ti/span_Qun tr khu vc'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Tm kim/a_Thnh vin'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Tm kim/a_Hnh ng trn hng lot thnh vin'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _1ca8e5/select_c cha        khng cha        bng vi _49cfad'), 
    '0', true)

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _1ca8e5/input_Tn y  value_realname'), 
    'Test')

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _1ca8e5/input_a ch IP trc  value_addfilter'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _1ca8e5/input_Danh sch thnh vin c chn_addall'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _1ca8e5/select_Chn.        Xc nhn        Gi tin nhn_4dafb0'), 
    'delete', true)

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _1ca8e5/input_Vi cc thnh vin c chn_doaction'))

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _1ca8e5/button_C'))

WebUI.closeBrowser()

