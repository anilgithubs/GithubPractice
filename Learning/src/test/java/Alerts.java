import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerts {

	static WebDriver driver;

	public static void main(String[] args) {

	}

	public static Alert waitforAlert(int timeout) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeout));
		return wait.until(ExpectedConditions.alertIsPresent());
	}

	public static void acceptAlert(int timeout) {
		waitforAlert(timeout).accept();
	}

	public static void dismissAlert(int timeout) {

		waitforAlert(timeout).dismiss();
	}

	public static void sendKeysAlert(int timeout, String text) {
		waitforAlert(timeout).sendKeys(text);
	}
}
