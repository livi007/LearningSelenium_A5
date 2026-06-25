package Handling_ScreenShot;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Handling_Screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.saucedemo.com/");
       
       
       TakesScreenshot ts=(TakesScreenshot) driver;
       File tempath=ts.getScreenshotAs(OutputType.FILE);
       File perPath=new File("./src/test/resources/TestScreenshot/screenshot.png");
       
    	   FileHandler.copy(tempath, perPath);
       
       
       driver.close();
       System.out.println("Screenshot Taken");
	}

}
