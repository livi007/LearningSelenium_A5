package HandlingMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.Scanner;
public class HandlingMultileEle {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
         System.out.println("Enter the Nth element:  ");
		Scanner sc  = new Scanner(System.in);
		int n=sc.nextInt();
		
		System.out.println(" -----------------------");
		
		WebDriver driver = new ChromeDriver();
      driver.manage().window().maximize();
      
      driver.get("https://vinothqaacademy.com/webtable/");
      
      WebElement Uname=driver.findElement(By.xpath("//table[@id='myTable']/tbody/tr[3]/td[2]"));
      System.out.println(Uname.getText());
        
    List<WebElement> AllDetails =driver.findElements(By.xpath("//table[@id='myTable']/tbody/tr/td[2]"));
    for(int i=1;i<AllDetails.size();i++) {
    System.out.println(AllDetails.get(i).getText());
    }
     
    
    System.out.println("-------------------------");
    
    List<WebElement> Rowname = driver.findElements(By.xpath("//table[@id='myTable']/tbody/tr["+ n + "]/td"));
    for(int i=1;i<Rowname.size();i++) {
    	System.out.println(Rowname.get(i).getText());
    }
    
      driver.close();
	}

}

