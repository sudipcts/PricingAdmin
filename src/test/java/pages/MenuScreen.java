package pages;

import org.openqa.selenium.By;
import com.cognizant.craft.ReusableLibrary;
import com.cognizant.craft.ScriptHelper;


/**
 * UserRegistrationPage class
 * 
 * @author Cognizant
 */
public class MenuScreen extends ReusableLibrary {
	// UI Map object definitions

	protected MenuScreen(ScriptHelper scriptHelper) {
		super(scriptHelper);
		// TODO Auto-generated constructor stub
	}

	
	public static final By txt_storeNameOnMenu = By.xpath("//span[@class='h5 text-left']/a");
	public static final By txt_wraps = By.xpath("//*[@class='full-menu-list']//*[contains(text(),'Wraps')]");
	public static final By txt_pepperjack_name = By.xpath("//*[@class='product-grid gw align--top']//*[contains(text(), 'PEPPER JACK STEAK WRAP')]");
	public static final By txt_itemName_details = By.xpath("//h1[@class='landmarklet']");
	public static final By btn_defaultTopping = By.xpath("//button[@aria-pressed='true']");
	public static final By btn_nondefaultTopping = By.xpath("//button[@aria-selected='false']");
	public static final By btn_addToOrder3 = By.xpath("//*[@class='landmark--dubs']//button[contains(text(),'Add to Order')]");
	public static final By txt_itemName_Popup = By.xpath("//div[@class='modal-body text-center']//h1");
	public static final By btn_viewOrder = By.xpath("//*[@class='modal-footer text-center']//button");
}