package SampleProject;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LetcodeEnterText {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playwright playwrite=Playwright.create();
		Browser browser=playwrite.chromium().launch(new BrowserType.LaunchOptions()
				.setHeadless(false));
		Page page=browser.newPage();
		page.navigate("https://letcode.in/edit");
		page.locator("#fullName").type("Sample Text");
		//page.locator("#join").fill("Sample Txt");
		Locator locator=page.locator("#join");
		locator.press("End");
		locator.type(" man");
		locator.press("Tab");
		
		String value=page.locator("id=getMe").getAttribute("value");
		System.out.println(value);
		
		page.locator("//*[@id=\"clearMe\"]").clear();
		
				

	}

}
