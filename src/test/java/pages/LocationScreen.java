package pages;

import org.openqa.selenium.By;
import com.cognizant.craft.ReusableLibrary;
import com.cognizant.craft.ScriptHelper;


/**
 * UserRegistrationPage class
 * 
 * @author Cognizant
 */
public class LocationScreen extends ReusableLibrary {
	// UI Map object definitions

	protected LocationScreen(ScriptHelper scriptHelper) {
		super(scriptHelper);
		// TODO Auto-generated constructor stub
	}

	
	public static final By txt_username = By.xpath("//input[@id='LoginControl_UserName']");
	public static final By txt_password = By.xpath("//input[@id='LoginControl_Password']");
	public static final By btn_login = By.name("LoginControl$Button1");
	public static final By lbl_fullmenu = By.xpath("//h1[text()='Full Menu']");
	public static final By lnk_locations = By.xpath("//*[text()='Locations']");

	public static final By lnk_set_orderlocations = By.xpath("//*[text()='Set Order Location']");
	public static final By txt_searchLocation = By.xpath("(//form//label[@class='visuallyhidden']//following-sibling::input)[2]");
	public static final By btn_Search = By.xpath("//*[text()='Search']");
	
	public static final By stores_name = By.xpath("//*[@class='location-card landmark hidden-below-desk']//h2");
	
	//Cart item locations
	public static final By cart_menu = By.xpath("//div[@class='main-item']//h4[1]");
	public static final By cart_menu_price = By.xpath("//div[@class='main-item']//h4[2]");
	public static final By cart_sub_menu = By.xpath("//div[@class='landmarklet']/strong");
	public static final By cart_location = By.xpath("//footer[@class='cart-footer']//a[1]");
	public static final By cart_location_time = By.xpath("(//*[text()='Pickup at']//a)[4]");
	public static final By cart_total = By.xpath("//span[@class='h4 cart-total landmarkless']");
	public static final By checkout_btn = By.xpath("//*[text()='Checkout']");
	
	//checkout page locations
	public static final By first_name = By.xpath("//input[@id='fname']");
	public static final By last_name = By.xpath("//input[@id='lname']");
	public static final By email = By.xpath("//input[@id='email']");
	public static final By phone = By.xpath("//input[@id='phone']");
	
	
	//delivery xpaths
	public static final By txt_deliveryAddress = By.xpath("//*[@placeholder='Enter Delivery Address*']");
	public static final By btn_checkDeliveryAddress = By.xpath("//input[@value='Check Delivery Address']");
	public static final By btn_yesSoundsGood = By.xpath("(//*[@class='landmark']//following:: button)[1]"); 
	
	//day/time/location change locations
	public static final By date_time_header = By.xpath("//span[text()='at']//a[2]");
	public static final By date_time_footer = By.xpath("(//span[text()='at']//a[2])[2]");
	//public static final By datetime = By.xpath("//*[text()='at']//following::a[2]");
	public static final By location_header = By.xpath("//span[text()='Delivery to']//a[1]");
	
	
	//public static final By days = By.xpath("//label[text()='Delivery Date:']//following::select");
	public static final By days_dropdown = By.xpath("//label[text()='Delivery Date:']//following::select[1]");
	public static final By time_dropdown = By.xpath("//label[text()='Delivery Date:']//following::select[2]");
	
	//thursday or any day menu locations
	//thursday or any day boneless
	public static final By wings = By.xpath("//h2[text()='Wings']");
	public static final By boneless_thu = By.xpath("//div[text()='BONELESS THURSDAY']");
	public static final By no_sauces = By.xpath("//h3[text()='No Sauce or Seasoning']");
	public static final By ranch_add = By.xpath("//h2[text()='Ranch']//following::button[text()='Add'][1]");
	//add another item
	public static final By add_another_item = By.xpath("//a[text()='Add Another Item']");
	//thursday lunch
	public static final By lunch = By.xpath("//h2[text()='Lunch']");
	public static final By lunch_garden_salad = By.xpath("//*[text()='GARDEN SALAD']");
	public static final By lunch_sides = By.xpath("//button[text()='French Fries']");
	
	//view order
	public static final By view_order = By.xpath("//button[text()='View Order']");
	
	
	//normal boneless
	public static final By boneless = By.xpath("//div[text()='BONELESS WINGS']");
	
	//delivery location box
	public static final By heading_DL = By.xpath("//h1[text()='Delivery Location']");
	public static final By default_chkbx = By.xpath("(//input[@type = 'checkbox'])[1]");
	public static final By default_add = By.xpath("//li[@class='landmarklet']");
	public static final By default_input_field = By.xpath("//input[@placeholder='Enter Delivery Address*']");
	public static final By search_button = By.xpath("(//button[text()='Search'])[1]");
	
	public static final By leftmenupanel_food = By.xpath("//a[text()='Food']");
	public static final By food_sharables = By.xpath("//a[text()='Sharables']");
	
	public static final By ato_ultimate_nachos = By.xpath("(//button[text()='Add To Order'])[1]");
	public static final By selectLocToOrder_nachos = By.xpath("//a[text()='Select Location to Order']");
}