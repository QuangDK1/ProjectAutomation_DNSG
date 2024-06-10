package DNSG.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import quangtester.com.helpers.SystemsHelper;
import quangtester.com.keywords.WebUI;

public class DonViTaiTroPage {
    private String URL = "https://saigon-business.erp.meu-solutions.com/admin/partner";
    private String PAGE_TEST = "Đơn vị tài trợ";


    //page add mới đơn vị
    private String PAGE_URL_DVTTADMIN = "https://saigon-business.erp.meu-solutions.com/admin/partner";
    private String PAGE_TEXT_THEMDVTT = "Thêm mới Đơn vị tài trợ";

    //Thêm mới đơn vị
    By headerPageDonViTaiTroAdmin = By.xpath("//h1[contains(text(),'Đơn vị tài trợ')]");
    By clickpagedonvitaitroadmin = By.xpath("//div/div/ul/div[4]/div");
    By buttonAddDonViTaiTro = By.xpath("//div/div/div[1]/div/button");
    By Logo = By.xpath("//div[2]/div/div[1]/label");
    By Tendonvi = By.xpath("//div/div[2]/div/input");
    By Linkdonvi = By.xpath("//div/div[3]/div/input");
    By buttonLuuDonvi = By.xpath("//div[3]/div[1]/div[3]/button[2]");
    By doituong = By.xpath("//div[2]/div/div[1]/div[2]/div/div/div[3]");
    public void ThemMoiDonViTaiTro(String Ten_Don_Vi , String Link_Don_Vi ){
        WebUI.clickElement(clickpagedonvitaitroadmin);
        WebUI.clickElement(buttonAddDonViTaiTro);
        WebUI.clickElement(Logo);
        WebUI.uploadFileRobotClass("D:\\Code_Automation\\ProjectAutomation_DNSG\\src\\main\\resources\\datatest\\img1.jpg");
        WebUI.setText(Tendonvi,Ten_Don_Vi);
        WebUI.setText(Linkdonvi,Link_Don_Vi);
        WebUI.clickElement(buttonLuuDonvi);
        WebUI.sleep(1.5);
    }
    By MessageThemDVTTThanhCong = By.xpath("//body/div[@id='app']/div[1]/div[1]");
    public void verifyThemMoiDonViTaiTroThanhCong(String messageThemDVTTthanhcong){
        boolean MessageThemDonViTaiTroThanhCong = WebUI.getTextElement(MessageThemDVTTThanhCong).equals(messageThemDVTTthanhcong);
        Assert.assertTrue(MessageThemDonViTaiTroThanhCong,"Fail");
    }


    //Xóa Đơn vị
    By buttonXoaDonViTaiTro = By.xpath("//div/div/div[1]/div[5]/div/button[2]");
    By popupXoa = By.xpath("//div/div[2]/button[2]");
    public void XoaDonViTaiTro(){
        WebUI.clickElement(clickpagedonvitaitroadmin);
        WebUI.clickElement(doituong);
        WebUI.clickElement(buttonXoaDonViTaiTro);
        WebUI.clickElement(popupXoa);
        WebUI.sleep(2);
    }
    By messageXoaDonViThanhCong = By.xpath("//div[contains(text(),'Thao tác thành công')]");
    public void verifyXoaDonViThanhCong(){
        boolean MessageXoaDonViThanhCong = WebUI.getTextElement(messageXoaDonViThanhCong).equals("Thao tác thành công");
        Assert.assertTrue(MessageXoaDonViThanhCong,"Fail");
    }





    //Chỉnh sửa ơn vị
    By buttonEditDonViTaiTro = By.xpath("//div/div[3]/div[5]/div/button[1]");
    By buttonLuuEdit = By.xpath("//div[3]/div[3]/div/div[3]/button[2]");
    public void EditDonViTaiTro(){
        WebUI.clickElement(clickpagedonvitaitroadmin);
        WebUI.clickElement(doituong);
        WebUI.clickElement(buttonEditDonViTaiTro);
        WebUI.clickElement(buttonLuuEdit);
        WebUI.sleep(2);
    }
    By messageChinhSuDonViThanhCong = By.xpath("//div[contains(text(),'Thao tác thành công')]");
    public void verifyChinhSuDonViThanhCong(){
        boolean MessageChinhSuaDonVIThanhCong = WebUI.getTextElement(messageChinhSuDonViThanhCong).equals("Thao tác thành công");
        Assert.assertTrue(MessageChinhSuaDonVIThanhCong,"Fail");
    }

}
