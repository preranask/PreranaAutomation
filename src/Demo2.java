import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","./driverss/chromedriver.exe");
		
	 WebDriver driver= new ChromeDriver();
	 
	 driver.manage().window().maximize();
	 
	 driver.get("https://www.facebook.com/");
	 
	 
	 driver.findElement(By.name("email")).sendKeys("preranakadlaskar@gmail.com");
	 
	 driver.findElement(By.name("pass")).sendKeys("");
	 
	 driver.findElement(By.name("login")).click();
	 
	 driver.findElement(By.name("_6s5d _71pn _-kb segoe\"")).click();
	 
	 	
	 //driver.findElement(By.linkText("Forgotten account?"));
	 
	 
	 
	}

}
