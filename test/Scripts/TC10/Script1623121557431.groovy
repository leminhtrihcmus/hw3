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

WebUI.navigateToUrl('http://localhost:5000/')

WebUI.click(findTestObject('Object Repository/Page_Funretro/a_Register'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Funretro/input_Register_password'), 'tzH6RvlfSTg=')

WebUI.click(findTestObject('Object Repository/Page_Funretro/button_Register'))

WebUI.waitForElementVisible(findTestObject('Page_Funretro/button_Ok'), 10)

WebUI.click(findTestObject('Object Repository/Page_Funretro/button_Ok'))

WebUI.waitForElementVisible(findTestObject('Page_Funretro/form_LoginLoginOr Register'), 10)

WebUI.verifyElementVisible(findTestObject('Object Repository/Page_Funretro/form_LoginLoginOr Register'))

WebUI.closeBrowser()

