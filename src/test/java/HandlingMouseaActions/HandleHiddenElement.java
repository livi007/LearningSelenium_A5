package HandlingMouseaActions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.WheelInput.ScrollOrigin;

public class HandleHiddenElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://demowebshop.tricentis.com/");
	
		Actions actionobj=new Actions(driver);
		
		WebElement ele1=driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Com')]"));
		actionobj.moveToElement(ele1);
		WebElement ele2 =driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Desk')]"));
		//actionobj.click(ele2).perform();
	     	
		
		//actionobj.doubleClick(driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Note')]"))).perform();
	     
	    actionobj.contextClick(driver.findElement(By.xpath("//ul[@class='top-menu']//a[contains(text(),'Acc')]"))).perform(); 
	     
	    
	    
	    
	    driver.get("https://vinothqaacademy.com/mouse-event/");
	    WebElement drageele=driver.findElement(By.id("dragItem"));
	    WebElement dropele=driver.findElement(By.id("dropZone"));
	    
	    
	    //actionobj.dragAndDrop(drageele, dropele);
	    actionobj.dragAndDrop(driver.findElement(By.id("dragItem")), driver.findElement(By.id("dropZone"))).perform();
	  
	    //actionobj.clickAndHold(drageele).release(dropele).perform();
	    actionobj.clickAndHold(driver.findElement(By.id("dragItem"))).release(driver.findElement(By.id("dropZone"))).perform();
	    
	    
	    //hover  operation
	    WebElement hover = driver.findElement(By.id("tooltipTarget"));
	    actionobj.moveToElement(hover).perform();
	    
	    
	    
	    
	    
	    actionobj.dragAndDropBy(driver.findElement(By.xpath("//div[@id='handle_max']")),400 , 0).perform();
	    
	    
	    //scrolling
	    actionobj.scrollByAmount(0, 500).perform();
	     
	    actionobj.scrollToElement(hover).perform();
	    
	    actionobj.scrollFromOrigin(ScrollOrigin.fromElement(hover), 0, 500).perform();
	    
	    System.out.println("Execution Done");
	     driver.close();
	}
	
	
	

}
