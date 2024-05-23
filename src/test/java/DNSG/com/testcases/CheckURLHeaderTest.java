package DNSG.com.testcases;

import DNSG.com.common.BaseTest;
import DNSG.com.pages.CheckURLHeader;
import DNSG.com.pages.LoginPage;
import org.testng.annotations.Test;

public class CheckURLHeaderTest extends BaseTest {
    LoginPage loginPage;
    CheckURLHeader checkURLHeader;

    @Test
    public void verifyGioiThieuPage(){
        loginPage = new LoginPage();
         //checkURLHeader = loginPage.LoginThanhCong("alt.zm-eoze7jtz@yopmail.com", "qua/ng2001");
        //loginPage.LoginThanhCong("alt.zm-eoze7jtz@yopmail.com","quang2001");
        checkURLHeader.checkURLGioiThieu();

    }

//    @Test
//    public void verify9thmonthlyb2bPage(){
//
//    }
//    @Test
//    public void verifyGiaoThuongB2B(){
//
//    }
//    @Test
//    public void verifyHiepHoiHoiClb(){
//
//    }
//    @Test
//    public void verifySuKienDoiTac(){
//
//    }
//    @Test
//    public void verifyLienHe(){
//
//    }


}
