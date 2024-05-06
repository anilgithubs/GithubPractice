package JqueryDroDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jqueryHandle {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("justAnInputBox")).click();
		List<WebElement> lists = driver.findElements(By.cssSelector("span.comboTreeItemTitle"));

		for(WebElement check : lists) {
//			String text = check.getText();
//			if(text.equals("choice 2 3")) {
//				check.click();
//				break;
//			}
			try {
				check.click();
			} catch (ElementNotInteractableException e) {
				// TODO: handle exception
				break;
			}
		}
	}

}
