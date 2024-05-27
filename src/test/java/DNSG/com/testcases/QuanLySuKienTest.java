package DNSG.com.testcases;

import DNSG.com.common.BaseTest;
import DNSG.com.pages.LoginPage;
import DNSG.com.pages.QuanLySuKienPage;
import org.testng.annotations.Test;

public class QuanLySuKienTest extends BaseTest {
    LoginPage loginPage;
    QuanLySuKienPage quanLySuKienPage;


    @Test(priority = 1)
    public void ThemMoiSuKienB2BThanhCong(){
        loginPage = new LoginPage();
        quanLySuKienPage = new QuanLySuKienPage();
        loginPage.LoginThanhCong("admin@meu-solutions.com","123456");
        quanLySuKienPage.ThemMoiSuKien();
    }

    @Test(priority = 2)
    public void XoaSuKienB2B(){
        loginPage = new LoginPage();
        quanLySuKienPage = new QuanLySuKienPage();
        loginPage.LoginThanhCong("admin@meu-solutions.com","123456");
        quanLySuKienPage.XoaSuKien();
    }

    @Test(priority = 3)
    public void ChinhSuaSuKienB2BThanhCong(){

    }

}
