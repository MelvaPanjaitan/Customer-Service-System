import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import java.util.concurrent.Delayed as Delayed
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

//Mobile.startExistingApplication('com.mpmfinance.jmcare', FailureHandling.STOP_ON_FAILURE)

for (int row = 1; row <= excelMelva.getRowNumbers(); row++) {

    if (excelMelva.getValue('input', row) == 'YES') {
//		
//		Mobile.tap(findTestObject('Start Existing/pin start exisiting'), 0)
//		
//		Mobile.setText(findTestObject('Start Existing/pin start exisiting'),excelMelva.getValue('pin', row), 0)
		
        if (Mobile.verifyElementExist(findTestObject('Ambil Antrian/m service'), 0, FailureHandling.OPTIONAL) == true) {
			
            Mobile.tap(findTestObject('Ambil Antrian/m service'), 0)

            Mobile.tap(findTestObject('Ambil Antrian/Antrian awal'), 0)

            Mobile.delay(120)	

            Mobile.tap(findTestObject('Ambil Antrian/Pilih nomor kontrak'), 0)

            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/search'), 0)

            Mobile.setText(findTestObject('Object Repository/Ambil Antrian/inputan'), excelMelva.getValue('no kontrak', 
                    row), 0)

            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/pilih pilihan'), 0)

            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/tanggal kedatangan'), 0)

            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/oke tgl kedatangan'), 0)

            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/jam kedatangan'), 0)
			
            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/jam lebih dari seharusnya/jam ' + excelMelva.getValue('jam', row)), 0)

            Mobile.tap(findTestObject('Ambil Antrian/jam lebih dari seharusnya/menit 00'), 0)
			
			Mobile.tap(findTestObject('Ambil Antrian/oke jam kedatangan'), 0)
			
			if (Mobile.verifyElementExist(findTestObject('Object Repository/Ambil Antrian/jam lebih dari seharusnya/Field Jam Kosong'), 0, FailureHandling.OPTIONAL) == true) {
					
				   Mobile.tap(findTestObject('Object Repository/Ambil Antrian/jam kedatangan'), 0)
	
				   Mobile.tap(findTestObject('Object Repository/Ambil Antrian/oke jam kedatangan'), 0)
				}


            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/pilih pic tujuan'), 0)

            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/CUSTOMER CARE'), 0)

            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/tujuan kedatangan'), 0)

            Mobile.delay(120)

            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/search tujuan kedatangan'), 0)

            Mobile.setText(findTestObject('Object Repository/Ambil Antrian/inputan tujuan kedatangan'), excelMelva.getValue(
                    'tujuan kedatangan', row), 0)

            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/pilih pilihan tujuan kedatangan'), 0)

            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/cabang tujuan'), 0)

            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/search tujuan kedatangan'), 0)

            Mobile.setText(findTestObject('Object Repository/Ambil Antrian/inputan tujuan kedatangan'), excelMelva.getValue(
                    'cabang tujuan', row), 0)

            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/pilih pilihan tujuan kedatangan'), 0)

            Mobile.swipe(0, 800, 0, 0)

            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/SUBMIT'), 0)
        } else {
            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/non debitur/antrian online non debitur'), 0)

            Mobile.delay(120)

            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/tanggal kedatangan'), 0)

            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/oke tgl kedatangan'), 0)

            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/jam kedatangan'), 0)

            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/oke jam kedatangan'), 0)

            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/pilih pic tujuan'), 0)

            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/CUSTOMER CARE'), 0)

            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/tujuan kedatangan'), 0)

            Mobile.delay(120)

            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/search tujuan kedatangan'), 0)

            Mobile.setText(findTestObject('Object Repository/Ambil Antrian/inputan tujuan kedatangan'), excelMelva.getValue(
                    'tujuan kedatangan', row), 0)

            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/pilih pilihan tujuan kedatangan'), 0)

            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/cabang tujuan'), 0)

            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/search tujuan kedatangan'), 0)

            Mobile.setText(findTestObject('Object Repository/Ambil Antrian/inputan tujuan kedatangan'), excelMelva.getValue(
                    'cabang tujuan', row), 0)

            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/pilih pilihan tujuan kedatangan'), 0)

            Mobile.swipe(0, 800, 0, 0)

            Mobile.tap(findTestObject('Object Repository/Ambil Antrian/SUBMIT'), 0)
        }
    }
}