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
    private double tyLeDaoVan;
    //    public List<BaoCaoKhoaLuan> dsHoiDong = List.copyOf(TvHoiDong)



    @Override
    public void nhap() throws ParseException {
        super.nhap();
        System.out.println("Nhập tỷ lệ đạo văn: ");
        Scanner s = new Scanner(System.in);
        tyLeDaoVan = s.nextDouble();
    }


    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("Tỷ lệ đạo văn: %d", this.tyLeDaoVan);
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
