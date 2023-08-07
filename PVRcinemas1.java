package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PVRcinemas1 {
	public static void main(String[] args) {
		
		//launch and get
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.pvrcinemas.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//click menu and movie library
		driver.findElement(By.xpath("//div[@class='nav-icon']")).click();
		driver.findElement(By.xpath("//a[@class='ng-star-inserted']")).click();
		
		//select place genre language
		Select city = new Select(driver.findElement(By.xpath("//select[@name='city']")));
		city.selectByVisibleText("Chennai");
		
		Select genre = new Select(driver.findElement(By.xpath("//select[@name='genre']")));
		genre.selectByVisibleText("ANIMATION");
		
		Select language = new Select(driver.findElement(By.xpath("//select[@name='lang']")));
		genre.selectByIndex(3);
		
		
		// click apply
		driver.findElement(By.xpath("//button[text()='Apply']")).click();
		
		//click 1st movie
		Select movie = new Select(driver.findElement(By.xpath("//div[@class='movie-list']")));
		movie.selectByVisibleText("Paw Patrol")	;
		
		//click proceed to book
		driver.findElement(By.xpath("//button[text()='Proceed To Book']")).click();
		
		//enter details
		driver.findElement(By.xpath("//select[@id='cinemaName']")).sendKeys("AeroHub");
		
		Select timings = new Select(driver.findElement(By.xpath("//select[@name='timings']")));
	    timings.selectByVisibleText("09:00 AM - 12:00 PM");
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Abilash");
		
		driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("9874563210");
		
		driver.findElement(By.xpath("//input[@name='noOfTickets']")).sendKeys("10");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("godzilla@gmail.com");
		
		Select fAndb = new Select(driver.findElement(By.xpath("//input[@name='food']")));
		fAndb.selectByVisibleText("Yes");
		
		driver.findElement(By.xpath("//span[@class='custom-control-indicator']")).click();
		
		driver.findElement(By.xpath("//button[text()='SEND REQUEST']")).click();
		
		driver.findElement(By.xpath("//button[text()='CANCEL']")).click();
		
		driver.findElement(By.xpath("//button[text()='×']")).click();
		
		System.out.println(driver.findElement(By.xpath(driver.getTitle())));
		
		
		
	}

}
