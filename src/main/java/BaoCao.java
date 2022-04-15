import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BaoCao {
    DanhSachBaoCao dsbc = new DanhSachBaoCao();
    protected String maBaoCao;
    protected String tenBaoCao;
    protected String linkBaoCao;
    protected Date ngayBaoCao;
    protected String dsSinhVien;
    protected String tenGiangVien;
    protected double diemBaoCao;

    public static SimpleDateFormat F = new SimpleDateFormat("dd-MM-yyyy");
    public Scanner scan = new Scanner(System.in);

    public BaoCao() {

    }

    public BaoCao(String maBaoCao, String tenBaoCao, String linkBaoCao, String ngayBaoCao, String dsSinhVien, String tenGiangVien, double diem) throws ParseException {
        this.setMaBaoCao(maBaoCao);
        this.setTenBaoCao(tenBaoCao);
        this.setLinkBaoCao(linkBaoCao);
        this.setNgayBaoCao(F.parse(ngayBaoCao));
        this.setDsSinhVien(dsSinhVien);
        this.setTenGiangVien(tenGiangVien);
        this.setDiemBaoCao(diem);
    }

    // xuất báo cáo
    public void xuat() {
        System.out.printf("== == == == == ==\nMã báo cáo: %s\nTên báo cáo: %s\nLink báo cáo: %s\nNgày báo cáo: %s\nDanh sách sinh viên: %s\nTên giảng viên: %s\nĐiểm: %.2f\n",
                this.getMaBaoCao(), this.getTenBaoCao(), this.getLinkBaoCao(),F.format(this.getNgayBaoCao()), this.getDsSinhVien(), this.getTenGiangVien(), this.getDiemBaoCao());
    }

    // nhập báo cáo
    public void nhap() throws ParseException {
        System.out.println("Mã báo cáo theo dạng gồm 5 chữ số, 2 chữ số đầu là tên loại báo cáo");
        System.out.println("Ví dụ nhập báo cáo thực tập: \"TT001\"");
        System.out.print("Nhập mã báo cáo(): ");
        this.setMaBaoCao(scan.nextLine());
        System.out.print("Nhập tên báo cáo: ");
        this.setTenBaoCao(scan.nextLine());
        System.out.print("Nhập link báo cáo: ");
        this.setLinkBaoCao(scan.nextLine());
        System.out.print("Nhập ngày báo cáo(dd-MM-YYYY): ");
        this.setNgayBaoCao(F.parse(scan.nextLine()));
        System.out.print("Nhập danh sách sinh viên thực hiện: ");
        this.setDsSinhVien(scan.nextLine());
        System.out.print("Nhập tên giảng viên: ");
        this.setTenGiangVien(scan.nextLine());
//        System.out.print("Nhập điểm: ");
//        diemBaoCao = scan.nextDouble();
    }


    public String getMaBaoCao() {
        return maBaoCao;
    }

    public void setMaBaoCao(String maBaoCao) {
        this.maBaoCao = maBaoCao;
    }

    public String getTenBaoCao() {
        return tenBaoCao;
    }

    public void setTenBaoCao(String tenBaoCao) {
        this.tenBaoCao = tenBaoCao;
    }

    public String getLinkBaoCao() {
        return linkBaoCao;
    }

    public void setLinkBaoCao(String linkBaoCao) {
        this.linkBaoCao = linkBaoCao;
    }

    public Date getNgayBaoCao() {
        return ngayBaoCao;
    }

    public void setNgayBaoCao(Date ngayBaoCao) {
        this.ngayBaoCao = ngayBaoCao;
    }

    public String getDsSinhVien() {
        return dsSinhVien;
    }

    public void setDsSinhVien(String dsSinhVien) {
        this.dsSinhVien = dsSinhVien;
    }

    public String getTenGiangVien() {
        return tenGiangVien;
    }

    public void setTenGiangVien(String tenGiangVien) {
        this.tenGiangVien = tenGiangVien;
    }

    public double getDiemBaoCao() {
        return diemBaoCao;
    }

    public void setDiemBaoCao(double diemBaoCao) {
        this.diemBaoCao = diemBaoCao;
    }
}
