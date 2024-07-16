package Excercise;

import java.io.IOException;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class Gyproc extends WebTest {

	public static void main(String[] args) throws IOException {

		WebTest.browserLaunch("http://192.168.1.62:84/Home/Index?uid=234JKR5678BMNREWT346");

		System.out.println(page.title());

		page.locator("xpath=//button[@id='btnAddProject']").click();

		page.getByPlaceholder("Project Name").fill(propReader.getData("projectName"));

		page.getByPlaceholder("Opportunity No.").fill(propReader.getData("OppNo"));

		page.getByPlaceholder("Account").fill(propReader.getData("AccNo"));

		page.getByPlaceholder("Partition Height").fill(propReader.getData("Press"));

		page.getByPlaceholder("Pressure Value").fill(propReader.getData("Height"));

		Locator segment = page.locator("id=ddl_segment");
		segment.selectOption("Entertainment");

		Locator zone = page.locator("id=ddl_zone");
		zone.selectOption("South");



		page.locator("xpath=//button[@id='btn_submit']").click();

		page.locator("xpath=//div[@class='swal2-actions']//button[@class='swal2-confirm swal2-styled']").click();


		page.locator("xpath=/html/body/div[2]/div[1]/section[2]/div/div/div/div[2]/div/div/div[2]/table/tbody/tr[1]/td[2]/img[5]").click();

		page.locator("xpath=/html/body/div[5]/div/div[3]/button[1]").click();

		page.locator("xpath=/html/body/div[5]/div/div[3]/button[1]").click();

		page.locator("id=lnkwall").click();

		page.getByText("Interior").click();

		Locator wallList = page.locator("id=ddl_int_wallcategory");
		wallList.selectOption("Shaft Wall");

		Locator wallname = page.locator("xpath=/html/body/div[2]/div[1]/section[2]/div/div/div/div[1]/div/div//div/div[2]/div[1]");
		wallname.last().waitFor();
		System.out.println(wallname.count());

		String wall="114.5mm thick Shaftwall (12.5GH+15FR+15FR-70I70-19CB with 50mm GW)";

		page.locator("xpath=//*[text()='"+wall+"']/following::input[1]").click();

		page.locator("xpath=//*[@id='lnksheets']").click();

		page.locator("xpath=//*[@id='lnk_static']").click();

		
		page.locator("xpath=//*[@id='chk_ss_ZAdkZT72tos=']").click();

		page.locator("id=btn_update").click();

		page.locator("xpath=/html/body/div[5]/div/div[3]/button[1]").click();
		
		page.locator("xpath=//*[@id='lnk_cart']").click();
		
		page.locator("id=btn_update_changes").click();
		
		page.locator("id=btnDownloadReport").click();



	}

}
