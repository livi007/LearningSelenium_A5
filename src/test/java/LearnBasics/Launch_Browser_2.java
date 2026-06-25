package LearnBasics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Launch_Browser_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver driver1 = new ChromeDriver();
         WebDriver driver2 = new EdgeDriver();
         WebDriver driver3 = new FirefoxDriver();
         System.out.println("Executed Done By Livingston");
	}

}
