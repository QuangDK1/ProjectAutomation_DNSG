package DNSG.com.pages;

import org.openqa.selenium.By;
import org.testng.Assert;
import quangtester.com.keywords.WebUI;

public class LoginPage {
    private String URl = "https://saigon-business.erp.meu-solutions.com/auth/login";
    private String PAGETEXT = "Đăng nhập";


    By headerPage = By.xpath("//div[@class='text-");
    By inputEmail = By.xpath("//input[@id='email']");
    By inputPassword = By.xpath("//form/div[3]/div/input");
    By buttonLogin = By.xpath("//form/div[5]/button");
    By messageErrorEmail = By.xpath("//p[@id='email-helper-text']");
    By getMessageErrorPassword = By.xpath("//p[@id=':rd:-helper-text']");
    By tatpopup = By.xpath("//body/div[2]/div[3]/div[1]/div[1]/button[1]/*[1]");
    private By messageFailed = By.xpath("//div[contains(text(),'Email hoặc mật khẩu không đúng')]");




    public void LoginThanhCong (String email,String password){
       WebUI.openURL(URl);
       WebUI.sleep(2);
       WebUI.clickElement(tatpopup);
       WebUI.setText(inputEmail,email);
       WebUI.setText(inputPassword,password);
       WebUI.clickElement(buttonLogin);
       WebUI.sleep(1.5);

   }
   public void  verifyLoginThanhCong(){
       boolean ketquamongmuon = WebUI.getCurrentUrl().equals("https://saigon-business.erp.meu-solutions.com/");
       Assert.assertTrue(ketquamongmuon,"Fail");
       //verify bằng cách get câu message = giá trị "..." thì pass ,néếu không bằng fail
   }

   public void verifyLoginThatBai(){
       boolean ketquamongmuon = WebUI.getTextElement(messageFailed).trim().equals("Email hoặc mật khẩu không đúng");
       Assert.assertTrue(ketquamongmuon,"Fail");
   }

}
