package DNSG.com.testcases;

import DNSG.com.common.BaseTest;
import DNSG.com.pages.DonViTaiTroPage;
import DNSG.com.pages.LoginPage;
import org.testng.annotations.Test;

public class DonViTaiTroTest extends BaseTest {
    LoginPage loginPage;
    DonViTaiTroPage donViTaiTroPage;

    @Test(priority = 0)
    public void OpenPageDonViTaiTro(){
        loginPage = new LoginPage();
        donViTaiTroPage = new DonViTaiTroPage();
        loginPage.LoginThanhCong("","");
        donViTaiTroPage.ThemMoiDonViTaiTro();

    }
    @Test(priority = 1)
    public void ThemMoiDonViTaiTroThanhCong(){

    }


    @Test(priority = 2)
    public void XoaDonViTaiTro(){

    }

    @Test(priority = 3)
    public void ChinhSuaDonViTaiTroThanhCong(){

    }
}
