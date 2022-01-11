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

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 'lcbinh')

WebUI.setEncryptedText(findTestObject('null'), 
    'o5TCnEIIWq0Pz0TkrK1a2rpuWvRKVWz2')

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.verifyElementText(findTestObject('null'), 'Thêm một chủ đề mới')

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 'Thông báo')

WebUI.setText(findTestObject('null'), '<p dir="ltr" style="text-align: left;">Thử test case 1</p>')

WebUI.verifyElementClickable(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.setText(findTestObject('null'), 'hs01')

WebUI.setEncryptedText(findTestObject('null'), 
    'o5TCnEIIWq2SeGQhIMNXLQ==')

WebUI.click(findTestObject('null'))

WebUI.verifyElementClickable(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.verifyElementClickable(findTestObject('null'))

WebUI.click(findTestObject('null'))

WebUI.verifyElementText(findTestObject('null'), 'Thông báo')

WebUI.click(findTestObject('null'))

WebUI.verifyElementText(findTestObject('null'), 'Thông báo')

WebUI.closeBrowser()

