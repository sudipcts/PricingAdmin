package pages;

import org.openqa.selenium.By;

import com.cognizant.craft.ReusableLibrary;
import com.cognizant.craft.ScriptHelper;

import businesscomponents.ReusableCompDesktop;

public class PJIElements extends ReusableCompDesktop {

	public PJIElements(ScriptHelper scriptHelper) {
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
	
	public static final By accept_radio = By.xpath("//div[@class='alert-banner__checkbox']//input[@id='accept-checkbox']");
	
	public static final By sign_in_link = By.xpath("//a[text()='SIGN IN']");
	public static final By email_address = By.xpath("//input[@id='email']");
	public static final By password = By.xpath("//input[@id='password']");
	public static final By signin_button = By.xpath("//input[@value='Sign In']");
	
	public static final By sendcode = By.xpath("//input[@value='SEND CODE']");
	public static final By otp = By.xpath("//input[@id='accessCodeInput']");
	public static final By continuebtn = By.xpath("//input[@value='CONTINUE']");
	
	//public static final By afterlogintextverification = By.xpath("//*[text()='Viewing offers for your ZIP Code: ']");
	public static final By afterlogintextverification = By.xpath("//h3[starts-with(text(),'Viewing')]");
	
	//public static final By ddDropdown = By.xpath("//span[@class='dropdown-links__dropdown-arrow js-dropdownComponent-arrow']");
	public static final By ddDropdown = By.xpath("//div[normalize-space(text())='What would you like to do today?']//parent::nav//a//span[2]");
	public static final By ddDropdownTwo = By.xpath("//div[normalize-space(text())='What would you like to do today?']//parent::nav//a");
	//public static final By ddDropdownList = By.xpath("//ul[@class='dropdown-links__dropdown-list js-dropdownComponent-list ']//a");
	public static final By ddDropdownList = By.xpath("//div[normalize-space(text())='What would you like to do today?']//parent::nav//ul//a");
	public static final By selectCards = By.xpath("//select[@id='card-selector']");
	
	public static final By selectedcard = By.xpath("//span[@id='select2-card-selector-container']");
	//public static final By displayedcard = By.xpath("//div[@class='form-card-slider__dd-card form-card-slider--masked js-dd-card-masked']");
	public static final By displayedcard = By.xpath("//p[text()='Card Number']//parent::div//child::div[1]");
	public static final By mainbalance = By.xpath("//p[text()='Balance']//parent::div//p[2]//span"); //following-siblings
	public static final By balanceafterpoint = By.xpath("//p[text()='Balance']//parent::div//p[2]//sup");
	
	public static final By balanceValidationmsg = By.xpath("//li[text()='This value should be between 10 and 100.']");
	
	public static final By balfield = By.xpath("//span[text()='$']//parent::div//child::input");
	
	public static final By ccNumber = By.xpath("//legend[text()='Choose Payment Method']//parent::fieldset//li//span[2]");
	public static final By pinField = By.xpath("//input[@name='security-pin']");
	public static final By passwordCCField = By.xpath("//label[text()='Security Code']//parent::div//input");
	public static final By reviewButton = By.xpath("//a[normalize-space(text())='REVIEW']");
	public static final By reviewBtn = By.xpath("//a[normalize-space(text())='Review']");
	
	public static final By previousBalance = By.xpath("//span[text()='Previous Balance: ']//parent::div//span[2]");
	public static final By amountLoaded = By.xpath("//span[text()='Amount Loaded: ']//parent::div//span[2]");
	public static final By newTotalBalance = By.xpath("//p[text()='New Total Balance: ']//parent::div//p[2]");
	public static final By submitBtn = By.xpath("//a[contains(text(),'SUBMIT')]");
	public static final By submitBtn2 = By.xpath("(//a[normalize-space(text())='Submit'])[2]");
	
	public static final By textAfterSubmission = By.xpath("//div[text()='YOUR CARD HAS BEEN LOADED']");
	public static final By confirmationNo = By.xpath("//p[contains(text(),'Confirmation Number')]//span");
	public static final By confirmationText = By.xpath("//div[@class='teaser__text form-add-value-wrapper__success-block-desc js-success-block-desc']");
	public static final By confirmationTextTwo = By.xpath("//*[@class='form-auto-reload-card-mgmt__success-block-desc js-success-block-desc']");
	
	//public static final By CardListAddOrDelete = By.xpath("//h3[text()='Delete a DD Card:']//parent::div//p[text()='Card Number']//parent::div//div");
	public static final By CardListAddOrDelete = By.xpath("//p[text()='Card Number']//parent::div//div");
	public static final By CardListBalance = By.xpath("//*[text()='Balance']//parent::div//p");
	//public static final By DeleteBtn = By.xpath("//h3[text()='Delete a DD Card:']//parent::div//a[text()='Delete']");
	public static final By DeleteBtn = By.xpath("//a[text()='Delete']");
	public static final By DeleteBtnModal = By.xpath("//a[normalize-space(text())='Yes, Delete']");
	public static final By ValidationTextWithBalance = By.xpath("//p[starts-with(text(),'Looks like')]");
	public static final By gotItBtn = By.xpath("//a[normalize-space(text())='Ok, Got It']");
	
	public static final By cardNumber = By.xpath("//input[@id='card-number']");
	public static final By cardPin = By.xpath("//input[@id='pin']");
	public static final By cardSubmit = By.xpath("//input[@value='Submit']");
	public static final By validationInvalidCard = By.xpath("//div[text()='Gift Card or PIN is incorrect']");
	
	//public static final By cardDropdownAutoReload = By.xpath("//span[@id='select2-card-selector-container']//parent::span[@class='select2-selection select2-selection--single']");
	//public static final By cardDropdownAutoReload = By.xpath("(//span[@id='select2-card-selector-container']//parent::span)[1]");
	public static final By cardDropdownAutoReload = By.xpath("(//b[@role='presentation'])[1]");
	public static final By autoReloadCardDropdown = By.xpath("//ul[@id='select2-card-selector-results']//li");
	public static final By headingAutoReload = By.xpath("//legend[text()='Manage Auto Reload']");
	
	public static final By autoReloadStatus = By.xpath("//span[@class='js-auto-reload-status']");
	public static final By autoReloadStatus2nd = By.xpath("//span[text()='On']");
	public static final By autoReloadStatus1st = By.xpath("//span[text()='Off']");
	public static final By autoReloadStatusToOn = By.xpath("//p[text()='On']");
	public static final By autoReloadYesRadio= By.xpath("//span[text()='Yes']");
	public static final By autoReloadNoRadio= By.xpath("//span[text()='No']");
	public static final By byBalance= By.xpath("//a[text()='By Balance']");
	public static final By bySchedule= By.xpath("//a[text()='By Schedule']");
	public static final By statusReview= By.xpath("//p[@class='review-card-image__text js-card-image-auto-reload']");
	public static final By scheduleArrow= By.xpath("//*[@id='auto-reload-schedule-frequency']//parent::div//b");
	public static final By scheduleDropdown= By.xpath("//ul[@id='select2-auto-reload-schedule-frequency-results']//li");
	public static final By scheduleArrowWeekly= By.xpath("//*[@id='schedule-weekly-frequency']//parent::div//b");
	public static final By scheduleArrowMonthly= By.xpath("//*[@id='schedule-monthly-frequency']//parent::div//b");
	public static final By scheduleWeeklyDD= By.xpath("//ul[@id='select2-schedule-weekly-frequency-results']//li");
	public static final By scheduleMonthlyDD= By.xpath("//ul[@id='select2-schedule-monthly-frequency-results']//li");
	public static final By scheduleArrowWeeklyAmount= By.xpath("//*[@id='schedule-weekly-amount']//parent::div//b");
	public static final By scheduleArrowMonthlyAmount= By.xpath("//*[@id='schedule-monthly-amount']//parent::div//b");
	public static final By scheduleMonthlyAmountdd= By.xpath("//ul[@id='select2-schedule-monthly-amount-results']//li");
	public static final By scheduleWeeklyAmountdd= By.xpath("//ul[@id='select2-schedule-weekly-amount-results']//li");
	
	public static final By reloadConfirmationMsg= By.xpath("//div[text()='YOUR ORDER IS COMPLETE']//parent::div//p");
	public static final By submitbtnAutoReloadForYES= By.xpath("//div[@class='form-auto-reload-card-mgmt--submit']//a[normalize-space(text())='Submit']");
	public static final By submitbtnAutoReloadForNO= By.xpath("//div[@class='cta-group   cta-group--desktop-left ']//a[normalize-space(text())='Submit']");
	public static final By reloadOffStatus= By.xpath("//p[@class='form-auto-reload-card-mgmt__updated-block-desc']");
	
	public static final By cardStolentextOne= By.xpath("//*[text()='Report Card Lost']//parent::div//h2");
	public static final By cardStolentextTwo= By.xpath("//*[text()='Report Card Lost']//parent::div//p");
	
	public static final By validationCardWithZeroBal= By.xpath("//div[@class='u-page-error']");
	
	public static final By btnAddCC= By.xpath("//div[normalize-space(text())='Add Credit Card']");
	public static final By CCFirstName= By.xpath("//input[@id='addCCFirstName']");
	public static final By CCLastName= By.xpath("//input[@id='addCCLastName']");
	public static final By CCNumber= By.xpath("//input[@id='creditCardNumber']");
	public static final By CCSelectMonth= By.xpath("(//span[text()='Select Month'])[2]");
	public static final By CCMonths= By.xpath("//ul[@id='select2-cCardMonth-results']//li");
	public static final By CCSelectYear= By.xpath("(//span[text()='Select Year'])[2]");
	public static final By CCYears= By.xpath("//ul[@id='select2-creditCardYear-results']//li");
	public static final By CCPin= By.xpath("(//input[@id='creditCardPin'])[2]");
	public static final By CCPin1st= By.xpath("(//input[@id='creditCardPin'])[1]");
	public static final By radioBtnAddress= By.xpath("//legend[text()='Billing Address']//parent::fieldset//li//span[@class='form-checkradio__input-label']");
	public static final By radioAddress= By.xpath("//legend[text()='Billing Address']//parent::fieldset//span[@class='form-checkradio__input-label']//span[@class='form-checkradio__address-1 js-address-1']");
	public static final By donebtn2nd= By.xpath("(//a[normalize-space(text())='DONE'])[2]");
	public static final By donebtn1st= By.xpath("(//a[normalize-space(text())='DONE'])[1]");
	public static final By donebtninsidemonthly2nd= By.xpath("(//a[normalize-space(text())='Done'])[2]");
	public static final By done= By.xpath("//a[normalize-space(text())='Done']");
	
	public static final By ARStatus= By.xpath("//legend[text()='Auto Reload']//parent::div//h5");
	public static final By ARCriteria1= By.xpath("(//legend[text()='Auto Reload']//parent::div//p)[1]");
	public static final By ARCriteria2= By.xpath("(//legend[text()='Auto Reload']//parent::div//p)[2]");
	public static final By AREdit= By.xpath("(//legend[text()='Auto Reload']//parent::div//a)[1]");
	
	public static final By cardListTransferFrom= By.xpath("//*[text()='Transfer From:']//parent::div//p//parent::div//div");
	public static final By radiobtncardListTransferFrom= By.xpath("//*[text()='Transfer From:']//parent::div//input");
	public static final By MaxBalanceValMsg= By.xpath("(//h3[text()='Transfer Balance']//parent::div//div)[1]");
	
	public static final By valdnMsgAddMaxBal= By.xpath("(//a[normalize-space(text())='REVIEW']//parent::div//parent::div//div)[1]");
	public static final By editCC= By.xpath("//a[@class='js-edit-credit-card']");
	
	public static final By maxCardsValidnMsg= By.xpath("//div[@class='u-page-error']");
	
	public static final By DDCard= By.xpath("//p[text()='DD CARD']//parent::a");
	public static final By manageAccount= By.xpath("//p[text()='Manage Account']//parent::a");
	
	public static final By paymentMethod= By.xpath("//h3[text()='Payment Methods']");
	public static final By ccDeleteBtn= By.xpath("//a[@class='js-delete-credit-card']");
	public static final By ccDeleteContinueBtn= By.xpath("(//a[normalize-space(text())='CONTINUE'])[1]");
	public static final By ccDeleteDoneBtn= By.xpath("(//a[normalize-space(text())='DONE'])[3]");
	
	public static final By ccList= By.xpath("//span[@class='u-credit-card js-credit-card']");
	
	public static final By cardAddSuccessMsg= By.xpath("//span[text()='WOOT!']");
	
	public static final By streetAddOne= By.xpath("(//input[@id='streetAddressOne'])[2]");
	public static final By streetAddTwo= By.xpath("(//input[@id='streetAddressTwo'])[2]");
	public static final By city= By.xpath("(//input[@id='city'])[2]");
	
	
}
