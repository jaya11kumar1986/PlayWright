package Naveen;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class DynamicTableNaveen extends WebTest  {
	
	

	public static void main(String[] args) {
		
		ReportGyproc.startReport();
		
		WebTest.browserLaunch("https://datatables.net/extensions/select/examples/checkbox/checkbox.html");
		ReportGyproc.startTest();
		
		Table.checkBox();
		ReportGyproc.reportStep("This is successfull steps", "PASS");
		ReportGyproc.stopReport();
		
	}

}
