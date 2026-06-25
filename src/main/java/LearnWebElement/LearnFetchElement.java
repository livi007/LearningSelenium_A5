package LearnWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnFetchElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
        
        //identify the webelement
        WebElement textfld=driver.findElement(By.xpath("//div[contains(text(),'Swag')]"));
        
        if(textfld.isDisplayed()) {
        	System.out.println("Text pass");
        }else {
        	System.out.println("Text Fail");
        }
        
        //fetching value
        String actual_txt=textfld.getText();
        System.out.println(actual_txt);
        String expectedValue  ="Swag Labs";
        if(actual_txt.equals(expectedValue)) {
     	   System.out.println("Both Actual_txt and Expected_txt is pass");
        }else {
     	   System.out.println("Both Actual_txt an d Expected_txt is fail");
        }
        
        
        String actual_tagname=textfld.getTagName();
        System.out.println(actual_tagname);
        String exp_tagname="div";
        if(actual_tagname.equals(exp_tagname)) {
     	   System.out.println("Both Actual and Expected is pass");
        }else {
     	   System.out.println("Both Actual and Expected is fail");
        }
        
        String actual_Attribute = textfld.getAttribute("class");
        System.out.println(actual_Attribute);
        String exp_attribute ="class";
        if(actual_Attribute.equals(exp_attribute)) {
     	   System.out.println("Both Actual and Expected is pass");
        }else {
     	   System.out.println("Both Actual and Expected is fail");
        }
        
        String actual_csspro = textfld.getCssValue("font-family");
        System.out.println(actual_csspro);
        String exp_csspro ="DM Mono, \"sans-serif\";";
        if(actual_csspro.equals(exp_csspro)) {
     	   System.out.println("Both Actual and Expected is pass");
        }else {
     	   System.out.println("Both Actual and Expected is fail");
        }
        
        Dimension actual_size = textfld.getSize();
        int actual_width=actual_size.getWidth();
        int exp_width=48;
        int actual_height=actual_size.getHeight();
        int exp_height=48;
        System.out.println(actual_size);
        System.out.println(actual_width + actual_height);
        
        if(actual_width == exp_width || actual_height == exp_height  ) {
     	   System.out.println("Both Actual and Expected is pass");
        }else {
     	   System.out.println("Both Actual and Expected is fail");
        }
        
        
        
        
        Point actual_loc = textfld.getLocation();
        int actual_X=actual_loc.getX();
        int actual_Y=actual_loc.getY();
        int exp_X=0;
        int exp_Y=0;
        System.out.println(actual_loc);
        System.out.println(actual_X);
        System.out.println(actual_Y);
        
        if(actual_X == exp_X && actual_Y == exp_Y) {
      	   System.out.println("Both Actual and Expected is pass");
         }else {
      	   System.out.println("Both Actual and Expected is fail");
         }
        
       //compare actual_res to expected_res
       
        driver.close();
	}

}
