package SampleProject;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class AlertExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType
				.LaunchOptions().setHeadless(false));
		Page page = browser.newPage();
		
		page.navigate("https://letcode.in/alert");
		
		page.onceDialog(dialog ->{
			System.out.println(dialog.message());
			//dialog.dismiss();
			dialog.accept("Hi");
		});
		
		//page.locator("#accept").click();
		
		page.locator("#prompt").click();
		String textContent = page.locator("#myName").textContent();
		System.out.println(textContent);

	}

}
