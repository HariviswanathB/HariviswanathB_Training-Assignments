package Assi1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class BigBasketAnchorTags {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bigbasket.com/ps/?q=milkymist+chees&nc=as&gad_source=1&gad_campaignid=21477799806&gclid=EAIaIQobChMIuuLN89KwkQMVYsE8Ah0apyiuEAAYASAAEgLU1PD_BwE");
		List<WebElement>allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Total number of Anchor (<a>) tags: " + allLinks.size());
		
		for(WebElement links:allLinks) {
			String url=links.getAttribute("href");
			System.out.println(url);
		}


	}

}
