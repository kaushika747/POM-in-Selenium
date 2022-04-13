package POM;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class VerifyLogin {
	@Test
	public void TestUser() {
		WebDriver driver = BrowserFactory.BrowserOptions("Chrome",
				"https://opensource-demo.orangehrmlive.com/");
		LoginPage loginOrgHRM = PageFactory.initElements(driver, LoginPage.class);
		loginOrgHRM.LoginHRM("Admin","admin123");
		}
	
}
