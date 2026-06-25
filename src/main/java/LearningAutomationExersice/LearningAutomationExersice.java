package LearningAutomationExersice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningAutomationExersice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationexercise.com/");
		
		
		System.out.println("ChromeDriver title" + driver.getTitle());
		WebElement signup=driver.findElement(By.xpath("//i[@class='fa fa-lock']"));
		signup.click();
		WebElement logemail= driver.findElement(By.xpath("//input[@data-qa='signup-email']"));
		logemail.sendKeys("livingston.v.personal@gmail.com");
		 boolean displaystatus=logemail.isDisplayed();
		 if(displaystatus) {
			 System.out.println("Is Displayed");
		 }else {
			 System.out.println("IS Not Displayed");
		 }
		WebElement nametxtfld=driver.findElement(By.xpath("//input[@data-qa='signup-name']"));
	     nametxtfld.sendKeys("LIVINGSTON V");
	     boolean displaystatus1=nametxtfld.isEnabled();
		WebElement signbutton =driver.findElement(By.xpath("//button[@data-qa='signup-button']"));
		signbutton.click();
		WebElement gender =driver.findElement(By.xpath("//label[@for='id_gender1']"));
		gender.click();
		WebElement password =driver.findElement(By.xpath("//input[@id='password']"));
		password.sendKeys("Livi2005@");
		WebElement date =driver.findElement(By.xpath("//select[@id='days']"));
		date.sendKeys("12");
		WebElement month =driver.findElement(By.xpath("//select[@name='months']"));
		month.sendKeys("january");
		WebElement year =driver.findElement(By.xpath("//select[@name='years']"));
		year.sendKeys("2021");
		WebElement checkbox1 =driver.findElement(By.xpath("//input[@type='checkbox']"));
		checkbox1.click();
		WebElement checkbox2 =driver.findElement(By.xpath("//input[@name='optin']"));
		checkbox2.click();
		WebElement firstname =driver.findElement(By.xpath("//input[@id='first_name']"));
		firstname.sendKeys("LIVINGSTON");
		WebElement lastname =driver.findElement(By.xpath("//input[@id='last_name']"));
		lastname.sendKeys("V");
		WebElement company =driver.findElement(By.xpath("//input[@id='company']"));
		company.sendKeys("Qspider");
		WebElement address =driver.findElement(By.xpath("//input[@data-qa='address']"));
		address.sendKeys("Ukkaram");
		WebElement address2 =driver.findElement(By.xpath("//input[@data-qa='address2']"));
		address2.sendKeys("Sathyamangalam");
		WebElement state =driver.findElement(By.xpath("//input[@data-qa='state']"));
		state.sendKeys("TamilNadu");
		WebElement city =driver.findElement(By.xpath("//input[@data-qa='city']"));
		city.sendKeys("Erode");
		WebElement zipcode =driver.findElement(By.xpath("//input[@data-qa='zipcode']"));
		zipcode.sendKeys("638402");
		WebElement mobnumber =driver.findElement(By.xpath("//input[@data-qa='mobile_number']"));
		mobnumber.sendKeys("9344991661");
		WebElement createacc =driver.findElement(By.xpath("//button[@type='submit']"));
		createacc.click();
		WebElement conbtn =driver.findElement(By.xpath("//a[@data-qa='continue-button']"));
		conbtn.click();
		WebElement men =driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
		men.click();
		WebElement tshirt =driver.findElement(By.xpath("//a[contains(text(),'Tshir')]"));
		tshirt.click();
		WebElement addtocart =driver.findElement(By.xpath("//a[@data-product-id='43']"));
		addtocart.click();
		WebElement viewcart =driver.findElement(By.xpath("//button[@type='submit']"));
		viewcart.click();
		WebElement checkout =driver.findElement(By.xpath("//a[@class='btn btn-default check_out']"));
		checkout.click();
		WebElement placeorder =driver.findElement(By.xpath("//a[@class='btn btn-default check_out']"));
		placeorder.click();
		driver.close();
		System.out.println("Execution Done By Livingston");
		
	}

}
