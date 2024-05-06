import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JSScript {

	static WebDriver driver;
	static JavascriptExecutor js;

	public JSScript(WebDriver driver) {

		this.driver = driver;
		js = (JavascriptExecutor) this.driver;
	}

	public static String getTitleByJS() {

		return js.executeScript("return document.title").toString();
	}

	public static String getURLByJS() {

		return js.executeScript("return document.URL").toString();
	}

	public static boolean pageLoadedrnotByJS() {

		return js.executeScript("return document.readyState").equals("complete");
	}

	public static void generateJSAlert(String msg) {

		js.executeScript("alert('" + msg + "')");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		driver.switchTo().alert().accept();
	}
	
	public static void generateJSconfirm(String msg) {

		js.executeScript("confirm('" + msg + "')");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		driver.switchTo().alert().accept();
	}
	
	public static void generateJSPrompt(String msg, String value) {
		js.executeScript("prompt('"+msg+"')");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(value);
		alert.accept();
	}
	
	public static void goForwardWithJS() {
		js.executeScript("history.go(1)");
	}
	
	public static void goBackWithJS() {
		js.executeScript("history.go(-1)");
	}
	
	public static void refreshWithJS() {
		js.executeScript("history.go(0)");
	}
	
	public static void scrolldownwithJS() {
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
	}
	
	public static void scrollMiddlepageWIthJS() {
		js.executeScript("window.scrollTo(0,document.body.scrollHeight/2);");
	}
	
	public static void scrollPageUPWithJS() {
		js.executeScript("window.scrollTo(document.body.scrollHeight,0);");
	}
	
	public static void scrollintoviewByJS(WebElement element) {
		
		js.executeScript("arguments[0].scrollIntoView(true);",element);
	}
	
	public static void clickByJS(WebElement element) {
		js.executeScript("arguments[0].click();",element);
	}
}
