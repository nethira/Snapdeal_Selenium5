package com.qa.testscripts;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
//import org.testng.Assert;
import org.testng.annotations.Test;


public class TC_SnapDeal_001 extends TestBase{
	@Test
public void searchItems() throws InterruptedException {	
	
	Actions actions=new Actions(driver);
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	actions.moveToElement(snapdeal.getSignInBtn()).build().perform();
    snapdeal.getLoginInBtn().click();
	driver.switchTo().frame(0);
	snapdeal.getEmailBtn().sendKeys("test@gmail.com");
	snapdeal.getContinueBtn().click();
	//System.out.println(snapdeal.getValidate().getTagName());
    //Assert.assertEquals(snapdeal.getValidate().getText(), "Login on snapdeal");
    //Thread.sleep(3000);
    System.out.println("Logged in");
}
}
