package LearnXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpathByParent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
          
        WebElement untxtfld=driver.findElement(By.xpath("//input[@name='user-name']"));
        WebElement pastxtfld=driver.findElement(By.xpath("//input[contains(@id,'word')]"));
        WebElement logtxtfld=driver.findElement(By.xpath("//input[@value='Login']"));
        
        
        untxtfld.sendKeys("standard_user");
	    pastxtfld.sendKeys("secret_sauce");
	    logtxtfld.click();
        
        WebElement pntoprtxtfld=driver.findElement(By.xpath("//div[contains(text(),'Backpack')]/parent::div/child::div[3]"));
        WebElement pdtocatxtfld=driver.findElement(By.xpath("//div[contains(text(),'carry')]/parent::div/child::button"));
        WebElement catopntxtfld=driver.findElement(By.xpath("//button/parent::div/child::div[1]"));
        WebElement prtopdtxtfld=driver.findElement(By.xpath("//div[@class='inventory_details_price']/parent::div/child::div[2]"));
       // WebElement scltxtfld=driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
       // WebElement ckbtxtfld=driver.findElement(By.xpath("//button[@id='checkout']"));
	
        System.out.println("ProductName to price: " + pntoprtxtfld.getText());
	    System.out.println("ProductDesc to Cart: " + pdtocatxtfld.getText());
	    System.out.println("Productcart to name: " +  catopntxtfld.getText());
	    System.out.println("Productprice to descc: " +  prtopdtxtfld.getText());
	  //  System.out.println("Shopping cart link: " +  scltxtfld.getText());
	   // ckbtxtfld.click();
	    
	    System.out.println("Execution Done By Livingston");
	    
	   // driver.quit();
	    
	
	
	}

}
