package practice;

import com.microsoft.playwright.Locator;

public class DynamicTable extends WebTest {
	
	public static void Table() {
		
		Locator row = page.locator("table#example tr");
		row.locator(":scope", new Locator.LocatorOptions().setHasText("Ashton Cox")).locator(".dt-select").click();
	}

}
