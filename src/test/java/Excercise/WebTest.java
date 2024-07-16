package Excercise;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class WebTest {
	
	 static Page page;
	
	public static void browserLaunch(String url) {
		
		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType
				.LaunchOptions().setHeadless(false).setChannel("chrome"));
		page=browser.newPage();
		page.navigate(url);
	}

}
