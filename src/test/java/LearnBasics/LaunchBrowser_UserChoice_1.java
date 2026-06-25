package LearnBasics;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class LaunchBrowser_UserChoice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int Choice = sc.nextInt();
         WebDriver Driver = null;
         switch(Choice) {
         case 1 :
        	 Driver = new ChromeDriver();
        	 break;
         case 2 :
        	 Driver = new EdgeDriver();
        	 break;
         case 3 :
        	 Driver = new FirefoxDriver();
        	 break;
        	 default: 
        		 break;
         }
         System.out.println("Execution Done By Livingston");
	}

}
