package Gyproc;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class wallSystem extends WebTestContext  {

	
	public static void wall() {
		
		page.locator("id=lnkwall").click();

		page.getByText("Interior").click();

		Locator wallList = page.locator("id=ddl_int_wallcategory");
		wallList.selectOption("Shaft Wall");

		Locator wallname = page.locator("xpath=/html/body/div[2]/div[1]/section[2]/div/div/div/div[1]/div/div//div/div[2]/div[1]");
		wallname.last().waitFor();
		System.out.println(wallname.count());

		String wall="114.5mm thick Shaftwall (12.5GH+15FR+15FR-70I70-19CB with 50mm GW)";

		page.locator("xpath=//*[text()='"+wall+"']/following::input[1]").click();
	}
	
	public static void sheet() {
		page.locator("xpath=//*[@id='lnksheets']").click();

		page.locator("xpath=//*[@id='lnk_static']").click();

		
		page.locator("xpath=//*[@id='chk_ss_ZAdkZT72tos=']").click();
		
		
		page.locator("id=btn_update").click();

		page.locator("xpath=/html/body/div[5]/div/div[3]/button[1]").click();
		
		page.waitForLoadState();
		
		page.locator("xpath=//*[@id='lnksheets']").click();
		
		page.locator("id=lnk_cart").click();
		
		page.locator("xpath=//button[@id='btn_update_changes']").click();
		
		page.locator("xpath=/html/body/div[5]/div/div[3]/button[1]").click();
		
		page.locator("id=btnDownloadReport").click();

}
}
