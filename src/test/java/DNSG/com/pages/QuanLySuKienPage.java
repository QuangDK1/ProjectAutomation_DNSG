package DNSG.com.pages;

import org.openqa.selenium.By;
import quangtester.com.keywords.WebUI;

public class QuanLySuKienPage {
    private String URL = "https://saigon-business.erp.meu-solutions.com/admin/event";
    private String PAGE_TEXT = "Quản lí sự kiện";

    By pageQLSK = By.xpath("//div/div/div/ul/div[3]/div");
    By pageSuKienB2B = By.xpath("//div[2]/div/div/div/div[3]/div/span");
    By btnThemMoiSK = By.xpath("//div[2]/div/div[1]/div/button");
    By avtSuKieb = By.xpath("//div[3]/div/div[1]/div/div[1]/label");
    By tensukien = By.xpath("//div/div[1]/div/div[3]/div/input");
    By ngaydienrasukien = By.xpath("//div[1]/div/div[4]/div/input");
    By btnlichSK = By.xpath("//div/div[1]/div/div[4]/div/div/button");
    By thoigianbatdauSK = By.xpath("//div/div[1]/div/div[5]/div/input");
    By thoigianketthucSK = By.xpath("//div[1]/div/div[6]/div/input");
    By btnselectthoigianbatdau = By.xpath("//div[1]/div/div[5]/div/div/button");
    By btnselectthoigianketthuc = By.xpath("//div/div[1]/div/div[6]/div/div/button");
//    By btnthangketiep = By.xpath("//div[5]/div[2]/div/div/div/div[1]/div[2]/button[2]");
    By popupChonNgayDienra = By.xpath("//div[2]/div/div/div[2]/div/div[5]/button[5]");
//    By listboxHour = By.xpath("//div[6]/div[2]/div/div[1]/div/ul[1]");
//    By HOUR = By.xpath("//div[6]/div[2]/div/div[1]/div/ul[1]");
//    By listboxMinute = By.xpath("//div[6]/div[2]/div/div[1]/div/ul[2]");
//    By MINUTE =By.xpath("//div[6]/div[2]/div/div[1]/div/ul[2]");
//    By btnOKthoigianbatdau = By.xpath("//div[6]/div[2]/div/div[2]/button");
    By radiobtnDiaDiem = By.xpath(" //input[@value='domestic']");
    By SelectTinhThanhPho = By.xpath("//div//div[contains(@class,'mui-style-112ig04')]");
    By diemdiem = By.xpath("//input[@id=':r2v:']");
    By gioithieumotangan = By.xpath("//div/div[3]/div/div[3]/div[1]/div");
    By gioithieuchung = By.xpath("//div/div[3]/div/div[3]/div[2]/div[2]/div/div[2]/div[1]");
    By soluongban_ke = By.xpath("//input[@id=':r31:']");
    By soluongnganke = By.xpath("//input[@id=':r32:']");
    By btnLuuSKnew = By.xpath("//button[@id=':r36:']");









    By btnEditSK = By.xpath("//div/div/div[2]/div[7]/div/button[1]");
    By btnXoaSK = By.xpath("//div[2]/div/div/div[2]/div[7]/div/button[2]");
    By deldoituongSK = By.xpath("//div/div[2]/div/div[1]/div[2]/div/div/div[2]");
    By popupXoaSK = By.xpath("//div/div[2]/button[2]");


    private String URLQLSK = "https://saigon-business.erp.meu-solutions.com/admin/event/b2b-event";
    private String PageText = "Sự kiện B2B";


    public void ThemMoiSuKien (){
        WebUI.clickElement(pageQLSK);
        WebUI.clickElement(pageSuKienB2B);
        WebUI.clickElement(btnThemMoiSK);
        //Tên sự kiện
        WebUI.setText(tensukien ,"Sự kiện B2B lần III tháng 6");
        //ngày diễn ra
        WebUI.clickElement(ngaydienrasukien);
        WebUI.clickElement(btnlichSK);
//      WebUI.clickElement(btnthangketiep);
        WebUI.clickElement(popupChonNgayDienra);
        //thời gian bắt đâu
        WebUI.clickElement(thoigianbatdauSK);
        WebUI.clickElement(btnselectthoigianbatdau);
//        WebUI.clickElement(listboxHour);
//        WebUI.clickElement(listboxMinute);
//        WebUI.clickElement(btnOKthoigianbatdau);
        //thời gian kết thúc
        WebUI.clickElement(thoigianketthucSK);
        WebUI.clickElement(btnselectthoigianketthuc);
        //địa điểm
        WebUI.clickElement(radiobtnDiaDiem);
        WebUI.setText(SelectTinhThanhPho,"Khánh Hòa");
        WebUI.setText(diemdiem ,"Nha Trang");
        //Giới thiệu
        WebUI.setText(gioithieumotangan,"Nha Trang là một thành phố ven biển và là trung tâm chính trị, kinh tế, văn hóa, khoa học kỹ thuật và du lịch của tỉnh Khánh Hòa. Nha Trang được mệnh danh là hòn ngọc của biển Đông, Viên ngọc xanh vì giá trị thiên nhiên, sắc đẹp cũng như khí hậu của nó.");
        //Giới thiệu chung
        WebUI.setText(gioithieuchung,"Nha Trang là một thành phố ven biển và là trung tâm chính trị, kinh tế, văn hóa, khoa học kỹ thuật và du lịch của tỉnh Khánh Hòa. Nha Trang được mệnh danh là hòn ngọc của biển Đông, Viên ngọc xanh vì giá trị thiên nhiên, sắc đẹp cũng như khí hậu của nó.Nha Trang là một thành phố ven biển và là trung tâm chính trị, kinh tế, văn hóa, khoa học kỹ thuật và du lịch của tỉnh Khánh Hòa. Nha Trang được mệnh danh là hòn ngọc của biển Đông, Viên ngọc xanh vì giá trị thiên nhiên, sắc đẹp cũng như khí hậu của nó.");
        //Số lượng bàn/kệ
        WebUI.setText(soluongban_ke,"10");
        //Số lượng ngăn kệ
        WebUI.setText(soluongnganke,"10");

        WebUI.clickElement(btnLuuSKnew);

    }

    public void ChinhSuaSuKien(){

    }

    public void XoaSuKien(){
        WebUI.clickElement(pageQLSK);
        WebUI.clickElement(pageSuKienB2B);
        WebUI.clickElement(btnXoaSK);
        WebUI.clickElement(popupXoaSK);
        WebUI.sleep(2);


    }

}
