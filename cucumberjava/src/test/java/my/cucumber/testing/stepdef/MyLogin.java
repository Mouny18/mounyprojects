package my.cucumber.testing.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyLogin {
	static WebDriver mydriver;
	public static String url = "https://www.amazon.com";

	public static WebDriver Driver() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\mouni\\eclipse-workspace\\cucumberjava\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		return driver;
	}

	
	@Given("^user is on login page$")
	public static void user_is_on_login_page() throws Throwable {
		mydriver = Driver();
		mydriver.get(url);
		mydriver.manage().window().maximize();
		mydriver.findElement(By.id("twotabsearchtextbox")).sendKeys("mobiles");
		mydriver.findElement(By.id("twotabsearchtextbox")).submit();
		
		mydriver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[1]/h2/a")).click();
        Select Quantity = new Select(mydriver.findElement(By.id("quantity"))); 
        Quantity.selectByIndex(1);
        mydriver.findElement(By.id("buy-now-button")).click();
        mydriver.findElement(By.id("ap_email")).sendKeys("00000000000");
		mydriver.findElement(By.id("continue")).click();
       mydriver.findElement(By.id("auth-error-message-box")).isDisplayed();
       
	
	}
	
	
	
	@When("^user enters invalid username and password $")
	
	public void user_enters_username_and_password() throws Throwable {
		throw new PendingException();
		
	        		
		
	}

	@Then("^user is navigated to home page$")
	public void user_is_navigated_to_home_page() throws Throwable {
		throw new PendingException();
	}

	@And("^clicks on login page$")
	public void clicks_on_login_page() throws Throwable {
		throw new PendingException();
	}

	public static void main(String[] args) throws Throwable {
		user_is_on_login_page();
	}
	
}
