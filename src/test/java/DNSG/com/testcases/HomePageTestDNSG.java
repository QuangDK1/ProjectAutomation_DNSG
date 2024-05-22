package DNSG.com.testcases;

import DNSG.com.common.BaseTest;
import org.openqa.selenium.By;
import org.testng.Assert;

import static quangtester.com.keywords.WebUI.*;
import static quangtester.com.keywords.WebUI.verifyElementNotVisible;

public class HomePageTestDNSG extends BaseTest {
    private String PAGE_URL = "https://saigon-business.erp.meu-solutions.com/";
    private String PAGE_TEXT = "HomePage";

    //Các Object

    By buttonOptionHomePage = By.xpath("//header/div[2]/div[1]/div[1]/a[1]/*[1]");




    public void verifyHomePage() {
        //Kiểm tra URL chứa phần thuộc trang DB
        //Kiểm tra Text hoặc Object chỉ có trang DB có
        Assert.assertEquals(getCurrentUrl(), PAGE_URL, "URL chưa đúng trang HomePage.");
        Assert.assertTrue(checkElementExist(buttonOptionHomePage), "HomePage not existing.");
    }


}
