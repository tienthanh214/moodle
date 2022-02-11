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

WebUI.click(findTestObject('Object Repository/create simple event/Page_Local Moodle/a_Log in (1)'))

WebUI.setText(findTestObject('Object Repository/create simple event/Page_Local Moodle Log in to the site/input_Username_username (1)'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/create simple event/Page_Local Moodle Log in to the site/input_Password_password (1)'), 
    'bfAykA/oWJ09FXmiKh6lyuuLu8QhG1K5')

WebUI.click(findTestObject('Object Repository/create simple event/Page_Local Moodle Log in to the site/button_Log in (1)'))

WebUI.verifyElementText(findTestObject('Object Repository/create simple event/Page_Nh ca ti/span_Lch'), 'Lịch')

WebUI.verifyElementClickable(findTestObject('Object Repository/create simple event/Page_Nh ca ti/span_Lch'))

WebUI.click(findTestObject('Object Repository/create simple event/Page_Nh ca ti/span_Lch'))

WebUI.click(findTestObject('Object Repository/create simple event/Page_Moodle Lch Xem chi tit thng Thng Hai 2022/button_S kin mi'))

WebUI.click(findTestObject('Object Repository/create simple event/Page_Moodle Lch Xem chi tit thng Thng Hai 2022/fieldset_Tiu  s kin                        _042335'))

WebUI.setText(findTestObject('Object Repository/create simple event/Page_Moodle Lch Xem chi tit thng Thng Hai 2022/input_Tiu  s kin_name'), 
    'THI CK')

WebUI.verifyElementText(findTestObject('Object Repository/create simple event/Page_Moodle Lch Xem chi tit thng Thng Hai 2022/button_Lu'), 
    'Lưu')

WebUI.verifyElementClickable(findTestObject('Object Repository/create simple event/Page_Moodle Lch Xem chi tit thng Thng Hai 2022/button_Lu'))

WebUI.click(findTestObject('Object Repository/create simple event/Page_Moodle Lch Xem chi tit thng Thng Hai 2022/button_Lu'))

WebUI.closeBrowser()

