package com.utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	Properties pro ;

	public  ReadConfig()
	{
		File configFilePath = new File("./Configuration/config.properties");

		try {
			FileInputStream configFile= new FileInputStream(configFilePath);
			pro = new Properties();
			pro.load(configFile);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

	public String getUrl()
	{
		String url = pro.getProperty("Url");
		return url;
	}

}
