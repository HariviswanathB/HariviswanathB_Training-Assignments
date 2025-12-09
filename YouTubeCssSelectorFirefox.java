package Assi1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class YouTubeCssSelectorFirefox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		
		Thread.sleep(3000);
		
		WebElement searchBar=driver.findElement(By.cssSelector("input[name='search_query']"));
		searchBar.sendKeys("Saiyaara");
		
		WebElement searchButton=driver.findElement(By.cssSelector(".ytSearchboxComponentSearchButton"));
		searchButton.click();
		
		System.out.println("Page Title: " + driver.getTitle());
		
		

	}

}
