package week2.day2.assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HyperLinkPage {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://www.leafground.com/pages/Link.html");
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		 driver.findElement(By.linkText("Go to Home Page")).click();
		 driver.findElement(By.xpath("//h5[text()='HyperLink']")).click();
		
		 System.out.println(driver.findElement(By.linkText("Find where am supposed to go without clicking me?")).getAttribute("href"));
		 System.out.println(driver.findElement(By.linkText("Verify am I broken?")).getAttribute("href"));

	}

}
