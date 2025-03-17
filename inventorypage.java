package Pages;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class inventorypage {
	WebDriver driver;
	WebDriverWait wait;
	
	public inventorypage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		this.wait=new WebDriverWait(driver,Duration.ofSeconds(10));
	}
	 public void scrollDown() {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,500);"); // Scroll down by 500 pixels
	    }

	 @FindBy(xpath="//a[@id=\"item_3_img_link\"]")
	 WebElement item;
	 public void itemclick() {
		 wait.until(ExpectedConditions.elementToBeClickable(item)).click();
	 }
	 @FindBy(xpath="//button[@id=\"add-to-cart\"]")
	 WebElement cart;
	 public void addtocart() {
		 wait.until(ExpectedConditions.elementToBeClickable(cart)).click();
	 }
	 @FindBy(xpath="//a[@class=\"shopping_cart_link\"]")
	 WebElement viewcart;
	 public void viewthecart() {
		 wait.until(ExpectedConditions.elementToBeClickable(viewcart)).click();
	 }
	 @FindBy(xpath="//button[@id=\"continue-shopping\"]")
	 WebElement shipping;
	 public void continueshopping() {
		 wait.until(ExpectedConditions.elementToBeClickable(shipping)).click();
	 }
	 @FindBy(xpath="//button[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
	 WebElement newproduct;
	 public void newproducts() {
		 wait.until(ExpectedConditions.elementToBeClickable(newproduct)).click();
	 }
	 @FindBy(xpath="//button[@id=\"checkout\"]")
	 WebElement checkout;
	 public void checkouts() {
		 wait.until(ExpectedConditions.elementToBeClickable(checkout)).click();
	 }
	 @FindBy(xpath="//input[@id=\"first-name\"]")
	 WebElement firstname;
	 public void firstnames(String fnames) {
		 wait.until(ExpectedConditions.elementToBeClickable(firstname)).sendKeys(fnames);;
	 }
	 @FindBy(xpath="//input[@id=\"last-name\"]")
	 WebElement lastname;
	 public void lastnames(String lnames) {
		 wait.until(ExpectedConditions.elementToBeClickable(lastname)).sendKeys(lnames);
	 }
	 @FindBy(xpath="//input[@id=\"postal-code\"]")
	 WebElement postal;
	 public void postalcode(String pincode) {
		 wait.until(ExpectedConditions.elementToBeClickable(postal)).sendKeys(pincode);
	 }
	 @FindBy(xpath="//input[@id=\"continue\"]")
	 WebElement continue1;
	 public void continuebutton() {
		 wait.until(ExpectedConditions.elementToBeClickable(continue1)).click();
	 }
	 @FindBy(xpath="//button[@id=\"finish\"]")
	 WebElement finish;
	 public void finishbutton() {
		 wait.until(ExpectedConditions.elementToBeClickable(finish)).click();
	 }
}
