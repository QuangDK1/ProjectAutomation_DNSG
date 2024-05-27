package DNSG.com.pages;

import org.openqa.selenium.By;
import quangtester.com.keywords.WebUI;

public class DonViTaiTroPage {
    private String URL = "https://saigon-business.erp.meu-solutions.com/admin/partner";
    private String PAGE_TEST = "Đơn vị tài trợ";
    By headerPageDonViTaiTroAdmin = By.xpath("//h1[contains(text(),'Đơn vị tài trợ')]");
    By clickpagedonvitaitroadmin = By.xpath("//div/div/ul/div[4]/div");
    By buttonAddDonViTaiTro = By.xpath("//div/div/div[1]/div/button");
    By buttonXoaDonViTaiTro = By.xpath("//div/div/div[1]/div[5]/div/button[2]");
    By buttonEditDonViTaiTro = By.xpath("//div/div[3]/div[5]/div/button[1]");
    By Logo = By.xpath("//div[2]/div/div[1]/label");
    By Tendonvi = By.xpath("//div/div[2]/div/input");
    By Linkdonvi = By.xpath("//div/div[3]/div/input");
    By buttonLuuDonvi = By.xpath("//div/div[3]/button[2]");
    By doituong = By.xpath("//div[2]/div/div[1]/div[2]/div/div/div[3]");
    By popupXoa = By.xpath("//div/div[2]/button[2]");
    By buttonLuuEdit = By.xpath("//div[3]/div[3]/div/div[3]/button[2]");

    //page add mới đơn vị
    private String PAGE_URL_DVTTADMIN = "https://saigon-business.erp.meu-solutions.com/admin/partner";
    private String PAGE_TEXT_THEMDVTT = "Thêm mới Đơn vị tài trợ";



    public void ThemMoiDonViTaiTro(String Ten_Don_Vi , String Link_Don_Vi){
        WebUI.clickElement(clickpagedonvitaitroadmin);
        WebUI.clickElement(buttonAddDonViTaiTro);
        WebUI.setText(Tendonvi,Ten_Don_Vi);
        WebUI.setText(Linkdonvi,Link_Don_Vi);
        WebUI.clickElement(buttonLuuDonvi);
        WebUI.sleep(1.5);
    }


    public void XoaDonViTaiTro(){
        WebUI.clickElement(clickpagedonvitaitroadmin);
        WebUI.clickElement(doituong);
        WebUI.clickElement(buttonXoaDonViTaiTro);
        WebUI.clickElement(popupXoa);
        WebUI.sleep(2);

    }
    public void EditDonViTaiTro(){
        WebUI.clickElement(clickpagedonvitaitroadmin);
        WebUI.clickElement(doituong);
        WebUI.clickElement(buttonEditDonViTaiTro);
        //
        WebUI.clickElement(buttonLuuEdit);
        WebUI.sleep(2);


    }
}
