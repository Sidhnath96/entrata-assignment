package com.pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Entrata_ButtonNavigation {
	WebDriver ldriver;
	
	public Entrata_ButtonNavigation(WebDriver driver)
	{
		ldriver= driver;
		
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(xpath="//div[@class='header-desktop-buttons hide-on-mobile']/a[1]")
	public WebElement demobtn;
	
	@FindBy(linkText="Sign In")
	public WebElement signinbtn;
	
	@FindBy(xpath="//a[@title='TEI Study Button']")
	public WebElement learnmoreBtn;
	
	@FindBy(xpath="//*[@id=\"gatsby-focus-wrapper\"]/div/div[2]/div[5]/div/div/div[1]/div/a")
	public WebElement seeoperatingsytbtn;

	
	
	
	public void clickOnBtn(WebElement ele)
	{
		ele.click();
	}
	
	
	
}
