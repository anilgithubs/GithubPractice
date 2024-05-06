package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFramess {

	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.londonfreelance.org/courses/frames/index.html");
		//driver.switchTo().frame("content");
		//driver.switchTo().frame(4);
		WebElement ele = driver.findElement(By.xpath("//frame[@name='content']"));
		driver.switchTo().frame(ele);
		String text = driver.findElement(By.xpath("//h1[text()='Example home page ']")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
	}

}
