package week3.day2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead
{
		public static void main(String[] args) 
		{
		//  1.  launch the chrome browser 
				ChromeDriver driver=new ChromeDriver();
				//  2.  launch the application url
				driver.get("http://leaftaps.com/opentaps/control/main");
				//  3.  maximize the window
				driver.manage().window().maximize();
				//  4.  enter the username as demosalesmanager
				driver.findElement(By.id("username")).sendKeys("demosalesmanager");
				//  5.  enter the password as crmsfa
				driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
				//  6.  click on login button using class locator
				driver.findElement(By.className("decorativeSubmit")).click();
				//  7. click on crm/sfa link
				driver.findElement(By.linkText("CRM/SFA")).click();
				//8  .click on leads button
				driver.findElement(By.linkText("Leads")).click();
				//9. click on create lead
				driver.findElement(By.partialLinkText("Create")).click();
				//10 . enter the companyn name as tcs
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
				//11. enter the firstname as nandhitha
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sibiraj");
				//12. enter the lastname as r
				driver.findElement(By.id("createLeadForm_lastName")).sendKeys("V");
				//13.enter the firstname local as nandhu
				driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("sibi");
				//14.enter the department name as testing
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
				//15.enter the decription as test engineer
				driver.findElement(By.id("createLeadForm_description")).sendKeys("test engineer");
				//15.enter the mailid as 20g113nandhitha@gmail.com
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("trest123@gmail.com");
				//16. Select State/Province as NewYork Using Visible Text
				WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				Select stateDD = new Select(State);
				stateDD.selectByVisibleText("New York");
				 //17.Click on Create Button
				driver.findElement(By.className("smallSubmit")).click();
				//18 . get the title of resulting page
				String text="viewlead | opentaps CRM";
				String text1=driver.getTitle();
				if(text.equals(text1))
				{
					System.out.println("matches ");
				}
				else
				{
					System.out.println("not matches");
					
				}
				// 19 . click on dupilicate button
				driver.findElement(By.className("subMenuButton")).click();
				//20. clear the company name using .clear()
				driver.findElement(By.id("createLeadForm_companyName")).clear();
				// add the new company name
				driver.findElement(By.id("createLeadForm_companyName")).sendKeys("tcs");
				//clear the first name
				driver.findElement(By.id("createLeadForm_firstName")).clear();
				//enter the new first name
				driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Sibiraj");
				driver.findElement(By.className("smallSubmit")).click();
				String text3="view Lead | opentaps CRM";
				String text4=driver.getTitle();
				if(text3.equals(text4))
				{
					System.out.println("matches ");
				}
				else
				{
					System.out.println("not matches");
					
				}
	}

}
