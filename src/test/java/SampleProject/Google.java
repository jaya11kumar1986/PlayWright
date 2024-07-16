package SampleProject;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Google {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType
				.LaunchOptions().setHeadless(false).setChannel("chrome"));
		Page page=browser.newPage();
		page.navigate("https://www.google.com/");
		page.locator("#APjFqb").fill("Tamil");
		
		
		Locator locator = page.locator("xpath=/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[4]/div[2]/div[1]/div/ul/li//div/div[2]/div[1]/div[1]/span");
		
		locator.last().waitFor();
		
		System.out.println(locator.count());
		
		for(int i=0;i<locator.count();i++) {
			
			System.out.println(locator.nth(i).textContent());
		}

	}

}
