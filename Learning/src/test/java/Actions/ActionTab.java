package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionTab {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		// act.sendKeys(firstName,
		// "Anil").sendKeys(Keys.TAB).pause(1000).sendKeys(Keys.TAB).pause(1000).sendKeys(Keys.TAB).sendKeys("anils").perform();
		String name = "ANLis";
		char[] val = name.toCharArray();

		for(char c:val) {
		act.sendKeys(firstName, String.valueOf(c)).pause(500).perform();
	}
	}

}
