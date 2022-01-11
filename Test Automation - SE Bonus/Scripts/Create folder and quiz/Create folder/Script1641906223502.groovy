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

WebUI.click(findTestObject('Create folder and quiz/Page_Nh ca ti/span_Nhp mn Cng ngh phn mm'))

WebUI.click(findTestObject('Create folder and quiz/Page_Kha Nhp mn Cng ngh phn mm/button_Bt ch  chnh sa'))

for (def index : (0..2)) {
    WebUI.click(findTestObject('Create folder and quiz/Page_Kha Nhp mn Cng ngh phn mm/span_Thm hot ng hoc ti nguyn'))

    WebUI.click(findTestObject('Create folder and quiz/Page_Kha Nhp mn Cng ngh phn mm/div_Thng tin v  Phng chat hot ng_optionicon mt-2 mb-1 icon-size-5 icon-no-margin'))

    WebUI.setText(findTestObject('Create folder and quiz/Page_Bin son Th mc/input_Tn_name'), 'Doc')

    WebUI.click(findTestObject('Create folder and quiz/Page_Bin son Th mc/input_Upon activity completion_submitbutton2'))
}

WebUI.click(findTestObject('Create folder and quiz/Page_CNPM Doc/a_Teacher Nguyen'))

WebUI.click(findTestObject('Create folder and quiz/Page_CNPM Doc/a_Thot'))

WebUI.callTestCase(findTestCase('Utils/Login as student'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Create folder and quiz/Page_Nh ca ti/span_Nhp mn Cng ngh phn mm'))

WebUI.verifyElementVisible(findTestObject('Create folder and quiz/Page_Kha Nhp mn Cng ngh phn mm/div_Doc Th mc 0'))

WebUI.verifyElementVisible(findTestObject('Create folder and quiz/Page_Kha Nhp mn Cng ngh phn mm/div_Doc Th mc 1'))

WebUI.verifyElementVisible(findTestObject('Create folder and quiz/Page_Kha Nhp mn Cng ngh phn mm/div_Doc Th mc 2'))

WebUI.click(findTestObject('Create folder and quiz/Page_Kha Nhp mn Cng ngh phn mm/button_Mark as done 0'))

WebUI.click(findTestObject('Create folder and quiz/Page_Kha Nhp mn Cng ngh phn mm/button_Mark as done 1'))

WebUI.click(findTestObject('Create folder and quiz/Page_Kha Nhp mn Cng ngh phn mm/button_Mark as done 2'))

WebUI.click(findTestObject('Create folder and quiz/Page_Nh ca ti/a_Student Nguyen'))

WebUI.click(findTestObject('Create folder and quiz/Page_Nh ca ti/span_Thot'))

WebUI.callTestCase(findTestCase('Utils/Delete course CNPM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

