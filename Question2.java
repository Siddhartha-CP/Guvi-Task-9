package task9;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.demoblaze.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		String expected_title ="STORE";
				
		String title = driver.getTitle();
		
		System.out.println("page title :" + title);
		
		if(title.equals(expected_title)) {
			
			System.out.println("Page landed on correct website");
	
		}
		else {
			System.out.println("Page not landed on correct website");
		}
		
		
	}

}
