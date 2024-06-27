import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.mobile.keyword.builtin.VerifyElementExistKeyword as VerifyElementExistKeyword
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.builtin.VerifyElementPresentKeyword as VerifyElementPresentKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

TestData excelMelva = findTestData('Data Files/Test Excel')

WebUI.click(findTestObject('Antrian Online/Daftar Antrian/a_Daftar Antrian'))

if (WebUI.verifyElementPresent(findTestObject('Object Repository/Antrian Online/Daftar Antrian/Judul Besar Daftar Antrian'), 
    0, FailureHandling.OPTIONAL)) {
    WebUI.click(findTestObject('Object Repository/Antrian Online/Daftar Antrian/tangani antrian'))
}
for (int row = 1; row <= excelMelva.getRowNumbers(); row++) {
	
		if (excelMelva.getValue('input', row) == 'YES') {
			WebUI.click(findTestObject('Antrian Online/Form Penanganan/No HP Terhubung WA/Yes'), FailureHandling.STOP_ON_FAILURE)
			
			WebUI.click(findTestObject('Antrian Online/Form Penanganan/Ditangani Sendiri/Yes'))
			
			WebUI.click(findTestObject('Antrian Online/Form Penanganan/Status Penyelesaian-DDL/Status Penyelesaian'))
			
			WebUI.click(findTestObject('Antrian Online/Form Penanganan/Status Penyelesaian-DDL/Close Internal'))
			
			WebUI.click(findTestObject('Antrian Online/Form Penanganan/Tingkat Pengaduan-DDL/Tingkat Pengaduan'))
			
			WebUI.click(findTestObject('Antrian Online/Form Penanganan/Tingkat Pengaduan-DDL/Tingkat Low'))
			
			WebUI.click(findTestObject('Antrian Online/Form Penanganan/Kronologi Masalah-DDL/Kronologi Masalah'))
			
			WebUI.click(findTestObject('Antrian Online/Form Penanganan/Kronologi Masalah-DDL/Kronologi Debitur melakukan pengambilan BPKB'))
			
			WebUI.click(findTestObject('Antrian Online/Form Penanganan/Kronologi Penyelesaian-DDL/Kronologi Penyelesaian'))
			
			WebUI.click(findTestObject('Antrian Online/Form Penanganan/Kronologi Penyelesaian-DDL/Penyelesaian Melakukan release BPKB'))
			
			WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/save'))
			
			if(WebUI.verifyElementPresent(findTestObject('Object Repository/Antrian Online/Form Penanganan/Diatas waktu tunggu-DDL/diatas waktu tunggu'), 0, FailureHandling.OPTIONAL)) {
				WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Diatas waktu tunggu-DDL/diatas waktu tunggu'))
				WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Diatas waktu tunggu-DDL/masih layani antrian sebelumnya'))
				WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/save'))
			}
			
			if(WebUI.verifyElementPresent(findTestObject('Object Repository/Antrian Online/Form Penanganan/di bawah penanganan/di bawah penanganan'), 0, FailureHandling.OPTIONAL)) {
				WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/di bawah penanganan/di bawah penanganan'))
				WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/di bawah penanganan/lupa klik tangani'))
				WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/save'))
			}
			
			if(WebUI.verifyElementPresent(findTestObject('Object Repository/Antrian Online/Form Penanganan/Diatas waktu penanganan-DDL/diatas penanganan'), 0, FailureHandling.OPTIONAL)) {
				WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Diatas waktu tunggu-DDL/diatas waktu tunggu'))
				WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Diatas waktu penanganan-DDL/lupa klik submit'))
				WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/save'))
			}
		}
}



