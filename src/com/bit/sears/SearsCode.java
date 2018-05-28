package com.bit.sears;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;



public class SearsCode {
	
	ChromeDriver dr;

	void openBrowser() {
	dr = new ChromeDriver();
	dr.get("http://www.sears.com/");
		
	
		
	}
	

	
	void verifylogoText() {
		
	String g= dr.findElement(By.xpath("//img[@width='200' and @height='64'and@src='http://seras.com/wp-content/uploads/2017/03/cropped-Seras1.jpg'and@class='header_logo header-logo']")).getTagName();
	System.out.println("Company logo displayed on Homepage:"  + g);	
		
		
	}
	
	
	void verifyImage() {
		
	boolean g= dr.findElement(By.xpath("//img[@width='200' and @height='64'and@src='http://seras.com/wp-content/uploads/2017/03/cropped-Seras1.jpg'and@class='header_logo header-logo']")).isDisplayed();	
	if(g) {
	System.out.println("Image is displayed");}
	else {
	System.out.println("Image is not displayed");}
	
	
	
	
	}
	
	
	
	
	
	
	
}
