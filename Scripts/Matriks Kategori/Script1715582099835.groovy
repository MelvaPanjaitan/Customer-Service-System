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

TestData excelMelva = findTestData('Data Files/Matriks Kategori')

WebUI.click(findTestObject('Object Repository/Master/master menu'))

WebUI.click(findTestObject('Object Repository/Master/Matriks Kategori/a_Matriks Kategori'))

//Add
for (int row = 1; row <= excelMelva.getRowNumbers(); row++) {
    if (excelMelva.getValue('input', row) == 'YES') {
		WebUI.click(findTestObject('Object Repository/Master/Matriks Kategori/add'))
		WebUI.click(findTestObject('Object Repository/Master/Matriks Kategori/Tipe/Tipe'))
		WebUI.click(findTestObject('Object Repository/Master/Matriks Kategori/Tipe/Tipe ' + excelMelva.getValue('Tipe', row)))
		WebUI.click(findTestObject('Object Repository/Master/Matriks Kategori/Sub Tipe/Sub Tipe'))
		WebUI.click(findTestObject('Object Repository/Master/Matriks Kategori/Sub Tipe/Sub Tipe ' + excelMelva.getValue('Sub Tipe', row)))
		WebUI.click(findTestObject('Object Repository/Master/Matriks Kategori/PIC/PIC'))
		WebUI.click(findTestObject('Object Repository/Master/Matriks Kategori/PIC/PIC ' + excelMelva.getValue('PIC', row)))
		WebUI.click(findTestObject('Object Repository/Master/Matriks Kategori/Kategori/Kategori'))
		WebUI.click(findTestObject('Object Repository/Master/Matriks Kategori/Kategori/Kategori ' + excelMelva.getValue('Kategori', row)))
		WebUI.click(findTestObject('Object Repository/Master/Matriks Kategori/Sub Kategori/Sub Kategori'))
		WebUI.click(findTestObject('Object Repository/Master/Matriks Kategori/Sub Kategori/Sub Kategori ' + excelMelva.getValue('Sub Kategori', row)))
		WebUI.click(findTestObject('Object Repository/Master/Matriks Kategori/Masalah/Masalah'))
		WebUI.click(findTestObject('Object Repository/Master/Matriks Kategori/Masalah/Masalah ' + excelMelva.getValue('Masalah', row)))
		WebUI.click(findTestObject('Object Repository/Master/Matriks Kategori/Is Branch/Is Branch'))
		WebUI.click(findTestObject('Object Repository/Master/Matriks Kategori/Is Branch/Is Branch ' + excelMelva.getValue('Is Branch', row)))
		WebUI.click(findTestObject('Object Repository/Master/Matriks Kategori/Status/Status'))
		WebUI.click(findTestObject('Object Repository/Master/Matriks Kategori/Status/Status ' + excelMelva.getValue('Status', row)))
		WebUI.click(findTestObject('Object Repository/Master/Matriks Kategori/save'))
    }
}

