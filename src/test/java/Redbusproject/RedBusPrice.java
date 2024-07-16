package Redbusproject;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import com.microsoft.playwright.Locator;

public class RedBusPrice extends Base {
	
	public static void fairCheck() {
		
		//Locator list = page.locator("xpath=//*[@class='seat-fare ']");
		
		Locator buslist = page.locator("xpath=//*[@class='column-two p-right-10 w-30 fl']/div[1]");
		
		for(int i=0;i<buslist.count();i++) {
			
			System.out.println(buslist.nth(i).textContent());
		}

}
	
}
