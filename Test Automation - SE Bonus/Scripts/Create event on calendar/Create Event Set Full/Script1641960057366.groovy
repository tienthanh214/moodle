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

WebUI.click(findTestObject('Object Repository/Page_Local Moodle/a_Log in (16)'))

WebUI.setText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Username_username (16)'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Local Moodle Log in to the site/input_Password_password (16)'), 
    'bfAykA/oWJ09FXmiKh6lyuuLu8QhG1K5')

WebUI.click(findTestObject('Object Repository/Page_Local Moodle Log in to the site/button_Log in (16)'))

WebUI.click(findTestObject('Object Repository/Page_Nh ca ti/a_Lch (3)'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Lch Xem chi tit thng Thng Ging 2022/button_S kin mi (3)'))

WebUI.setText(findTestObject('Object Repository/Page_Moodle Lch Xem chi tit thng Thng Ging 2022/input_Tiu  s kin_name (3)'), 
    'Seminar')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Moodle Lch Xem chi tit thng Thng Ging 2022/select_1        2        3        4        _45ea30 (3)'), 
    '16', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Moodle Lch Xem chi tit thng Thng Ging 2022/select_00        01        02        03    _f6e37b (2)'), 
    '8', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Moodle Lch Xem chi tit thng Thng Ging 2022/select_00        01        02        03    _f6e37b_1 (2)'), 
    '15', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Moodle Lch Xem chi tit thng Thng Ging 2022/select_Thnh vin            Kho hc          _5efb09 (3)'), 
    'course', true)

WebUI.click(findTestObject('Object Repository/Page_Moodle Lch Xem chi tit thng Thng Ging 2022/span__1_2_3_4'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Lch Xem chi tit thng Thng Ging 2022/li_Software Engineering_1_2_3'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Moodle Lch Xem chi tit thng Thng Ging 2022/select_Software Engineering'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Page_Moodle Lch Xem chi tit thng Thng Ging 2022/a_Show more (2)'))

WebUI.click(findTestObject('Object Repository/Page_Moodle Lch Xem chi tit thng Thng Ging 2022/p'))

WebUI.setText(findTestObject('Object Repository/Page_Moodle Lch Xem chi tit thng Thng Ging 2022/div_Gii p thc mc  n'), 'Giải đáp thắc mắc đồ án')

WebUI.click(findTestObject('Object Repository/Page_Moodle Lch Xem chi tit thng Thng Ging 2022/input_Ti_duration (1)'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Moodle Lch Xem chi tit thng Thng Ging 2022/select_1        2        3        4        _45ea30_1 (1)'), 
    '16', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Moodle Lch Xem chi tit thng Thng Ging 2022/select_00        01        02        03    _f6e37b_1_2 (1)'), 
    '11', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Moodle Lch Xem chi tit thng Thng Ging 2022/select_00        01        02        03    _f6e37b_1_2_3 (1)'), 
    '0', true)

WebUI.click(findTestObject('Object Repository/Page_Moodle Lch Xem chi tit thng Thng Ging 2022/button_Lu (3)'))

WebUI.closeBrowser()

