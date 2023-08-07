package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		//1.Launch The Browser
		ChromeDriver driver =new ChromeDriver();
		//2. load the URL
		driver.get("https://www.amazon.in/");
		//3.maximize the window
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//type bags in the searchbox
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bags");
		//choose the items in the result(bags for boys)
		driver.findElement(By.xpath("//span[text()=' for boys']")).click();
		//print the total number of results (like 5000)1-48 of over 50000 results for "bags for boys"
	    System.out.println(driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText());
	    //select the first 2 brands in the left menu
	    driver.findElement(By.xpath("//span[text()='Skybags'and @class='a-size-base a-color-base']")).click();
	    driver.findElement(By.xpath("//span[text()='Safari' and @class='a-size-base a-color-base']")).click();
	    //choose the new arrivals
	    driver.findElement(By.xpath("//span[text()='Sort by:']")).click();
	    driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
	    //print the first resulting bag info(name discount price)
	    System.out.println(driver.findElement(By.xpath("//span[text()='Safari']")).getText());
	    System.out.println(driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText());
	    //get the page title and choose the browser(driver.close())
	   System.out.println(driver.getTitle());
	   Thread.sleep(10000);
	   driver.close();
	    
	    
	 

	}

}
