package Naveen;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType
				.LaunchOptions().setHeadless(false));
		Page page=browser.newPage();
		
		page.navigate("https://www.orangehrm.com/en/30-day-free-trial/");
		
		Locator locators = page.locator("//*[@id=\"Form_getForm_Country\"]/option");
		System.out.println(locators.count());
		
		//for(int i=1;i<=locators.count();i++) {
			
			//System.out.println(locators.nth(i).textContent());
		//}
		
		List<String> allTextContents = locators.allTextContents();
		//for(String e:allTextContents) {
			//System.out.println(e);
		//}
		
		allTextContents.forEach(ele ->System.out.println(ele));

	}

}
