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

WebUI.click(findTestObject('Object Repository/Utils/Page_Nh ca ti/span_Qun tr khu vc'))

WebUI.click(findTestObject('Object Repository/Utils/Page_Moodle Khu vc qun tr Tm kim/a_Kho hc'))

WebUI.click(findTestObject('Object Repository/Utils/Page_Moodle Khu vc qun tr Tm kim/a_Thmsa cc kho hc'))

WebUI.click(findTestObject('Object Repository/Utils/Page_Qun l kha hc v danh mc kha hc/a_To kha hc mi'))

WebUI.setText(findTestObject('Object Repository/Utils/Page_Moodle Thm kho hc mi/input_Tn y_fullname'), 'Nhập môn Công nghệ phần mềm')

WebUI.setText(findTestObject('Object Repository/Utils/Page_Moodle Thm kho hc mi/input_Tn rt gn ca kho hc_shortname'), 'CNPM')

WebUI.click(findTestObject('Object Repository/Utils/Page_Moodle Thm kho hc mi/input__saveanddisplay'))

WebUI.click(findTestObject('Object Repository/Utils/Page_CNPM Danh sch thnh vin/input_Danh sch thnh vin_btn btn-secondary my-1'))

WebUI.click(findTestObject('Object Repository/Utils/Page_CNPM Danh sch thnh vin/span_'))

WebUI.click(findTestObject('Object Repository/Utils/Page_CNPM Danh sch thnh vin/span_Student Nguyen'))

WebUI.click(findTestObject('Object Repository/Utils/Page_CNPM Danh sch thnh vin/button_Ghi danh ngi dng'))

WebUI.click(findTestObject('Object Repository/Utils/Page_CNPM Danh sch thnh vin/input_Danh sch thnh vin_yui_3_17_2_1_164190_a20bc6'))

WebUI.click(findTestObject('Object Repository/Utils/Page_CNPM Danh sch thnh vin/span__1'))

WebUI.click(findTestObject('Object Repository/Utils/Page_CNPM Danh sch thnh vin/span_Teacher Nguyen'))

WebUI.click(findTestObject('Object Repository/Utils/Page_CNPM Danh sch thnh vin/button_Ghi danh ngi dng_1'))

WebUI.click(findTestObject('Object Repository/Utils/Page_CNPM Danh sch thnh vin/span_CNPM'))

WebUI.click(findTestObject('Create folder and quiz/Page_CNPM Danh sch thnh vin/a_Qun tr Thnh vin'))

WebUI.click(findTestObject('Create folder and quiz/Page_CNPM Danh sch thnh vin/span_Thot'))

