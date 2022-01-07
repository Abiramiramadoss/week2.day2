package week2.day2.assignment;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebooklogin {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 
		WebElement newaccount = driver.findElement(By.linkText("Create New Account"));
		newaccount.click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Abirami");
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Sangeetha");
		 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("9597837520");
		 driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("Abiakr@123");
		 WebElement dob =driver.findElement(By.id("day"));
		 Select day = new Select(dob);
		 day.selectByVisibleText("16");
		 WebElement dob1 = driver.findElement(By.id("month"));
		 Select month = new Select(dob1);
		month.selectByValue("6");
		 WebElement dob2 =driver.findElement(By.id("year"));
		 Select year = new Select(dob2);
		 year.selectByValue("1997");
		 driver.findElement(By.xpath("//input[@value='1']")).click();
		 driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		 
			

	}

}
