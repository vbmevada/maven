package Testcase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import pageobject.login_page;

public class login {

	
	
	
	 public WebDriver driver;
	 
	 login_page login;
	 FileInputStream fis;
	 XSSFWorkbook wb;
	 XSSFSheet sheet;
	 
	 
	 
	  @Parameters("browser")
	 
	  @BeforeClass
	 
	  // Passing Browser parameter from TestNG xml
	 
	  public void beforeTest(String browser) throws IOException {
	 
	  // If the browser is Firefox, then do this
	 
	  if(browser.equalsIgnoreCase("chorme")) {
		  
	   System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
	   driver = new ChromeDriver();
	   setup();
	   
	 
	  // If browser is IE, then do this	  
	 
	  }else if (browser.equalsIgnoreCase("firefox")) { 
	 
	   // Here I am setting up the path for my IEDriver
	 
	   System.setProperty("webdriver.gecko.driver", "D:\\geckodriver.exe");
	 
	   driver = new FirefoxDriver();
	   setup();
	   
	 
	  } 
	 
	  // Doesn't the browser type, lauch the Website
	 
	 
	  }
	 
	  // Once Before method is completed, Test method will start
	 
	  public void setup() throws IOException {
		  
		driver.get("https://cygnet.hrinnova.com/login");  
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		login = PageFactory.initElements(driver,login_page.class);
	
	    
		
		
		
		  
	  }
	  
	  
	  
	  
	  @Test public void login() throws InterruptedException {
	 
		
	
	 
	 }  
	 
	  @AfterClass public void afterTest() {
	 
	 driver.quit();
	 
	 }
	 
	}
	
	

