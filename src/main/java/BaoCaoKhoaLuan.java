import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BaoCaoKhoaLuan extends BaoCao {
    private String danhGiaGV;
    public List<HoiDong> dsTvHoiDong = new ArrayList<>();
    private double diem;
    private String nhanXet;
    private double diemTongKet;
    //    public List<BaoCaoKhoaLuan> dsHoiDong = List.copyOf(TvHoiDong)
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
}
