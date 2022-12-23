package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CucumberHooks {
    public WebDriver driver;
    public DriverFactory driverFactory;

    //@Before(order = 0)
    public void firstHook() {
        System.out.println("Testing1st hook");
    }

    //@Before(order = 1)
    public void setup() {
        System.out.println("This is will be called before to every method");
        driverFactory = new DriverFactory();
        driverFactory.initialiseDriver();

    }

    //@After(order = 1)
    public void tearDown() {
        DriverFactory.getDriver().quit();
    }

    //@After(order = 0)
    public void lastHook() {
        System.out.println("Testing1st hook");

    }
}