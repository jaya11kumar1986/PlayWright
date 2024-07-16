package Excercise;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Day2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playwright playwright = Playwright.create();
		Browser launch = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
		Page page = launch.newPage();
		
		//page.navigate("https://translate.google.com/");
		
		//page.locator(".er8xn").last().fill("Tamil");
		
		page.navigate("https://letcode.in/signin");
		
		//page.getByText("Log in").click();
		
		page.locator("xpath=//input[@name='email']").fill("Tamil");
		
		

	}

}
