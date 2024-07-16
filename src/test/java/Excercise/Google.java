package Excercise;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Google {

	public static void main(String[] args) {
		
		Playwright playwright = Playwright.create();
		Browser launch = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
		Page page = launch.newPage();
		
		page.navigate("https://www.google.com/");
		
		page.locator("#APjFqb").fill("Tamil");
		
		Locator list = page.locator("xpath=//*[@class='G43f7e']/li");
		
		list.last().waitFor();
		
		for(int i=0;i<list.count();i++) {
			
			String text = list.nth(i).innerText();
			
			System.out.println(text);
			
			if(text.equalsIgnoreCase("tamil to english")) {
				
				list.nth(i).click();
				break;
			}
		}

	}

}
