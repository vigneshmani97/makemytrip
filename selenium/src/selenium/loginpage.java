package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {



	public static WebElement  username(WebDriver driver) {
		return driver.findElement(By.name("username"));

	}
	public  static WebElement  password(WebDriver driver) {
		return driver.findElement(By.name("password"));

	}
	public static WebElement loginbtn(WebDriver driver) {
		return driver.findElement(By.id("loginForm"));

	}


}

