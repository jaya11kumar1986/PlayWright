package Naveen;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DynamicTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
		Page page = browser.newPage();

		//page.navigate("https://demo.guru99.com/test/web-table-element.php");

		//Locator row = page.locator("table.dataTable tr");

		//row.locator(":scope", new Locator.LocatorOptions().setHasText("JK Tyre & Industries")).locator(".selectcheckbox").click();
		//row.locator(":scope").allInnerTexts().forEach(e -> System.out.println(e));

		page.navigate("http://192.168.1.62:84/Home/Index?uid=234JKR5678BMNREWT346");
		page.locator("xpath=//*[@id='lnksheets']").click();

		page.locator("xpath=//*[@id='lnk_static']").click();
		page.waitForLoadState();
		page.locator("xpath=//*[@id='btn_update']").click();

		page.locator("xpath=/html/body/div[5]/div/div[3]/button[1]").click();
		Locator row = page.locator("table#tbl_static_sheet tr");
		

		row.locator(":scope", new Locator.LocatorOptions().setHasText("Disclaimer")).locator(".ui-sortable-handle").click();
		
		page.locator("xpath=//*[@id='btn_update']").click();

		page.locator("xpath=/html/body/div[5]/div/div[3]/button[1]").click();




	}

}
