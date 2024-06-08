package DNSG.com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import quangtester.com.drivers.DriverManager;
import quangtester.com.keywords.WebUI;

import java.util.List;

public class QuanLySuKienPage {
    private String URL = "https://saigon-business.erp.meu-solutions.com/admin/event";
    private String PAGE_TEXT = "Quản lí sự kiện";

    By pageQLSK = By.xpath("//div/div/div/ul/div[3]/div");
    By pageSuKienB2B = By.xpath("//div[2]/div/div/div/div[3]/div/span");





    private String URLQLSK = "https://saigon-business.erp.meu-solutions.com/admin/event/b2b-event";
    private String PageText = "Sự kiện B2B";


    //Thêm Mới Một Sự Kiện B2B
    By btnThemMoiSK = By.xpath("//div[2]/div/div[1]/div/button");
    By avtSuKieb = By.xpath("//div[3]/div/div[1]/div/div[1]/label");
    By tensukien = By.xpath("//div/div[1]/div/div[3]/div/input");
    By ngaydienrasukien = By.xpath("//div[1]/div/div[4]/div/input");
    By btnlichSK = By.xpath("//div/div[1]/div/div[4]/div/div/button");
    By thoigianbatdauSK = By.xpath("//div/div[1]/div/div[5]/div/input");
    By thoigianketthucSK = By.xpath("//div[1]/div/div[6]/div/input");
    By btnselectthoigianbatdau = By.xpath("//div[1]/div/div[5]/div/div/button");
    By btnselectthoigianketthuc = By.xpath("//div/div[1]/div/div[6]/div/div/button");
    By popupChonNgayDienra = By.xpath("//div[2]/div/div/div[2]/div/div[5]/button[5]");
    By HOUR = By.xpath("//li[@aria-label='4 giờ']");
    By MINUTE = By.xpath("//li[@aria-label='10 phút']");
    By HOURTGKT = By.xpath("//li[@aria-label='10 giờ']");
    By MINUTETGKT = By.xpath("//li[@aria-label='10 phút']");
    By SelectTinhThanhPho = By.xpath("//div/div/main/div/div[3]/div/div[2]/div/div[2]/div/div");
    By tinh = By.xpath("//li[normalize-space()='Khánh Hòa']");
    By diemdiem = By.xpath("//div[2]/div/div[3]/div/input");
    By gioithieumotangan = By.xpath("//textarea[@id=':r23:']");
    By gioithieuchung = By.xpath("//div/div[3]/div[2]/div[2]/div/div[2]/div[1]");
    By btnLuuSKnew = By.xpath("//div/div/main/div/div[7]/button[2]");
    public void ThemMoiSuKien(String value_tensukien, String value_diadiem, String vulue_gioithieungan, String value_gioithieuchung  ) {
        WebUI.clickElement(pageQLSK);
        WebUI.clickElement(pageSuKienB2B);
        WebUI.clickElement(btnThemMoiSK);

        //Logo
        WebUI.clickElement(avtSuKieb);
        WebUI.uploadFileRobotClass("D:\\Code_Automation\\ProjectAutomation_DNSG\\src\\main\\resources\\datatest\\img4.png");

        //Tên sự kiện
        WebUI.setText(tensukien,value_tensukien);

        //ngày diễn ra
        WebUI.clickElement(ngaydienrasukien);
        WebUI.clickElement(btnlichSK);
        WebUI.clickElement(popupChonNgayDienra);

        //thời gian bắt đâu
        WebUI.clickElement(thoigianbatdauSK);
        WebUI.clickElement(btnselectthoigianbatdau);
        WebUI.clickElement(HOUR);
        WebUI.clickElement(MINUTE);

        //thời gian kết thúc
        WebUI.clickElement(btnselectthoigianketthuc);
        WebUI.scrollToElementWithJS(HOURTGKT);
        WebUI.clickElementWithJS(HOURTGKT);
        WebUI.clickElementWithJS(MINUTETGKT);

        //địa điểm
        WebUI.clickElement(SelectTinhThanhPho);
        WebUI.clickElementWithJS(tinh);
        WebUI.setText(diemdiem,value_diadiem);

        //Giới thiệu
        WebUI.setText(gioithieumotangan,vulue_gioithieungan);

        //Giới thiệu chung
        WebUI.setText(gioithieuchung,value_gioithieuchung);

        //Click Button Lưu Sự Kiện
        WebUI.clickElementWithJS(btnLuuSKnew);

    }


    public void verifyThemMoiSuKien() {
        //câu message thêm thành công
        //verify xem sự kiện đã thêm có trong ds hay không bằng cách rà xót tất cả các tên sự kiện có chứa tên sk vừa thêm hay không
    }


    //Chỉnh sửa Sự Kiện B2B
    By btnEditSK = By.xpath("//div/div/div[2]/div[7]/div/button[1]");
    public void ChinhSuaSuKien() {
        //tìm sự kiến muô chính sửa
        //chỉnh sửa sự kiện
        //verify sự kien

    }

    public void checkdatatablebycolumn(int column, String value) {
    }


    //Xóa Sự Kiên B2B
    By btnXoaSK = By.xpath("//div[2]/div/div/div[2]/div[7]/div/button[2]");
    By popupXoaSK = By.xpath("//div/div[2]/button[2]");
    public void XoaSuKien() {
        WebUI.clickElement(pageQLSK);
        WebUI.clickElement(pageSuKienB2B);


    }


    public void checkSearchTableByColumn(String value) {
        //Xác định số dòng của table sau khi search
        List<WebElement> row = DriverManager.getDriver().findElements(By.xpath("//div/div[2]/div/div[2]/div/div/div[1]/div[2]"));
        int rowTotal = row.size(); //Lấy ra số dòng
        System.out.println("Số dòng tìm thấy: " + rowTotal);

        //Duyệt từng dòng
        for (int i = 1; i <= rowTotal; i++) {
            WebElement elementCheck = DriverManager.getDriver().findElement(By.xpath("//div[2]/div/div/div["+i+"]/div[3]/div"));

            JavascriptExecutor js = (JavascriptExecutor) DriverManager.getDriver();
            js.executeScript("arguments[0].scrollIntoView(true);", elementCheck);

            Boolean ColumnValue = elementCheck.getText().toUpperCase().equals(value.toUpperCase());
            System.out.println("Text của hàng này là: " + elementCheck.getText());
            if (ColumnValue == true) {
                System.out.println("Đã tìm thấy giá trị");
                break;
            }
            else if (i == rowTotal){
                System.out.println("Không tìm thấy giá trị");
                Assert.fail("Đã tìm hết mà không thấy tên sự kiện mong muốn");
            }
        }
    }

    private final By clickDangDienRaTab = By.xpath("//div/main/div/div[1]/div/div/button[2]");
    public void GotoQuanLiSuKienPage(){
        WebUI.clickElement(pageQLSK);
        WebUI.clickElement(pageSuKienB2B);
    }
}
