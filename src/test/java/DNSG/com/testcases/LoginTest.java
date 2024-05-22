package DNSG.com.testcases;

import DNSG.com.common.BaseTest;
import DNSG.com.pages.LoginPage;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    LoginPage loginPage;

    @Test (priority = 2)
    public void loginTestDNSGSuccess(){
        loginPage = new LoginPage();
        loginPage.LoginThanhCong("alt.zm-eoze7jtz@yopmail.com","quang2001");
        loginPage.verifyLoginThanhCong();
    }

    @Test (priority = 1)
    public void loginTestDNSGThatBai(){
        loginPage = new LoginPage();
        loginPage.LoginThanhCong("alt.zm-eoze7jtz@yopmail.com" , "123456");
        loginPage.verifyLoginThatBai();
    }
}
