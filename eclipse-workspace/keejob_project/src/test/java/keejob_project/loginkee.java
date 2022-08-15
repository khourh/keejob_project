package keejob_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginkee {
		public static WebDriver driver;
	
	@Given("^connect to keejob website$")
	public void connect_to_keejob_website() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get("https://www.keejob.com/");
	   
	}

	@When("^I click se connecter$")
	public void i_click_se_connecter() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   driver.findElement(By.name("button")).click();
	   
	}

	@When("^I enter a correct email$")
	public void i_enter_a_correct_email() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  driver.findElement(By.name("username")).sendKeys("brown.c.riahi@gmail.com");
	}

	@When("^I enter my passeword$")
	public void i_enter_my_passeword() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  driver.findElement(By.name("password")).sendKeys("09471640");
	}

	@Then("^I click se connecter1$")
	public void i_click_se_connecter1() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
    driver.findElement(By.xpath("//*[@class = \"btn\"]")).click();
	}
	@Before
	public void sd() {
	System.setProperty("webdriver.chrome.driver","/Users/khoubeibriahi/eclipse-workspace/Twitter_project/src/test/resources/Driver/chromedriver");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	//System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+ "//src//test//resources//Driver//chromedriver.exe");

	}
	@After()
	public void cleanup() {
	}}

