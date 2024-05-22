package DNSG.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class LoginPageDNSG {
    private String URl = "https://saigon-business.erp.meu-solutions.com/auth/login";
    private String PAGETEXT = "Đăng nhập";


    By headerPage = By.xpath("//div[@class='text-");
    By inputEmail = By.xpath("//input[@id='email']");
    By inputPassword = By.xpath("//input[@id=':rd:']");
    By checkboxSaveAccount = By.xpath(" //input[@type='checkbox']");
    By buttonLogin = By.xpath("//button[@id=':re:']");
    By messageErrorEmail = By.xpath("//p[@id='email-helper-text']");
    By getMessageErrorPassword = By.xpath("//p[@id=':rd:-helper-text']");

    private WebDriver driver;

    public LoginPageDNSG (WebDriver _driver){
        driver = _driver;
    }


    //Các hàm xử lý trang login
//    public  void  verifyHeaderPage(){
//        Assert.assertEquals(driver.findElement(headerPage).getText(),"Đăng nhập","Fail HeaderPage");
//    }
    public void enterEmail(String email){
        driver.findElement(inputEmail).sendKeys(email);
    }
    public void enterPassword(String password){
        driver.findElement(inputPassword).sendKeys(password);
    }
    public void ClickOnCheckboxSaveAccount(){
        driver.findElement(checkboxSaveAccount).click();
    }
    public void ClickOnButtonLogin(){
        driver.findElement(buttonLogin).click();
    }
    public void verifyErrorMessage(){
        Assert.assertTrue(driver.findElement(messageErrorEmail).isDisplayed(),"Fail. Error message no displays.");
        Assert.assertEquals(driver.findElement(messageErrorEmail).getText(),"Vui lòng nhập email hợp lệ","Nội dung thông báo lỗi không đúng.");
        Assert.assertEquals(driver.findElement(getMessageErrorPassword).getText(),"Vui lòng nhập mật khẩu","Nội dung thông báo lỗi không đúng.");
    }
    public void loginEmailKhongHopLe(String email , String password){
        driver.get(URl);
        //verifyHeaderPage();
        enterEmail(email);
        enterPassword(password);
        ClickOnCheckboxSaveAccount();
        ClickOnButtonLogin();
        //Kiểm tra massega thông báo lỗi
        verifyErrorMessage();

    }
    public HomePageDNSG login(String email , String password){
        driver.get(URl);
        //verifyHeaderPage();
        enterEmail(email);
        enterPassword(password);
        ClickOnButtonLogin();

        return new HomePageDNSG();
    }


}
