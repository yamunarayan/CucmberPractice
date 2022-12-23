package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginWithDataSteps {
    public WebDriver driver;

    @Given("The user in the login page")
    public void the_user_in_the_login_page() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }
    @When("The user enters the valid {string} and {string}")
    public void the_user_enters_the_valid_and(String string, String string2) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(string);
        driver.findElement(By.name("password")).sendKeys(string2);


    }
    @When("Clicks on login button")
    public void clicks_on_login_button() {
        driver.findElement(
                        By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"))
                .click();

    }
    @Then("User should be navigate to home page")
    public void user_should_be_navigate_to_home_page() {
        boolean status= driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
        Assert.assertTrue(status);

    }

}
