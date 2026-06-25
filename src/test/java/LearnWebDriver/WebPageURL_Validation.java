package LearnWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageURL_Validation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Step 1: Open the Browser
       WebDriver Driver = new ChromeDriver();
       //Step 2: NAvigate to the APP via URL
       Driver.get("https://www.youtube.com/");
       String Expected_URL ="https://www.youtube.com/";
       String Actual_URL =Driver.getCurrentUrl();
       if(Expected_URL.equals(Actual_URL)) {
    	   System.out.println("URL passed   " + Actual_URL);
       }else {
    	   System.out.println("URL Fail" + Actual_URL);
       }
       System.out.println("Execution Done By Livingston");
	}
}
