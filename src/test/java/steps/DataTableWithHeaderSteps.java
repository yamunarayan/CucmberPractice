package steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;
import java.util.Map;

public class DataTableWithHeaderSteps {
    public WebDriver driver;
    @Given("The user is in login page")
    public void the_user_is_in_login_page() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @When("enter the below credentials")
    public void enter_the_below_credentials(io.cucumber.datatable.DataTable dataTable) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));

        List<Map<String, String>> credentialsLogin = dataTable.asMaps(String.class, String.class);
        String username = credentialsLogin.get(0).get("Username");
        String password = credentialsLogin.get(0).get("Password");
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
    }
    @When("Clicks login button of the login page")
    public void clicks_login_button_of_the_login_page() {
        driver.findElement(
                        By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"))
                .click();
    }
    @Then("We should be navigate to home page screen")
    public void we_should_be_navigate_to_home_page_screen() {
        boolean status= driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
        Assert.assertTrue(status);
    }

}
