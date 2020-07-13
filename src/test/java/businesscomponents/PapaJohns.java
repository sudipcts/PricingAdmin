package businesscomponents;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


import com.cognizant.craft.*;
import com.cognizant.framework.Status;
import com.cognizant.framework.selenium.CraftDriver;

import pages.*;

/**
 * Class for storing business components related to the user registration
 * functionality
 * 
 * @author Cognizant
 */
public class PapaJohns extends ReusableCompDesktop {
	
	/**
	 * Constructor to initialize the component library
	 * 
	 * @param scriptHelper
	 *            The {@link ScriptHelper} object passed from the
	 *            {@link DriverScript}
	 */
	public PapaJohns(ScriptHelper scriptHelper) {
		super(scriptHelper);
		// TODO Auto-generated constructor stub
	}
	
	public void launchPJIApplication() throws AWTException 
	{
		driver.get("https://qa2.ctscallserv.com/index.html");
		visibleClick(PJILocations.username);
		sendKeys(PJILocations.username,dataTable.getData("General_Data", "Username"));
		visibleClick(PJILocations.pjipassword);
		sendKeys(PJILocations.pjipassword,dataTable.getData("General_Data", "Password"));
		visibleClick(PJILocations.loginBtn);
		driverUtil.waitFor(3000);
		report.updateTestLog("ElementPresent","Element is Present", Status.PASS);
	}
	
	public void searchCustomer() throws AWTException
	{	
		scrollTop(PJILocations.custsearchbtn);
		sendKeys(PJILocations.custsearch,dataTable.getData("General_Data", "PhoneNum"));
		visibleClick(PJILocations.custsearchbtn);
		//assertElement(PJILocations.btnAddNewCust);
	}
	
	public void selectDeliveryAddress()
	{
		assertElement(PJILocations.btnAddNewCust);
		selectEleFromList(PJILocations.deliveryAddress, dataTable.getData("General_Data", "Address"));
		driverUtil.waitFor(3000);
	}
	
	public void zoomout() throws AWTException
	{
		Robot robot = new Robot();
		for (int i = 0; i < 4; i++) {

			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}
	}
	
	public void deliveryStoreOrder()
	{
		scrollTop(PJILocations.orderbutn);
		Click(PJILocations.orderbutn);
		driverUtil.waitFor(2000);
	}
	
	public void selectMenu()
	{
		selectEleFromList(PJILocations.menucategory, dataTable.getData("General_Data", "CartMenu"));
		selectEleFromList(PJILocations.menucategory, dataTable.getData("General_Data", "SubMenu2"));
		selectEleFromList(PJILocations.menucategory, dataTable.getData("General_Data", "SubMenu3"));
		driverUtil.waitFor(1000);
		Click(PJILocations.addtocart);
		driverUtil.waitFor(6000);
	}
	
	public void addPromo()
	{
		selectEleFromList(PJILocations.storedeals_67, dataTable.getData("General_Data", "Deal1"));
		//selectEleFromList(PJILocations.storedeals_67, dataTable.getData("General_Data", "Deal2"));
	}
	public void item_level_promo()
	{
		//promoItemLevelCheck(PJILocations.promo_item_level, PJILocations.promo_item_level_chkbox, dataTable.getData("General_Data", "Promo1"));
		selectItemPromo(PJILocations.promoDropDown, dataTable.getData("General_Data", "Deal2"));
		promoItemLevelCheckbox(PJILocations.promochkbox);
	}
	public void orderMenubyCash()
	{
		visibleClick(PJILocations.validateCart);
		driverUtil.waitFor(2000);
		visibleClick(PJILocations.promoModalClose);
		visibleClick(PJILocations.placeOrder);
		driverUtil.waitFor(3000);
		assertElement(PJILocations.orderConfText, dataTable.getData("General_Data", "Friendlyname"));
		assertElement(PJILocations.orderId, dataTable.getData("General_Data", "Friendlyname2"));
	}
	
	public void addNewCustomerCarryOut()
	{
		visibleClick(PJILocations.Custname);
		sendKeys(PJILocations.Custname,dataTable.getData("General_Data", "CustName"));
		visibleClick(PJILocations.CustEmail);
		sendKeys(PJILocations.CustEmail,dataTable.getData("General_Data", "CustEmail"));
		visibleClick(PJILocations.custdetailsCarryoutRadio);
		visibleClick(PJILocations.submitbtn);
	}
	
	public void pickUpZipSearch()
	{
		visibleClick(PJILocations.pickUp);
		visibleClick(PJILocations.carryOutSearch);
		sendKeys(PJILocations.carryOutSearch,dataTable.getData("General_Data", "ZipCode"));
		visibleClick(PJILocations.carryOutSearchBtn);
	}
}

