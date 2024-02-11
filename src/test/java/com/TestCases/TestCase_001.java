package com.TestCases;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.pageObject.Entrata_HomePage;

public class TestCase_001 extends BaseClass {

	Entrata_HomePage homepage;

	@Test
	public void verifyBrokenLinksOnHomePage() {
		homepage = new Entrata_HomePage(driver);
		
		List<WebElement> links= homepage.getAllLinks();
	
		System.out.println(links);
		int brokenlinkcount=0;
		int linkCount = 0;
        for (WebElement link : links) {
            linkCount++;
           
            String url = link.getAttribute("href");
            String linkText = link.getText(); // Get the text associated with the link

            try {
                // Open a connection to the URL
                HttpURLConnection connection = (HttpURLConnection) new URL(url).openConnection();

                // Set the request method
                connection.setRequestMethod("HEAD");

                // Get the response code
                int responseCode = connection.getResponseCode();
                System.out.println(responseCode);
                // Check if the response code is not 200 (OK)
                if (responseCode != HttpURLConnection.HTTP_OK  ) 
                {
                	// 308 status code - for permanent migrated url so not a broken link
                	if(responseCode!=HttpURLConnection.HTTP_MOVED_PERM)
                    System.out.println("Broken link: " + linkText + " - URL: " + url + " - Response Code: " + responseCode);
                	logger.info("Broken link: " + linkText + " - URL: " + url + " - Response Code: " + responseCode);
                    brokenlinkcount++;
                } 
                
                connection.disconnect();
            } catch (Exception e) {
                System.out.println("Exception occurred while checking the link: " + url);
                logger.info(e +"Exception occurred while checking the link: " + url);
            }
        }
        System.out.println("Total links checked: " + linkCount);
        System.out.println("Total broken link found: " +  brokenlinkcount);
		}
			
	}







