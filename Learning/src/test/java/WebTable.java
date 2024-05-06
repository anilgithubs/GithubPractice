import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selectorshub.com/xpath-practice-page/");
		//selectCountry("United States");
		
		while(true) {
			
			if(driver.findElements(By.xpath("//td[text()='Russia']")).size()>0){
				//selectCountry("Denmark");
				//break;
				selectMultupleCountry("Russia");
				break;
			}
				WebElement next = driver.findElement(By.linkText("Next"));
				
				if(next.getAttribute("class").contains("disabled")) {
					System.out.println("Pagenation is over country is not found");
					break;
				}
				
				next.click();
				Thread.sleep(1000);
			
		
		}
	}

	public static void selectCountry(String countryName) {

		driver.findElement(
				By.xpath("//td[contains(text(),'" + countryName + "')]/preceding-sibling::td/input[@type='checkbox']"))
				.click();
	}

	public static void selectMultupleCountry(String countryName) {

		List<WebElement> ele = driver.findElements(
				By.xpath("//td[contains(text(),'" + countryName + "')]/preceding-sibling::td/input[@type='checkbox']"));

		for (WebElement list : ele) {

			list.click();
		}
	}
}
