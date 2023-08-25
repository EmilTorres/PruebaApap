import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')
WebUI.navigateToUrl(GlobalVariable.rutaWebInputs)

if (WebUI.verifyElementPresent(findTestObject('Object Repository/InputsObjs/home_TxtInput'), GlobalVariable.tiempoEspera)) {
	KeywordUtil.markPassed("Te encuentras en el pantalla de inicio de Inputs")

	WebUI.setText(findTestObject('Object Repository/InputsObjs/Edt_input'), "123")
	KeywordUtil.markPassed("Se ha ingresado en el apartado de input")

}else {
	KeywordUtil.markFailed("No te encuentras en la pantalla de Inputs")
}
