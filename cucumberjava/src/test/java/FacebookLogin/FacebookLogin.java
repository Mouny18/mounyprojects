package FacebookLogin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FacebookLogin {

	WebDriver driver = null;
	public static String driverpath = "C:\\Users\\mouni\\eclipse-workspace\\cucumberjava\\src\\test\\resources\\drivers\\chromedriver.exe";

	@Given("browser is launched")

	public void browser_is_launched() {

		System.out.println("Inside Step-browser is open");
		String projectPath = System.getProperty("user.dir");
		System.out.println("projectPath is: " + projectPath);
		System.setProperty("Webdriver.chrome.driver", driverpath);

		driver = new ChromeDriver();

		driver.manage().window().maximize();

	}

	@And("user is on facebook login page")

	public void user_is_on_facebook_login_page() {
		driver.navigate().to("https://www.facebook.com/");

	}

	@When("user enters username and password")

	public void user_enters_username_and_password() {

		driver.findElement(By.id("email")).sendKeys("XXXXXX.XXXXX@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("XXXXXXXXXX");

	}

	@And("user clicks on login button")

	public void user_clicks_on_login_button() {

		driver.findElement(By.name("login")).click();
	}

	@Then("user is navigated to facebook home page")

	public void user_is_navigated_to_facebook_home_page() {
		driver.navigate().to("https://www.facebook.com/");

	}

	@And("user navigates to facebook home page")

	public void user_navigates_to_facebook_home_page() {
		driver.navigate().to("https://www.facebook.com/mounika.reddy.142035");
		driver.findElement(By.xpath(
				"//*[@id=\"mount_0_0_Xd\"]/div/div[1]/div/div[2]/div[2]/div[1]/div/div/div[3]/div/div[2]/div/div[1]/div/div/label/input"))
				.sendKeys("brayan road elementry school");

		driver.close();
		driver.quit();
	}

}
