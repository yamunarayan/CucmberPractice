package steps;

import hooks.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import pages.HomePage;
import pages.LoginPage;
import pages.PageManager;
import utils.ConfigReader;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class RediffLoginSteps {
    WebDriver driver;
    PageManager pageManagerObject;
    LoginPage loginPageObject;
    HomePage homePageObject;
    ConfigReader configReaderObject;
    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() throws IOException {
        configReaderObject = new ConfigReader();
        DriverFactory.getDriver().get(configReaderObject.getUrl());

    }

    @When("Entered the username {string}")
    public void entered_the_username(String userName) {
        System.out.println("Entered user name ");
        pageManagerObject= new PageManager(DriverFactory.getDriver());
        loginPageObject = pageManagerObject.getLoginPageObject();
        loginPageObject.getUsername(userName);

    }
    @When("Entered the password {string}")
    public void entered_the_password(String password) {
        System.out.println("Entered password ");
        loginPageObject.getPassword(password);

    }
    @When("Click on login button")
    public void click_on_login_button() {
        System.out.println("Click on login button");
        loginPageObject.clickButton();
    }

    @Then("Logout from rediff mail")
    public void Logout_from_rediff_mai(){
        homePageObject = pageManagerObject.getHomePageObject();
        homePageObject.clickLogout();
    }
    @Then("Validate user logged in successfully")
    public void validate_user_logged_in_successfully() {
        System.out.println("Validate user logged in successfully");
        loginPageObject.getTitleText();

    }


}
