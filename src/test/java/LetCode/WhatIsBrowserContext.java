package LetCode;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class WhatIsBrowserContext {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright playwright = Playwright.create();
		BrowserType browserType = playwright.chromium();
		LaunchOptions setHeadless = new BrowserType.LaunchOptions().setHeadless(false).setChannel("chrome");
		Browser browser = browserType.launch(setHeadless);
		BrowserContext context = browser.newContext();
		Page page = context.newPage();
		
		page.navigate("https://bookcart.azurewebsites.net/login");
		page.getByPlaceholder("Username").type("ortoni");
		page.locator("input[formcontrolname='password']").type("Pass1234$");
		page.locator("button[color='primary']").last().click();
		
		Page newPage = context.newPage();
       newPage.navigate("https://letcode.in/elements");
	}

}
