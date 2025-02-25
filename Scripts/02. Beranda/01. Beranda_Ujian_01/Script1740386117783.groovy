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

WebUI.scrollToElement(findTestObject('Beranda/03. Ujian BP_Pemahaman dan Pengetahuan Umum/01. Beranda_Ujian01_klik_Lihat'), 
    2)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/Beranda/03. Ujian BP_Pemahaman dan Pengetahuan Umum/01. Beranda_Ujian01_klik_Lihat'))

WebUI.scrollToElement(findTestObject('Beranda/03. Ujian BP_Pemahaman dan Pengetahuan Umum/xpath_ujian_title'), 3)

WebUI.delay(3)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Beranda/03. Ujian BP_Pemahaman dan Pengetahuan Umum/xpath_ujian_penalaran_umum'))

WebUI.click(findTestObject('Beranda/03. Ujian BP_Pemahaman dan Pengetahuan Umum/xpath_Button_siap mulai'))

WebUI.click(findTestObject('Beranda/03. Ujian BP_Pemahaman dan Pengetahuan Umum/soal_jawaban_a'), FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Beranda/03. Ujian BP_Pemahaman dan Pengetahuan Umum/xpath_soal_ujian_no30'), 2)

WebUI.click(findTestObject('Beranda/03. Ujian BP_Pemahaman dan Pengetahuan Umum/xpath_soal_ujian_no30'))

WebUI.click(findTestObject('Beranda/03. Ujian BP_Pemahaman dan Pengetahuan Umum/soal_jawaban_a'))

WebUI.click(findTestObject('Beranda/03. Ujian BP_Pemahaman dan Pengetahuan Umum/xpath_btn_kumpulkan_ujian'))

WebUI.takeScreenshot()

WebUI.click(findTestObject('Beranda/03. Ujian BP_Pemahaman dan Pengetahuan Umum/xpath_btn_kumpulkan_ujian'))

WebUI.click(findTestObject('Beranda/03. Ujian BP_Pemahaman dan Pengetahuan Umum/xpath_btn_kembali_ke_beranda'))

