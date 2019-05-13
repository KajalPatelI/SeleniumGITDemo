package GitHubScripts;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Kajal\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		
		Cookie SeleniumDemo = new Cookie("NewCookie Kajal", "Today 2nd day if training");
		driver.manage().addCookie(SeleniumDemo);
		
		Set<Cookie> cookiesList = driver.manage().getCookies();
		for(Cookie getcookies :cookiesList)
		{
			System.out.println(getcookies);
			System.out.println(" ");
		}
	}

}
