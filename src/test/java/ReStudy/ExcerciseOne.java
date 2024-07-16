package ReStudy;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ExcerciseOne {

	public static void main(String[] args) {
		
	Playwright playwright = Playwright.create();
	Browser launch = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
	Page newPage = launch.newPage();
	newPage.navigate("https://www.google.com/");
	newPage.locator("id=APjFqb").fill("Tamil");
	
	Locator list = newPage.locator("xpath=//*[@id='Alh6id']/div/div/ul/li");
	list.last().waitFor();
	System.out.println(list.count());
	
	for(int i=0;i<list.count();i++) {
		
		System.out.println(list.nth(i).innerText());
	}
		
		

	}

}
