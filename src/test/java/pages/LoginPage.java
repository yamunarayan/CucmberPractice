package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LoginPage {

    public WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    @FindBy (id="login1")
    private WebElement userNameR;

    @FindBy(id="password")
    private WebElement passwordR;
    @FindBy(name="proceed")
    private WebElement signinButton;
    public void  getUsername(String userName){
        userNameR.sendKeys(userName);

    }
    public void getPassword(String password){

       passwordR.sendKeys(password);
    }

    public void clickButton(){
       signinButton.click();

    }

    public void getTitleText(){
        String text=driver.getTitle();


    }
}
