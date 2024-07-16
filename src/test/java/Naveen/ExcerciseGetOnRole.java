package Naveen;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ExcerciseGetOnRole {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
		Page page = browser.newPage();
		
		//page.navigate("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		
		//boolean enabled = page.getByText("Register Account").isEnabled();
		//System.out.println(enabled);
		
		//page.getByText("Continue").click();
		
		page.navigate("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		page.locator("form input:has-text('Login')").click();
	}

}
