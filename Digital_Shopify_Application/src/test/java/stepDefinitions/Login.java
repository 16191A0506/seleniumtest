package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Login {
    private WebDriver driver;
    @Given("I am on homepage")
    public  void i_am_on_homepage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver",".\\src\\test\\resources\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://dataportal.uksouth.cloudapp.azure.com:3000/cts-shop/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\'root\']/div/header/div/button[1]")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\'login\']")).click();

    }
    @When("I click on login")
    public  void i_click_on_login() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElement(By.id("email")).sendKeys("kirandeepmungara@gmail.com");
        driver.findElement(By.id("password")).sendKeys("1234567890");
        driver.findElement(By.id("buttonlogin")).click();
    }
    @Then("I should be logged in")
    public  void i_should_be_logged_in(){
        Assert.assertEquals(driver.getTitle(), "React App");
        driver.quit();
    }
}

