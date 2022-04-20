public class SinhVien {
    private int mssv;
    private String hoTen;
    private int khoaHoc;
    private String gioiTinh;
    private int namSinh;
    private String chuyenNganh;

    public SinhVien() {

    }

    public SinhVien(int mssv, String hoTen, int khoaHoc, String gioiTinh, int namSinh, String chuyenNganh) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.khoaHoc = khoaHoc;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.chuyenNganh = chuyenNganh;
    }

    public void xuat() {
        System.out.printf("MSSV: %d\nHọ tên: %s\nKhóa học: %d\nGiới tính: %s\nNăm sinh: %d\nChuyên ngành: %s\n", this.mssv, this.hoTen, this.khoaHoc, this.gioiTinh, this.namSinh, this.chuyenNganh);
    }

    public int getMssv() {
        return mssv;
    }

    public void setMssv(int mssv) {
        this.mssv = mssv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }
}
