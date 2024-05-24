package DNSG.com.pages.customers;

import DNSG.com.pages.DonViTaiTroPage;
import org.openqa.selenium.By;
import quangtester.com.keywords.WebUI;

public class AddDonViTaiTroPage extends DonViTaiTroPage {
    private String PAGE_URL = "https://saigon-business.erp.meu-solutions.com/admin/partner";
    private String PAGE_TEXT = "Thêm mới Đơn vị tài trợ";
    By Logo = By.xpath("//div[2]/div/div[1]/label");
    By Tendonvi = By.xpath("//div/div[2]/div/input");
    By Linkdonvi = By.xpath("//div/div[3]/div/input");
    By buttonLuuDonvi = By.xpath("//div/div[3]/button[2]");

    public void AddNewDataDonViTaiTro(String Ten_Don_Vi , String Link_Don_Vi){

        WebUI.setText(Tendonvi,Ten_Don_Vi);
        WebUI.setText(Linkdonvi,Link_Don_Vi);
        WebUI.clickElement(buttonLuuDonvi);
        WebUI.sleep(1.5);
    }

}
