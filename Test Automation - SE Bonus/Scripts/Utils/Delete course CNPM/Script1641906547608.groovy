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

WebUI.callTestCase(findTestCase('Utils/Login as admin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Create course/Page_Nh ca ti/span_Qun tr khu vc'))

WebUI.click(findTestObject('Object Repository/Create course/Page_Moodle Khu vc qun tr Tm kim/a_Kho hc'))

WebUI.click(findTestObject('Object Repository/Create course/Page_Moodle Khu vc qun tr Tm kim/a_Thmsa cc kho hc'))

WebUI.click(findTestObject('Object Repository/Create course/Page_Qun l kha hc v danh mc kha hc/div_La chn hnh ng hng lot Nhp mn Cng ngh ph_52747d'))

WebUI.click(findTestObject('Object Repository/Create course/Page_Qun l kha hc v danh mc kha hc/a_Nhp mn Cng ngh phn mm'))

WebUI.click(findTestObject('Object Repository/Create course/Page_Qun l kha hc v danh mc kha hc/a_Xo'))

WebUI.click(findTestObject('Object Repository/Create course/Page_Moodle Xo CNPM/button_Xo'))

WebUI.click(findTestObject('Object Repository/Create course/Page_Moodle Xo CNPM/button_Tip tc'))

