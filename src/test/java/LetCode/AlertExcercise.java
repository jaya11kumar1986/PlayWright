package LetCode;

import com.microsoft.playwright.Page;

public class AlertExcercise extends WebTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebTest.browserLaunch("https://letcode.in/alert");
		
		
		
		page.onDialog(dialog ->{
			
			System.out.println(dialog.message());
			dialog.accept("Tamil");
			//dialog.dismiss();
			
		});
		
		page.locator("xpath=//button[text()='Simple Alert']").click();
		page.locator("xpath=//button[text()='Prompt Alert']").click();
		
		System.out.println(page.locator("xpath=//p[@id='myName']").textContent());
	}

}
