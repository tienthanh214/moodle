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

WebUI.click(findTestObject('Object Repository/Create course/Page_Nh ca ti/span_Qun tr khu vc'))

WebUI.click(findTestObject('Object Repository/Create course/Page_Moodle Khu vc qun tr Tm kim/a_Kho hc'))

WebUI.click(findTestObject('Object Repository/Create course/Page_Moodle Khu vc qun tr Tm kim/a_Thmsa cc kho hc'))

WebUI.click(findTestObject('Object Repository/Create course/Page_Qun l kha hc v danh mc kha hc/a_To kha hc mi'))

WebUI.setText(findTestObject('Object Repository/Create course/Page_Moodle Thm kho hc mi/input_Tn y_fullname'), 'Nhập môn lập trình')

WebUI.setText(findTestObject('Object Repository/Create course/Page_Moodle Thm kho hc mi/input_Tn rt gn ca kho hc_shortname'), 
    'NMLT')

WebUI.click(findTestObject('Object Repository/Create course/Page_Moodle Thm kho hc mi/input__saveandreturn'))

WebUI.click(findTestObject('Object Repository/Create course/Page_Qun l kha hc v danh mc kha hc/a_To kha hc mi'))

WebUI.setText(findTestObject('Object Repository/Create course/Page_Moodle Thm kho hc mi/input_Tn y_fullname'), 'Nhập môn lập trình')

WebUI.setText(findTestObject('Object Repository/Create course/Page_Moodle Thm kho hc mi/input_Tn rt gn ca kho hc_shortname'), 
    'NMLT')

WebUI.click(findTestObject('Object Repository/Create course/Page_Moodle Thm kho hc mi/input__saveanddisplay'))

WebUI.verifyElementText(findTestObject('Object Repository/Create course/Page_Moodle Thm kho hc mi/div_Tn tt ny  c dng trong mt kho hc khc (Nh_d016a9'), 
    'Tên tắt này đã được dùng trong một khoá học khác (Nhập môn lập trình)')

WebUI.click(findTestObject('Object Repository/Create course/Page_Qun l kha hc v danh mc kha hc/i_Nhp mn Cng ngh phn mm_yui_3_17_2_1_164205_0a846d'))

WebUI.navigateToUrl('http://localhost/course/delete.php?id=16')

WebUI.click(findTestObject('Object Repository/Create course/Page_Qun l kha hc v danh mc kha hc/span_Qun tr khu vc'))

WebUI.navigateToUrl('http://localhost/admin/search.php')

WebUI.click(findTestObject('Object Repository/Create course/Page_Moodle Khu vc qun tr Tm kim/a_Kho hc'))

WebUI.click(findTestObject('Object Repository/Create course/Page_Moodle Khu vc qun tr Tm kim/a_Thmsa cc kho hc'))

WebUI.click(findTestObject('Object Repository/Create course/Page_Qun l kha hc v danh mc kha hc/i_Nhp mn lp trnh_yui_3_17_2_1_1642050622599_445'))

WebUI.click(findTestObject('Object Repository/Create course/Page_Moodle Xo NMLT/button_Xo'))

WebUI.closeBrowser()

