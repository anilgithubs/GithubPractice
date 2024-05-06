import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement mainlct =  driver.findElement(By.xpath("//select"));
		  By secondlct = By.xpath("//select/option");
		
		Select select = new Select(mainlct);
		
//		System.out.println(select.isMultiple());
//		if(select.isMultiple()) {
//			
//			for(WebElement list : secondlct) {
//				
//				String name = list.getText();
//				System.out.println(name);
//				list.click();
//			}
//			
//		}
		
		SelectMultipleDropdown(mainlct,secondlct,"all");
		
	}
	
	public static void SelectMultipleDropdown(WebElement first, By second, String... values) {
		
		Select select = new Select(first);
		
		if(select.isMultiple()) {
			
			if(values[0].equalsIgnoreCase("all")) {
				List<WebElement> optionlist = driver.findElements(second);
				for(WebElement list : optionlist) {
					
					list.click();
				}
			}else {
				
				for(String val : values) {
					select.selectByVisibleText(val);
				}
			}
		}
		
	}
	
	


}
