package DNSG.com.testcases;

import DNSG.com.common.BaseTest;
import DNSG.com.pages.CheckURLHeader;
import DNSG.com.pages.LoginPage;
import org.testng.annotations.Test;

public class CheckURLHeaderTest extends BaseTest {
    LoginPage loginPage;
    CheckURLHeader checkURLHeader;

    @Test (priority = 1)
    public void verifyGioiThieuPage(){
        loginPage = new LoginPage();
        checkURLHeader = new CheckURLHeader();
        loginPage.LoginThanhCong("alt.zm-eoze7jtz@yopmail.com","quang2001");
        checkURLHeader.checkURLGioiThieu();

    }

    @Test(priority = 2)
    public void verify9thmonthlyb2bPage(){
        loginPage = new LoginPage();
        checkURLHeader = new CheckURLHeader();
        loginPage.LoginThanhCong("alt.zm-eoze7jtz@yopmail.com","quang2001");
        checkURLHeader.checkURL9thmonthlyb2b();
    }
    @Test (priority = 3)
    public void verifyGiaoThuongB2B(){
        loginPage = new LoginPage();
        checkURLHeader = new CheckURLHeader();
        loginPage.LoginThanhCong("alt.zm-eoze7jtz@yopmail.com","quang2001");
        checkURLHeader.checkURLGiaoThuongB2B();
    }
    @Test (priority = 4)
    public void verifyHiepHoiHoiClb(){
        loginPage = new LoginPage();
        checkURLHeader = new CheckURLHeader();
        loginPage.LoginThanhCong("alt.zm-eoze7jtz@yopmail.com","quang2001");
        checkURLHeader.checkURLHiepHoiHoiClb();
    }
    @Test (priority = 5)
    public void verifySuKienDoiTac(){
        loginPage = new LoginPage();
        checkURLHeader = new CheckURLHeader();
        loginPage.LoginThanhCong("alt.zm-eoze7jtz@yopmail.com","quang2001");
        checkURLHeader.checkURLSuKienDoiTac();
    }
    @Test (priority = 6)
    public void verifyLienHe(){
        loginPage = new LoginPage();
        checkURLHeader = new CheckURLHeader();
        loginPage.LoginThanhCong("alt.zm-eoze7jtz@yopmail.com","quang2001");
        checkURLHeader.checkURLLienHe();
    }


}
