package SampleProject;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class OrangeHrm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType
				.LaunchOptions().setHeadless(false).setChannel("chrome"));
		Page page = browser.newPage();
		
		page.navigate("https://www.orangehrm.com/en/30-day-free-trial/");
		
		page.getByPlaceholder("Your Full Name*").type("Tamil");
		page.getByPlaceholder("Business Email*").type("Sample");

	}

}
