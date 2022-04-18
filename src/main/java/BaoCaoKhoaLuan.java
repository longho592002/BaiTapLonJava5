import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class BaoCaoKhoaLuan extends BaoCao {
    private String danhGiaGV;
    private double diem;
    private ArrayList<String> nhanXet = new ArrayList<>();
    private double diemTongKet;
    private double tyLeDaoVan;


    public BaoCaoKhoaLuan() {

    }
//    public BaoCaoKhoaLuan(String maBaoCao, String tenBaoCao, String linkBaoCao, String ngayBaoCao, String dsSinhVien, String tenGiangVien, double diem, double tyLeDaoVan, ArrayList<String> nhanXet) throws ParseException {
//        super(maBaoCao, tenBaoCao, linkBaoCao, ngayBaoCao, dsSinhVien, tenGiangVien, diem);
//        this.setNhanXet(nhanXet);
//    }
    public BaoCaoKhoaLuan(String maBaoCao, String tenBaoCao, String linkBaoCao, String ngayBaoCao, String dsSinhVien, String tenGiangVien,double diem, double tyLeDaoVan) throws ParseException {
        super(maBaoCao, tenBaoCao, linkBaoCao, ngayBaoCao, dsSinhVien, tenGiangVien, diem);
        this.tyLeDaoVan = tyLeDaoVan;
    }

    @Override
    public void nhap() throws ParseException {
        super.nhap();
        System.out.print("Nhập tỷ lệ đạo văn: ");
        Scanner s = new Scanner(System.in);
        tyLeDaoVan = s.nextDouble();
    }


    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("Tỷ lệ đạo văn: %.2f\n", this.tyLeDaoVan);
        nhanXet.toArray();
        System.out.print("Các lời nhận xét: ");
        System.out.println(nhanXet);
    }


    public String getDanhGiaGV() {
        return danhGiaGV;
    }

    public void setDanhGiaGV(String danhGiaGV) {
        this.danhGiaGV = danhGiaGV;
    }

//    public List<HoiDong> getDsTvHoiDong() {
//        return dsTvHoiDong;
//    }

//    public void setDsTvHoiDong(HoiDong[] dsTvHoiDong) {
//        this.dsTvHoiDong = Arrays.asList(dsTvHoiDong);
//    }

//    @Override
//    public double getDiem() {
//        return diem;
//    }
//
//    @Override
//    public void setDiem(double diem) {
//        this.diem = diem;
//    }

//    public ArrayList<String> getNhanXet() {
//        return nhanXet;
//    }
//
//    public void setNhanXet(ArrayList<String> nhanXet) {
//        this.nhanXet = nhanXet;
//    }

    public double getDiemTongKet() {
        return diemTongKet;
    }

    public void setDiemTongKet(double diemTongKet) {
        this.diemTongKet = diemTongKet;
    }

    public double getTyLeDaoVan() {
        return tyLeDaoVan;
    }

    public void setTyLeDaoVan(double tyLeDaoVan) {
        this.tyLeDaoVan = tyLeDaoVan;
    }

    public ArrayList<String> getNhanXet() {
        return nhanXet;
    }

    public void setNhanXet(ArrayList<String> nhanXet) {
        this.nhanXet = nhanXet;
    }
}
