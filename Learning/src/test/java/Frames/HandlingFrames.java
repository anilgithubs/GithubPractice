package Frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//Browser
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("http://www.londonfreelance.org/courses/frames/index.html");//Page
		Thread.sleep(1000);
		//driver.switchTo().frame("content");
		driver.switchTo().frame(4);
		String text = driver.findElement(By.xpath("//h1[text()='Example home page ']")).getText();

		System.out.println(text);
	}

}
