package SampleProject;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Letcode {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playwright playwrite=Playwright.create();
		Browser browser=playwrite.chromium().launch(new BrowserType.
				LaunchOptions().setHeadless(false));
		Page page=browser.newPage();
		page.navigate("https://letcode.in/");
		System.out.println(page.title());
		page.close();
		browser.close();
		playwrite.close();
		
		
		

	}

}
