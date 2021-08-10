package init_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;

import com.paulhammant.ngwebdriver.ByAngular;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.BrowserType;
 

public class init_test {
	
	public void test1() {
		//setting the driver executable
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\agales\\Desktop\\TSAS\\chromedriver_win32\\chromedriver.exe");
		
		//Initiating your chromedriver
		WebDriver driver = new ChromeDriver();
		
		//Applied wait time
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//maximize window
		//driver.manage().window().maximize();
		//TODO make functions to centralize usual behaviors
		
		//open browser and open the TSAS interface
		//ByAngular.buttonText("cLiCk mE");

		
		//driver.get("https://gateway.after.eu.airbus.corp/tsas-val/plot/ui/canvas");
		driver.get("https://voice.google.com/u/0/about");
		//ByAngular.buttonText("For personal use");
		//ByAngular.buttonText("Create a canvas");
		//driver.findElement(By.linkText("For personal use")).click();
		driver.findElement(By.className("mat-button-wrapper")).click();
		
		//driver.findElement(By.linkText("Choose your A/C type")).click();
		//driver.findElement(By.linkText("A320")).click();
		
		//driver.findElement(By.linkText("Choose your Aircraft")).click();
		//driver.findElement(By.id("msnSearch")).click();
		//WebElement msn = driver.findElement(By.id("msnSearch"));
		//msn.sendKeys("F10543");
		//driver.findElement(By.linkText("F10543")).click();
		//driver.findElement(By.id("search-btn")).click();
		
		//driver.findElement(By.id("testTypes")).click();
		//driver.findElement(By.linkText("Run")).click();
		//driver.findElement(By.linkText("Static/Session")).click();
		
		//WebElement dropdown =  driver.findElement(By.id("dropdownMenuButton1"));
		//dropdown.sendKeys(Keys.ENTER);
		
		//Select select = new Select(dropdown);
		//select.deselectByIndex(2);
		
		//dropdown.findElement(By.linkText("Another action")).click();
		//driver.findElement(By.name("Get started")).click();
	
		//Select select = new Select(driver.findElement(By.name("Get started")));
		//select.selectByVisibleText("Get started");
		
		//closing the browser
		//driver.close();
	}

	public static void main(String[] args) {
		init_test obj= new init_test();
		obj.test1();
	}

}
