package LearnWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebPageValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         WebDriver Driver = new ChromeDriver();
         Driver.get("https://www.selenium.dev/");
         String expected_Title ="Selenium";
         String actual_Title =Driver.getTitle();
         if(expected_Title.equals(actual_Title)) {
        	 System.out.println("Title passed" +actual_Title);
         }else {
        	 System.out.println("Title Fail" +actual_Title);
         }
         System.out.println("Execution Done By Livingston");
	}

}
