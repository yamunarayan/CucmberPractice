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

public class DataTableWithoutHeaderSteps {
    public WebDriver driver;

    @Given("The user  the login page")
    public void the_user_the_login_page() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }
    @When("you enter the below credentials")
    public void you_enter_the_below_credentials(DataTable dataTable) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        List<String> credentials = dataTable.asList(String.class);
        String userName = credentials.get(0);
        String password = credentials.get(1);
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys(userName);
        driver.findElement(By.name("password")).sendKeys(password);

    }
    @When("Clicks login button")
    public void clicks_login_button() {
        driver.findElement(
                        By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"))
                .click();


    }
    @Then("We should be navigate to home page")
    public void we_should_be_navigate_to_home_page() {
        boolean status= driver.findElement(By.xpath("//img[@alt='client brand banner']")).isDisplayed();
        Assert.assertTrue(status);
    }
}
