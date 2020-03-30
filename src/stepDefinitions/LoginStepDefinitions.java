package stepDefinitions;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDefinitions {	
	  public static WebDriver driver;
	   
	   @Given("^User opens chrome browser and lauch application$")
	   public void user_opens_chrome_browser_and_lauch_application() throws Throwable {
		   System.setProperty("webdriver.chrome.driver","/Users/shilpa/Documents/automation/chromedriver");
		   driver= new ChromeDriver(); 
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}

		@Then("^user should navigate to login page$")
		public void user_should_navigate_to_login_page() throws Throwable {
			driver.get("https://greenflag-qa-experience.dev.mycro.app");
		    String currentURL = driver.getCurrentUrl();
		    System.out.println(currentURL);
		}
		/**
		 * Wrong username & password test
		 * @throws Throwable
		 */
		@When("^I enter username as \"([^\"]*)\"$")
		public void i_enter_username_as(String arg1) throws Throwable {
			driver.findElement(By.name("loginUsername")).clear();
			driver.findElement(By.name("loginUsername")).sendKeys(arg1);
		}
		@When("^I enter password as \"([^\"]*)\"$")
		public void i_enter_password_as(String arg1) throws Throwable {
			driver.findElement(By.name("loginPassword")).clear();
			driver.findElement(By.name("loginPassword")).sendKeys(arg1);
		}
		@Then("^Login should fail$")
		public void login_should_fail() throws Throwable {
			driver.findElement(By.className("form-field__error"));
		}
		 
		/**
		 * Successful test
		 * @throws Throwable
		 */
		@When("^user enter username as \"(.*?)\"$")
		public void enter_username_as(String arg1) throws Throwable {
			driver.findElement(By.name("loginUsername")).clear();
		    driver.findElement(By.name("loginUsername")).sendKeys(arg1);
		}

		@When("^enter password as \"(.*?)\"$")
		public void enter_password_as(String arg1) throws Throwable {
			driver.findElement(By.name("loginPassword")).clear();
		    driver.findElement(By.name("loginPassword")).sendKeys(arg1);
		}

		@When("^click on Login button$")
		public void click_on_Login_button() throws Throwable {
			driver.findElement(By.xpath("/html/body/app-root/div/app-login/form/button")).click();
		}

		@Then("^\"(.*?)\" message displayed to user$")
		public void message_displayed_to_user(String arg1) throws Throwable {
			assertEquals("Successfully logged in!",driver.findElement(By.xpath("/html/body/app-root/div/app-logged-in/div")).getText());
		}
		
}