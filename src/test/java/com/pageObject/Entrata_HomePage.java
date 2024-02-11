package com.pageObject;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Entrata_HomePage {

	WebDriver ldriver;

	public Entrata_HomePage(WebDriver driver)
	{
		 ldriver = driver;

		 PageFactory.initElements(driver,this);
	}

	/*@FindBy(tagName="//a")
	//public List<WebElement> allLinks;
	WebElement allLinks;*/

	String allLinks = "a";

	public List<WebElement> getAllLinks() {
		
		return ldriver.findElements(By.tagName(allLinks));
		
		
	}
	
	


}
