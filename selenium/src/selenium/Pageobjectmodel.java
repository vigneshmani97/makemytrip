package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pageobjectmodel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver110.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.instagram.com/");
		driver.manage().window().maximize();

		//loginpage loginpage= new loginpage();
		loginpage.username(driver).sendKeys("vignesh");
		loginpage.password(driver).sendKeys("vignesh");
		loginpage.loginbtn(driver).click();

		/*WebElement username=driver.findElement(By.name("username"));
		username.sendKeys("vigneshm");

		WebElement password=driver.findElement(By.name("password"));
		password.sendKeys("vigenesh");

		WebElement loginbtn=driver.findElement(By.id("loginForm"));
		loginbtn.click();

		driver.quit();*/




	}

}
