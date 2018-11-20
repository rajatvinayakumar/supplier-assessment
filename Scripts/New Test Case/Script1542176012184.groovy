import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.phptravels.net/admin')

WebUI.setText(findTestObject('Object Repository/Page_Administator Login/input_Login Panel_email'), username)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Administator Login/input_Login Panel_password'), password)

WebUI.click(findTestObject('Object Repository/Page_Administator Login/button_Login'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Accounts'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Suppliers'))

WebUI.click(findTestObject('Object Repository/Page_Suppliers Management/button_Add'))

WebUI.setText(findTestObject('Object Repository/Page_Add Supplier/input_First Name_fname'), fname)

WebUI.setText(findTestObject('Object Repository/Page_Add Supplier/input_Last Name_lname'), lastname)

WebUI.setText(findTestObject('Object Repository/Page_Add Supplier/input_Email_email'), email)

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Add Supplier/input_Password_password'), 'RigbBhfdqOBDK95asqKeHw==')

WebUI.setText(findTestObject('Object Repository/Page_Add Supplier/input_Mobile Number_mobile'), mobile)

WebUI.click(findTestObject('Page_Add Supplier/select country'))

not_run: WebUI.setText(findTestObject('Page_Add Supplier/input country'), 'IN')

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_Add Supplier/input_concat(id(  select2-drop'), 10, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Add Supplier/input_concat(id(  select2-drop'))

WebUI.setText(findTestObject('Object Repository/Page_Add Supplier/input_Address 1_address1'), 'test3')

WebUI.setText(findTestObject('Object Repository/Page_Add Supplier/input_Address 2_address2'), 'test4')

WebUI.setText(findTestObject('Object Repository/Page_Add Supplier/input_Name_itemname'), 'test5')

WebUI.click(findTestObject('Object Repository/Page_Add Supplier/ul_Assign Hotels_select2-choic'))

WebUI.waitForElementPresent(findTestObject('Page_Add Supplier/Select Hotel'), 10)

WebUI.click(findTestObject('Page_Add Supplier/Select Hotel'))

WebUI.click(findTestObject('Object Repository/Page_Add Supplier/ul_Assign Tours_select2-choice'))

WebUI.waitForElementPresent(findTestObject('Page_Add Supplier/select tours'), 10)

WebUI.click(findTestObject('Page_Add Supplier/select tours'))

WebUI.click(findTestObject('Object Repository/Page_Add Supplier/ul_Assign Cars_select2-choices'))

WebUI.waitForElementPresent(findTestObject('Page_Add Supplier/select car'), 10)

WebUI.click(findTestObject('Page_Add Supplier/select car'))

WebUI.click(findTestObject('Object Repository/Page_Add Supplier/ins_Hotels_iCheck-helper'))

WebUI.click(findTestObject('Object Repository/Page_Add Supplier/ins_Tours_iCheck-helper'))

WebUI.click(findTestObject('Object Repository/Page_Add Supplier/ins_Cars_iCheck-helper'))

WebUI.click(findTestObject('Object Repository/Page_Add Supplier/ins_Bookings_iCheck-helper'))

WebUI.click(findTestObject('Object Repository/Page_Add Supplier/ins_Locations_iCheck-helper'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Add Supplier/ins_Hotels_iCheck-helper'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Add Supplier/ins_Tours_iCheck-helper'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Add Supplier/ins_Cars_iCheck-helper'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Add Supplier/label_Bookings'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Add Supplier/label_Locations'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Add Supplier/label_Hotels'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Add Supplier/label_Tours'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Add Supplier/li_Cars'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Add Supplier/label_Cars'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Add Supplier/label_Bookings'))

not_run: WebUI.click(findTestObject('Object Repository/Page_Add Supplier/label_Locations'))

WebUI.click(findTestObject('Object Repository/Page_Add Supplier/button_Submit'))

