import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class BaoCaoKhoaLuan extends BaoCao {
    private String danhGiaGV;
    private double diem;
    private ArrayList<String> nhanXet = new ArrayList<>();
    ArrayList<TvHoiDong> listTV = new ArrayList<>();
    private ArrayList<String> ten = new ArrayList<>();
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
}
