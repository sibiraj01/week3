package week3.day5;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AbhiBus1 
{
	public static void main(String[] args) 
	{
		//1.Launch The Browser
		ChromeDriver driver =new ChromeDriver();
		//2. load the URL
		driver.get("https://www.abhibus.com");
		//3.maximize the window
		driver.manage().window().maximize();
		//4.add implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//5.type chennai in from text
		driver.findElement(By.id("source")).sendKeys("chennai");
		//6.select the first pop up message
		driver.findElement(By.xpath("//li[text()='Chennai']")).click();
		//7.type bangalore in to text
		driver.findElement(By.id("destination")).sendKeys("bangalore");
		//8.select the first pop message 
		driver.findElement(By.xpath("//li[text()='Bangalore']")).click();
		//9.select tomorrows date in date field
		driver.findElement(By.id("datepicker1")).click();
		driver.findElement(By.xpath("//a[@class='ui-state-default']")).click();
		//10. click on search box
		driver.findElement(By.xpath("//a[text()='Search']")).click();
		//11.print the resulting bus
		WebElement name =driver.findElement(By.xpath("//h2[@title='Yolo Bus']"));
		String name1=name.getText();
		System.out.println("name of the first resulting bus "+ name1);
		//12.choose the sleeper in the left menu
		driver.findElement(By.xpath("//input[@id='Bustypes4']")).click();	
		//13.print the resulting bus seat count(eg.35 seats available)
		WebElement state=driver.findElement(By.xpath("//p[text()='20 Seats Available']"));
		String state1=state.getText();
		System.out.println("seat count is "+state1);
		//14.click select seat
		driver.findElement(By.className("book")).click();
		//15. choose any one available seat
		driver.findElement(By.className("pillow")).click();
		//16.print seats selected 
		WebElement state2 = driver.findElement(By.id("seatnos"));
		String state3=state2.getText();
		System.out.println(state3);
		//17.print the total fare
		WebElement state4=driver.findElement(By.id("ticketfare"));
		String stateDD=state4.getText();
		System.out.println(stateDD);
		//18.select the boarding point
		WebElement state5 = driver.findElement(By.xpath("//select[@name='boardingpoint_id']"));
		Select state6=new Select(state5);  
		state6.selectByVisibleText("Sirsuri-21:00");
		//19.select the dropping wait
		WebElement state7=driver.findElement(By.xpath("//select[@id='droppingpoint_id']"));
		Select state8=new Select(state7);
		state8.selectByVisibleText("Attibele Toll Gate-04:22");
		//20.get the title of the page
		String title=driver.getTitle();
		System.out.println(title);
		//close the browser
		driver.close();
		
	}
	
}
