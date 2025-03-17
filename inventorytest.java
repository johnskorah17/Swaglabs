package Test;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.inventorypage;
import Pages.swagspages;
import io.github.bonigarcia.wdm.WebDriverManager;

public class inventorytest {
	WebDriver driver;
	inventorypage iv;
	swagspages sw;
	
	
	@BeforeTest
	public void beforetest() {
		WebDriverManager.chromedriver().clearDriverCache();
        WebDriverManager.chromedriver().clearResolutionCache();
        WebDriverManager.chromedriver().setup();
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        
        sw = new swagspages(driver); 
        sw.enterusername("standard_user");
        sw.enterpassword("secret_sauce");
        sw.loginbutton();

	}
	
	
  @Test
  public void inventorypage() {
	  iv= new inventorypage(driver);
	  iv.scrollDown();
	  iv.itemclick();
	  iv.addtocart();
	  iv.viewthecart();
	  iv.continueshopping();
	  iv.newproducts();
	  iv.viewthecart();
	  iv.checkouts();
	  iv.firstnames("johns");
	  iv.lastnames("jose");
	  iv.postalcode("686571");
	  iv.continuebutton();
	  iv.finishbutton();

  }
}
