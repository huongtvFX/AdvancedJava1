package Cau2;

public class KyThuat extends NhanVien {

    private String chuyenNganh;

    public KyThuat() {
    }

    public KyThuat(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    public KyThuat(String chuyenNganh, String nhanVienId, String tenNv, String namSinhNv, String diaChiNv) {
        super(nhanVienId, tenNv, namSinhNv, diaChiNv);
        this.chuyenNganh = chuyenNganh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }


    @Override
    public String moTaCongViec() {
        return "cong viec rat tot";
    }

    @Override
    public String toString() {
        return "KyThuat{" +
                "chuyenNganh='" + chuyenNganh + '\'' +
                ", nhanVienId='" + nhanVienId + '\'' +
                ", tenNv='" + tenNv + '\'' +
                ", namSinhNv='" + namSinhNv + '\'' +
                ", diaChiNv='" + diaChiNv + '\'' +
                '}';
    }
}
