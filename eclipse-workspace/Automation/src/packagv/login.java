package packagv;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) throws InterruptedException {
		 
		 System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://www.toolsqa.com");
		 
		 Thread.sleep(5000);
		 driver.quit();
		 System.out.println("Test");
		 }
	
	
}
