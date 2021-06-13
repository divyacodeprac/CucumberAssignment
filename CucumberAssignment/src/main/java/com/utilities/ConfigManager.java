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
			FileInputStream fileInput = new FileInputStream(new File(".//CucumberAssignment//src//test/resources//config//configuration.properties"));
			prop.load(fileInput);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop;
	}
}
