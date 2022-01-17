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

WebUI.click(findTestObject('Create folder and quiz/Page_Kha Nhp mn Cng ngh phn mm/div_Thng tin v  Trang hot ng_optionicon mt-_99da1e'))

WebUI.setText(findTestObject('Create folder and quiz/Page_Bin son Trc nghim/input_Tn_name'), 'quiz1')

WebUI.click(findTestObject('Create folder and quiz/Page_Bin son Trc nghim/a_ang tnh gi'))

WebUI.click(findTestObject('Create folder and quiz/Page_Bin son Trc nghim/input_M_timeopenenabled'))

WebUI.click(findTestObject('Create folder and quiz/Page_Bin son Trc nghim/a_Gii hn v bi lm c b sung'))

WebUI.click(findTestObject('Create folder and quiz/Page_Bin son Trc nghim/em_Click to enter text'))

WebUI.setEncryptedText(findTestObject('Create folder and quiz/Page_Bin son Trc nghim/input_Yu cu mt khu_quizpassword'), 
    '4nvbrPglk7k=')

WebUI.click(findTestObject('Create folder and quiz/Page_Bin son Trc nghim/input_Upon activity completion_submitbutton'))

WebUI.click(findTestObject('Create folder and quiz/Page_CNPM quiz1/button_Chnh sa bi trc nghim'))

WebUI.click(findTestObject('Create folder and quiz/Page_ang sa bi trc nghim quiz1/a_Thm'))

WebUI.click(findTestObject('Create folder and quiz/Page_ang sa bi trc nghim quiz1/span_cu hi mi'))

WebUI.click(findTestObject('Create folder and quiz/Page_ang sa bi trc nghim quiz1/input_Multiple choice_qtype'))

WebUI.click(findTestObject('Create folder and quiz/Page_ang sa bi trc nghim quiz1/input_Description_submitbutton'))

WebUI.setText(findTestObject('Create folder and quiz/Page_Sa cu hi ngsai/input_Tn cu hi_name'), 'AUT')

WebUI.setText(findTestObject('Create folder and quiz/Page_Sa cu hi ngsai/div_Katalon is an automation test tool'), 'Katalon is an automation test tool')

WebUI.selectOptionByValue(findTestObject('Create folder and quiz/Page_Sa cu hi ngsai/select_Sai            ng'), '1', true)

WebUI.click(findTestObject('Create folder and quiz/Page_Sa cu hi ngsai/input__submitbutton'))

WebUI.click(findTestObject('Object Repository/Create course/Page_Nh ca ti/a_Nguyen Van A'))

WebUI.click(findTestObject('Object Repository/Create course/Page_Nh ca ti/span_Thot'))

WebUI.callTestCase(findTestCase('Utils/Login as student'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Create folder and quiz/Page_Nh ca ti/span_Nhp mn Cng ngh phn mm'))

WebUI.click(findTestObject('Create folder and quiz/Page_Kha Nhp mn Cng ngh phn mm/span_quiz1 Trc nghim'))

WebUI.click(findTestObject('Create folder and quiz/Page_CNPM quiz1/button_Bt u kim tra'))

WebUI.setEncryptedText(findTestObject('Create folder and quiz/Page_CNPM quiz1/input_Quiz password_quizpassword'), '4nvbrPglk7k=')

WebUI.click(findTestObject('Create folder and quiz/Page_CNPM quiz1/input_Quiz password_submitbutton'))

WebUI.click(findTestObject('Create folder and quiz/Page_quiz1/input_Hy chn mt_q21_answer'))

WebUI.click(findTestObject('Create folder and quiz/Page_quiz1/input_Sai_next'))

WebUI.click(findTestObject('Create folder and quiz/Page_quiz1 Tng quan bi lm th/button_Np bi v kt thc'))

WebUI.click(findTestObject('Create folder and quiz/Page_quiz1 Tng quan bi lm th/input_Mt khi np bi, bn s khng th thay i p n_23c1d4'))

WebUI.verifyElementText(findTestObject('Create folder and quiz/Page_quiz1 Xem li ln lm th/td_10,00 trn 10,00 (100)'), '10,00 trên 10,00 (100%)')

WebUI.click(findTestObject('Create folder and quiz/Page_quiz1 Xem li ln lm th/a_Student Nguyen'))

WebUI.click(findTestObject('Create folder and quiz/Page_quiz1 Xem li ln lm th/span_Thot'))

WebUI.callTestCase(findTestCase('Utils/Delete course CNPM'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()

