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

TestData excelMelva = findTestData('Data Files/Test Excel')

Mobile.startApplication(GlobalVariable.apk, true)

Mobile.tap(findTestObject('Login/android.widget.TextView - Lewati'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.M-Service'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.Self Service'), 0)

Mobile.tap(findTestObject('Object Repository/Login/android.widget.TextView - Login'), 0)

Mobile.tap(findTestObject('Object Repository/Login/Input Email atau nomor HP'), 0)

for (int row = 1; row <= 1; row++)
{
	if(excelMelva.getValue('input', row) == 'YES')
	{
		if (Mobile.verifyElementExist(findTestObject('Object Repository/Login/Button - No thanks'), 0, FailureHandling.OPTIONAL) == true)
		{
			Mobile.tap(findTestObject('Object Repository/Login/Button - No thanks'), 0)
		}

			Mobile.setText(findTestObject('Object Repository/Login/Input Email atau nomor HP'), excelMelva.getValue('email', row), 0)
			
			Mobile.setText(findTestObject('Object Repository/Login/Input Password'), excelMelva.getValue('password', row), 0)
			
			Mobile.tap(findTestObject('Object Repository/Login/Button - MASUK'), 0)
			
			Mobile.setText(findTestObject('Object Repository/Login/Pin'), excelMelva.getValue('pin', row), 0)
			
			Mobile.setText(findTestObject('Object Repository/Login/Pin Lagi'), excelMelva.getValue('pin', row), 0)
			
			Mobile.tap(findTestObject('Object Repository/Login/LANJUT'), 0)
		}
	}