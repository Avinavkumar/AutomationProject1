package Base;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BrowserTest {

	//	public static void main(String[] args) 
	public static WebDriver driver;
	
	@BeforeMethod
	public void LaunchDriver()
	{

//		String path = System.getProperty("user.dir");
//		System.out.println(path);
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Avinav\\eclipse-workspace\\SeliniumAutomation\\driver\\geckodriver\\geckodriver.exe");
		driver = new FirefoxDriver();
		//		driver.get("https://amazon.in/");
		//		driver.quit();
		//		driver.close();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().fullscreen();
	}
	@Test
	public void Test1(){
		driver.navigate().to("https://amazon.in/");
		System.out.println("Test 1 title is "+driver.getTitle());
	}
	@Test
	public void Test2(){
		driver.navigate().to("https://amazon.in/");
		System.out.println("Test 2 title is "+driver.getTitle());	
	}
	@Test
	public void Test3(){
		driver.navigate().to("https://amazon.in/");
		System.out.println("Test 3 title is "+driver.getTitle());
	}
	@AfterMethod
	public void quit() {
		driver.quit();
	}

}
