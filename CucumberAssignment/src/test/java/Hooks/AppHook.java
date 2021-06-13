package Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.utilities.ConfigManager;
import com.utilities.DriverFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class AppHook {

	private DriverFactory driverFactory;
	private ConfigManager config;
	private WebDriver driver;
	
	@Before
	public void openApplication()  {
		
		driverFactory = new DriverFactory();
		config = new ConfigManager();
		driver=driverFactory.createDriverInstance(ConfigManager.getconfigReader().getProperty("browser"));
	
		driver.manage().window().maximize();
		driver.get(ConfigManager.getconfigReader().getProperty("url"));
		
		
	}
	
	@After
	public void tearDown(Scenario scenario) {
		/*
		 * if(scenario.isFailed()) { String screenShotName = scenario.getName(); byte[]
		 * sourcePath = ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		 * scenario.attach(sourcePath, "img/png", screenShotName); }
		 * 
		 * driver.quit();
		 */
	}
}
