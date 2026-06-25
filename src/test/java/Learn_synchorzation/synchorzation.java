package Learn_synchorzation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class synchorzation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.shoppersstack.com/");
		
		WebElement titletxtfld=driver.findElement(By.xpath("//h3[contains(text(),'Welcome')]"));
		System.out.println(titletxtfld.getText());
		
		WebElement logbtn=driver.findElement(By.xpath("//button[@id='loginBtn']"));
        logbtn.click();
        
        driver.close();
	}

}
