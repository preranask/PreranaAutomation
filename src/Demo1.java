import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "./driverss/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		
		
		driver.manage().deleteAllCookies();
			driver.get("https://www.google.com/");
			
        //driver.findElement(By.name("q")).sendKeys("youtube.com");
	   driver.findElement(By.name("q")).sendKeys("youtube.com");
	   Thread.sleep(2000);
	   Actions action = new Actions(driver); 
	   action.sendKeys(Keys.ENTER).build().perform();
	   WebElement search=driver.findElement(By.id("gsr"));
	   
	   
	   
	   
       
       String xp="//div[@class='sbl1 sbl1p']//span[contains(text(),'youtube')]\r\n";
       
       WebElement suggestion=driver.findElement(By.xpath(xp));
       
       suggestion.click();
		
		Thread.sleep(3000);
		
		driver.close();
		
	}

}
