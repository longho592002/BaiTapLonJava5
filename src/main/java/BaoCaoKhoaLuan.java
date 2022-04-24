import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;

public class BaoCaoKhoaLuan extends BaoCao {
    private double tyLeDaoVan;
    private String danhGiaGV;
    private double diemTongKet;
    private ArrayList<String> nhanXet = new ArrayList<>();
     ArrayList<TvHoiDong> listTV = new ArrayList<>();
    private ArrayList<String> ten = new ArrayList<>();

    public BaoCaoKhoaLuan() {

    }

    public BaoCaoKhoaLuan(String maBaoCao, String tenBaoCao, String linkBaoCao, String ngayBaoCao, ArrayList<SinhVien> dsSinhVien, String tenGiangVien,double diem, double tyLeDaoVan) throws ParseException {
        super(maBaoCao, tenBaoCao, linkBaoCao, ngayBaoCao, dsSinhVien, tenGiangVien,diem);
        this.tyLeDaoVan = tyLeDaoVan;
    }

    @Override
    public void nhap() throws ParseException, FileNotFoundException {
        super.nhap();
        System.out.print("Nhập tỷ lệ đạo văn(vd: 0.5): ");
        this.tyLeDaoVan = Double.parseDouble(s.nextLine());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Tỷ lệ đạo văn: " + BaoCaoDoAn.decFormat.format(this.tyLeDaoVan));
        if(!nhanXet.isEmpty() && !ten.isEmpty() & !listTV.isEmpty()) {
            System.out.println("Danh sách hội đồng bảo vệ: ");
            int i = 1;
            for (TvHoiDong b: this.listTV) {
                System.out.println("_ Thành viên hội đồng thứ " + i);
                System.out.println("\t\t Họ tên: " + b.hoTen);
                System.out.println("\t\t Học hàm: " + b.hocHam);
                System.out.println("\t\t Học vị: " + b.hocVi);
                System.out.println("\t\t Nhiệm vụ: " + b.nhiemVu);
                System.out.println("\t\t Nhận xét: " + b.nhanXet);
                i = i + 1;
            }
        }
    }

    public String getDanhGiaGV() {
        return danhGiaGV;
    }

    public void setDanhGiaGV(String danhGiaGV) {
        this.danhGiaGV = danhGiaGV;
    }

    public double getDiemTongKet() {
        return diemTongKet;
    }

    public void setDiemTongKet(double diemTongKet) {
        this.diemTongKet = diemTongKet;
    }

    public ArrayList<String> getNhanXet() {
        return nhanXet;
    }

    public void setNhanXet(ArrayList<String> nhanXet) {
        this.nhanXet = nhanXet;
    }

    public ArrayList<TvHoiDong> getListTV() {
        return listTV;
    }

    public void setListTV(ArrayList<TvHoiDong> listTV) {
        this.listTV = listTV;
    }

    public ArrayList<String> getTen() {
        return ten;
    }

    public void setTen(ArrayList<String> ten) {
        this.ten = ten;
    }

    public double getTyLeDaoVan() {
        return tyLeDaoVan;
    }

    public void setTyLeDaoVan(double tyLeDaoVan) {
        this.tyLeDaoVan = tyLeDaoVan;
    }
}
