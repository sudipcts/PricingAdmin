package businesscomponents;
import com.cognizant.craft.*;
import com.cognizant.framework.Status;


import pages.*;

/**
 * Class for storing business components related to the user registration
 * functionality
 * 
 * @author Cognizant
 */
public class OrderOrchestrationNew extends ReusableCompDesktop {
	
	/**
	 * Constructor to initialize the component library
	 * 
	 * @param scriptHelper
	 *            The {@link ScriptHelper} object passed from the
	 *            {@link DriverScript}
	 */
	public OrderOrchestrationNew(ScriptHelper scriptHelper) {
		super(scriptHelper);
		// TODO Auto-generated constructor stub
	}

	//private static final String GENERAL_DATA = "General_Data";

	public void launchAppliaction() 
	{
		driver.get("https://qa.ctscallserv.com/index.html");
		visibleClick(PJILocations.username);
		sendKeys(PJILocations.username,dataTable.getData("General_Data", "Username"));
		visibleClick(PJILocations.pjipassword);
		sendKeys(PJILocations.pjipassword,dataTable.getData("General_Data", "Password"));
		visibleClick(PJILocations.loginBtn);
//		assertElement(LocationScreen.lnk_locations);
		report.updateTestLog("ElementPresent","Element is Present", Status.PASS);
	}
	
}

