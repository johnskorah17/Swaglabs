package Pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class swagspages {
	WebDriver driver;
	WebDriverWait wait;
	public swagspages(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));		
	}
	@FindBy(xpath="//input[@placeholder=\"Username\"]")
	WebElement username;
	public void enterusername(String usernames) {
		username.clear();
		wait.until(ExpectedConditions.elementToBeClickable(username)).sendKeys(usernames);
	}
	@FindBy(xpath="//input[@placeholder=\"Password\"]")
	WebElement passowrd;
	public void enterpassword(String passwords) {
		passowrd.clear();
		wait.until(ExpectedConditions.elementToBeClickable(passowrd)).sendKeys(passwords);
	}
	@FindBy(xpath="//input[@id=\"login-button\"]")
	WebElement login;
	public void loginbutton() {
		wait.until(ExpectedConditions.elementToBeClickable(login)).click();
	}
	
	public String getCurrentUrls() {
		return driver.getCurrentUrl();
	}
	
	@FindBy(xpath="//div[@class=\"error-message-container error\"]")
	WebElement errors;
	public String geterrormessage() {
		wait.until(ExpectedConditions.visibilityOf(errors));
		return errors.getText();
	}
	@FindBy(xpath="//button[@class=\"error-button\"]")
	WebElement close;
	public void closebutton() {
		wait.until(ExpectedConditions.elementToBeClickable(close)).click();
	}

}
