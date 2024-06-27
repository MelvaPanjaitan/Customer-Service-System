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

TestData excelMelva = findTestData('Data Files/Excel Konsumen Manual Eskalasi')

WebUI.click(findTestObject('Antrian Online/Daftar Antrian/a_Daftar Antrian'))

for (int row = 1; row <= excelMelva.getRowNumbers(); row++) {
    if (excelMelva.getValue('input', row) == 'YES') {
        if (WebUI.verifyElementPresent(findTestObject('Object Repository/Antrian Online/Daftar Antrian/Judul Besar Daftar Antrian'), 
            0, FailureHandling.OPTIONAL)) {
            WebUI.click(findTestObject('Object Repository/Antrian Online/Daftar Antrian/tambah antrian'))

            WebUI.click(findTestObject('Object Repository/Antrian Online/Daftar Antrian/Tipe Pengunjung/pilih tipe pengunjung'))

            WebUI.click(findTestObject('Object Repository/Antrian Online/Daftar Antrian/Tipe Pengunjung/Tipe ' + excelMelva.getValue(
                        'Tipe Pengunjung', row)))

            WebUI.click(findTestObject('Object Repository/Antrian Online/Daftar Antrian/Antrian Manual/search nomor kontrak'))

            WebUI.switchToWindowIndex(1)

            WebUI.setText(findTestObject('Object Repository/Antrian Online/Daftar Antrian/Antrian Manual/input_No. KontrakPlat Nomor_txtvalue'), 
                excelMelva.getValue('nomor kontrak', row))

            WebUI.click(findTestObject('Object Repository/Antrian Online/Daftar Antrian/Antrian Manual/search konsumen'))

            WebUI.click(findTestObject('Object Repository/Antrian Online/Daftar Antrian/Antrian Manual/checkbox'))

			WebUI.click(findTestObject('Object Repository/Antrian Online/Daftar Antrian/Antrian Manual/BtnSave'))
			
            WebUI.switchToDefaultContent()

            WebUI.click(findTestObject('Object Repository/Antrian Online/Daftar Antrian/Antrian Manual/start antrian'))
        }
        
        WebUI.setText(findTestObject('Object Repository/Antrian Online/Form Penanganan/input_Nama Pengunjung'), excelMelva.getValue(
                'nama pengunjung', row))

        WebUI.scrollToElement(findTestObject('Object Repository/Antrian Online/Form Penanganan/input_Alamat Domisili Debitur (jika ada perubahan)'), 
            0)

        WebUI.setText(findTestObject('Antrian Online/Form Penanganan/input_Alamat Domisili Debitur (jika ada perubahan)'), 
            excelMelva.getValue('alamat jika ada perubahan', row))

        WebUI.setText(findTestObject('Antrian Online/Form Penanganan/input_Nomor HP Debitur (jika ada perubahan)'), excelMelva.getValue(
                'no hp jika ada perubahan', row))

        WebUI.setText(findTestObject('Object Repository/Antrian Online/Form Penanganan/input_Email Debitur (jika ada perubahan)'), 
            excelMelva.getValue('email jika ada perubahan', row))

        WebUI.setText(findTestObject('Object Repository/Antrian Online/Form Penanganan/input_Nama Emergency Kontak (jika ada perubahan)'), 
            excelMelva.getValue('nama emergency jika ada perubahan', row))

        WebUI.setText(findTestObject('Object Repository/Antrian Online/Form Penanganan/input_Nomor Emergency Kontak Jika Ada Perubahan'), 
            excelMelva.getValue('nomor emergency jika ada perubahan', row))

        if (findTestData('Data Files/Excel Konsumen').getValue('no hp terhubung wa', row) == 'YES') {
            WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/No HP Terhubung WA/Yes'))
        } else {
            WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/No HP Terhubung WA/No'))
        }
        
        if (findTestData('Data Files/Excel Konsumen').getValue('ditangani sendiri', row) == 'YES') {
            WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Ditangani Sendiri/Yes'))
        } else {
            WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Ditangani Sendiri/No'))
        }
        
        WebUI.setText(findTestObject('Object Repository/Antrian Online/Form Penanganan/input_Alamat Domisili Debitur (jika ada perubahan)'), 
            excelMelva.getValue('alamat jika ada perubahan', row))

        WebUI.setText(findTestObject('Object Repository/Antrian Online/Form Penanganan/input_Nama Emergency Kontak (jika ada perubahan)'), 
            excelMelva.getValue('nama emergency jika ada perubahan', row))

        WebUI.setText(findTestObject('Object Repository/Antrian Online/Form Penanganan/input_Nomor Emergency Kontak Jika Ada Perubahan'), 
            excelMelva.getValue('nomor emergency jika ada perubahan', row))

        WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Sumber Pengaduan-DDL/Sumber Pengaduan'))

        WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Sumber Pengaduan-DDL/Sumber ' + excelMelva.getValue(
                    'sumber pengaduan', row)))

        WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Tipe Pengaduan-DDL/Tipe Pengaduan'))

        WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Tipe Pengaduan-DDL/Tipe ' + excelMelva.getValue(
                    'tipe pengaduan', row)))

        WebUI.click(findTestObject('Antrian Online/Form Penanganan/Tingkat Pengaduan-DDL/Tingkat Pengaduan'))

        WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Tingkat Pengaduan-DDL/Tingkat ' + excelMelva.getValue(
                    'tingkat pengaduan', row)))

        WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Kategori Pengaduan-DDL/Kategori Pengaduan'))

        WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Kategori Pengaduan-DDL/Kategori ' + 
                excelMelva.getValue('kategori pengaduan', row)))

        WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Subkategori Pengaduan-DDL/Subkategori Pengaduan'))

        WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Subkategori Pengaduan-DDL/Subkategori ' + 
                excelMelva.getValue('sub kategori pengaduan', row)))

        WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Cabang Tujuan-DDL/Cabang Tujuan'))

        WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Cabang Tujuan-DDL/Cabang ' + excelMelva.getValue(
                    'cabang tujuan', row)))

        WebUI.click(findTestObject('Antrian Online/Form Penanganan/Kronologi Masalah-DDL/Kronologi Masalah'))

        WebUI.click(findTestObject('Antrian Online/Form Penanganan/Kronologi Masalah-DDL/Kronologi ' + excelMelva.getValue(
                    'kronologi masalah', row)))

        WebUI.click(findTestObject('Antrian Online/Form Penanganan/Kronologi Penyelesaian-DDL/Kronologi Penyelesaian'))

        WebUI.click(findTestObject('Antrian Online/Form Penanganan/Kronologi Penyelesaian-DDL/Penyelesaian ' + excelMelva.getValue(
                    'kronologi penyelesaian', row)))

        WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/save'))

        if (WebUI.verifyElementPresent(findTestObject('Object Repository/Antrian Online/Form Penanganan/di bawah penanganan/di bawah penanganan'), 
            0, FailureHandling.OPTIONAL)) {
            WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/di bawah penanganan/di bawah penanganan'))

            WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/di bawah penanganan/lupa klik tangani'))

            WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/save'))
        }
        
        if (WebUI.verifyElementPresent(findTestObject('Object Repository/Antrian Online/Form Penanganan/Diatas waktu penanganan-DDL/diatas penanganan'), 
            0, FailureHandling.OPTIONAL)) {
            WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Diatas waktu penanganan-DDL/diatas penanganan'))

            WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/Diatas waktu penanganan-DDL/lupa klik submit'))

            WebUI.click(findTestObject('Object Repository/Antrian Online/Form Penanganan/save'))
        }
    }
}