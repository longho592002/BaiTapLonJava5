import java.io.FileNotFoundException;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.util.ArrayList;

public class BaoCaoDoAn extends BaoCao {
    private double tyLeDaoVan;
    public static DecimalFormat decFormat = new DecimalFormat("#%");

    public BaoCaoDoAn() {

    }

    public BaoCaoDoAn(String maBaoCao, String tenBaoCao, String linkBaoCao, String ngayBaoCao, ArrayList dsSinhVien, String tenGiangVien, double diem, double tyLeDaoVan) throws ParseException {
        super(maBaoCao, tenBaoCao, linkBaoCao, ngayBaoCao, dsSinhVien, tenGiangVien, diem);
        this.tyLeDaoVan = tyLeDaoVan;
    }



    @Override
    public void nhap() throws ParseException, FileNotFoundException {
        super.nhap();
        System.out.print("Nhập điểm: ");
        this.setDiemBaoCao(Double.parseDouble(s.nextLine()));
        System.out.print("Nhập tỷ lệ đạo văn(vd: 0.5): ");
        this.tyLeDaoVan = Double.parseDouble(s.nextLine());
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Tỷ lệ đạo văn: " + decFormat.format(this.tyLeDaoVan));
    }

    public double getTyLeDaoVan() {
        return tyLeDaoVan;
    }

    public void setTyLeDaoVan(double tyLeDaoVan) {
        this.tyLeDaoVan = tyLeDaoVan;
    }
}
