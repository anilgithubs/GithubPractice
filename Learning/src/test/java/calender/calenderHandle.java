package calender;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calenderHandle {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.makemytrip.com/flights/");
		Thread.sleep(5000);

		selectFutureDate(driver,"25-July-2025","dd-MMM-yyyy");
	}

	public static void selectFutureDate(WebDriver driver, String targetDate, String formatDate) {

		Calendar calender = Calendar.getInstance();

		SimpleDateFormat targetformatDate = new SimpleDateFormat(formatDate);

		Date formatedTargetDate = null;

		try {
			targetformatDate.setLenient(false);
			targetformatDate.parse(targetDate);
			calender.setTime(formatedTargetDate);

			int targetDay = calender.get(Calendar.DAY_OF_MONTH);
			int targetMonth = calender.get(Calendar.MONTH);
			int targetYear = calender.get(Calendar.YEAR);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//label[@for='departure']")).click();
			Thread.sleep(3000);
			String actualDate = driver.findElement(By.xpath("//div[@class='DayPicker-Caption']")).getText();
			calender.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));
			
			int actMonth = calender.get(Calendar.MONTH);
			int actYear = calender.get(Calendar.YEAR);
			
			while(targetMonth>actMonth || targetYear>actYear) {
				driver.findElement(By.xpath("//a[@data-handler='next']")).click();
				actualDate = driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
				calender.setTime(new SimpleDateFormat("MMM yyyy").parse(actualDate));
				
				 actMonth = calender.get(Calendar.MONTH);
				 actYear = calender.get(Calendar.YEAR);
			}

			driver.findElement(By.xpath("//p[text()='"+targetDay+"']")).click();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}
}
