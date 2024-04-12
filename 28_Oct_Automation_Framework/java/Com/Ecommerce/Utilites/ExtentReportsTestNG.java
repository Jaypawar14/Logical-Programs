package Com.Ecommerce.Utilites;


import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportsTestNG {

	static ExtentReports extent;

	public static ExtentReports getReportObject() {

		String Timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());

		String name = "ExtentReport-" + Timestamp;
		
		Path ResourecDirectory =Paths.get("src", "test", "resources");
		
		String absolutepath =ResourecDirectory.toFile().getAbsolutePath();

		String Path = absolutepath+"\\Reports\\"+name+""+".html";
		
//		String path = System.getProperty("user.dir") + "\\src\\test\\resources\\Reports\\" + name + ".html";

		ExtentHtmlReporter reporter = new ExtentHtmlReporter(Path);

		reporter.config().setReportName("28 Oct Automation Framework");

		reporter.config().setDocumentTitle("Execution Report");

		extent = new ExtentReports();

		extent.attachReporter(reporter);

		extent.setSystemInfo("Name", "Jay Pawar");

		extent.setSystemInfo("Suite Name", "Regression/Smoke");

		return extent;

	}

}
