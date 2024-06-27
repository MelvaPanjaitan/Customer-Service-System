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

TestData excelMelva = findTestData('Data Files/Excel TSSPV')

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.url)

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Antrian Online/Daftar Penanganan-Eskalasi/a_Daftar Penanganan'))

WebUI.click(findTestObject('Object Repository/Antrian Online/Document Checking/icon doc check'))

for (int row = 1; row <= excelMelva.getRowNumbers(); row++) {
	if (excelMelva.getValue('input', row) == 'YES') {

		WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Sumber Pengaduan-DDL/Sumber Pengaduan'))

		WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Sumber Pengaduan-DDL/Sumber ' + excelMelva.getValue(
					'sumber pengaduan', row)))

//		WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Tipe Pengaduan-DDL/Tipe Pengaduan'))
//
//		WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Tipe Pengaduan-DDL/Tipe ' + excelMelva.getValue(
//					'tipe pengaduan', row)))

		WebUI.click(findTestObject('Antrian Online/Form Penanganan/Tingkat Pengaduan-DDL/Tingkat Pengaduan'))

		WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Tingkat Pengaduan-DDL/Tingkat ' + excelMelva.getValue(
					'tingkat pengaduan', row)))

//		WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Kategori Pengaduan-DDL/Kategori Pengaduan'))
//
//		WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Kategori Pengaduan-DDL/Kategori ' +
//				excelMelva.getValue('kategori pengaduan', row)))
//
//		WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Subkategori Pengaduan-DDL/Subkategori Pengaduan'))
//
//		WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Subkategori Pengaduan-DDL/Subkategori ' +
//				excelMelva.getValue('sub kategori pengaduan', row)))

		WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Cabang Tujuan-DDL/Cabang Tujuan'))

		WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Cabang Tujuan-DDL/Cabang ' + excelMelva.getValue(
					'cabang tujuan', row)))

//		WebUI.click(findTestObject('Antrian Online/Form Penanganan/Kronologi Masalah-DDL/Kronologi Masalah'))
//
//		WebUI.click(findTestObject('Antrian Online/Form Penanganan/Kronologi Masalah-DDL/Kronologi ' + excelMelva.getValue(
//					'kronologi masalah', row)))
//
//		WebUI.click(findTestObject('Antrian Online/Form Penanganan/Kronologi Penyelesaian-DDL/Kronologi Penyelesaian'))
//
//		WebUI.click(findTestObject('Antrian Online/Form Penanganan/Kronologi Penyelesaian-DDL/Penyelesaian ' + excelMelva.getValue(
//					'kronologi penyelesaian', row)))
		
		WebUI.click(findTestObject('Object Repository/Antrian Online/Document Checking/Doc Check'))
		
		WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Document Checking/Doc Check-DDL/Dokumen ' + excelMelva.getValue('Doc Check', row)))

		WebUI.click(findTestObject('Object Repository/Antrian Online/Document Checking/save'))
	}
}
