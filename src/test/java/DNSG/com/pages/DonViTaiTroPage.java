package DNSG.com.pages;

import DNSG.com.pages.customers.AddDonViTaiTroPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import quangtester.com.keywords.WebUI;

public class DonViTaiTroPage {
    private String URL = "https://saigon-business.erp.meu-solutions.com/admin/partner";
    private String PAGE_TEST = "Đơn vị tài trợ";
    By headerPageDonViTaiTroAdmin = By.xpath("//h1[contains(text(),'Đơn vị tài trợ')]");
    By buttonAddDonViTaiTro = By.xpath("//div/div/div[1]/div/button");
    By buttonXoaDonViTaiTro = By.xpath("//div/div/div[1]/div[5]/div/button[2]");
    By buttonEditDonViTaiTro = By.xpath("//div/div/div[1]/div[5]/div/button[1]");



    public void verifyDonViTaiTroPageAdmin(){
        boolean donvitaitro = WebUI.getCurrentUrl().equals("https://saigon-business.erp.meu-solutions.com/admin/partner");
        Assert.assertTrue(donvitaitro,"Fail");
    }

    public AddDonViTaiTroPage clickNewThemDonViTaiTro(){
        WebUI.clickElement(buttonAddDonViTaiTro);
        return new AddDonViTaiTroPage();
    }





//    public void ThemMoiDonViTaiTro (){
//
//        WebUI.clickElement(buttonAddDonViTaiTro);
//    }

//    public void ChinhSuaDonViTaiTro(){
//
//    }
//
//    public void XoaDonViTaiTro(){
//
//    }
//
//
//    public void verifyThaoTacThemDonViTaiTroThanhCong(){
//
//    }
//
//
//    public void verifyThaoChinhSuaDonViTaiTroThanhCong(){
//
//    }
//    public void verifyXoaDonViTaiTro(){
//
//    }
}
