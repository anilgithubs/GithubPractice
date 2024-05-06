import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class svg {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://petdiseasealerts.org/forecast-map");
		
		Thread.sleep(5000);
		
		String statePath ="//*[local-name()='svg' and @id='map-svg']//*[name()='g' and @id='features']//*[name()='g' and @class='region']";
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]")));
		
		List<WebElement> state_list = driver.findElements(By.xpath(statePath));
		
		
		Actions act = new Actions(driver);
		
		for(WebElement list : state_list) {
			
			act.moveToElement(list).perform();
			Thread.sleep(500);
			String state_Name = list.getAttribute("id");
			System.out.println(state_Name);
		}
		

	}

}
