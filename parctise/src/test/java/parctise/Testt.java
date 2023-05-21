package parctise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Testt {
	@Test
public void test1()
{
	//pulling from guthub
	WebDriver driver = new ChromeDriver();
	driver.get("https://github.com/");
}
}
