package com.bit.sears;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	ChromeDriver driver;

	// open a blank browser
	void openBrowser() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\kayum\\Downloads\\chromedriver_win32\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

	}

	// image display yes or no
	void imageDisplay() {
		boolean g = driver.findElement(By.xpath("//span[@class='nav-logo-base nav-sprite']")).isDisplayed();
		//WebElement e = driver.findElement(By.xpath("//span[@class='nav-logo-base nav-sprite']"));
		

		if (g) {
			//e.click();
			System.out.println("Image Displayed:" + g);
		} else {
			System.out.println("Image is not Displayed" + g);
		}

	}

	// Text displayed

	void textOnConsole() {

		String g = driver.findElement(By.xpath("//span[@class='nav-logo-base nav-sprite']")).getText();
		System.out.println("Company Logo Displayed:" + g);

	}

	// close browser
	void closeBrowser() {
		driver.close();
	}

}
