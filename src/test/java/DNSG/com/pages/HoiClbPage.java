package DNSG.com.pages;

import org.openqa.selenium.By;
import quangtester.com.keywords.WebUI;

public class HoiClbPage {
    private String URL = "https://saigon-business.erp.meu-solutions.com/admin/partner";
    private String PAGETEXT = "Quản lý Hiệp hội/Hội/CLB";


    //page add HoiCLB
    private String PAGE_URL_HOICLBADMIN = "https://saigon-business.erp.meu-solutions.com/admin/club";
    private String PAGE_TEXT_THEMHOICLB = "Thông tin Hiệp hội/Hội/CLB";



    //Thêm mới Hội Clb
    By clickpagehoiclbadmin = By.xpath("//div/div/div/ul/div[5]/div");
    By buttonthemmoihoiclb = By.xpath("//main/div/div[1]/div/button");
    By logohoiclb = By.xpath("//div[2]/div/div[1]/label");
    By tenhoiclb = By.xpath("//div/div[2]/div/input");
    By emailhoiclb = By.xpath("//div/div[3]/div/input");
    By chieukhau = By.xpath("//div/div[4]/div/input");
    By btnluuhoiclb = By.xpath("//div[3]/div[1]/div[3]/button[2]");
    public void ThemMoiHoiClB(){
        WebUI.clickElement(clickpagehoiclbadmin);
        WebUI.clickElement(buttonthemmoihoiclb);
        WebUI.clickElement(logohoiclb);
        WebUI.uploadFileRobotClass("D:\\Code_Automation\\ProjectAutomation_DNSG\\src\\main\\resources\\datatest\\img2.png");
        WebUI.setText(tenhoiclb ,"QuangPham");
        WebUI.setText(emailhoiclb,"phamquang@gmail.com");
        WebUI.setText(chieukhau,"10%");
        WebUI.clickElement(btnluuhoiclb);
        WebUI.sleep(1.5);
    }

    //Xóa Hội Clb
    By btnXoaHoiClb = By.xpath("//div[3]/div[8]/div/button[2]");
    By popupXoaHoiClb = By.xpath("//div[3]/div/div[2]/button[2]");
    By doituonghoiclb = By.xpath("//div/div[2]/div/div[1]/div[2]/div/div/div[3]");
    public void XoaHoiClb(){
        WebUI.clickElement(clickpagehoiclbadmin);
        WebUI.clickElement(doituonghoiclb);
        WebUI.clickElement(btnXoaHoiClb);
        WebUI.clickElement(popupXoaHoiClb);
        WebUI.sleep(2);
    }

    //Chỉnh Sửa Hội Clb
    By btnEditHoiClb = By.xpath("//div/div[3]/div[8]/div/button[1]");
    By btnLuutrongEditHoi = By.xpath("//div/div[3]/button[2]");
    public void EditHoiClb(){
        WebUI.clickElement(clickpagehoiclbadmin);
        WebUI.clickElement(doituonghoiclb);
        WebUI.clickElement(btnEditHoiClb);
        WebUI.sleep(1.5);
        WebUI.clickElement(btnLuutrongEditHoi);
    }

}
