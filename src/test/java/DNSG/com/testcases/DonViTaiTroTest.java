package DNSG.com.testcases;

import DNSG.com.common.BaseTest;
import DNSG.com.pages.DonViTaiTroPage;
import DNSG.com.pages.LoginPage;
import DNSG.com.pages.customers.AddDonViTaiTroPage;
import org.testng.annotations.Test;

public class DonViTaiTroTest extends BaseTest {
    LoginPage loginPage;
    DonViTaiTroPage donViTaiTroPage;
    AddDonViTaiTroPage addDonViTaiTroPage;


    @Test(priority = 0)
    public void OpenPageDonViTaiTro(){
        loginPage = new LoginPage();
        addDonViTaiTroPage = new AddDonViTaiTroPage();
        donViTaiTroPage = new DonViTaiTroPage();
        loginPage.LoginThanhCong("admin@meu-solutions.com","123456");
        donViTaiTroPage.verifyDonViTaiTroPageAdmin();
        addDonViTaiTroPage.AddNewDataDonViTaiTro("NhaTrang","https://github.com/QuangDK1");



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
