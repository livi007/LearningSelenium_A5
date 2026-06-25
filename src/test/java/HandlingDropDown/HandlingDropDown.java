package HandlingDropDown;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
       WebDriver  driver = new ChromeDriver();
       driver.manage().window().maximize();
        
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20l));
        
       driver.get("file:///C:/Users/ELCOT/Downloads/EmbededWebpage.html");
       
      WebElement coun1 =driver.findElement(By.cssSelector("Select[name='country1']"));
       
      WebElement coun2 =driver.findElement(By.cssSelector("Select[name='country2']"));
	
	Select selobj = new Select(coun2);
	boolean Status = selobj.isMultiple();
	
	if(Status) {
		System.out.println("It is An Multiple dropdown ");
	}else {
		System.out.println("It Is An Single DropDown");
	}
	
	Thread.sleep(3000);

	List<WebElement> options = selobj.getOptions();
	

	System.out.println(options.size());
	
	System.out.println("--------------------------------------------------------------");

	
	for(WebElement list:options) {
		
		System.out.println(list.getText());
	}
	
	//System.out.println("---------------");
	
	selobj.selectByIndex(2);
	
	//System.out.println("---------------");
	selobj.selectByValue("cnd");
	
	//System.out.println("----------------");
	selobj.selectByContainsVisibleText("IND");
	//System.out.println("-----------------");
	selobj.selectByVisibleText("SWITZERLAND");
	//System.out.println("-----------------");
     List<WebElement> Getoption=selobj.getOptions();
	for(int i=0;i<Getoption.size();i++) {
		System.out.println(Getoption.get(i).getText());
	}
	
	//System.out.println("-----------------");
	
selobj.deselectByIndex(2);
	
	//System.out.println("---------------");
	selobj.deselectByValue("cnd");
	
	//System.out.println("----------------");
	selobj.deSelectByContainsVisibleText("INDIA");
	//System.out.println("-----------------");
	selobj.deselectByVisibleText("SWITZERLAND");
	//System.out.println("-----------------");
    
	
	//System.out.println("-----------------");
	driver.quit();
	
	}

}
