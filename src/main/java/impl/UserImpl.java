package impl;

import pages.LoginPage;
import pages.UserPage;
import utils.ConfigReader;
import utils.WebDriverUtils;

public class UserImpl {
    UserPage page;
    LoginPage loginPage;

    public UserPage getPage() {
        if (page == null)
            page = new UserPage();
        return page;
    }

    public LoginPage getLoginPage(){
        if(loginPage == null)
            loginPage = new LoginPage();
        return loginPage;
    }


    public void navigateToLoginPage() {
        WebDriverUtils.getDriver().get(ConfigReader.readProperty("url"));
    }
}
