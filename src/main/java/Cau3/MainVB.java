package Cau3;
public class MainVB {
    public static void main(String[] args) {
        VanBan vb=new VanBan("sam sung sds");
        System.out.println("So ky tu trong chuoi la:"+vb.wordCount());
        System.out.println("Viet hoa chuoi van ban:"+vb.toUpper());
        System.out.println("Chuyen hoa thanh thuong:"+vb.hoaThanhThuong());
        System.out.println("Viet hoa dau:"+vb.vietHoaDau());

    }

}
