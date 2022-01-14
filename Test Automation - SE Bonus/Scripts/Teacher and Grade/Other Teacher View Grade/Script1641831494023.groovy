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

WebUI.click(findTestObject('Teacher and Grade/Page_Nh ca ti/span_Test View Grade'))

WebUI.click(findTestObject('Object Repository/Teacher and Grade/Page_Kha Test View Grade/span_Test ch  2 Bi tp'))

WebUI.click(findTestObject('Object Repository/Teacher and Grade/Page_View Grade Test ch  2/a_im'))

WebUI.setText(findTestObject('Object Repository/Teacher and Grade/Page_View Grade Test ch  2 - ang chm/input_Grade out of 100_grade'), 
    '11')

WebUI.click(findTestObject('Object Repository/Teacher and Grade/Page_View Grade Test ch  2 - ang chm/button_Lu v xem trang tip theo'))

WebUI.setText(findTestObject('Teacher and Grade/Page_View Grade Test ch  2 - ang chm/input_Grade out of 100_grade'), '56')

WebUI.click(findTestObject('Object Repository/Teacher and Grade/Page_View Grade Test ch  2 - ang chm/button_Lu v xem trang tip theo'))

WebUI.setText(findTestObject('Object Repository/Teacher and Grade/Page_View Grade Test ch  2 - ang chm/input_Grade out of 100_grade'), 
    '89')

WebUI.click(findTestObject('Object Repository/Teacher and Grade/Page_View Grade Test ch  2 - ang chm/button_Lu v xem trang tip theo'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Teacher and Grade/Page_View Grade Test ch  2 - ang chm/a_Kho hc Test View Grade'))

WebUI.click(findTestObject('Object Repository/Teacher and Grade/Page_Kha Test View Grade/a_Cng Bnh L'))

WebUI.click(findTestObject('Object Repository/Teacher and Grade/Page_Kha Test View Grade/span_Thot'))

WebUI.click(findTestObject('Object Repository/Teacher and Grade/Page_Local Moodle/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Teacher and Grade/Page_Local Moodle Log in to the site/input_Username_username'), 
    'ndtthanh')

WebUI.setEncryptedText(findTestObject('Admin Site/Page_Local Moodle Log in to the site/input_Password_password'), 'cvW8qx4B2o1gIDzvWT+0mQ==')

WebUI.click(findTestObject('Object Repository/Teacher and Grade/Page_Local Moodle Log in to the site/button_Log in'))

WebUI.click(findTestObject('Teacher and Grade/Page_Nh ca ti/span_Test View Grade'))

WebUI.click(findTestObject('Object Repository/Teacher and Grade/Page_Kha Test View Grade/span_im s'))

WebUI.verifyElementText(findTestObject('Object Repository/Teacher and Grade/Page_im s Xem/span_11,00'), '11,00')

WebUI.verifyElementText(findTestObject('Object Repository/Teacher and Grade/Page_im s Xem/span_89,00'), '89,00')

WebUI.verifyElementText(findTestObject('Object Repository/Teacher and Grade/Page_im s Xem/span_56,00'), '56,00')

WebUI.closeBrowser()

