package Com.Ecommerce.Utilites;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import Com.Ecommerce.BaseClass.Ecommerce_BaseClass;
import net.bytebuddy.utility.RandomString;

public class GenericUtils extends Ecommerce_BaseClass {

	public static String GetScreenshotAs() throws IOException {

		File Screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		

		String Timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	
		String Name = "E_Com" +Timestamp+".png";

//		String TT = RandomString.make(2);
//
//		String Name = "ECom" + TT + ".png";

		Path FolderPath = Paths.get("src", "test", "resources");

		String ScreenshotPath = FolderPath.toFile().getAbsolutePath();

		String Act_Path = ScreenshotPath + "\\Screenshots\\" + Name;

		FileUtils.copyFile(Screen, new File(Act_Path));

		return ScreenshotPath;

	}

	public static void Clickonelement_By_Java_Script_Executor(WebElement element, WebDriver driver) {

		JavascriptExecutor js = ((JavascriptExecutor) driver);

		js.executeScript("arguments[0].click;", element);

	}

//	public static WebElement Wait_for_element(WebDriver driver, WebElement locator, int timeout) {
//
//		WebDriverWait Mywait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
//
//		Mywait.until(ExpectedConditions.presenceOfElementLocated((By) locator));
//
//		return driver.findElement((By) locator);
//	}
	
	public static String GetScreenshotAs(String TestCasename,WebDriver driver) throws IOException {

		File Screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		

		String Timestamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());
	
		String Name =  TestCasename+Timestamp;

//		String TT = RandomString.make(2);
//
//		String Name = "ECom" + TT + ".png";

		Path FolderPath = Paths.get("src", "test", "resources");

		String ScreenshotPath = FolderPath.toFile().getAbsolutePath();

		String Act_Path = ScreenshotPath + "\\Screenshots\\" + Name + ".png";

		FileUtils.copyFile(Screen, new File(Act_Path));

		return Act_Path;  
		
		

	}

}
