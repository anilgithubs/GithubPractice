package JqueryDroDown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jquery {

	static WebDriver driver;

	public static void main(String[] args) {

		int row = 5;
		
		for(int i=1;i<=row;i++) {
			
			for(int j=1;j<=i;j++) {
				System.out.print(j + " ");
			}
			System.out.println(" ");
			
		}
	}

}