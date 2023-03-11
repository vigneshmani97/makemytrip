package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpage {



	public static WebElement  username(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='username']"));
	}
	public  static WebElement  password(WebDriver driver) {
		return driver.findElement(By.xpath("//input[@name='password']"));
	}
	public static WebElement loginbtn(WebDriver driver) {
		return driver.findElement(By.id("loginForm"));
	}
	
	public static WebElement frgtpswd(WebDriver driver) {
		return driver.findElement(By.xpath("//a[normalize-space()='Forgot password?']"));
	}
	public static WebElement creatnwac(WebDriver driver) {
		return driver.findElement(By.xpath("//a[normalize-space()='Create new account']"));
	}
	public static WebElement usrnm(WebDriver driver) {
		return driver.findElement(By.name("emailOrPhone"));
	}
	public static WebElement fulnam(WebDriver driver) {
		return driver.findElement(By.name("fullName"));
	}
	public static WebElement uname(WebDriver driver){
		return driver.findElement(By.name("username"));
	}
	public static WebElement pswd(WebDriver driver) {
		return driver.findElement(By.name("password"));
	}
	public static WebElement sinup(WebDriver driver) {
		return driver.findElement(By.xpath("//div[1]//div[1]//div[2]//form[1]//div[7]//div[1]"));
		
	}
}

