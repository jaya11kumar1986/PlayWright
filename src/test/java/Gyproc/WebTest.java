package Gyproc;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.ScreenshotOptions;
import com.microsoft.playwright.Playwright;

public class WebTest {

	static Page page;
	static Page page2;

	public static void browserLaunch(String url) {

		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType
				.LaunchOptions().setHeadless(false).setChannel("chrome"));
		page=browser.newPage();
		page.navigate(url);
	}

	public static void screenShot(String path) {

		page.screenshot(new ScreenshotOptions().setPath(Paths.get(path)));
	}

	public static void screenShotFull(String path) {

		page.screenshot(new ScreenshotOptions().setPath(Paths.get(path)).setFullPage(true));
	}
	
	

}
