package co.trucom.seleniumproject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class Main {

	public static void main(String [] args) {
		Random rand = new Random();

		//setting the driver executable
		System.setProperty("webdriver.chrome.driver", "Driver\\chromedriver.exe");

		//Initiating your chromedriver
		WebDriver driver = new ChromeDriver();

		//Applied wait time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		//maximize window
		driver.manage().window().maximize();

		//open browser with desired URL
		driver.get("https://www.sapo.pt");
		System.out.println("Title: " + driver.getTitle());
		System.out.println("Source: " + driver.getPageSource());

		//Stay in this window for some seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(rand.nextInt(5)));

		//closing the browser
		driver.close();
	}
	
}
