package Naveen;

import java.io.File;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.Page.ScreenshotOptions;
import java.io.IOException;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ReportGyproc extends WebTest {

	static ExtentSparkReporter reporter;
	static ExtentReports extent;
	static ExtentTest test;


	public static String htmlReportPath="./reports/result"+new SimpleDateFormat("dd-MMM-yy - HH.mm.ss ").format(new Date())+".html";
    public static String screenShotFolder="./reports/ScreenShot"+new SimpleDateFormat("dd-MMM-yy - HH.mm.ss").format(new Date())+"/";

	public static void startReport( ){

		String htmlReportPath="./reports/result"+new SimpleDateFormat("dd-MMM-yy - HH.mm.ss ")
				.format(new Date())+".html";


		reporter=new ExtentSparkReporter(htmlReportPath);

		extent=new ExtentReports();

		extent.attachReporter(reporter);
	}
	
	public static void reportStep(String desc, String status) {

		 String fileName = new SimpleDateFormat("dd-MMM-yy - HH-mm-ss").format(new Date());
      page.screenshot(new ScreenshotOptions().setPath(Paths.get(screenShotFolder+"/"+fileName+".png")));
      if(status.toUpperCase().equals("PASS")){
          //test.log(LogStatus.PASS, desc+test.addScreenCaptureFromPath("./."+screenShotFolder+testCaseName+"/"+fileName+".jpg"));
         test.log(Status.PASS, desc+test.addScreenCaptureFromPath("./."+screenShotFolder+"/"+fileName+".jpg"));
      }
    }

	public static void stopReport() {

		extent.flush();
	}

	public static void startTest() {
		test=extent.createTest("Dynamic table","This is the basic level test")
				.info("This is try to select the check box");


	}

	
}
