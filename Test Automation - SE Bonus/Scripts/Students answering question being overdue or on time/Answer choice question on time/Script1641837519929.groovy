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

WebUI.callTestCase(findTestCase('Utils/Login as teacher'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Create folder and quiz/Page_Nh ca ti/span_Trang ch h thng'))

WebUI.click(findTestObject('Object Repository/Create folder and quiz/Page_New Moodle Site/a_Nhp mn Cng ngh phn mm'))

WebUI.click(findTestObject('Object Repository/Create folder and quiz/Page_Kha Nhp mn Cng ngh phn mm/button_Bt ch  chnh sa'))

WebUI.click(findTestObject('Object Repository/Create folder and quiz/Page_Kha Nhp mn Cng ngh phn mm/span_Thm hot ng hoc ti nguyn'))

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Kha Nhp mn cng ngh phn mm/div_Cu hi thm d'))

WebUI.setText(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Bin son Cu hi thm d/input_Tn cu hi_name'), 
    'Câu hỏi trắc nghiệm')

WebUI.setText(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Bin son Cu hi thm d/input_Phng n khng_option0'), 
    'a')

WebUI.setText(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Bin son Cu hi thm d/input_Phng n khng_option1'), 
    'b')

WebUI.setText(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Bin son Cu hi thm d/input_Phng n khng_option2'), 
    'c')

WebUI.setText(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Bin son Cu hi thm d/input_Phng n khng_option3'), 
    'd')

WebUI.verifyElementClickable(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Bin son Cu hi thm d/input_Gii hn khng_option_add_fields'))

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Bin son Cu hi thm d/input_Gii hn khng_option_add_fields'))

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Bin son Cu hi thm d/input_Upon activity completion_submitbutton2'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Kha Nhp mn cng ngh phn mm/span_Cu hi trc nghim Cu hi thm d'))

WebUI.click(findTestObject('Object Repository/Create course/Page_Nh ca ti/a_Nguyen Van A'))

WebUI.click(findTestObject('Object Repository/Create course/Page_Nh ca ti/span_Thot'))

WebUI.callTestCase(findTestCase('Utils/Login as student'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Nh ca ti/span_Trang ch h thng'))

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_New Moodle Site/a_Nhp mn Cng ngh phn mm'))

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Kha Nhp mn Cng ngh phn mm/span_Cu hi trc nghim Cu hi thm d'))

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Cu hi trc nghim/input__answer'))

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Cu hi trc nghim/input_d_btn btn-primary'))

WebUI.verifyElementText(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Cu hi trc nghim/div_La chn ca bn a'), 
    'Lựa chọn của bạn: a')

WebUI.click(findTestObject('Create folder and quiz/Page_quiz1 Xem li ln lm th/a_Student Nguyen'))

WebUI.click(findTestObject('Create folder and quiz/Page_quiz1 Xem li ln lm th/span_Thot'))

WebUI.callTestCase(findTestCase('Utils/Delete course CNPM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

