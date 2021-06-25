package Methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Repeat2 {
	@BeforeClass
	 public void openBrowser() {
		 Reporter.log("running 1");
	 }
	 
	 @BeforeMethod
	 public void loginAppilication() {
		 Reporter.log("running 2");
	 }
	 
	 @Test(groups="dp")
	 public void verifyName() {
		 Reporter.log("runnning 3",true);

	 }
	 
	 @Test(groups="dp")
	 public void verifyName1() {
		 
		 Reporter.log("runnning 3",true);
		
	 }
	 
	 @Test(groups="pd")
	 public void verifyName2() {
		 
		 Reporter.log("runnning 3a",true);
		
	 }
	 
	 
	 @AfterMethod
	 public void logoutApplication() {
		 Reporter.log("running 4");
	 }
	 
	 @AfterClass
	 public void closeBrowser(){
		 Reporter.log("runnoing 5");
	 }

	
	
		
		
		
		
	}


