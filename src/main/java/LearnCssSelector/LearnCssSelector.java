package LearnCssSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnCssSelector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver= new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.saucedemo.com/");
     WebElement untxtfld =driver.findElement(By.cssSelector("input[id='user-name']"));
     WebElement pstxtfld =driver.findElement(By.cssSelector("input[placeholder='Password']"));
     WebElement logtxtfld =driver.findElement(By.cssSelector("input[value='Login']"));
     //perform operation
     untxtfld.sendKeys("standard_user");
     pstxtfld.sendKeys("secret_sauce");
     logtxtfld.click();
     driver.close();
     System.out.println("Code Done By Livingston");
	}

}
