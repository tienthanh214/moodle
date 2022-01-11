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

WebUI.click(findTestObject('Utils/Page_Nh ca ti (1)/a_QuanTriKhuVuc'))

WebUI.click(findTestObject('Create course/Page_Moodle Khu vc qun tr Tm kim/a_KhoaHoc'))

WebUI.click(findTestObject('Create course/Page_Moodle Khu vc qun tr Tm kim/a_ThemSuaKhoaHoc'))

WebUI.click(findTestObject('Create course/Page_Qun l kha hc v danh mc kha hc/a_TaoKhoaHocMoi'))

WebUI.setText(findTestObject('Create course/Page_Moodle Thm kho hc mi/input_TenDayDu'), 'Nhập môn lập trình')

WebUI.setText(findTestObject('Create course/Page_Moodle Thm kho hc mi/input_TenRutGon'), 'NMLT')

WebUI.click(findTestObject('Create course/Page_Moodle Thm kho hc mi/span_X'))

WebUI.click(findTestObject('Create course/Page_Moodle Thm kho hc mi/input__LuuVaQuayLai'))

WebUI.verifyElementText(findTestObject('Create course/Page_Moodle Thm kho hc mi/div_- PhaiChonLoaiKhoaHoc'), '- You must supply a value here.')

WebUI.closeBrowser()

