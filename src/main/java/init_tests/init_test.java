package init_tests;

import org.openqa.selenium.WebDriver;
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
		driver.get("https://gateway.after.eu.airbus.corp/tsas-val/plot/ui/canvas");
		
		//closing the browser
		//driver.close();
	}

	public static void main(String[] args) {
		init_test obj= new init_test();
		obj.test1();
	}

}
