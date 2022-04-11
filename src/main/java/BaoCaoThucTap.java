import java.text.ParseException;
import java.util.Scanner;

public class BaoCaoThucTap extends BaoCao {
    private String thongTinDanhGia;

    public BaoCaoThucTap() {

    }

    public BaoCaoThucTap(String maBaoCao, String tenBaoCao, String linkBaoCao, String ngayBaoCao, String dsSinhVien, String tenGiangVien, double diem, String thongTinDanhGia) throws ParseException {
        this.maBaoCao = maBaoCao;
        this.tenBaoCao = tenBaoCao;
        this.linkBaoCao = linkBaoCao;
        this.ngayBaoCao = F.parse(ngayBaoCao);
        this.dsSinhVien = dsSinhVien;
        this.tenGiangVien = tenGiangVien;
        this.diemBaoCao = diem;
        this.thongTinDanhGia = thongTinDanhGia;
    }

    @Override
    public void nhap() throws ParseException {
        System.out.println("");
        System.out.println("Nhap thong tin danh gia: ");
        Scanner s = new Scanner(System.in);
        thongTinDanhGia = s.nextLine();
        super.nhap();
    }

    public String getThongTinDanhGia() {
        return thongTinDanhGia;
    }

    public void setThongTinDanhGia(String thongTinDanhGia) {
        this.thongTinDanhGia = thongTinDanhGia;
    }
}
