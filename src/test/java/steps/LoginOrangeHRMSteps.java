package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginOrangeHRMSteps {
    public WebDriver driver;
    @Given("The user is in the login page")
    public void The_user_is_in_the_login_page(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

    }

    @When("The user enters the valid username and password")
    public void the_user_enters_the_valid_username_and_password() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");


    }
    @When("Clicks on the login button")
    public void clicks_on_the_login_button() {
        driver.findElement(
                By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"))
                .click();


    }
    @Then("User should be navigate to the home page")
    public void user_should_be_navigate_to_the_home_page() {
        boolean status= driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
        if(status){
            System.out.print("Image is displayed");
        }
        else
            System.out.print("Image not displayed");

    }


}
