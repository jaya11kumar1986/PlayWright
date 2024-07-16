package SampleProject;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class SachinHundreds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
		Page page = browser.newPage();
		
		page.navigate("https://en.wikipedia.org/wiki/List_of_international_cricket_centuries_by_Sachin_Tendulkar");
		
		Locator list = page.locator("xpath=/html/body/div[2]/div/div[3]/main/div[3]/div[3]/div[1]/table[1]/tbody/tr//th/span");
		
		Locator country = page.locator("xpath=/html/body/div[2]/div/div[3]/main/div[3]/div[3]/div[1]/table[1]/tbody/tr//td[2]/a");
		list.last().waitFor();
		
		for(int i=0;i<list.count();i++) {
			
			System.out.println(list.nth(i).textContent()+"---"+country.nth(i).textContent());
		}
playwright.close();
	}

}
