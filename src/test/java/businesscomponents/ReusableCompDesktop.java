package businesscomponents;


import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.cognizant.craft.*;
import com.cognizant.framework.Status;

import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.interactions.Action;



/**
 * Class for storing business components related to the user registration
 * functionality
 * 
 * @author Cognizant
 */
public class ReusableCompDesktop extends ReusableLibrary {

	/**
	 * Constructor to initialize the component library
	 * 
	 * @param scriptHelper
	 *            The {@link ScriptHelper} object passed from the
	 *            {@link DriverScript}
	 */
	public ReusableCompDesktop(ScriptHelper scriptHelper) {
		super(scriptHelper);
	}
	
	public void LongWait (By Element)
	{
		
	try {
	WebDriverWait wait = new WebDriverWait(driver.getWebDriver(),30);
	wait.until(ExpectedConditions.presenceOfElementLocated(Element));
	report.updateTestLog("ElementPresent",driver.findElement(Element).getText()+" Element is Present", Status.DONE);
	}
	catch(Exception ex) {
	report.updateTestLog("ElementPresent","Element is not Present:"+ex.toString(), Status.FAIL);
	}
	}
	
	public void LongWait_visible (By Element)
	{
		
	try {
		
	WebDriverWait wait= new WebDriverWait(driver.getWebDriver(),15);
    wait.until(ExpectedConditions.elementToBeClickable(Element));
	report.updateTestLog("ElementPresent","Element is Clickable", Status.DONE);
	}
	catch(Exception ex) {
	report.updateTestLog("ElementPresent","Element is not Clickable:"+ex.toString(), Status.FAIL);
	}
	}
	
	
	public void assertElement(By Element)
	{
	LongWait(Element);
	try
	{
	if(driver.findElement(Element).isDisplayed())
	{
	report.updateTestLog("Element -" +"  "+driver.findElement(Element).getText(), " Element is displayed", Status.PASS);
	}
	}
	catch(Exception e)
	{
	report.updateTestLog("Element -" +driver.findElement(Element).getText(),"Element is not displayed"+e.toString(), Status.FAIL);
	}
	}



	 
	public void visibleClick(By Element)
	{
	LongWait(Element);
	try
	{
	driver.findElement(Element).click();
	report.updateTestLog("Click"," Element is clicked", Status.PASS); 
	 
	}
	catch(Exception e)
	{
	report.updateTestLog("Click","Element is not clickable"+e.toString(), Status.FAIL);
	}
	}


	public void sendKeys(By Element, String value)
	{
	LongWait(Element);
	
	    try
	   {
	    	
	 driver.findElement(Element).sendKeys(value);
	report.updateTestLog("Enter Data","Data entered successfully", Status.DONE);  
	    }
	    catch(Exception e)
	    {
	    report.updateTestLog("Enter Data","Data is not entered successfully"+e.toString(), Status.FAIL); 
	    
	 
	    }
	 

	}


	public void scrollToElement(By Element)
	{
		
	    try
	   {
	    	
	   ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Element);
	     
	    }
	    catch(Exception e)
	    {
	   System.out.println(e);
	    }
	    

	}
	
	public void scrollUp(By Element)
	{
		try
		{
			((JavascriptExecutor) driver).executeScript("window.scrollBy(0,-400)", "", Element);
		}
		catch(Exception e)
		{
			System.out.println(e); 
		}
	}
	
	public void cart_verification(List<WebElement> Elements, String value)
	{
	try
	   {
		List<WebElement> cart_menus = Elements;
		for(WebElement menu:cart_menus)
		{
			String menuone = menu.getText();
			System.out.println(menuone);
			if(menuone.equalsIgnoreCase(value))
			{
				report.updateTestLog("Cart Element verification","The cart element is verified", Status.PASS);
			}
		}
	   }
	    catch(Exception e)
	    {
	    	report.updateTestLog("Enter Data","Data is not entered successfully"+e.toString(), Status.FAIL); 
	    }
	}
	
	public String getlocation(String sheetname,String keyname)
    {
          String textvalue = dataTable.getData(sheetname, keyname);
          String abc = "//*[text()="+"'"+textvalue+"'"+"]//ancestor::div[4]//button[text()='Order Pickup']";
          return abc;
          
     }

	public String getdeliverylocation(String sheetname,String keyname)
    {
          String textvalue = dataTable.getData(sheetname, keyname);
          String abc = "//*[text()="+"'"+textvalue+"'"+"]//ancestor::div[4]//button[text()='Order Delivery']";
          return abc;
          
     }

	public String getDeliveryAddress(String sheetname,String keyname)
	{
	      String textvalue = dataTable.getData(sheetname,keyname);
	      String abc = "//*[@class='typeahead-selector']//*[contains(text(),"+"'"+textvalue+"'"+")]";
	      return abc;
	      
	 }
	
	public void verifySelected(By Element)
	{
	LongWait(Element);
	try
	{
	boolean check = driver.findElement(Element).isSelected();
		if(check == true)
		{
			report.updateTestLog("Check checking","The Checkbox is selected", Status.DONE); 
		}
		else {
			report.updateTestLog("Check checking","The Checkbox is not selected", Status.FAIL);
		}
	}
	catch(Exception e)
		{
		report.updateTestLog("Click","Element is not clickable"+e.toString(), Status.FAIL);
		}
	}
	
	public void navigation(int page)
	{
		
		switch(page)
		{
		case 1:
			driver.navigate().back();
		break;
		
		case 2:
			driver.navigate().forward();
		break;
		}
	}
	
	public void selectEleFromList(By Element, String addr)
	{
		try
		{
			List<WebElement> address = driver.findElements(Element);
			for(int i=0; i<address.size(); i++)
			{
				String adddetails = address.get(i).getText();
				System.out.println(adddetails);
				if(adddetails.equalsIgnoreCase(addr))
				{
					address.get(i).click();
					report.updateTestLog("Element selected","Required element selected successfully: "+adddetails, Status.PASS);
					break;
				}
			}
		}
		catch(Exception e)
		{
			report.updateTestLog("Element not selected","Required element not selected: "+addr, Status.FAIL);
		}
	}
	
	public void promoItemLevelCheck(By Element1, By Element2, String addr)
	{
		try
		{
			List<WebElement> address = driver.findElements(Element1);
			List<WebElement> addresschkbox = driver.findElements(Element2);
			System.out.println(addr);
			System.out.println(address.size());
			for(int i=0; i<address.size(); i++)
			{
				String adddetails = address.get(i).getText();
				System.out.println(adddetails);
				if(adddetails.equalsIgnoreCase(addr))
				{
					addresschkbox.get(i).click();
					report.updateTestLog("Element selected","Required element selected successfully: "+adddetails, Status.PASS);
					break;
				}
			}
		}
		catch(Exception e)
		{
			report.updateTestLog("Address not selected","Required address not selected: "+addr, Status.FAIL);
		}
	}
	
	public void scrollTop(By Element)
	{
		try
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("scroll(300, 0)");
		}
		catch(Exception e)
		{
			System.out.println(e); 
		}
	}
	
	public void scrollcart(By Element)
	{
		try
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("scroll(600, 0)");
		}
		catch(Exception e)
		{
			System.out.println(e); 
		}
	}
	
	public void refresh()
	{
		driver.navigate().refresh();
	}
	
	public void LongWaitVisibility(By Element)
	{
		
		//scrollToElementByJavaScript(Element);
		try {
		WebDriverWait wait = new WebDriverWait(driver.getWebDriver(),20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(Element));
		report.updateTestLog("ElementPresent",driver.findElement(Element).getText()+" Element is Present", Status.PASS);
		}
		catch(Exception ex) {
		report.updateTestLog("ElementPresent","Element is not Present:"+ex.toString(), Status.FAIL);
		}
	}
	
	public void scrollToElementByJavaScript(By Element)
	{

		JavascriptExecutor js = (JavascriptExecutor) driver.getWebDriver();
		
		js.executeScript("return document.readyState").equals("complete");
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		List<WebElement> elements = driver.findElements(Element);
		if(elements.size()>0)
			js.executeScript("arguments[0].scrollIntoView();", elements.get(0));
	}
	
	public void LongWaitClickable(By Element)
	{
		
		scrollToElementByJavaScript(Element);
	
	try {
	WebDriverWait wait = new WebDriverWait(driver.getWebDriver(),20);
	wait.until(ExpectedConditions.elementToBeClickable(Element));
	report.updateTestLog("ElementPresent",driver.findElement(Element).getText()+" Element is Present", Status.PASS);
	}
	catch(Exception ex) {
	report.updateTestLog("ElementPresent","Element is not Present:"+ex.toString(), Status.FAIL);
	}
	}
	
	

	/** Assert function for screenshots having long texts **/
	public void assertElement(By Element,String friendlyName)
	{
	LongWait(Element);
	
	try
	{
	if(driver.findElement(Element).isDisplayed())
	{
	report.updateTestLog("Element -" +"  "+((friendlyName!="")?friendlyName:driver.findElement(Element).getText()), " Element is displayed", Status.PASS);
	}
	}
	catch(Exception e)
	{
	report.updateTestLog("Element -" +driver.findElement(Element).getText(),"Element is not displayed "+e.toString(), Status.FAIL);
	}
	}


	public void Click(By Element)
	{
		LongWaitVisibility(Element);
		driver.findElement(Element).click();
		report.updateTestLog("Click"," Element is clicked", Status.PASS); 
		 
	}
	
	public void forceClick(By element)
	{
		try
		{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", element);
		report.updateTestLog("Click"," Element is clicked", Status.PASS);
		}
		catch(Exception e)
		{
		report.updateTestLog("Click","Element: "+element+" is not clickable"+e.toString(), Status.FAIL);
		}
	}
	
	public boolean elementExists(By elementLocator)
	{
		LongWaitVisibility(elementLocator);
		try
		{
			driver.findElement(elementLocator);
			return true;
		 
		}
		catch(Exception e)
		{
			return false;
		}
	}
	
	public void sendKeysOTP(By Element, String value)
	{
	LongWait(Element);
	
	    try
	   {
	    	
	 driver.findElement(Element).sendKeys(value);
	 report.updateTestLog("Enter Data","Data entered successfully", Status.DONE);  
	    }
	    catch(Exception e)
	    {
	    report.updateTestLog("Enter Data","Data is not entered successfully"+e.toString(), Status.FAIL);
	    }
	 

	}
	
	
	public void scrollYcoordinate(By elementToClick)
	{
		// Scroll the browser to the element's Y position
		 
		((JavascriptExecutor)driver).executeScript("window.scrollTo(0,"+((WebElement) elementToClick).getLocation().y+")");
		 
		 
		 
		// Click the element
		 
		((WebElement) elementToClick).click();
	}
	
	
	public void dropdownListSelect(By Element, String ddtext)
	{
		try
		{
			//System.out.println(ddtext);
			String dd = null;
			List<WebElement> ddlists = driver.findElements(Element);
			for(WebElement ddlist : ddlists)
			{
				dd = ddlist.getText();
				System.out.println("cards:"+dd);
				if(dd.equalsIgnoreCase(ddtext))
				{
					ddlist.click();	
					report.updateTestLog("Element-"+dd+" found","Element "+dd+" selected", Status.PASS);
					break;	
				}
			}	
		}
		catch(Exception e)
		{
			report.updateTestLog("Element-"+ddtext,"Element "+ddtext+" has not been selected"+e.toString(), Status.FAIL);
		}
	}
	
	public void cardChoosing(By Element, String cardnumber)
	{
		try
		{
		scrollToElement(Element);
		WebElement cards = driver.findElement(Element);
		Select d = new Select(cards);
		List<WebElement> opts = d.getOptions();
		for(WebElement opt : opts)
		{
			String num = opt.getText();
			if(num.equalsIgnoreCase(cardnumber))
			{
				opt.click();
				report.updateTestLog("Element- Card number "+num+" found","Element with Card number "+num+" selected", Status.PASS);
				break;
			}
		}
		}
		catch(Exception e)
		{
			report.updateTestLog("Element- Card number "+cardnumber+" not found","Element with Card number "+cardnumber+" not selected"+e.toString(), Status.FAIL);
		}
	}
	
	public void cardChoose(By Element, By Element1, By Element2)
	{
		scrollToElement(Element);
		String num = null;
		Float bal = null ;
		try
		{
		WebElement cards = driver.findElement(Element);
		Select d = new Select(cards);
		List<WebElement> opts = d.getOptions();
		for(int i =0; i< opts.size(); i++)
		{
			String mainbalance = driver.findElement(Element1).getText();
			String pointbalance = driver.findElement(Element2).getText();
			String combinedbalance = mainbalance+pointbalance;
			bal = Float.parseFloat(combinedbalance.replace("$", ""));
			if(bal<115.00)
			{
				num = opts.get(i).getText();
				d.selectByIndex(i);
				report.updateTestLog("Element- Card number "+num+" found","Element with Card number "+num+" selected", Status.PASS);
				break;
			}
			else{
				d.selectByIndex(i+1);
			}
		}
		}
		catch(Exception e)
		{
			report.updateTestLog("Element- Card number "+num+" not found","Element with Card number "+num+" not selected"+e.toString(), Status.FAIL);
		}
	}
	
	public void cardVerify(By Element1, By Element2)
	{
		try
		{
		String selectedcardnumber = driver.findElement(Element1).getText();
		String selectnum = selectedcardnumber.replace("••••••••••••", "");
		//System.out.println(selectnum);
		int result1 = Integer.parseInt(selectnum);
		
		String displayedcardnumber = driver.findElement(Element2).getText();
		//System.out.println(displayedcardnumber);
		int result2 = Integer.parseInt(displayedcardnumber);
			if(result1 == result2)
			{
				//System.out.println(displayedcardnumber);
				report.updateTestLog("Card verification","Selected card "+selectedcardnumber+" matches with the displayed card "+displayedcardnumber, Status.PASS);
			}
		}
		catch(Exception e)
		{
			System.out.println("test");
			report.updateTestLog("Card verification","Selected card doesn't matches with the displayed card "+e.toString(), Status.FAIL);
		}	
	}
	
	public Float verifyBalance(By Element1, By Element2)
	{
		Float bal = null ;
		try
		{
			String mainbalance = driver.findElement(Element1).getText();
			String pointbalance = driver.findElement(Element2).getText();
			String combinedbalance = mainbalance+pointbalance;
			bal = Float.parseFloat(combinedbalance.replace("$", ""));  //parseFloat(combinedbalance.replace("$", ""));
			report.updateTestLog("Balance verification","Displayed balance is "+combinedbalance, Status.PASS);
		}
		catch(Exception e)
		{
			report.updateTestLog("Balance verification","Displayed balance doesn't matches with the expected balance. "+e.toString(), Status.FAIL);
		}
		return bal;
	}
	
	public void balanceValidation(By Element1, String valMsg)
	{
		String validationMsg = driver.findElement(Element1).getText();
		try
		{
		if(validationMsg.equalsIgnoreCase(valMsg))
			{
				report.updateTestLog("Min. and Max. message validation","Min. and Max. amount validation message verified- "+validationMsg, Status.PASS);
			}
		}
		catch(Exception e)
		{
			report.updateTestLog("Min. and Max. message validation","Validation message doesn't appear "+e.toString(), Status.FAIL);
		}
	}
	
	public void selectCC(By Element1,By Element2, String ccInt, String csv)
	{
		try
		{
			//JavascriptExecutor js = (JavascriptExecutor)driver;
			int ccInt1 = Integer.parseInt(ccInt);
			System.out.println("ccint1"+ccInt1);
			int ccId = 0;
			List<WebElement> ccNumbers = driver.findElements(Element1);
			for(ccId=0; ccId< ccNumbers.size(); ccId++)
			{
				String cc = ccNumbers.get(ccId).getText();
				int ccInt2 = Integer.parseInt(cc);
				System.out.println("ccint2"+ccInt2);
				if(ccInt1 == ccInt2)
				{
					//js.executeScript("arguments[0].click();", ccNumbers.get(ccId));
					ccNumbers.get(ccId).click();
					report.updateTestLog("Card selected","Required card selected successfully: "+ccInt2, Status.PASS);
					List<WebElement> fields = driver.findElements(Element2);
					fields.get(ccId).click();
					fields.get(ccId).sendKeys(csv);
					break;
				}
			}
		}
		catch(Exception e)
		{
			report.updateTestLog("Exception section","Required card not selected: "+e.toString(), Status.FAIL);
		}
	}
	
	public void balReview(By Element1, By Element2, By Element3, Float balance, String actualamount)
	{
		try{
			String previous = driver.findElement(Element1).getText();
			System.out.println("Previous: "+previous);
			Float prevbal = Float.parseFloat(previous.replace("$", ""));
			System.out.println("prevbal: "+prevbal);
			if(prevbal.equals(balance))
			{
				report.updateTestLog("Matching Previous Balance","Displayed previous balance verified successfully: "+previous, Status.PASS);
			}
			else{
				report.updateTestLog("Matching Previous Balance","Displayed previous balance:"+previous+" does not matches with the original: "+balance, Status.FAIL);
			}
			
			String amountLoaded = driver.findElement(Element2).getText();
			Float actLoad = Float.parseFloat(amountLoaded.replace("$", ""));
			Float amtLoading = Float.parseFloat(actualamount);
			
			if(actLoad.equals(amtLoading))
			{
				report.updateTestLog("Matching Load balance","Displayed load balance verified successfully: "+actLoad, Status.PASS);
			}
			else{
				report.updateTestLog("Matching Load balance","Displayed load balance:"+actLoad+" does not matches with the original: "+amtLoading, Status.FAIL);
			}
			
			
			Float originalTotal = balance+amtLoading;
			String totalBalance = driver.findElement(Element3).getText();
			Float totBl = Float.parseFloat(totalBalance.replace("$", ""));
			if(totBl.equals(originalTotal))
			{
				report.updateTestLog("Total balance","Displayed total Balance: "+totBl, Status.PASS);
			}
			else{
				report.updateTestLog("Total balance","Displayed total balance:"+totBl+" does not matches with the original: "+originalTotal, Status.FAIL);
			}
		}
		catch(Exception e)
		{
			report.updateTestLog("Balance review error","Error is: "+e.toString(), Status.FAIL);
		}
		
	}
	
	public void deleteCardWithBalance(By Element1, String cardNumber, By Element2)
	{
		int cNum1 = Integer.parseInt(cardNumber);
		List<WebElement> cardsList = driver.findElements(Element1);
		for(int i=0; i<cardsList.size(); i++)
		{
			String cardNumberStr = cardsList.get(i).getText();
			int cNum2 = Integer.parseInt(cardNumberStr);
			if(cNum1 == cNum2)
			{
				driver.findElements(Element2).get(i).click();
				break;
			}
		}
	}
	
	public void statusAutoReload(By Element1, String str1)
	{
		String status = null;
		
		try
		{
			status = driver.findElement(Element1).getText();
			if(status.equalsIgnoreCase(str1))
			{
				report.updateTestLog("Status AutoReload","Auto Reload Status: "+status, Status.PASS);
			}
			else{
				report.updateTestLog("Status AutoReload","Auto Reload Status: "+status, Status.FAIL);
			}
		}
		catch(Exception e)
		{
			report.updateTestLog("Status AutoReload","Auto Reload Status: "+status+ e.toString(), Status.FAIL);
		}
	}
	
	public void autoReloadStatus(By Element)
	{
		try
		{
			LongWait(Element);
			report.updateTestLog("Status AutoReload","Auto Reload Status: "+driver.findElement(Element).getText(), Status.PASS);
		}
		catch(Exception e)
		{
			report.updateTestLog("Status AutoReload","Auto Reload Status: "+ e.toString(), Status.FAIL);
		}
	}
	
	public void savedCardsLists(By Element1, By Element2, By Element3)
	{
		try
		{
			List<WebElement> cards = driver.findElements(Element1);
			for(int i=0; i<cards.size(); i++)
			{
				report.updateTestLog("Cards Last Four digits ","DDCARDS Displayed Last Four digits: "+cards.get(i).getText(), Status.PASS);
				report.updateTestLog("Delete Button for card: "+cards.get(i).getText(),"Delete Button Is Displayed: "+driver.findElements(Element2).get(i).getText(), Status.PASS);
				report.updateTestLog("Balance for: "+cards.get(i).getText()+" is displayed","Balance is: "+driver.findElements(Element3).get(i).getText(), Status.PASS);
			}
		}
		catch(Exception e)
		{
			report.updateTestLog("Saved cards elements error","Error: "+ e.toString(), Status.FAIL);
		}
	}
	
	public void assertTextValidation(By Element1, String str1)
	{
		try
		{
			String str2 = driver.findElement(Element1).getText();
			if(str2.equalsIgnoreCase(str1))
			{
				report.updateTestLog("Validating Text Message","Displayed message: "+str2+" matches with the required message: "+str1, Status.DONE);
			}
			else{
				report.updateTestLog("Validating Text Message","Displayed message: "+str2+" does not matches with the required message: "+str1, Status.FAIL);
			}
		}
		catch(Exception e)
		{
			report.updateTestLog("Exception message ","Error: "+ e.toString(), Status.FAIL);
		}
	}
	
	public void dropDownClick(By Element1, By Element2, String option)
	{
		LongWait(Element1);
		try
		{
			driver.findElement(Element1).click();
			List<WebElement> months = driver.findElements(Element2);
			for(WebElement reqMonth :months)
			{
				String num = reqMonth.getText();
				if(num.equalsIgnoreCase(option))
				{
					reqMonth.click();
					report.updateTestLog("Required Element Selected","Element: "+num, Status.PASS);
					break;
				}
			}
		}
		catch(Exception e)
		{
			report.updateTestLog("Exception message selecting month and year","Error: "+ e.toString(), Status.FAIL);
		}
	}
	
	public void selectingAddress(By Element1, By Element2, String actualAddress)
	{
		LongWait(Element1);
		
		LongWait(Element2);
		try
		{
			List<WebElement> address = driver.findElements(Element1);
			for(int i=0; i<address.size(); i++)
			{
				String addr = address.get(i).getText();
				if(addr.equalsIgnoreCase(actualAddress))
				{
					driver.findElements(Element2).get(i).click();
					report.updateTestLog("Required Element Selected","Element: "+addr, Status.PASS);
					break;
				}
			}
		}
		catch(Exception e)
		{
			report.updateTestLog("Exception message selecting month and year","Error: "+ e.toString(), Status.FAIL);
		}
	}
	
	public void transferBalCardClick(By Element1, By Element2, String num)
	{
		try
		{
			int number  = Integer.parseInt(num);
			List<WebElement> cards = driver.findElements(Element1);
			for(int i=0; i<cards.size(); i++)
			{
				int cardnum = Integer.parseInt(cards.get(i).getText());
				if(cardnum == number)
				{
					driver.findElements(Element2).get(i).click();
					report.updateTestLog("Required Element Selected","Element: "+cardnum, Status.PASS);
					break;
				}
			}
		}
		catch(Exception e)
		{
			report.updateTestLog("Exception message selecting card","Error: "+ e.toString(), Status.FAIL);
		}
	}
	
	public Float addMaxValue(By Element1, By Element2, By Element3)
	{
		Float bal = null ;
		try
		{
			String mainbalance = driver.findElement(Element1).getText();
			String pointbalance = driver.findElement(Element2).getText();
			String combinedbalance = mainbalance+pointbalance;
			sendKeys(Element3, "100");
			report.updateTestLog("Balance verification","Displayed balance is "+combinedbalance, Status.PASS);
			report.updateTestLog("Balance added","Added balance is $100", Status.DONE);
		}
		catch(Exception e)
		{
			report.updateTestLog("Balance verification","Displayed balance doesn't matches with the expected balance. "+e.toString(), Status.FAIL);
		}
		return bal;
	}
	
	public void editCreditCard(By Element1, By Element2, String ccInt )
	{
		try
		{
			int ccInt1 = Integer.parseInt(ccInt);
			System.out.println("ccint1"+ccInt1);
			int ccId = 0;
			List<WebElement> ccNumbers = driver.findElements(Element1);
			for(ccId=0; ccId< ccNumbers.size(); ccId++)
			{
				String cc = ccNumbers.get(ccId).getText();
				int ccInt2 = Integer.parseInt(cc);
				System.out.println("ccint2"+ccInt2);
				if(ccInt1 == ccInt2)
				{
					report.updateTestLog("Card selected","Required card selected successfully: "+ccInt2, Status.PASS);
					List<WebElement> fields = driver.findElements(Element2);
					fields.get(ccId).click();
					break;
				}
			}
		}
		catch(Exception e)
		{
			report.updateTestLog("Exception section","Required card not selected: "+e.toString(), Status.FAIL);
		}
	}
	
	public void csv(By Element1,By Element2, String ccInt, String csv)
	{
		try
		{
			//JavascriptExecutor js = (JavascriptExecutor)driver;
			int ccInt1 = Integer.parseInt(ccInt);
			System.out.println("ccint1"+ccInt1);
			int ccId = 0;
			List<WebElement> ccNumbers = driver.findElements(Element1);
			for(ccId=0; ccId< ccNumbers.size(); ccId++)
			{
				String cc = ccNumbers.get(ccId).getText();
				int ccInt2 = Integer.parseInt(cc);
				System.out.println("ccint2"+ccInt2);
				if(ccInt1 == ccInt2)
				{
					List<WebElement> fields = driver.findElements(Element2);
					fields.get(ccId).click();
					fields.get(ccId).sendKeys(csv);
					report.updateTestLog("Card selected","CSV entered in the selected card successfully: "+ccInt2, Status.PASS);
					break;
				}
			}
		}
		catch(Exception e)
		{
			report.updateTestLog("Exception section","Required card not selected: "+e.toString(), Status.FAIL);
		}
	}
	
	public void ccDelete(By Element1, By Element2, String ccnum)
	{
		try
		{
			scrollToElement(Element1);
			List<WebElement> cclists = driver.findElements(Element1);
			for(int i=0; i<cclists.size(); i++)
			{
				String cardnum = cclists.get(i).getText();
				if(cardnum.equalsIgnoreCase(ccnum))
				{
					driver.findElements(Element2).get(i).click();
					report.updateTestLog("Element selected","Card "+cardnum+"deleted successfully ", Status.DONE);
					break;
				}
			}
		}
		catch(Exception e)
		{
			report.updateTestLog("Exception section","Required card not selected and deleted: "+e.toString(), Status.FAIL);
		}

	}
	
//	public void action(By Element)
//	{
//		WebElement actionEle = driver.findElement(Element);
//		Actions actions = new Actions(driver);
//		actions.moveToElement(actionEle);
//		actions.perform();
//		//actions.moveToElement(element).click().perform();
//	}
	
	public void selectItemPromo(By Element1, String promoname1)
	{
		List<WebElement> promoSelect = driver.findElements(Element1);
		for(int a=1; a<=promoSelect.size(); a++)
		{
			Select promoDD = new Select(promoSelect.get(a));
			List<WebElement> prolists = promoDD.getOptions();
			for(int i=0; i<prolists.size(); i++)
			{
				String proname_indexed = promoname1 + " - "+(a+1);
				String promoname2 = prolists.get(i).getText();
				if(proname_indexed.equalsIgnoreCase(promoname2))
				{
					prolists.get(i).click();
					break;
				}
			}
		}
	}
	
	public void promoItemLevelCheckbox(By Element1)
	{
		try
		{
			List<WebElement> address = driver.findElements(Element1);
			for(int i=0; i<address.size(); i++)
			{
				address.get(i).click();
			}
		}
		catch(Exception e)
		{
			report.updateTestLog("Promo not selected","Promo not checked", Status.FAIL);
		}
	}
	
	

}