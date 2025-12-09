package Assi1;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class CrossBrowserTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Browser in which you want to Launch the Website : ");
		String browser=sc.nextLine();
		WebDriver driver=null;
		if(browser.equalsIgnoreCase("Chrome")){
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("FireFox")){
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("Safari")){
			driver=new SafariDriver();
		}
		else {
			System.out.println("The Browser you entered is invalid");
		}
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org");
		
		System.out.println("Page Title : "+driver.getTitle());
		
		

	}

}
