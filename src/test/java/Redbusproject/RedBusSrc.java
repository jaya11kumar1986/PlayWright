package Redbusproject;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class RedBusSrc extends Base {
	
	

	public static void boardingPlace(String pla,String Place) {

		

		page.locator("#src").fill(pla);

		Locator srcList = page.locator("xpath=//div[@class='sc-gZMcBi hviMLb']");

		srcList.last().waitFor();

		for(int i=0;i<srcList.count();i++) {

			String innerText = srcList.nth(i).textContent();

			//System.out.println(innerText);
			if(innerText.contains(Place)) {

				srcList.nth(i).click();
				break;
			}




		}



	}

}
