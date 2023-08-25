package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object rutaWebLogin
     
    /**
     * <p></p>
     */
    public static Object tiempoEspera
     
    /**
     * <p></p>
     */
    public static Object rutaWebInputs
     
    /**
     * <p></p>
     */
    public static Object rutaWebHovers
     
    /**
     * <p></p>
     */
    public static Object waitTime
     
    /**
     * <p></p>
     */
    public static Object rutaWebDropdown
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            rutaWebLogin = selectedVariables['rutaWebLogin']
            tiempoEspera = selectedVariables['tiempoEspera']
            rutaWebInputs = selectedVariables['rutaWebInputs']
            rutaWebHovers = selectedVariables['rutaWebHovers']
            waitTime = selectedVariables['waitTime']
            rutaWebDropdown = selectedVariables['rutaWebDropdown']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
