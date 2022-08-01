package lec01_java_basics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D10__use_of_mouse_hover_action {
	WebDriver driver;

	@BeforeTest
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.mountsinai.org/");
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(enabled = true, priority = 1)
	public void mouseHoverActionOnAboutUs() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement aboutUs  = driver.findElement(By.xpath("//a[normalize-space(text())='About Us' and @class='hidden-xs dropdown']"));
		Thread.sleep(3000);
		actions.moveToElement(aboutUs).build().perform(); // this syntax interview question
		Thread.sleep(6000);
		// This below is not a part of the above action
		// It is not must, but better to show
		System.out.println("\nThe text of this web element is: "+ aboutUs.getText());	
	}
	
	// similar, nothing different, extra
	@Test(enabled = true, priority = 2)
	public void mouseHoverActionOnOurLocations() throws InterruptedException {
		Actions actions = new Actions(driver); // very important interview question
		WebElement ourLocations = driver.findElement(By.xpath("//a[normalize-space(text())='Our Locations' and @class='hidden-xs dropdown']"));
		Thread.sleep(2000);
		actions.moveToElement(ourLocations).build().perform();
		Thread.sleep(2000);	
		System.out.println("\nThe text of this web element is: "+ ourLocations.getText());
		
		System.out.println("\n----------------\n");
		List<WebElement> elements = driver.findElements(By.xpath("a"));
	    System.out.println("Number of elements:" +elements.size());
	}
	
	
	@AfterTest
	public void tearUp() {
		driver.quit();
	}

}
