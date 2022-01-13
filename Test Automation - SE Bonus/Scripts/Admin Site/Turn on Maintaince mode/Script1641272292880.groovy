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

WebUI.click(findTestObject('Object Repository/Admin Site/Page_Moodle Khu vc qun tr Tm kim/a_My ch'))

WebUI.click(findTestObject('Object Repository/Admin Site/Page_Moodle Khu vc qun tr Tm kim/a_Ch  bo tr'))

WebUI.navigateToUrl('http://localhost/admin/settings.php?section=maintenancemode')

WebUI.selectOptionByValue(findTestObject('Object Repository/Admin Site/Page_Moodle Khu vc qun tr My ch Ch  bo tr/select_Tt            M'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Admin Site/Page_Moodle Khu vc qun tr My ch Ch  bo tr/button_Lu cc thay i'))

WebUI.click(findTestObject('Object Repository/Admin Site/Page_Moodle Khu vc qun tr My ch Ch  bo tr -_346a94/a_Qun tr Thnh vin'))

WebUI.click(findTestObject('Object Repository/Admin Site/Page_Moodle Khu vc qun tr My ch Ch  bo tr -_346a94/a_Thot'))

WebUI.verifyElementText(findTestObject('Object Repository/Admin Site/Page_New Moodle Site - In maintenance mode/h2_The site is undergoing maintenance and i_04cd85'), 
    'The site is undergoing maintenance and is currently not available')

WebUI.click(findTestObject('Object Repository/Admin Site/Page_New Moodle Site - In maintenance mode/a_Data retention summary'))

WebUI.navigateToUrl('http://localhost/admin/tool/dataprivacy/summary.php')

WebUI.click(findTestObject('Object Repository/Admin Site/Page_Registry configuration summary - In ma_a4478e/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Admin Site/Page_New Moodle Site Log in to the site - I_a50ac0/input_Username_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Admin Site/Page_New Moodle Site Log in to the site - I_a50ac0/input_Password_password'), 
    'bfAykA/oWJ09FXmiKh6lyuuLu8QhG1K5')

WebUI.click(findTestObject('Object Repository/Admin Site/Page_New Moodle Site Log in to the site - I_a50ac0/button_Log in'))

WebUI.click(findTestObject('Object Repository/Admin Site/Page_Registry configuration summary - ang  _9bfae6/span_Qun tr khu vc'))

WebUI.click(findTestObject('Object Repository/Admin Site/Page_Moodle Khu vc qun tr Tm kim - ang  ch  bo tr/a_My ch'))

WebUI.click(findTestObject('Object Repository/Admin Site/Page_Moodle Khu vc qun tr Tm kim - ang  ch  bo tr/a_Ch  bo tr'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Admin Site/Page_Moodle Khu vc qun tr My ch Ch  bo tr -_346a94/select_Tt            M'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Admin Site/Page_Moodle Khu vc qun tr My ch Ch  bo tr/button_Lu cc thay i'))

WebUI.closeBrowser()

