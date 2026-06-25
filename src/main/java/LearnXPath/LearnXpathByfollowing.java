package LearnXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpathByfollowing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     WebDriver driver = new ChromeDriver();
     driver.manage().window().maximize();
     driver.get("https://www.saucedemo.com/");
     
     WebElement logntxtfld = driver.findElement(By.xpath("//input[@id='user-name']/following::input[@name='login-button']"));
     WebElement unmtxtfld = driver.findElement(By.xpath("//input[@name='login-button']/preceding::input[@id='user-name']"));
	  
     unmtxtfld.sendKeys("standard_user");
	    //pastxtfld.sendKeys("secret_sauce");
	    logntxtfld.click();
	    
	    System.out.println("usernametologn" + logntxtfld.getText() );
	    System.out.println("logntousername"  + unmtxtfld.getText());
	
	}

}
