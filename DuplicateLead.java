package week2.day2.assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		 WebDriverManager.chromedriver().setup();
		 ChromeDriver driver = new ChromeDriver();
		 driver.get("http://leaftaps.com/opentaps/control/login");
		 driver.manage().window().maximize();
		 WebElement username = driver.findElement(By.id("username"));
		 username.sendKeys("DemoSalesManager");
		 driver.findElement(By.id("password")).sendKeys("crmsfa");
		 driver.findElement(By.className("decorativeSubmit")).click();
		 driver.findElement(By.linkText("CRM/SFA")).click();
		 driver.findElement(By.linkText("Leads")).click();
		 driver.findElement(By.linkText("Find Leads")).click();
		 WebElement dd = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/a)[1]"));
         String firstName=dd.getText();
         System.out.println(firstName);
         //Click on Email
         driver.findElement(By.xpath("//span[text()='Email']")).click();
         
         //Enter Email
         driver.findElement(By.name("emailAddress")).sendKeys("abisangeetha1606@gmail.com");
        
         dd.click();
         //Click Duplicate Lead
         driver.findElement(By.xpath("(//div[@class='frameSectionExtra']/a)[1]")).click();
         //Verify the title as 'Duplicate Lead'
         String title=driver.getTitle();
         if(title.contains("Duplicate"))
         	System.out.println("Title is verified");
         else
         	System.out.println("Your are at wrong page");
         
         //Click Create Lead
         driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
         
         //Confirm the duplicated lead name is same as captured name
         WebElement lead = driver.findElement(By.xpath("//span[@id='viewLead_firstName_sp']"));
         String leadName=lead.getText();
         System.out.println(leadName);
         if(leadName.equalsIgnoreCase(firstName))
         	System.out.println("Duplicate lead name is same as captured name");
         else
         	System.out.println("Duplicate lead name is not same as captured name");
         
		

	}

}
