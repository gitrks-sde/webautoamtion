package nop.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import nopcommerce.webautomation.BaseTest;

public class LetShopListeners extends BaseTest implements ITestListener {
	
	static ExtentReports extentReports=new ExtentReports();
	static ExtentSparkReporter extentSparkReporter=new ExtentSparkReporter("extent-report.html");
	static ExtentTest extentTest;
	@Override
	public void onTestStart(ITestResult result) {
		
		ITestListener.super.onTestStart(result);
		extentTest=extentReports.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		ITestListener.super.onTestSuccess(result);
		extentTest.pass("Pass");
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {

		ITestListener.super.onTestFailure(result);
		File filescreenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(filescreenshot, new File("./screenshot.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		extentTest.fail("Fail");
		extentTest.log(Status.FAIL, result.getThrowable());
		extentTest.addScreenCaptureFromPath("./screenshot.png");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		
		ITestListener.super.onStart(context);
		extentSparkReporter.config().setDocumentTitle("LetShop Automation Report");
		extentSparkReporter.config().setReportName("Web Test Report");
		extentReports.attachReporter(extentSparkReporter);
		

	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
		extentReports.flush();
	}

}
