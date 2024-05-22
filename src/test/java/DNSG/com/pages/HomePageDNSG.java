package DNSG.com.pages;

import org.openqa.selenium.By;
import org.testng.Assert;

import static quangtester.com.keywords.WebUI.*;
import static quangtester.com.keywords.WebUI.verifyElementNotVisible;

public class HomePageDNSG {
    private String PAGE_URL = "https://crm.anhtester.com/admin/";
    private String PAGE_TEXT = "House";

    //Các Object
    By buttonOptionHomePage = By.xpath("//header/div[2]/div[1]/div[1]/a[1]/*[1]");



    public void verifyHomePage() {
        //Kiểm tra URL chứa phần thuộc trang DB
        //Kiểm tra Text hoặc Object chỉ có trang DB có
        Assert.assertEquals(getCurrentUrl(), PAGE_URL, "URL chưa đúng trang Dashboard.");
        Assert.assertTrue(checkElementExist(buttonOptionHomePage), "Dashboard Options not existing.");
    }

}
