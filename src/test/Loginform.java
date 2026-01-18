package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDrive;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.chromeDrive;





public class Loginform {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver d= new ChoromeDriver();
		d.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement username = d.findElement(By.xpath("//input[@placeholder='Email address or phone number']"));
		username.sendkeys("patilsaloni0610@gmail.com");
		Thread.sleep(2000);
		
		WebElement password = d.findElement(By.xpath("//input[@name='pass']"));
		password.sendkeys("123456");
		Thread.sleep(2000);
		
		
		WebElement Login = d.findElement(By.xpath("//button[@name='Login']"));
		Login.click();
		Thread.sleep(2000);
		
		
		
		
	}

}
