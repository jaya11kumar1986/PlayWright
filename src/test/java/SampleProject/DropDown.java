package SampleProject;



import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.SelectOption;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType
				.LaunchOptions().setHeadless(false));
		Page page=browser.newPage();
		page.navigate("https://letcode.in/dropdowns");
		//page.selectOption("#fruits","3");
		Locator fruits=page.locator("#fruits");
		//fruits.selectOption("1");
		//fruits.selectOption(new SelectOption().setLabel("Apple"));
		fruits.selectOption(new SelectOption().setIndex(4));
		String textContent=page.locator("p.subtitle").textContent();
		System.out.println(textContent);
		
		Locator heros=page.locator("id=superheros");
		heros.selectOption(new String[] {"aq","ta","ca"});
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		playwright.close();
		
		

	}

}
