package DNSG.com.testcases;

import DNSG.com.common.BaseTest;
import DNSG.com.pages.LoginPage;
import DNSG.com.pages.QuanLySuKienPage;
import org.testng.annotations.Test;
import quangtester.com.keywords.WebUI;

public class QuanLySuKienTest extends BaseTest {
    LoginPage loginPage;
    QuanLySuKienPage quanLySuKienPage;

    @Test
    public void KiemTraGiaTriTongTable(){
        loginPage = new LoginPage();
        quanLySuKienPage = new QuanLySuKienPage();
        loginPage.LoginThanhCong("admin@meu-solutions.com","123456");
        quanLySuKienPage.GotoQuanLiSuKienPage();
        WebUI.sleep(5);
        quanLySuKienPage.checkSearchTableByColumn("Nguyễn Tấn Tài");

    }


    @Test(priority = 1)
    public void ThemMoiSuKienB2BThanhCong(){
        loginPage = new LoginPage();
        quanLySuKienPage = new QuanLySuKienPage();
        loginPage.LoginThanhCong("admin@meu-solutions.com","123456");
        quanLySuKienPage.ThemMoiSuKien(
                "Su Kien B2B",
                "Nha Trang",
                "Thành phố biển Nha Trang",
                "Thành phố biển Nha Trang");
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
