import java.text.ParseException;
import java.util.Scanner;

public class BaoCaoThucTap extends BaoCao {
    private String thongTinDanhGia;

    public BaoCaoThucTap() {

    }

    public BaoCaoThucTap(String maBaoCao, String tenBaoCao, String linkBaoCao, String ngayBaoCao, String dsSinhVien, String tenGiangVien, double diem, String thongTinDanhGia) throws ParseException {
        super(maBaoCao, tenBaoCao, linkBaoCao, ngayBaoCao, dsSinhVien, tenGiangVien, diem);
        this.thongTinDanhGia = thongTinDanhGia;
    }

    @Override
    public void nhap() throws ParseException {
        super.nhap();
        System.out.print("Nhap thong tin danh gia: ");
        this.thongTinDanhGia = s.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("Thông tin đánh giá: %s\n", this.thongTinDanhGia);
    }

    public String getThongTinDanhGia() {
        return thongTinDanhGia;
    }

    public void setThongTinDanhGia(String thongTinDanhGia) {
        this.thongTinDanhGia = thongTinDanhGia;
    }
}
