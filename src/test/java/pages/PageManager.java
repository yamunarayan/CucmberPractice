package pages;

import org.openqa.selenium.WebDriver;

public class PageManager {
    HomePage homePageObject;
    LoginPage loginPageObject;

    public WebDriver driver;
    public PageManager(WebDriver driver){
        this.driver= driver;
    }

    public LoginPage getLoginPageObject(){
        return (loginPageObject==null)? loginPageObject=new LoginPage(this.driver) : loginPageObject;
    }

    public HomePage getHomePageObject(){
        return (homePageObject==null)? homePageObject=new HomePage(this.driver) : homePageObject;
    }

}
