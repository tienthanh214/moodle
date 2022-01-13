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

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_Tn ti khon_username'))

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_Tn ti khon_username'), 
    'test_fail')

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_Tn m v tn_firstname'), 
    '1')

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_H_lastname'), 
    '2')

WebUI.setText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_a ch th in t_email'), 
    'test_fail@gmail.com')

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/em_Click to enter text'))

WebUI.setEncryptedText(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_Mt khu mi_newpassword'), 
    'RigbBhfdqOBGNlJIWM1ClA==')

WebUI.click(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/input_a ch_submitbutton'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/div_Mt khu phi c t nht l 1 k t vit thng'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/div_Mt khu phi c t nht l 1 k t vit hoa'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Create New User/Page_Moodle Khu vc qun tr Thnh vin Ti khon _57274d/div_Mt khu phi c t nht l 1 k t dng ch'), 
    0)

WebUI.closeBrowser()

