import java.text.ParseException;

public class BaoCaoDoAn extends BaoCao {
    private double tyLeDaoVan;

    public BaoCaoDoAn() {

    }

    public BaoCaoDoAn(String maBaoCao, String tenBaoCao, String linkBaoCao, String ngayBaoCao, String dsSinhVien, String tenGiangVien, double diem, double tyLeDaoVan) throws ParseException {
        super(maBaoCao, tenBaoCao, linkBaoCao, ngayBaoCao, dsSinhVien, tenGiangVien, diem);
        this.tyLeDaoVan = tyLeDaoVan;
    }

    @Override
    public void nhap() throws ParseException {
        super.nhap();
        System.out.print("Nhập điểm: ");
        this.diemBaoCao = Double.parseDouble(s.nextLine());
        System.out.print("Nhập tỷ lệ đạo văn: ");
        this.tyLeDaoVan = Double.parseDouble(s.nextLine());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.printf("Tỷ lệ đạo văn: %.2f\n", this.tyLeDaoVan);
    }

    public double getTyLeDaoVan() {
        return tyLeDaoVan;
    }

    public void setTyLeDaoVan(double tyLeDaoVan) {
        this.tyLeDaoVan = tyLeDaoVan;
    }
}
