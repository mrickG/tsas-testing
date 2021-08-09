package init_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

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
		
		//open browser with desried URL
		//driver.get("https://gateway.after.eu.airbus.corp/tsas-val/plot/ui/canvas");
		driver.get("https://getbootstrap.com/");
		driver.findElement(By.linkText("Get started")).click();
		//driver.findElement(By.className("bd-sidebar")).click();
		WebElement search =  driver.findElement(By.id("search-input"));
		search.sendKeys("dropdowns");
		search.sendKeys(Keys.DOWN);
		search.sendKeys(Keys.ENTER);
		
		//driver.findElement(By.linkText("Dropdown button")).click();
		WebElement dropdown =  driver.findElement(By.id("dropdownMenuButton1"));
		dropdown.sendKeys(Keys.ENTER);
		
		Select select = new Select(dropdown);
		select.deselectByIndex(2);
		
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
