package Gyproc;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.Page.ScreenshotOptions;

public class WebTestContext {
	static Page page;
	public static void browserLaunchContext(String url) {
		Playwright playwright=Playwright.create();
		Browser browser=playwright.chromium().launch(new BrowserType
				.LaunchOptions().setHeadless(false).setChannel("chrome"));
		BrowserContext context = browser.newContext(new Browser.NewContextOptions()
				.setRecordVideoDir(Paths.get("videos/")).setRecordVideoSize(1280,720));
		 page = context.newPage();
		page.navigate(url);
		
	}
	
	public static void screenShot(String path) {

		page.screenshot(new ScreenshotOptions().setPath(Paths.get(path)));
	}

	public static void screenShotFull(String path) {

		page.screenshot(new ScreenshotOptions().setPath(Paths.get(path)).setFullPage(true));
	}

}
