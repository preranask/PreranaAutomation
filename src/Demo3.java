import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./driverss/chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		driver.manage().window().maximize();
		
  //er.manage().deleteAllCookies();
		
		
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		
		
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		
		driver.findElement(By.cssSelector("input[type=submit]")).click();
		
		
		
		
		
		

	}

}
