package SampleProject;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class ScreenShot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Playwright playwrite = Playwright.create()) {
			Browser browser=playwrite.chromium().launch(new BrowserType.
					LaunchOptions().setHeadless(false));
		      Page page = browser.newPage();
		      page.navigate("https://playwright.dev/");
		      page.screenshot(new Page.ScreenshotOptions().setPath(Paths.get("example.png")));
		    }
	}

}
