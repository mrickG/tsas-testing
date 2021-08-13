package init_tests;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.util.concurrent.TimeUnit;

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
		
		String useDir = FileSystems.getDefault().getPath("").toAbsolutePath().toString();
		System.setProperty("webdriver.chrome.driver", useDir + "\\src\\main\\resources\\chromedriver.exe");
		
		//Initiating your chromedriver
		WebDriver driver = new ChromeDriver();
		
		//Applied wait time
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//maximize window
		//driver.manage().window().maximize();
		//TODO make functions to centralize usual behaviors
		
		//open browser and open the TSAS interface
		//ByAngular.buttonText("cLiCk mE");
		
		//Accessing the tsas url
		driver.get("https://gateway.after.eu.airbus.corp/tsas-val/plot/ui/canvas");
		//driver.findElement(By.xpath("/html/body/div[2]/div[3]/div/button/span"));
		
		//Clicking the "Create a Canvas" button
		//WebElement button = driver.findElement(By.xpath("/html/body/app-root/app-canva/div/div/button"));
		WebElement canvasButton = driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/div/div[1]/section/section[4]/div[1]/div[1]/section[1]/button"));
		canvasButton.click();
		
		//Accessing the Category and selecting PROD
		Select categoryDropdown = new Select(driver.findElement(By.xpath("/html/body/app-root/app-canva/div/div/button")));
		categoryDropdown.selectByVisibleText("PROD");
		
		//Selecting a/c type 
		Select dropdown = new Select(driver.findElement(By.xpath("/html/body/div[2]/div/div/div//mat-option[3]/span")));
	    dropdown.selectByIndex(2);
	    
	    //Selecting a/c type alternative
	    //driver.findElement(By.linkText("Choose your A/C type")).click();
  		//driver.findElement(By.linkText("A320")).click();
	    
		//Focus and filling the a/c MSN search 
		WebElement msn = driver.findElement(By.id("msnSearch"));
		msn.sendKeys("F10543");
		msn.sendKeys(Keys.ENTER);
		
		//Focus and filling the a/c MSN search alternative1
		//driver.findElement(By.linkText("Choose your Aircraft")).click();
		//driver.findElement(By.id("msnSearch")).click();
		//WebElement msn = driver.findElement(By.id("msnSearch"));
		//msn.sendKeys("F10543");
		
		//Focus and filling the a/c MSN search alternative
		//WebElement aircrafttypeDropdown = driver.findElement(By.xpath("/html/body/main/div/div/div/div[1]/div/div[1]/section/section[4]/div[1]/div[1]/section[1]/button"));
		//aircrafttypeDropdown.click();
		
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
