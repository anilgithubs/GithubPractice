package Actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysWithActions {

	static WebDriver driver;
	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
		Actions act = new Actions(driver);
		By firstName = By.id("input-firstname");
		sendKeysWithPauseAction(firstName,"Naveen");
		
		//act.sendKeys(firstName, "Naveen").sendKeys(Keys.TAB).pa
		/*act.sendKeys(getElement(firstName), "Naveen")
		.sendKeys(Keys.TAB).pause(500)
		.sendKeys("Automation").sendKeys(Keys.TAB).pause(500)
		.sendKeys("latest").perform();*/
		
		
		
	}
	
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}
	
	public static void sendKeysWithAction(By locator, String value) {
		
		Actions act = new Actions(driver);
		act.sendKeys(getElement(locator), value);
	}
	
	public static void clickWithActions(By locator) {
		Actions act = new Actions(driver);
		act.click(getElement(locator));
	}

public static void sendKeysWithPauseAction(By locator, String value) {
		
		Actions act = new Actions(driver);
		char[] ch = value.toCharArray();
		for(char c : ch) {
		act.sendKeys(getElement(locator), String.valueOf(c)).pause(1000).perform();
		}
	}
}
