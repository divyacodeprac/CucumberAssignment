package com.pages;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.List;
import java.util.Locale;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TextBoxPage {
	 WebDriver driver;
	
	private By textBoxVal = By.id("sum1");
	private By textBoxesValue = By.xpath("//input[contains(@id,'sum')]");
	private By labelValues = By.xpath("//label[contains(@for,'value')]");
	
	public int getLabels() {
		List<WebElement> textLabels = driver.findElements(labelValues);
		return textLabels.size();
		
	}
	
	
	public List<WebElement> textBoxes (){
		List<WebElement> textBoxes = driver.findElements(textBoxesValue);
		return textBoxes;
		
	}
	
	public void enterTextBox(String input) {
		
		
	}
	public Long verifyCurrencyFormat() throws ParseException {
		List<WebElement> textBoxes = driver.findElements(textBoxesValue);
		long total=0;
		for (WebElement textBox : textBoxes) {
			 String currencyVal= textBox.getAttribute("value");
			 Locale locale = new Locale("en", "US");
			Number amount = NumberFormat.getCurrencyInstance(locale).parse(currencyVal);
			total+=amount.longValue();
			System.out.println(total);
		}
		
		 return total;
	}
	
	public int verifyTotal()  {
		List<WebElement> textBoxes = driver.findElements(textBoxesValue);
		int total=0;
		for (WebElement textBox : textBoxes) {
			 String currencyVal= textBox.getAttribute("value");
			String val = currencyVal.substring(1);
			total+= Integer.parseInt(val);
		}
		System.out.println("Total "+total);
		 return total;
	}
	 
	
	
	public String getPageTitle() {
		return driver.getTitle();
	}
	public TextBoxPage(WebDriver driver){
		this.driver = driver;
	}
}
