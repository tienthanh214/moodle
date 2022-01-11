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

WebUI.click(findTestObject('View course grade/Page_im s Xem/button_Bt ch  chnh sa'))

WebUI.click(findTestObject('View course grade/Page_im s Xem/input_Student Nguyen Tng kha hc grade_grade626'))

WebUI.setText(findTestObject('View course grade/Page_im s Xem/input_Student Nguyen Tng kha hc grade_grade626'), 
    '9,00')

WebUI.click(findTestObject('View course grade/Page_im s Xem/input_Trung bnh tng_gradersubmit'))

WebUI.verifyElementText(findTestObject('View course grade/Page_im s Xem/div_im c nhp i vi Tng kha hc cho Student Ng_e10466'), 
    'Điểm được nhập đối với Tổng khóa học cho Student Nguyen nhiều hơn mức tối đa cho phép')

WebUI.click(findTestObject('Create course/Page_CNPM Danh sch thnh vin/a_Qun tr Thnh vin'))

WebUI.click(findTestObject('Create course/Page_CNPM Danh sch thnh vin/span_Thot'))

WebUI.callTestCase(findTestCase('Utils/Delete course CNPM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

