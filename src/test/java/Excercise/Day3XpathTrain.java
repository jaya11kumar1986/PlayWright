package Excercise;

import com.microsoft.playwright.Page;

public class Day3XpathTrain extends WebTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebTest.browserLaunch("https://www.lambdatest.com/selenium-playground/simple-form-demo");
		
		//page.locator("xpath=//input[@type='text' and @placeholder='First Name*']").fill("Hi Tamil");
		page.getByPlaceholder("Please enter your Message").fill("Hi sample");
		page.locator("xpath=//button[@id=\"showInput\"]").click();
		
		String textContent = page.locator("xpath=//p[@id=\"message\"]").textContent();
		System.out.println(textContent);
		
	}

}
