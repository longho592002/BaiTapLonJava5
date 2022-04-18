import java.text.ParseException;

public class BaoCaoDoAn extends BaoCao {
    private double tyLeDaoVan;
//    private String giangVienPhanBien;

    public BaoCaoDoAn() {

    }

//    public BaoCaoDoAn(String maBaoCao, String tenBaoCao, String linkBaoCao, String ngayBaoCao, String dsSinhVien, String tenGiangVien, double tyLeDaoVan) throws ParseException {
//        this.tyLeDaoVan = tyLeDaoVan;
//    }

    public BaoCaoDoAn(String maBaoCao, String tenBaoCao, String linkBaoCao, String ngayBaoCao, String dsSinhVien, String tenGiangVien, double diem, double tyLeDaoVan) throws ParseException {
        super(maBaoCao, tenBaoCao, linkBaoCao, ngayBaoCao, dsSinhVien, tenGiangVien, diem);
        this.tyLeDaoVan = tyLeDaoVan;
    }
//    public BaoCaoDoAn(String maBaoCao, String tenBaoCao, String linkBaoCao, String ngayBaoCao, String dsSinhVien, String tenGiangVien, double diem, double tyLeDaoVan, String gvpb) throws ParseException {
//        super(maBaoCao, tenBaoCao, linkBaoCao, ngayBaoCao, dsSinhVien, tenGiangVien, diem);
//        this.tyLeDaoVan = tyLeDaoVan;
//        this.giangVienPhanBien = gvpb;
//    }
    @Override
    public void nhap() throws ParseException {
        super.nhap();
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
