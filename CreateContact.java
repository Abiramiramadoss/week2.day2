package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/");
		 driver.manage().window().maximize();
		 WebElement username = driver.findElement(By.id("username"));
		 username.sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Contacts")).click();
		 driver.findElement(By.linkText("Create Contact")).click();
		 driver.findElement(By.id("firstNameField")).sendKeys("Abi");
         driver.findElement(By.id("lastNameField")).sendKeys("Akr");
         driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Abirami");
         driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Ramadoss");
         driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("rdtd");
         driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("crehrieur533gri2e2u4233ty4htr");
         driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("abisangeetha1606@gmail.com");
         WebElement dd =driver.findElement(By.xpath("//select[@id='createContactForm_generalStateProvinceGeoId']"));
         Select dropdown = new Select(dd);
         dropdown.selectByVisibleText("New York");
         driver.findElement(By.xpath("//input[@name='submitButton']")).click();
         driver.findElement(By.linkText("Edit")).click();
         driver.findElement(By.xpath("//textarea[@name='description']")).clear();
         driver.findElement(By.xpath("//textarea[@id='updateContactForm_importantNote']")).sendKeys("gwqergwrhr3");
         driver.findElement(By.xpath("//input[@value='Update']")).click();
         String title = driver.getTitle();
         System.out.println(title);
         
         
         
         

	}

}
