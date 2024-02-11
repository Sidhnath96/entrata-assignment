package com.TestCases;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.pageObject.Entrata_ButtonNavigation;

import junit.framework.Assert;


public class TestCase_002 extends BaseClass {
	
	Entrata_ButtonNavigation navigateTopage;
	SoftAssert sfassert= new SoftAssert();
	
	@Test
	public void verifyNavigationOfButtons()
	{
		navigateTopage= new Entrata_ButtonNavigation(driver);
		
		navigateTopage.clickOnBtn(navigateTopage.demobtn);	
		String demopagetitle= driver.getTitle();
	
		if(demopagetitle.equalsIgnoreCase("Property Management Software | Entrata"))
		{
			sfassert.assertTrue(true);
			driver.navigate().back();
			logger.info("successful navigated to watch demo page");
		}
		else
		{
			sfassert.assertTrue(false);
			System.out.println(demopagetitle);
			logger.info("failed to navigate watch demo page");
			driver.navigate().back();
		}
		
		//waithelper.waitForVisibilityOfElement(navigateTopage.signinbtn, Duration.ofSeconds(3));
		navigateTopage.clickOnBtn(navigateTopage.signinbtn);
		String signinpagetitle= driver.getTitle();
		
		
		if(signinpagetitle.equalsIgnoreCase("Entrata Sign In"))
		{
			sfassert.assertTrue(true);
			logger.info("successful navigated to sign in page");
			driver.navigate().back();
		}
		else
		{
			sfassert.assertTrue(false);
			System.out.println(signinpagetitle);
			logger.info("failed to navigate sign page");
			driver.navigate().back();
		}
		
		

        // Scroll to the element (assuming it's below the fold)
	
		helper.scrolldownMethod(driver, 0,10500);
        
		//waithelper.waitForVisibilityOfElement(navigateTopage.signinbtn, Duration.ofSeconds(3));
		//waithelper.waitForElementToBeClickable(navigateTopage.signinbtn, Duration.ofSeconds(3));
		
	
		helper.clickByjavaScript(driver, navigateTopage.learnmoreBtn);
		
		String learnmorepagetitle= driver.getTitle();
		
		if(learnmorepagetitle.equalsIgnoreCase("Property Management Software | Entrata"))
		{
			sfassert.assertTrue(true);
			logger.info("successful navigated to learn more page");
			driver.navigate().back();
		}
		else
		{
			sfassert.assertTrue(false);
			System.out.println(learnmorepagetitle);
			logger.info("failed to navigate learn more page");
			driver.navigate().back();
		}
		
		helper.scrolldownMethod(driver, 0,12000);
		helper.clickByjavaScript(driver, navigateTopage.seeoperatingsytbtn);
		
		String seeopertsyspagetitle= driver.getTitle();
		
		if(seeopertsyspagetitle.equalsIgnoreCase("Property Management Software | Entrata"))
		{
			sfassert.assertTrue(true);
			logger.info("successful navigated to see operating system page");
			driver.navigate().back();
		}
		else
		{
			sfassert.assertTrue(false);
			System.out.println(seeopertsyspagetitle);
			logger.info("failed to navigate see operating system page");
			driver.navigate().back();
		}
		
	
		sfassert.assertAll();
		
	}
	
	

}
