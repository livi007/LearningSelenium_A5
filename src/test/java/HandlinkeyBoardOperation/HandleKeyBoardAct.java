package HandlinkeyBoardOperation;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandleKeyBoardAct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       WebDriver driver = new ChromeDriver();
       
       
       driver.manage().window().maximize();
       
       driver.get("https://demowebshop.tricentis.com/");
       
       Actions actionobj = new Actions(driver);
       
       actionobj.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
       actionobj.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
       actionobj.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
       actionobj.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
       actionobj.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
       actionobj.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
       actionobj.sendKeys("Book",Keys.ENTER).perform();
       
      /* actionobj.sendKeys(Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,Keys.TAB,"book",Keys.ENTER).perform();  */
       
       
	}

}
