package DNSG.com.testcases;

import DNSG.com.common.BaseTest;
import DNSG.com.pages.DonViTaiTroPage;
import DNSG.com.pages.LoginPage;

import com.google.j2objc.annotations.Weak;
import org.testng.annotations.Test;
import quangtester.com.keywords.WebUI;

public class DonViTaiTroTest extends BaseTest {
    LoginPage loginPage;
    DonViTaiTroPage donViTaiTroPage;




    @Test(priority = 1)
    public void ThemMoiDonViTaiTroThanhCong(){
        loginPage = new LoginPage();
        donViTaiTroPage = new DonViTaiTroPage();
        loginPage.LoginThanhCong("admin@meu-solutions.com","123456");
        donViTaiTroPage.ThemMoiDonViTaiTro("NhaTrang","https://github.com/QuangDK1/ProjectAutomation_DNSG");


    }


    @Test(priority = 2)
    public void XoaDonViTaiTro(){
        loginPage = new LoginPage();
        donViTaiTroPage = new DonViTaiTroPage();
        loginPage.LoginThanhCong("admin@meu-solutions.com","123456");
        donViTaiTroPage.XoaDonViTaiTro();


    }

    @Test(priority = 3)
    public void ChinhSuaDonViTaiTroThanhCong(){
        loginPage = new LoginPage();
        donViTaiTroPage = new DonViTaiTroPage();
        loginPage.LoginThanhCong("admin@meu-solutions.com","123456");
        donViTaiTroPage.EditDonViTaiTro();


    }
}
