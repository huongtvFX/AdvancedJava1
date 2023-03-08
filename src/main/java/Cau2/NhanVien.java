package Cau2;

public abstract class NhanVien {
    public String nhanVienId;
    public String tenNv;
    public String namSinhNv;
    public String diaChiNv;

    public NhanVien() {
    }

    public NhanVien(String nhanVienId, String tenNv, String namSinhNv, String diaChiNv) {
        this.nhanVienId = nhanVienId;
        this.tenNv = tenNv;
        this.namSinhNv = namSinhNv;
        this.diaChiNv = diaChiNv;
    }

    public String getNhanVienId() {
        return nhanVienId;
    }

    public String getTenNv() {
        return tenNv;
    }

    public void setTenNv(String tenNv) {
        this.tenNv = tenNv;
    }

    public String getNamSinhNv() {
        return namSinhNv;
    }

    public void setNamSinhNv(String namSinhNv) {
        this.namSinhNv = namSinhNv;
    }

    public String getDiaChiNv() {
        return diaChiNv;
    }

    public void setDiaChiNv(String diaChiNv) {
        this.diaChiNv = diaChiNv;
    }

    public abstract String moTaCongViec();

    @Override
    public String toString() {
        return "NhanVien{" +
                "nhanVienId='" + nhanVienId + '\'' +
                ", tenNv='" + tenNv + '\'' +
                ", namSinhNv='" + namSinhNv + '\'' +
                ", diaChiNv='" + diaChiNv + '\'' +
                '}';
    }
}
