import java.time.Duration;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class waitfortitle {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public static String waitforTitleContains(String titleFraction, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));

		try {
			if (wait.until(ExpectedConditions.titleContains(titleFraction))) {
				return driver.getTitle();
			}
		} catch (org.openqa.selenium.TimeoutException e) {

			System.out.println(titleFraction + "title not present.....");
		}
		return null;

	}

	public static String waitforTitle(String title, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			if (wait.until(ExpectedConditions.titleIs(title))) {
				return driver.getTitle();
			}
		} catch (org.openqa.selenium.TimeoutException e) {

			System.out.println(title + "title not present.....");
		}
		return null;
	}

	public static String waitforURLcontains(String urlcontains, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			if (wait.until(ExpectedConditions.urlContains(urlcontains))) {
				return driver.getCurrentUrl();
			}
		} catch (org.openqa.selenium.TimeoutException e) {

			System.out.println(urlcontains + "URL not present.....");
		}
		return null;
	}

	public static String waitforURLIS(String url, int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		try {
			if (wait.until(ExpectedConditions.urlToBe(url))) {
				return driver.getCurrentUrl();
			}
		} catch (org.openqa.selenium.TimeoutException e) {

			System.out.println(url + "URL not present.....");
		}
		return null;
	}
}
