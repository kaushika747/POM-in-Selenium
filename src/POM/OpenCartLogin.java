package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class OpenCartLogin {
	WebDriver driver;
		
	public OpenCartLogin(WebDriver driver) {
		this.driver = driver;
	}
	@FindBy(how = How.ID, using="input-email")
	WebElement email;
		
	@FindBy(how = How.ID, using = "input-password")
	WebElement password;
		
	@FindBy(how = How.XPATH, using = "//*[@id=\"account-login\"]/div[2]/div/div[1]/form/div[3]/div[1]/button[2]")
	WebElement submit;
		
	public void LoginHRM(String emailID, String Psd) {
		email.sendKeys(emailID);
		password.sendKeys(Psd);
		submit.click();
	}	
}
