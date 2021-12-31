package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SnapDeal {
	WebDriver driver;
@FindBy(xpath="/html[1]/body[1]/div[2]/div[4]/div[2]/div[1]/div[3]/div[3]/div[1]")
WebElement signinbtn;
	public WebElement getSignInBtn() {
		return signinbtn;
}
	
@FindBy(xpath="//a[normalize-space()='login']")
WebElement loginbtn;	
public	WebElement getLoginInBtn() {
	return loginbtn;
}
@FindBy(name="username")
WebElement emailbtn;	
public	WebElement getEmailBtn() {
	return emailbtn;
}
@FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[6]/form[1]/button[1]")
WebElement continuebtn;	
public	WebElement getContinueBtn() {
	return continuebtn;
}
//@FindBy(xpath="/html[1]/body[1]/header[1]/div[1]/div[3]/div[1]/div[1]/div[8]/div[2]/header[1]")
//WebElement validate;
//public	WebElement getValidate() {
//	return validate;
//}
public SnapDeal(WebDriver driver) {
	this.driver=driver;
	PageFactory.initElements(driver, this);
}
}
