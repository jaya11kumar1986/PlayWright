package LetCode;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class MultiWebElement {
	
	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		Page page = browser.newPage();
		
		page.navigate("https://letcode.in/elements");
		//page.locator("name=username").first().type("ortonikc");
		page.getByPlaceholder("Enter your").type("ortonikc");
		page.locator("id=search").click();
		
		Locator locators = page.locator("ol li a");
		
		locators.last().waitFor();
		System.out.println(locators.count());
		
		for(int i=0;i<locators.count();i++) {
			
			System.out.println(locators.nth(i).textContent());
		}
	}

}
