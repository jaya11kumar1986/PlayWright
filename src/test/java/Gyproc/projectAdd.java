package Gyproc;

import java.io.IOException;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import Excercise.propReader;

public class projectAdd extends WebTestContext  {
	

	
	public static void project() throws IOException {
		
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

		
		
	}

}
