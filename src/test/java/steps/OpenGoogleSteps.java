package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogleSteps {
        public WebDriver driver;

    @Given("BackgroundstepOne")
    public void backgroundstep_one() {
      System.out.println("backgroundstep_one");
    }
    @Given("Backgroundstep2")
    public void backgroundstep2() {
        System.out.println("backgroundstep2");
    }

    @Given("user entering google.co.in")
    public void user_entering_google_co_in() {
        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        driver.get("http://google.com/");
    }
    @When("user is typing the search term {string}")
    public void user_is_typing_the_search_term(String searchTerm) {
        driver.findElement(By.name("q")).sendKeys(searchTerm);

    }
    @When("Enters the return key")
    public void enters_the_return_key() {
        driver.findElement(By.name("q")).sendKeys(Keys.ENTER);

    }
    @Then("User should see the search results")
    public void user_should_see_the_search_results() {
       boolean status= driver.findElement(By.partialLinkText("test")).isDisplayed();
       if(status){
           System.out.println("Result is displayed");
       }else
           System.out.println("Result not displayed");

    }

}
