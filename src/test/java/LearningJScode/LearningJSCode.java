package LearningJScode;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningJSCode {

	public static void main(String[] args) {
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize();
         
       JavascriptExecutor jsobj = (JavascriptExecutor)driver;
       jsobj.executeScript("window.location = arguments[0]", "https://automationexercise.com/");
       
       jsobj.executeScript("history.go(0)");
 
       System.out.println(jsobj.executeScript("return document.title"));
       System.out.println(jsobj.executeScript("return document.URL"));
       
       jsobj.executeScript("arguments[0].click()", driver.findElement(By.partialLinkText("Sign")));
       
       
       jsobj.executeScript("arguments[0].value='LIVINGSTON V'", driver.findElement(By.name("name")));
       jsobj.executeScript("arguments[0].value='livi123@gmail.com'", driver.findElement(By.xpath("//input[@data-qa='signup-email']")));
      
       jsobj.executeScript("arguments[0].click()", driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]")));
       
       
       jsobj.executeScript("arguments[0].value='livi025@gmail.com'", driver.findElement(By.xpath("//input[@data-qa='signup-email']")));
       
       
       jsobj.executeScript("arguments[0].scrollIntoView(false)", driver.findElement(By.xpath("//button[@data-qa=\"signup-button\"]")));
       
       
       jsobj.executeScript("window.scrollTo(500,0)");
       jsobj.executeScript("window.scrollBy(500,1500)");
       
       driver.close();
	} 
}