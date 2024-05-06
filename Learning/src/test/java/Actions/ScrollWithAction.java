package Actions;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollWithAction {
 
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.zomato.com/india");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.COMMAND).sendKeys(Keys.END).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.COMMAND).sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.COMMAND).sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.sendKeys(Keys.COMMAND).sendKeys(Keys.HOME).perform();
	}

}
