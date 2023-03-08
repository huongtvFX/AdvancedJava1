package Cau3;

import java.io.DataInputStream;
import java.io.IOException;

import static Cau3.VanBan.*;

public class MainVB {
    public static void main(String args[]) throws IOException {
        String st;
        System.out.print("Nhap xau: ");
        DataInputStream stream = new DataInputStream(System.in);
        st = stream.readLine();

        // khởi tạo đối tượng văn bản
        VanBan VB = new VanBan(st);
        System.out.println("So tu trong xau la: " + dem(VB));

        VB.str = ChuanHoa(VB);
        System.out.println("Xau chuan hoa: " + VB.str);

        VB.str = ConvertUpperCase(VB);
        System.out.println("Van ban sau khi chuyen thanh viet hoa: " + VB.str);

        VB.str = ConvertLowerCase(VB);
        System.out.println("Van ban sau khi chuyen thanh viet thuong: " + VB.str);

        VB.str = ConvertCapitalize(VB);
        System.out.println("Van ban sau khi chuyen thanh viet hoa ki tu dau tien cua moi tu: " + VB.str);

    }
}
