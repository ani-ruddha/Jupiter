package section1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {
	public static void main(String[] args) throws Exception {
		/* launching browser */
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumFolder\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();

//		1st way*:-		
//		driver.navigate().to("");		
//		driver.navigate().back();	
//		driver.navigate().forward();	
//		driver.navigate().refresh();

		// 2nd way:-
		Navigation nav = driver.navigate();
		nav.to("https://www.amazon.in/");
		Thread.sleep(3000);
		nav.to("https://www.flipkart.com/");
		Thread.sleep(3000);
		nav.back();
		Thread.sleep(3000);
		nav.forward();
		Thread.sleep(3000);
		nav.refresh();

	}
}
