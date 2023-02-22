package StepDefinitions;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSearchSteps {
	WebDriver driver = null;

	
	@Given("browser is open")
	public void browser_is_open() {
		
		System.out.println("Inside Step- browser is open");
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\mouni\\eclipse-workspace\\cucumberjava\\src\\test\\resources\\drivers\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@And("user is on google search")
	public void user_is_on_google_search() {
		
		System.out.println("Inside Step- user is on google search");
		driver.navigate().to("https://www.google.com/");
		
	
	}

	@When("user enters a text in search box")
	public void user_enters_a_text_in_search_box() throws InterruptedException {
		
		System.out.println("Inside Step-user enters a text in search box");
		driver.findElement(By.name("q")).sendKeys("maven repository");
		Thread.sleep(2000);
		
	}

	@And("hits enter")
	public void hits_enter() throws InterruptedException {
		
		System.out.println("Inside Step-hits enter");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
    
	}

	@Then("user is navigated to search results")
	public void user_is_navigated_to_search_results() {
		
		System.out.println("Inside Step-user is navigated to search results");
		driver.findElement(By.xpath("//*[@id=\"rso\"]/div[1]/div/div/div/div/div/div/div/div[1]/a/h3")).click();
		driver.close();
		driver.quit();
	}



}
