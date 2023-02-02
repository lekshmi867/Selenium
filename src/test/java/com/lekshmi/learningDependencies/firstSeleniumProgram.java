package com.lekshmi.learningDependencies;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class firstSeleniumProgram {
	WebDriver driver; 
	
@BeforeMethod
public void setUp() {
	System.setProperty("webdriver.chrome.driver", "C:\\chrome driver 108\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://parabank.parasoft.com/parabank/index.htm");
	
}

@Test()
public void findtheElements() {
	List<WebElement> elements = driver.findElements(By.cssSelector("ul.leftmenu>li"));
	System.out.println(elements.stream().filter(x->x.getText().length()>8).count());
}

@AfterMethod()
public void tearDown() {
	driver.quit();
}
}
