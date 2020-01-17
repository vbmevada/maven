package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class login_page {
	 
		final WebDriver driver;
		 
		 @FindBy(how = How.ID, using = "username")
		 
		 public WebElement txtbx_UserName;
		 
		 @FindBy(how = How.ID, using = "password")
		 
		 public WebElement txtbx_Password;
		 
		 @FindBy(how = How.ID, using = "btnLogin")
		 
		 public WebElement btn_Login ;
		 
		// This is a constructor, as every page need a base driver to find web elements
		 
		public login_page(WebDriver driver){ 
		 
		    this.driver = driver; 
		 
		    } 
		 
		}
	 
	
	
	

