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

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Local Moodle/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Local Moodle Log in to the site/input_Username_username'), 
    'hs02')

WebUI.setEncryptedText(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Local Moodle Log in to the site/input_Password_password'), 
    'RigbBhfdqOBGP4y92+oMSw==')

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Local Moodle Log in to the site/button_Log in'))

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Nh ca ti/span_Trang ch h thng'))

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Local Moodle/a_Nhp mn cng ngh phn mm'))

WebUI.click(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Kha Nhp mn cng ngh phn mm/span_Cu hi trc nghim Cu hi thm d'))

WebUI.verifyElementText(findTestObject('Object Repository/Student answering question being overdue or on time/Page_Cu hi trc nghim/div_Hin khng th xem c kt qu'), 
    'Hiện không thể xem được kết quả.')

WebUI.closeBrowser()
