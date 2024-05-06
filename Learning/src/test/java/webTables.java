import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTables {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);
		
		ArrayList<String> ds = userDetails("John.Smith");
		System.out.println(ds);
		
		clickOnUser("John.Smith");
	}
////a[text()='Joe.Root']/parent::td/following-sibling::td
	public static void clickOnUser(String user) {
		
		driver.findElement(By.xpath("//a[text()='"+user+"']/parent::td/preceding-sibling::td/input[contains(@id,'ohrmList_chkSelectRecord_')]")).click();
		
	}
	
	
	public static ArrayList<String> userDetails(String user) {
		
		List<WebElement> details = driver.findElements(By.xpath("//a[text()='"+user+"']/parent::td/following-sibling::td"));
		ArrayList<String> list = new ArrayList<String>();
		for(WebElement ele:details) {
			
			String text = ele.getText();
			list.add(text);
		}
		return list;
	}
}
