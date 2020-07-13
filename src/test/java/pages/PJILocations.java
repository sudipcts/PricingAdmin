package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cognizant.craft.ReusableLibrary;
import com.cognizant.craft.ScriptHelper;

public class PJILocations extends ReusableLibrary {

	public PJILocations(ScriptHelper scriptHelper) {
		super(scriptHelper);
		// TODO Auto-generated constructor stub
	}
	
	public static final By username = By.xpath("//input[@id='agentID']");
	public static final By pjipassword = By.xpath("//input[@id='pwd']");
	public static final By loginBtn = By.xpath("//button[text()='LOGIN']");
	//public static final By loginBtn = By.xpath("//button[@id='agent-login-submit']");
	public static final By custsearch = By.xpath("//input[@id='customer-search']");
	public static final By custsearchbtn = By.xpath("//button[@id='button-apply']");
	public static final By btnAddNewCust = By.xpath("//button[text()='ADD NEW CUSTOMER']");
	public static final By deliveryAddress = By.xpath("//div[@id='delivery']//li//p[@id='address-lines']");
	
	public static final By orderbutn = By.xpath("//button[text()='ORDER NOW']");
	public static final By pizza = By.xpath("//button[normalize-space(text())='Pizza']");
	public static final By menucategory = By.xpath("//ul[@class='tile-list grey-tile-list']//button");
	public static final By addtocart = By.xpath("//button[normalize-space(text())='ADD TO CART']");
	
	public static final By validateCart = By.xpath("//*[text()='VALIDATE CART']");
	public static final By placeOrder = By.xpath("//*[text()='PLACE ORDER']");
	public static final By orderConfText = By.xpath("//*[text()='Your Order is confirmed!']");
	public static final By orderId = By.xpath("//*[@id='order-confirmation']//b");
	
	public static final By storedeals_67 = By.xpath("//*[@class='tile-list white-tile-list']//li//button/span");
	public static final By promo_item_level = By.xpath("//*[@for='checkbox']");
	public static final By promo_item_level_chkbox = By.xpath("//*[@for='checkbox']//input");
	
	public static final By promoModalClose = By.xpath("//*[@id='order-confirmation-popup-close']");
	
	public static final By noCustfoundOkbtn = By.xpath("//*[text()='No Customer Found']//parent::div//*[text()='OK']");
	public static final By addNewCust = By.xpath("//*[text()='ADD NEW CUSTOMER']");
	
	//Add new customer xpaths
	public static final By Custname = By.xpath("//*[@id='customer-name']");
	public static final By CustEmail = By.xpath("//*[@id='email']");
	public static final By custdetailsDelivRadio = By.xpath("//*[@value='isDeliveryAddress']");
	public static final By custdetailsCarryoutRadio = By.xpath("//*[@value='isCarryoutAddress']");
	public static final By addressType = By.xpath("//*[@id='address-type']");
	public static final By streetAddress = By.xpath("//*[@id='street-address']");
	public static final By streetAddress2 = By.xpath("//*[@id='street-address1']");
	public static final By city = By.xpath("//*[@id='street-address-line-2']");
	public static final By state = By.xpath("//*[@id='street-address-line-3']");
	public static final By zipcode = By.xpath("//*[@id='zip-code']");
	public static final By submitbtn = By.xpath("//*[@id='add-customer-submit']");
	
	public static final By pickUp = By.xpath("//*[text()='PICKUP']");
	public static final By carryOutSearch = By.xpath("//*[@id='carryout-search']");
	public static final By carryOutSearchBtn = By.xpath("//*[@id='carryout-search-button-apply']");
	
	//Cart elements
	public static final By cartEdit = By.xpath("//*[text()='EDIT']");
	public static final By cartRemove = By.xpath("//*[text()='REMOVE']");
	public static final By promoDropDown = By.xpath("//select[starts-with(@id,'item-available-promos')]");
	public static final By promochk = By.xpath("//label[@class='chk-box']");
	public static final By promochkbox = By.xpath("//label[@class='chk-box']//input");
	
	
	//*[@id='promo-code-search']");
	//public static WebElement orderbtn = driver.findElement(validateCart);

}
