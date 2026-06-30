package HandlinkeyBoardOperation;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingRobotKeyword {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       
       
       driver.manage().window().maximize();
       
       driver.get("https://demowebshop.tricentis.com/");
       
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       
       //create robot obj
       
       Robot RoObj = new Robot();
       
       RoObj.keyPress(KeyEvent.VK_TAB);
       RoObj.keyPress(KeyEvent.VK_TAB);
       
       RoObj.keyPress(KeyEvent.VK_TAB);
       RoObj.keyRelease(KeyEvent.VK_TAB);
       
       RoObj.keyPress(KeyEvent.VK_TAB);
       RoObj.keyRelease(KeyEvent.VK_TAB);
       
       RoObj.keyPress(KeyEvent.VK_TAB);
       RoObj.keyRelease(KeyEvent.VK_TAB);
       
       RoObj.keyPress(KeyEvent.VK_TAB);
       RoObj.keyRelease(KeyEvent.VK_TAB);
       
       RoObj.keyPress(KeyEvent.VK_TAB);
       RoObj.keyRelease(KeyEvent.VK_TAB);
       
       //Type a word 
       RoObj.keyPress(KeyEvent.VK_SHIFT);
       RoObj.keyPress(KeyEvent.VK_C);
       RoObj.keyRelease(KeyEvent.VK_C);
       RoObj.keyRelease(KeyEvent.VK_SHIFT);
       
     
       RoObj.keyPress(KeyEvent.VK_O);
       RoObj.keyRelease(KeyEvent.VK_O);
       
   
       
       RoObj.keyPress(KeyEvent.VK_M);
       RoObj.keyRelease(KeyEvent.VK_M);
      
       
       

       RoObj.keyPress(KeyEvent.VK_P);
       RoObj.keyRelease(KeyEvent.VK_P);
  

       RoObj.keyPress(KeyEvent.VK_U);
       RoObj.keyRelease(KeyEvent.VK_U);
 
       
       
       RoObj.keyPress(KeyEvent.VK_T);
       RoObj.keyRelease(KeyEvent.VK_T);
       
       RoObj.keyPress(KeyEvent.VK_E);
       RoObj.keyRelease(KeyEvent.VK_E);
       
       RoObj.keyPress(KeyEvent.VK_R);
       RoObj.keyRelease(KeyEvent.VK_R);
	}

}
