package Com.Ecommerce.Utilites;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;

public class Listners extends Ecommerce_BaseClass implements ITestListener {

	ExtentTest test;

	ExtentReports extent = ExtentReportsTestNG.getReportObject();

	ThreadLocal<ExtentTest> Extenttest = new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
		test = extent.createTest(result.getMethod().getMethodName());
		Extenttest.set(test);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Extenttest.get().log(Status.PASS, "Test Case Pass");
	}

	public void onTestFailure(ITestResult result) {

		Extenttest.get().log(Status.FAIL, "Test failed");

		String testmethodname = result.getMethod().getMethodName();

		try {
			driver = (WebDriver) result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			try {
				Extenttest.get().addScreenCaptureFromPath(GenericUtils.GetScreenshotAs(testmethodname, driver),
						result.getMethod().getMethodName());
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
	}

//	@Override
//	public void onTestSkipped(ITestResult result) {
//		Extenttest.get().log(Status.SKIP, "Test Case Skiped");
//		result.getMethod().getMethodName();
//	}

	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
	}

}
