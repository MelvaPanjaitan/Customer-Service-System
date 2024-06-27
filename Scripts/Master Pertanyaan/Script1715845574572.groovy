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

TestData excelMelva = findTestData('Data Files/Master Pertanyaan')

WebUI.click(findTestObject('Object Repository/Master/master menu'))

WebUI.click(findTestObject('Object Repository/Master/Master Pertanyaan/a_Master Pertanyaan'))

WebUI.click(findTestObject('Object Repository/Master/Master Pertanyaan/add'))

for (int row = 1; row <= excelMelva.getRowNumbers(); row++) {
    if (excelMelva.getValue('input', row) == 'YES') {
		WebUI.click(findTestObject('Object Repository/Master/Master Pertanyaan/Format/pilih format'))
		WebUI.click(findTestObject('Object Repository/Master/Master Pertanyaan/Format/Format ' + excelMelva.getValue('Format', row)))
        WebUI.setText(findTestObject('Object Repository/Master/Master Pertanyaan/textarea Pertanyaan'), excelMelva.getValue('Pertanyaan', row))
		WebUI.click(findTestObject('Object Repository/Master/Master Pertanyaan/Status/pilih status'))
		WebUI.click(findTestObject('Object Repository/Master/Master Pertanyaan/Status/Status ' + excelMelva.getValue('Status', row)))
		WebUI.click(findTestObject('Object Repository/Master/Master Pertanyaan/save'))
    }
}


