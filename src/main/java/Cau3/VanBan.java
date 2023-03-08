package Cau3;

public class VanBan {
    // thuộc tính là một chuỗi kí tự
    protected String str;

    // Hàm khởi tạo không có tham số
    VanBan() {
    }

    // Hàm khởi tạo có tham số
    VanBan(String st) {
        str = st;
    }

    // Đếm số từ của văn bản
    static int dem(VanBan vb) {
        int d;
        vb.str = ChuanHoa(vb);
        if (vb.str.charAt(0) == ' ') d = 0;
        else d = 1;
        for (int i = 0; i < vb.str.length(); i++)
            if (vb.str.charAt(i) == ' ' && vb.str.charAt(i + 1) != ' ') d++;
        return d;
    }

    // chuẩn hóa một xâu theo tiêu chuẩn
    static String ChuanHoa(VanBan vb) {
        StringBuffer vbn = new StringBuffer(vb.str);
        while (vbn.charAt(0) == '\0') {
            vbn = vbn.delete(0, 1);
        }
        while (vbn.charAt(vbn.length() - 1) == '\0') ;
//        vbn = vbn.delete(vbn.length() - 1, vbn.length());
        for (int i = 1; i < vbn.length(); i++)
            while (vbn.charAt(i) == '\0' && vbn.charAt(i + 1) == '\0') vbn = vbn.delete(i, i + 1);
        return (vbn.toString());
    }

    // chuyển thành viết hoa
    static String ConvertUpperCase(VanBan vanban) {
        return vanban.str.toUpperCase();
    }

    // chuyển thành viết thường
    static String ConvertLowerCase(VanBan vanBan) {
        return vanBan.str.toLowerCase();
    }

    // viết hoa chữ cái đầu mỗi từ
    static String ConvertCapitalize(VanBan vanBan) {
        // cắt chuỗi thành từng từ dựa vào khoảng trắng
        String[] arr = vanBan.str.split(" ");
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < arr.length; i++) {
            sb.append(Character.toUpperCase(arr[i].charAt(0))).append(arr[i].substring(1)).append(" ");
        }
        return sb.toString().trim();
    }
}
