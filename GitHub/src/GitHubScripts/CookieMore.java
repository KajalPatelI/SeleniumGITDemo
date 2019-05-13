package GitHubScripts;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CookieMore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Kajal\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		
		Cookie SeleniumDemo1 = new Cookie("UserName", "TestUser");
		driver.manage().addCookie(SeleniumDemo1);
		
		Cookie SeleniumDemo2 = new Cookie("Password", "TestPassword");
		driver.manage().addCookie(SeleniumDemo2);
		
		Set<Cookie> ck = driver.manage().getCookies();
		for(Cookie c :ck)
		{
			System.out.println("Name" + c.getName());
			System.out.println("Value" + c.getValue());
			System.out.println("Domain" + c.getDomain());
			System.out.println("Path" + c.getPath());
			System.out.println("Expires" + c.getExpiry());
			System.out.println(" ");
		}
	}

}
