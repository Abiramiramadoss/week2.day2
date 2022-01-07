package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PrintTitlePage {

	public static void main(String[] args) {
		
				WebDriverManager.chromedriver().setup();
				ChromeDriver driver = new ChromeDriver();
				driver.get("https://acme-test.uipath.com/login");
				driver.manage().window().maximize();
				WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
				email.sendKeys("kumar.testleaf@gmail.com");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("leaf@12");
				driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
				String title = driver.getTitle();
				System.out.println(title);
				driver.findElement(By.linkText("Log Out")).click();
				driver.close();
				
				
				

	}

}
