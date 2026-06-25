package LearnXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXPath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      driver.get("https://www.saucedemo.com/");
      WebElement logo=driver.findElement(By.xpath("//div[text()='Swag Labs']"));
      String text =logo.getText();
      System.out.println(text);
      WebElement untxtfld=driver.findElement(By.xpath("//input[@name='user-name']"));
      WebElement pastxtfld=driver.findElement(By.xpath("//input[contains(@id,'word')]"));
      WebElement logtxtfld=driver.findElement(By.xpath("//input[@value='Login']"));
      
      untxtfld.sendKeys("standard_user");
      pastxtfld.sendKeys("secret_sauce");
      logtxtfld.click();
      driver.close();
      System.out.println("Execution Done By Livingston");
	}

}
