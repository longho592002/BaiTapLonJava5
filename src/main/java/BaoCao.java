import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class BaoCao {
    DanhSachBaoCao dsbc = new DanhSachBaoCao();
    private String maBaoCao;
    private String tenBaoCao;
    private String linkBaoCao;
    private Date ngayBaoCao;
    private String dsSinhVien;
    private String tenGiangVien;
    private double diemBaoCao;

    public static SimpleDateFormat F = new SimpleDateFormat("dd-MM-yyyy");
    public Scanner scan = new Scanner(System.in);

    public BaoCao() {

    }

    public BaoCao(String maBaoCao, String tenBaoCao, String linkBaoCao, String ngayBaoCao, String dsSinhVien, String tenGiangVien, double diem) throws ParseException {
        this.maBaoCao = maBaoCao;
        this.tenBaoCao = tenBaoCao;
        this.linkBaoCao = linkBaoCao;
        this.ngayBaoCao = F.parse(ngayBaoCao);
        this.dsSinhVien = dsSinhVien;
        this.tenGiangVien = tenGiangVien;
        this.diemBaoCao = diem;
    }

    // xuất báo cáo
    public void xuat() {
        System.out.printf("== == == == == ==\nMã báo cáo: %s\nTên báo cáo: %s\nLink báo cáo: %s\nNgày báo cáo: %s\nDanh sách sinh viên: %s\nTên giảng viên: %s\nĐiểm: %.2f\n",
                this.maBaoCao,this.tenBaoCao,this.linkBaoCao,F.format(this.ngayBaoCao),this.dsSinhVien,this.tenGiangVien,this.diemBaoCao);
    }

    // nhập báo cáo
    public void nhap() throws ParseException {
        System.out.println("Mã báo cáo theo dạng gồm 5 chữ số, 2 chữ số đầu là tên loại báo cáo");
        System.out.println("Ví dụ nhập báo cáo thực tập: \"TT001\"");
        System.out.print("Nhập mã báo cáo(): ");
        this.maBaoCao = scan.nextLine();
        System.out.print("Nhập tên báo cáo: ");
        this.tenBaoCao = scan.nextLine();
        System.out.print("Nhập link báo cáo: ");
        this.linkBaoCao = scan.nextLine();
        System.out.print("Nhập ngày báo cáo(dd-MM-YYYY): ");
        this.ngayBaoCao = F.parse(scan.nextLine());
        System.out.print("Nhập danh sách sinh viên thực hiện: ");
        this.dsSinhVien = scan.nextLine();
        System.out.print("Nhập tên giảng viên: ");
        this.tenGiangVien = scan.nextLine();
//        System.out.print("Nhập điểm: ");
//        diemBaoCao = scan.nextDouble();
    }


    // getter setter
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

    public double getDiem() {
        return diemBaoCao;
    }

    public void setDiem(double diem) {
        this.diemBaoCao = diem;
    }
}
