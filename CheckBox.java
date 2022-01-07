package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CheckBox {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://www.leafground.com/pages/checkbox.html");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.findElement(By.xpath("//div[text()='Java']/input")).click();
		 driver.findElement(By.xpath("//div[text()='C']/input")).click();
		 driver.findElement(By.xpath("//div[text()='C++']/input")).click();
		 driver.findElement(By.xpath("//div[text()='I am Selected']/input")).click();
		 driver.findElement(By.xpath("//div[text()='Option 1']/input")).click();
		 driver.findElement(By.xpath("//div[text()='Option 2']/input")).click();
		 driver.findElement(By.xpath("//div[text()='Option 3']/input")).click();
		 driver.findElement(By.xpath("//div[text()='Option 4']/input")).click();
		 driver.findElement(By.xpath("//div[text()='Option 5']/input")).click();
		 
		 

	}

}
