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

WebUI.callTestCase(findTestCase('Utils/Login as admin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Utils/Page_Nh ca ti (1)/span_Qun tr khu vc'))

WebUI.click(findTestObject('Create course/Page_Moodle Khu vc qun tr Tm kim/a_Kho hc'))

WebUI.click(findTestObject('Create course/Page_Moodle Khu vc qun tr Tm kim/a_Thmsa cc kho hc'))

WebUI.click(findTestObject('Create course/Page_Qun l kha hc v danh mc kha hc/a_TaoKhoaHocMoi'))

WebUI.setText(findTestObject('Create course/Page_Moodle Thm kho hc mi/input_Tn y_fullname'), 'Nhập môn Công nghệ phần mềm')

WebUI.setText(findTestObject('Create course/Page_Moodle Thm kho hc mi/input_Tn rt gn ca kho hc_shortname'), 'CNPM')

WebUI.selectOptionByValue(findTestObject('Create course/Page_Moodle Thm kho hc mi/select_1        2        3        4        _45ea30'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Create course/Page_Moodle Thm kho hc mi/select_Thng Ging        Thng Hai        Thn_b248db'), 
    '9', true)

WebUI.selectOptionByValue(findTestObject('Create course/Page_Moodle Thm kho hc mi/select_1900        1901        1902        _6405c9'), 
    '2021', true)

WebUI.selectOptionByValue(findTestObject('Create course/Page_Moodle Thm kho hc mi/select_00        01        02        03    _f6e37b'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Create course/Page_Moodle Thm kho hc mi/select_00        01        02        03    _f6e37b_1'), 
    '15', true)

WebUI.selectOptionByValue(findTestObject('Create course/Page_Moodle Thm kho hc mi/select_1        2        3        4        _45ea30_1'), 
    '15', true)

WebUI.selectOptionByValue(findTestObject('Create course/Page_Moodle Thm kho hc mi/select_1900        1901        1902        _6405c9_1'), 
    '2022', true)

WebUI.selectOptionByValue(findTestObject('Create course/Page_Moodle Thm kho hc mi/select_00        01        02        03    _f6e37b_1_2'), 
    '10', true)

WebUI.setText(findTestObject('Create course/Page_Moodle Thm kho hc mi/input_M s ID kho hc_idnumber'), '1234')

WebUI.click(findTestObject('Object Repository/Utils/Page_Moodle Thm kho hc mi/input__saveanddisplay'))

WebUI.click(findTestObject('Object Repository/Utils/Page_CNPM Danh sch thnh vin/input_Danh sch thnh vin_btn btn-secondary my-1'))

WebUI.click(findTestObject('Object Repository/Utils/Page_CNPM Danh sch thnh vin/span_'))

WebUI.click(findTestObject('Object Repository/Utils/Page_CNPM Danh sch thnh vin/span_Student Nguyen'))

WebUI.click(findTestObject('Object Repository/Utils/Page_CNPM Danh sch thnh vin/button_Ghi danh ngi dng'))

WebUI.click(findTestObject('Object Repository/Utils/Page_CNPM Danh sch thnh vin/input_Danh sch thnh vin_btn btn-secondary my-1'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Create course/Page_CNPM Danh sch thnh vin/select_Ngi qun l            Gio vin        _4311d9'), 
    '3', true)

WebUI.click(findTestObject('Object Repository/Utils/Page_CNPM Danh sch thnh vin/span_'))

WebUI.click(findTestObject('Object Repository/Create course/Page_CNPM Danh sch thnh vin/span_Nguyen Van A'))

WebUI.click(findTestObject('Object Repository/Create course/Page_CNPM Danh sch thnh vin/button_Ghi danh ngi dng_1'))

WebUI.click(findTestObject('Create course/Page_CNPM Danh sch thnh vin/a_Qun tr Thnh vin'))

WebUI.click(findTestObject('Create course/Page_CNPM Danh sch thnh vin/span_Thot'))

WebUI.click(findTestObject('Object Repository/Create course/Page_New Moodle Site/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Create course/Page_New Moodle Site Log in to the site/input_Username_username'), 
    'hs01')

WebUI.setEncryptedText(findTestObject('Object Repository/Create course/Page_New Moodle Site Log in to the site/input_Password_password'), 
    'o5TCnEIIWq2SeGQhIMNXLQ==')

WebUI.click(findTestObject('Object Repository/Create course/Page_New Moodle Site Log in to the site/button_Log in'))

WebUI.click(findTestObject('Create course/Page_Nh ca ti/span_Trang ch h thng'))

WebUI.verifyElementClickable(findTestObject('Create course/Page_New Moodle Site/a_Nhp mn Cng ngh phn mm'))

WebUI.click(findTestObject('Create course/Page_New Moodle Site/a_Nhp mn Cng ngh phn mm'))

WebUI.click(findTestObject('Create course/Page_Kha Nhp mn Cng ngh phn mm/button_Bt ch  chnh sa'))

WebUI.click(findTestObject('Create course/Page_Kha Nhp mn Cng ngh phn mm/button_Tt ch  chnh sa'))

WebUI.click(findTestObject('Object Repository/Create course/Page_Nh ca ti/a_Nguyen Van A'))

WebUI.click(findTestObject('Object Repository/Create course/Page_Nh ca ti/span_Thot'))

WebUI.callTestCase(findTestCase('Utils/Login as student'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Utils/Page_Nh ca ti (1)/span_Nhp mn Cng ngh phn mm'))

WebUI.click(findTestObject('Create course/Page_Nh ca ti/a_Student Nguyen'))

WebUI.click(findTestObject('Create course/Page_CNPM Danh sch thnh vin/span_Thot'))

WebUI.callTestCase(findTestCase('Utils/Delete course CNPM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

