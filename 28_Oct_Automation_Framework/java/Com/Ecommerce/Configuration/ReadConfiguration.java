package Com.Ecommerce.Configuration;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfiguration {

	Properties prop;

	public ReadConfiguration() {

		File src = new File(
				"C:\\Users\\Jay\\eclipse-workspace\\28_Oct_Automation_Framework\\src\\test\\resources\\Configuration\\Config.properties");

		prop = new Properties();

		try {
			FileInputStream FIS = new FileInputStream(src);
			try {
				prop.load(FIS);
			} catch (IOException e) {
				System.out.println(e.getMessage());
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}

	}

	public String GetApplicationURL() {
		String URL = prop.getProperty("BaseURL");
		return URL;
	}

	public String Username() {
		String Username = prop.getProperty("UserName");
		return Username;
	}

	public String Password() {
		String Password = prop.getProperty("Password");
		return Password;
	}
}
