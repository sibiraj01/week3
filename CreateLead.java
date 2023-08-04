package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {

	public static void main(String[] args) throws InterruptedException {
		
		// launchthe chrome browser
		ChromeDriver driver =new ChromeDriver();
		
		//load the application
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//maximize the browser
		driver.manage().window().maximize();
		
		//enter the user name as demosalesmanager
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		
		//enter the password as crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//click on login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		
		//print welcome note
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		
		//click on hyper link button
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//click on leads tap
		driver.findElement(By.linkText("Leads")).click();
		
		
		//click oncreate lead button
		driver.findElement(By.partialLinkText("Create")).click();
		
		
		
		//enter the company name
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		
		//enter thefirst name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sibiraj");
		
		
		//enter thelast name
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("V");
		
		
	    //Enter FirstName(Local)FieldUsing id Locator
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sherif123");
		
		
		//Enter departmentfield usingg any locator of your choice
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
		
		//Enter description field
		driver.findElement(By.id("createLeadForm_description")).sendKeys("TestEngineer");
		
		//Enter your email in the email address
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sibi123@gmail.com");
		
		//select State/Province as NewYork using visible text
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select  stateDD=new Select(state);
		Thread.sleep(5000);
		stateDD.selectByVisibleText("New York");
		
		//click on create button
		driver.findElement(By.className("smallSubmit")).click();
		
		//get thr title of resulting page
		String title="View Lead | opentaps CRM";
		//driver.get title
		
		String title2 = driver.getTitle();
		
		if (title.equals(title2)) {
			System.out.println("title page is verified");
		} else {
			System.out.println("title page is not verified");
 
		}
		

	}

}
