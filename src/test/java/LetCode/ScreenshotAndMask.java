package LetCode;

import java.nio.file.Paths;
import java.util.Arrays;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.ScreenshotOptions;
import com.microsoft.playwright.Playwright;

public class ScreenshotAndMask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Playwright playwright = Playwright.create();
		Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome"));
		Page page = browser.newPage();
		page.navigate("https://www.amazon.in/");

		page.screenshot(new ScreenshotOptions().setPath(Paths.get("./snaps/img.png")).setFullPage(true));

		Locator search = page.locator("xpath=//input[@id='twotabsearchtextbox']");

		search.fill("Mobile");

		search.screenshot(new Locator.ScreenshotOptions().setPath(Paths.get("./snaps/search.png")));

		//mask

		page.screenshot(new ScreenshotOptions().setMask(Arrays.asList(search)).setPath(Paths.get("./snaps/mask.png")));

		playwright.close();
	}


}
