package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigManager {

	static Properties prop;
	public static Properties getconfigReader()  {
		try {
			 prop= new Properties();
			 String filename = "src\\test\\resources\\config\\configuration.properties";
		        String workingDirectory = System.getProperty("user.dir");
		         System.out.println("Working "+workingDirectory);   
		       String absoluteFilePath = "";
		            
		        absoluteFilePath = workingDirectory + File.separator + filename;

		        System.out.println("Final filepath : " + absoluteFilePath);
			FileInputStream fileInput = new FileInputStream(new File(absoluteFilePath));
			prop.load(fileInput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
}
