package practice;

import java.nio.file.Paths;

import com.microsoft.playwright.Page.ScreenshotOptions;

public class ScreenShot extends WebTest {
	
	public static void screenShotBasic() {
		
		page.screenshot(new ScreenshotOptions().setPath(Paths.get("./snaps/screen/img.png")));
		
	}

}
