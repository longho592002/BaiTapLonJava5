import java.text.ParseException;
import java.util.Scanner;

public class BaoCaoDoAn extends BaoCao {
    private double tyLeDaoVan;

    public BaoCaoDoAn() {

    }
    public BaoCaoDoAn(String maBaoCao, String tenBaoCao, String linkBaoCao, String ngayBaoCao, String dsSinhVien, String tenGiangVien, double diem, double tyLeDaoVan) throws ParseException {
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
    public double getTyLeDaoVan() {
        return tyLeDaoVan;
    }

    public void setTyLeDaoVan(double tyLeDaoVan) {
        this.tyLeDaoVan = tyLeDaoVan;
    }
}
