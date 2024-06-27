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

TestData excelMelva = findTestData('Data Files/Master SLA')

WebUI.click(findTestObject('Object Repository/Master/master menu'))

WebUI.click(findTestObject('Object Repository/Master/Master SLA/a_Master SLA'))

WebUI.click(findTestObject('Object Repository/Master/Matriks Kategori/add'))

for (int row = 1; row <= excelMelva.getRowNumbers(); row++) {
	if (excelMelva.getValue('input', row) == 'YES') {
		WebUI.click(findTestObject('Object Repository/Master/Master SLA/PIC/PIC'))
		WebUI.click(findTestObject('Object Repository/Master/Master SLA/PIC/PIC ' + excelMelva.getValue('PIC', row)))
		WebUI.click(findTestObject('Object Repository/Master/Master SLA/Sub Kategori/Sub Kategori'))
		WebUI.click(findTestObject('Object Repository/Master/Master SLA/Sub Kategori/Sub Kategori ' + excelMelva.getValue('Sub Kategori', row)))
		WebUI.setText(findTestObject('Object Repository/Master/Master SLA/SLA Antrian Min'), excelMelva.getValue('SLA Antrian Min', row))
		WebUI.setText(findTestObject('Object Repository/Master/Master SLA/SLA Antrian Max'), excelMelva.getValue('SLA Antrian Max', row))
		WebUI.click(findTestObject('Object Repository/Master/Master SLA/Sumber Pengaduan/Sumber Pengaduan'))
		WebUI.click(findTestObject('Object Repository/Master/Master SLA/Sumber Pengaduan/Sumber Pengaduan ' + excelMelva.getValue('Sumber Pengaduan', row)))
		WebUI.setText(findTestObject('Object Repository/Master/Master SLA/SLA Min'), excelMelva.getValue('SLA Min', row))
		WebUI.setText(findTestObject('Object Repository/Master/Master SLA/SLA Max'), excelMelva.getValue('SLA Max', row))
		WebUI.click(findTestObject('Object Repository/Master/Master SLA/Status/Status'))
		WebUI.click(findTestObject('Object Repository/Master/Master SLA/Status/Status ' + excelMelva.getValue('Status', row)))
		WebUI.click(findTestObject('Object Repository/Master/Master SLA/save'))
	}
}