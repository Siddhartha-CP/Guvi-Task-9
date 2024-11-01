package task9;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new FirefoxDriver();
		
		driver.navigate().to("http://google.com");
		
		driver.manage().window().maximize();
		
		String currenturl = driver.getCurrentUrl();
		
		System.out.println("Current Url: "+ currenturl);
		
		driver.navigate().refresh();
		
		driver.close();
	}

}
