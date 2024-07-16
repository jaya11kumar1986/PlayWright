package Excercise;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType
				.LaunchOptions().setHeadless(false).setChannel("chrome"));
		Page page=browser.newPage();
		
		page.navigate("https://www.lambdatest.com/selenium-playground/simple-form-demo");
		
		
		page.getByPlaceholder("Please enter your Message").fill("Hi sample");
	    page.locator("id=showInput").click();
	    
	    String textContent = page.locator("xpath=//*[@id=\"message\"]").textContent();
	    System.out.println(textContent);
	    
	    page.locator("id=sum1").fill("10");
	    page.locator("id=sum2").fill("50");
	    page.locator("text=Get Sum").click();
	    
	    String textContent2 = page.locator("id=addmessage").textContent();
	    System.out.println(textContent2);
	    
	    Locator locator = page.locator("text=Simple Form Demo");
	    boolean enabled = locator.isEnabled();
	    
	    System.out.println(enabled);
	    
	   // page.locator("text=Login").click();
	    page.locator("xpath=//a[contains(text(),'Platform')]").click();
	    
	   // Locator locator2 = page.locator("li a h3");
	    
	   // for(int i=1;i<=locator2.count();i++) {
	    	
	    	//System.out.println(locator2.nth(i).textContent());
	   // }
	    
	}

}
