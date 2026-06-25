package LearnXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpathByTraversing {

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
	    driver.findElement(By.xpath("//div[@class='inventory_item_name ']")).click();
	    WebElement prtonatxtfld=driver.findElement(By.xpath("//div[@class='inventory_details_price']/../div[@class='inventory_details_name large_size']"));
        WebElement natoprtxtfld = driver.findElement(By.xpath("//div[@class='inventory_details_name large_size']/../div[@class='inventory_details_price']"));
        WebElement detocartxtfld = driver.findElement(By.xpath("//div[@class='inventory_details_desc large_size']/../button[@id='add-to-cart']"));
	    WebElement cartodetxtfld =driver.findElement(By.xpath("//button[@id='add-to-cart']/..//div[@class='inventory_details_desc large_size'] "));
	    
	    System.out.println("Product Name: " + prtonatxtfld.getText());
	    System.out.println("Product Price: " + natoprtxtfld.getText());
	    System.out.println("Product Desc: " +  cartodetxtfld.getText());
	    detocartxtfld.click();
	    
	    System.out.println("Execution Done By Livingston");
	    
	    driver.quit();
	    
	    
	}
	

}
