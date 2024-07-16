package LetCode;

import com.microsoft.playwright.Page;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


public class WindowPopUp extends WebTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebTest.browserLaunch("https://www.lambdatest.com/selenium-playground/window-popup-modal-demo");
		System.out.println(page.title());
		
		Page popup = page.waitForPopup(()->{
			page.getByText("  Follow On Twitter ").click();
		});
		
		popup.waitForLoadState();
		
	
	
		
		System.out.println(popup.title());
		
		

	}

}
