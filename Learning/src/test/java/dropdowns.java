import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdowns {

	static WebDriver driver;
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/#google_vignette");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		List<WebElement> chekc = driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
		for(WebElement list:chekc) {
			
			String name = list.getText();
			System.out.println(name);
			if(name.contains("choice 6 2 1")) {
				list.click();
				break;
			}
//			try {
//				list.click();
//			} catch (Exception e) {
//				// TODO: handle exception
//				System.out.println("Drop down list completed");
//				break;
//			}
			
		}
	}
}
