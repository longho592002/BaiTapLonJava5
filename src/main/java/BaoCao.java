import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BaoCao {
    private String maBaoCao;
    private String tenBaoCao;
    private String linkBaoCao;
    private Date ngayBaoCao;
    private String dsSinhVien;
    private String tenGiangVien;
    private double diemBaoCao;

//    DanhSachBaoCao dsbc = new DanhSachBaoCao();

    public static SimpleDateFormat F = new SimpleDateFormat("dd-MM-yyyy");
    public static Scanner s = new Scanner(System.in);

    public BaoCao() {

    }

    public BaoCao(String maBaoCao, String tenBaoCao, String linkBaoCao, String ngayBaoCao, String dsSinhVien, String tenGiangVien, double diemBaoCao) throws ParseException {
        this.maBaoCao = maBaoCao;
        this.tenBaoCao = tenBaoCao;
        this.linkBaoCao = linkBaoCao;
        this.ngayBaoCao = F.parse(ngayBaoCao);
        this.dsSinhVien = dsSinhVien;
        this.tenGiangVien = tenGiangVien;
        this.diemBaoCao = diemBaoCao;
    }

//    public BaoCao(String maBaoCao, String tenBaoCao, String linkBaoCao, String ngayBaoCao, String dsSinhVien, String tenGiangVien, double diem) throws ParseException {
//        this.setMaBaoCao(maBaoCao);
//        this.setTenBaoCao(tenBaoCao);
//        this.setLinkBaoCao(linkBaoCao);
//        this.setNgayBaoCao(F.parse(ngayBaoCao));
//        this.setDsSinhVien(dsSinhVien);
//        this.setTenGiangVien(tenGiangVien);
//        this.setDiemBaoCao(diem);
//    }

    // xuất báo cáo
    public void xuat() {
        System.out.printf("== == == == == ==\nMã báo cáo: %s\nTên báo cáo: %s\nLink báo cáo: %s\nNgày báo cáo: %s\nDanh sách sinh viên: %s\nTên giảng viên: %s\nĐiểm: %.2f\n",
                this.maBaoCao, this.tenBaoCao, this.linkBaoCao,F.format(this.ngayBaoCao), this.dsSinhVien, this.tenGiangVien, this.diemBaoCao);
    }
    public void nhap() throws ParseException {
        System.out.println("Mã báo cáo theo dạng gồm 5 chữ số, 2 chữ số đầu là tên loại báo cáo");
        System.out.println("Ví dụ nhập báo cáo thực tập: \"TT001\"");
        System.out.print("Nhap ma bao cao: ");
        this.maBaoCao = s.nextLine();
        System.out.print("Nhap ten bao cao: ");
        this.tenBaoCao = s.nextLine();
        System.out.print("Nhap link bao cao: ");
        this.linkBaoCao = s.nextLine();
        System.out.print("Nhap ngay bao cao: ");
        this.ngayBaoCao = F.parse(s.nextLine());
        System.out.print("Nhap danh sach sinh vien thuc hien: ");
        this.dsSinhVien = s.nextLine();
        System.out.print("Nhap ten giang vien: ");
        this.tenGiangVien = s.nextLine();
        System.out.print("Nhap diem bao cao: ");
        this.diemBaoCao = Double.parseDouble(s.nextLine());
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
