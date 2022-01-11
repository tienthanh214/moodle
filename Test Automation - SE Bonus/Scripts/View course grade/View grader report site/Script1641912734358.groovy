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

WebUI.callTestCase(findTestCase('Utils/Create course CNPM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Utils/Login as admin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('View course grade/Page_Nh ca ti/span_Trang ch h thng'))

WebUI.click(findTestObject('View course grade/Page_Local Moodle/a_Nhp mn Cng ngh phn mm'))

WebUI.click(findTestObject('View course grade/Page_Kha Nhp mn Cng ngh phn mm/span_im s'))

WebUI.verifyElementText(findTestObject('View course grade/Page_im s Xem/h2_Grader report'), 'Grader report')

tatCaThanhVien = WebUI.getText(findTestObject('View course grade/Page_im s Xem/h3_Tt c thnh vin00'))

if (tatCaThanhVien != 'Tất cả thành viên:0/0') {
    WebUI.verifyElementVisible(findTestObject('View course grade/Page_im s Xem/th_Trung bnh tng'), FailureHandling.STOP_ON_FAILURE)
}

WebUI.callTestCase(findTestCase('Utils/Delete course CNPM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

