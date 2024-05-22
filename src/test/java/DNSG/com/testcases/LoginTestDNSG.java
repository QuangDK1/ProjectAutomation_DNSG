package DNSG.com.testcases;

import DNSG.com.common.BaseTest;
import DNSG.com.pages.LoginPageDNSG;
import org.testng.annotations.Test;
import quangtester.com.drivers.DriverManager;

public class LoginTestDNSG extends BaseTest {
    LoginPageDNSG loginPage;

    @Test
    public void loginTestDNSGSuccess(){

        loginPage = new LoginPageDNSG(DriverManager.getDriver());
        loginPage.login("alt.zm-eoze7jtz@yopmail.com","quang2001");
    }

//    @Test
//    public void loginTestInvalidEmail(){
//        loginPage = new LoginPageDNSG(DriverManager.getDriver());
//        loginPage.loginEmailKhongHopLe("alt.zm-eoze7jtz@yopmail.com123", "quang2001");
//    }
}
