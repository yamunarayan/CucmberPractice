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

public class DataTableWithExampleSteps {
    public WebDriver driver;
    @Given("The user is in login page screen")
    public void the_user_is_in_login_page_screen() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @When("enter the credentials {string} and {string}")
    public void enter_the_credentials_and(String userName, String password) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(password);

    }
    @When("Clicks login button of the login pagescreen")
    public void clicks_login_button_of_the_login_pagescreen() {
        driver.findElement(
                        By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"))
                .click();
    }
    @Then("We should be navigate to home pagescreen")
    public void we_should_be_navigate_to_home_pagescreen() {
        boolean status= driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
        Assert.assertTrue(status);
    }

}
