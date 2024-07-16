package Naveen;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ContextExcercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
		
		BrowserContext bx1 = browser.newContext();
		BrowserContext bx2 = browser.newContext();
		
		Page page1 = bx1.newPage();
		Page page2 = bx2.newPage();
		
		page1.navigate("https://www.google.com/");
		System.out.println(page1.title());
		
		page2.navigate("https://www.amazon.com/");
		System.out.println(page2.title());
		
		//page1.close();
		//page2.close();
		
		
		

	}

}
