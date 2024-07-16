package LetCode;

import com.microsoft.playwright.Page;

public class LetWindow extends WebTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebTest.browserLaunch("https://letcode.in/windows");
		System.out.println(page.title());
		System.out.println(page.url());
		Page popup = page.waitForPopup(() ->{
			page.getByText("Open Home Page").click();
		});
		
		popup.waitForLoadState();
		
		System.out.println(popup.title());
		System.out.println(popup.url());
		
		popup.getByText("Log in").click();
		
		System.out.println(popup.title());
		
		popup.locator("xpath=//input[@name='email']").fill("Tamil");
		popup.locator("xpath=//input[@name='password']").fill("Tamil");
		
		
		
		
	

	}

}
