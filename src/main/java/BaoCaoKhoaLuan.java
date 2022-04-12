import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BaoCaoKhoaLuan extends BaoCao {
    private String danhGiaGV;
    public List<HoiDong> dsTvHoiDong = new ArrayList<>();
    private double diem;
    private String nhanXet;
    private double diemTongKet;
    protected double tyLeDaoVan;
    //    public List<BaoCaoKhoaLuan> dsHoiDong = List.copyOf(TvHoiDong)


    public BaoCaoKhoaLuan() {

    }
    public BaoCaoKhoaLuan(String maBaoCao, String tenBaoCao, String linkBaoCao, String ngayBaoCao, String dsSinhVien, String tenGiangVien, double diem, double tyLeDaoVan) throws ParseException {
        this.maBaoCao = maBaoCao;
        this.tenBaoCao = tenBaoCao;
        this.linkBaoCao = linkBaoCao;
        this.ngayBaoCao = F.parse(ngayBaoCao);
        this.dsSinhVien = dsSinhVien;
        this.tenGiangVien = tenGiangVien;
        this.diemBaoCao = diem;
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
        System.out.printf("Tỷ lệ đạo văn: %s\n", this.tyLeDaoVan);
    }


    public String getDanhGiaGV() {
        return danhGiaGV;
    }

    public void setDanhGiaGV(String danhGiaGV) {
        this.danhGiaGV = danhGiaGV;
    }

    public List<HoiDong> getDsTvHoiDong() {
        return dsTvHoiDong;
    }

    public void setDsTvHoiDong(HoiDong[] dsTvHoiDong) {
        this.dsTvHoiDong = Arrays.asList(dsTvHoiDong);
    }

    @Override
    public double getDiem() {
        return diem;
    }

    @Override
    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getNhanXet() {
        return nhanXet;
    }

    public void setNhanXet(String nhanXet) {
        this.nhanXet = nhanXet;
    }

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
}
