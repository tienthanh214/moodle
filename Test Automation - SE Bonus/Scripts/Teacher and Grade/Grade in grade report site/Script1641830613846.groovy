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

WebUI.click(findTestObject('Object Repository/Teacher and Grade/Page_Local Moodle/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Teacher and Grade/Page_Local Moodle Log in to the site/input_Username_username'), 
    'lcbinh')

WebUI.setEncryptedText(findTestObject('Admin Site/Page_Local Moodle Log in to the site/input_Password_password'), 'o5TCnEIIWq0Pz0TkrK1a2rpuWvRKVWz2')

WebUI.click(findTestObject('Object Repository/Teacher and Grade/Page_Local Moodle Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Teacher and Grade/Page_Nh ca ti/span_View Grade'))

WebUI.click(findTestObject('Object Repository/Teacher and Grade/Page_Kha Test View Grade/a_im s'))

WebUI.click(findTestObject('Object Repository/Teacher and Grade/Page_im s Xem/i_Test ch  1_icon fa fa-pencil fa-fw'))

WebUI.check(findTestObject('Object Repository/Teacher and Grade/Page_im s Xem/input_Override for Student Replace_override_3_28'))

WebUI.setText(findTestObject('Object Repository/Teacher and Grade/Page_im s Xem/input_Grade for Student Replace_finalgrade_3_28'), 
    '100')

WebUI.check(findTestObject('Object Repository/Teacher and Grade/Page_im s Xem/input_Override for Student Three_override_3_30'))

WebUI.setText(findTestObject('Object Repository/Teacher and Grade/Page_im s Xem/input_Grade for Student Three_finalgrade_3_30'), 
    '60')

WebUI.check(findTestObject('Object Repository/Teacher and Grade/Page_im s Xem/input_Override for Student Two_override_3_29'))

WebUI.setText(findTestObject('Object Repository/Teacher and Grade/Page_im s Xem/input_Grade for Student Two_finalgrade_3_29'), 
    '25')

WebUI.click(findTestObject('Object Repository/Teacher and Grade/Page_im s Xem/input_Insert value_btn btn-secondary'))

WebUI.click(findTestObject('Object Repository/Teacher and Grade/Page_Saving grades/button_Tip tc'))

WebUI.click(findTestObject('Object Repository/Teacher and Grade/Page_im s Xem/a_Grader report'))

WebUI.verifyElementText(findTestObject('Object Repository/Teacher and Grade/Page_im s Xem/span_100,00'), '100,00')

WebUI.verifyElementText(findTestObject('Object Repository/Teacher and Grade/Page_im s Xem/span_60,00'), '60,00')

WebUI.verifyElementText(findTestObject('Object Repository/Teacher and Grade/Page_im s Xem/span_25,00'), '25,00')

WebUI.click(findTestObject('Object Repository/Teacher and Grade/Page_im s Xem/span_Ch  1'))

WebUI.click(findTestObject('Object Repository/Teacher and Grade/Page_Kha Test View Grade/span_Test ch  1 Bi tp'))

WebUI.click(findTestObject('Object Repository/Teacher and Grade/Page_View Grade Test ch  1/a_im'))

WebUI.verifyElementText(findTestObject('Object Repository/Teacher and Grade/Page_View Grade Test ch  1 - ang chm/a_100,00'), 
    '100,00')

WebUI.click(findTestObject('Object Repository/Teacher and Grade/Page_View Grade Test ch  1 - ang chm/a_'))

WebUI.verifyElementText(findTestObject('Object Repository/Teacher and Grade/Page_View Grade Test ch  1 - ang chm/a_25,00'), 
    '25,00')

WebUI.click(findTestObject('Object Repository/Teacher and Grade/Page_View Grade Test ch  1 - ang chm/a_'))

WebUI.verifyElementText(findTestObject('Object Repository/Teacher and Grade/Page_View Grade Test ch  1 - ang chm/a_60,00'), 
    '60,00')

WebUI.closeBrowser()

