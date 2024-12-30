package selenium.work;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.*;

public class browseropen {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//System.setPrperty("webdriver.chrome.driver".Chromedriver.C:\Users\Admin\Downloads
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(4000);
		driver.manage().window().maximize();
		Thread.sleep(6000);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.id("email")).sendKeys("Email address");
		Thread.sleep(6000);
                driver.findElement(By.name("pass")).sendKeys("lucky123#");
        	Thread.sleep(8000);
        	driver.findElement(By.name("login")).click();
        	Thread.sleep(7000);
		driver.close();
		driver.quit();

	}

}

		