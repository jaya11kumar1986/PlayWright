package Naveen;

import com.microsoft.playwright.Locator;

public class Table extends WebTest{

	public static void checkBox() {
		
		Locator row = page.locator("table#example tr");
		row.locator(":scope", new Locator.LocatorOptions().setHasText("Ashton Cox")).locator(".dt-select").click();
	}
}
