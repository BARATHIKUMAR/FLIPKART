package org.framess.test.login;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Framess {
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver",
				"C:\\Users\\Barat\\eclipse-workspace\\SeleniumFramess\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://chercher.tech/practice/frames");

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.manage().window().maximize();

		WebElement frame1 = driver.findElement(By.name("iamframe"));

		driver.switchTo().frame(frame1);

		WebElement topicc = driver.findElement(By.xpath("//b[@id='topic']//following::input"));

		topicc.sendKeys("shivabarathikumar");

		driver.switchTo().defaultContent();
		 
		driver.switchTo().frame("frame2");

		WebElement dropbox = driver.findElement(By.id("animals"));

		Select s = new Select(dropbox);
		s.selectByIndex(3);

		driver.switchTo().defaultContent();

		driver.switchTo().frame(0);

		driver.switchTo().frame(0);

		WebElement smallbtn = driver.findElement(By.xpath("//input[@id='a']"));
		smallbtn.click();

		driver.switchTo().parentFrame();

		topicc.sendKeys("55");

	}

}
