package Redbusproject;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Base {
static	Page page;
	public static void tearUp() {
		
		Playwright play = Playwright.create();
		Browser browser = play.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		 page= browser.newPage();
		page.navigate("https://www.redbus.in/");
	}

}
