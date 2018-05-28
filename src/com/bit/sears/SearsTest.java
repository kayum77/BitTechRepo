package com.bit.sears;

public class SearsTest {
public static void main(String [] args) {
		
System.setProperty("webdriver.chrome.driver",
"C:\\Users\\kayum\\Downloads\\chromedriver_win32\\chromedriver.exe");


	SearsCode st = new SearsCode();	
	st.openBrowser();	
	st.verifylogoText();
	st.verifyImage();
	
	
	}	
	
}
