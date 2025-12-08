package Assi1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonAssi {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.linkText("Customer Service")).click();
		System.out.println("Clicked using LinkText");
		
		driver.navigate().back();
		
		driver.findElement(By.partialLinkText("Deals")).click();
		System.out.println("Clicked using PartialLinkText");
		
		driver.quit();
		
	}

}
