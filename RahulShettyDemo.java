package Assi1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RahulShettyDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement radioButton = driver.findElement(By.name("radioButton"));
        radioButton.click();
		System.out.println("Radio button selected");
		
		WebElement checkBox1 = driver.findElement(By.id("checkBoxOption1"));
        WebElement checkBox2 = driver.findElement(By.id("checkBoxOption2"));

        checkBox1.click();
        checkBox2.click();
        System.out.println("Two checkboxes selected");
	}

}
