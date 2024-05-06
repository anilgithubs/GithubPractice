import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleCountry {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(10000);
		
		while(true) {
			
			if(driver.findElements(By.xpath("//tr[td[contains(text(),'Russia')] or td[contains(text(),'India')]]")).size()>0) {
				
				selectmuliplsCountry("Russia","India");
			}
			
			WebElement next =  driver.findElement(By.linkText("Next"));
			
			if(next.getAttribute("class").contains("disabled")) {
				
				System.out.println("Pagination is completed... No Country found");
				break;
			}
			next.click();
			Thread.sleep(1000);
		}
	}
	
	
	public static void selectmuliplsCountry(String countryName1, String countryName2) {
		
		List<WebElement> ele = driver.findElements(By.xpath("//tr[td[contains(text(),'"+countryName1+"')] or td[contains(text(),'"+countryName2+"')]]/child::td/input[@type='checkbox']"));
		
		for(WebElement list:ele) {
			list.click();
		}
	}

}
