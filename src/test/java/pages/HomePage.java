package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public WebDriver driver;

    public HomePage(WebDriver driver){

        this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(className = "rd_logout")
    private WebElement logoutButton;
    public void clickLogout(){

        logoutButton.click();
    }


}
