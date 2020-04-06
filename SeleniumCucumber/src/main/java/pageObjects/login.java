package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import seleniumUtility.Root;

public class login extends Root{
	
	
	@FindBy(how=How.NAME,using="userName")
	private WebElement username;
	
	@FindBy(how=How.NAME,using="password")
	private WebElement password;
	
	@FindBy(how=How.NAME,using="login")
	private WebElement loginbutton;
	
	@FindBy(how=How.XPATH,using="//a[contains(text(),'ITINERARY')]")
	private WebElement HOMEPAGE;
	
	
	public login()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void loginpage(String uname,String pwd) throws InterruptedException
	{
		username.sendKeys(uname);
		password.sendKeys(pwd);
		loginbutton.click();
		Thread.sleep(1000);
	}
	public void homePage() throws InterruptedException
	{
		Thread.sleep(2000);
		HOMEPAGE.isDisplayed();
	}

}
