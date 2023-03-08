package Cau2;

import java.util.Scanner;

public class MainTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // đối tượng tạo sẵn dữ liệu
        NhanVien nv1 = new KyThuat("CNTT", "TP123", "Huong", "13/02/2000", "Bac Ninh");

        // 1 đối tượng nhập từ bàn phím

        NhanVien nv2 = new KyThuat();
        System.out.print("Chuyen nganh: ");
        ((KyThuat) nv2).setChuyenNganh(scanner.nextLine());
        System.out.print("Nhập mã nhân viên: ");
        nv2.nhanVienId = scanner.nextLine();
        System.out.print("Nhập tên nhân viên: ");
        nv2.tenNv = scanner.nextLine();
        System.out.print("Nhập năm sinh nhân viên: ");
        nv2.namSinhNv = scanner.nextLine();
        System.out.print("Nhập địa chỉ nhân viên: ");
        nv2.diaChiNv = scanner.nextLine();

        System.out.println(nv1.toString());
        System.out.println(nv1.moTaCongViec());
        System.out.println(nv2.toString());
        System.out.println(nv2.moTaCongViec());

    }
}
