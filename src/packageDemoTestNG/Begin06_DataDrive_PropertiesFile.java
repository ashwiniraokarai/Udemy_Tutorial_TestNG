package packageDemoTestNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Begin06_DataDrive_PropertiesFile {
	// This @Test METHOD is MEANT for READING LOGIN functionality related TEST DATA
	// from a .properties FILE
	@Test
	public void login() throws IOException {
		/*
		 * 1.Create a .properties file and store your data 2.Instantiate the PROPERTIES
		 * CLASS 3.Pass the .properties file to the PROPERTIES OBJECT via one of its
		 * APPROPRIATE MEMBER METHODS (The PROPERTIES OBJECT takes the FILE LOCATION
		 * stored in a FILESTREAM OBJECT) 4.Have the PROPERTIES OBJECT ACCESS the FILE
		 * CONTENTS via KEYS
		 */
		Properties prprty = new Properties();
		// prprty.load(inStream);
		/*
		 * Need an Input Stream Object instantiated first, in order to CALL the load()
		 * method that takes Input Strem as an argument
		 */

		FileInputStream fileContent = new FileInputStream(
				"C:\\Users\\Ash\\Java Eclipse Workspace\\Udemy_Tutorial_TestNG\\src\\packageDemoTestNG\\testDataFile_login.properties");

		/*
		 * Although the FileInputStream has many associated methods, we don't
		 * necessarily need them now. We just need to PASS this FILE STREAM OBJECT to
		 * the .load method as an argument
		 */

		prprty.load(fileContent);

		/*
		 * You have LOADED the PROPERTY OBJECT with the .PROPERTIES file CONTENT. It can
		 * now ACCESS DATA VALUES via it's KEY
		 */
		String userName = prprty.getProperty("p_userName");
		System.out.println(userName);
		
		//Selenium 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ash\\Selenium JARs and Bindings\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(prprty.getProperty("p_url"));
	}

}
