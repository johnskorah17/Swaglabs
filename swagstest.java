package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Pages.swagspages;
import io.github.bonigarcia.wdm.WebDriverManager;

public class swagstest {
    WebDriver driver;
    swagspages sw;

    @BeforeTest  // Ensures setup runs before test execution
    public void setup() {
        WebDriverManager.chromedriver().clearDriverCache();
        WebDriverManager.chromedriver().clearResolutionCache();
        WebDriverManager.chromedriver().setup();
        
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        
        sw = new swagspages(driver); // Initialize page object
    }

    @Test(priority = 2)
    public void logincredentials() {
 
        sw.enterusername("standard_user");
        sw.enterpassword("secret_sauce");
        sw.loginbutton();

        String currentUrl = sw.getCurrentUrls();
        System.out.println("✅ Current URL: " + currentUrl);

        // ✅ Fix: Expected redirect URL is "/inventory.html"
        Assert.assertTrue(currentUrl.contains("inventory.html"), "❌ Login failed! Redirected to incorrect page.");
    }
    
    
    @Test(priority= 1)
    public void invalidcredentails() {
    	sw.enterusername("aaa");
    	sw.enterpassword("sss");
    	sw.loginbutton();
    	
    	String actualerrormessage= sw.geterrormessage();
    	String Expectederrormessage="Epic sadface: Username and password do not match any user in this service";
    	
    	System.out.println("errormessage:" +actualerrormessage);
    	Assert.assertEquals(actualerrormessage,Expectederrormessage, "errormessagemismatch");
    	sw.closebutton();
    	
    }
}
