package com.TestCases;



import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.*;

import com.utility.Helper;
import com.utility.ReadConfig;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static Logger logger;
	
	ReadConfig config= new ReadConfig();
	public String url= config.getUrl();


	public static WebDriver driver;
	public Helper helper = new Helper(driver);
	
	@Parameters("browser")
	@BeforeClass
	public void setUp(String br)
	{
		logger = Logger.getLogger("demoSiteTesting");
		PropertyConfigurator.configure("log4j.properties");
		
		
		if (br.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();
			
			// to declined cookies 
			/* ChromeOptions options = new ChromeOptions();
			 options.addArguments("--disable-extensions");*/
			driver = new ChromeDriver();
		}

		else if (br.equalsIgnoreCase("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}

		else if (br.equalsIgnoreCase("ie")) {
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
		} 
		else if (br.equalsIgnoreCase("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		

		driver.get(url);
		
		
	}
	
	@AfterClass
	
	public void tearDown()
	{
		driver.quit();
	}
	
}
