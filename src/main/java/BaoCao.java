import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public abstract class BaoCao {
    private String maBaoCao;
    private String tenBaoCao;
    private String linkBaoCao;
    private Date ngayBaoCao;
    private ArrayList<SinhVien> dsSinhVien = new ArrayList<>();
    private String tenGiangVien;
    private double diemBaoCao ;
    public static SimpleDateFormat F = new SimpleDateFormat("dd-MM-yyyy");
    public static Scanner s = new Scanner(System.in);
    DanhSachSinhVien sinhViens = new DanhSachSinhVien();

    public BaoCao() {

    }

    public BaoCao(String maBaoCao, String tenBaoCao, String linkBaoCao, String ngayBaoCao, ArrayList<SinhVien> dsSinhVien, String tenGiangVien, double diemBaoCao) throws ParseException {
        this.maBaoCao = maBaoCao;
        this.tenBaoCao = tenBaoCao;
        this.linkBaoCao = linkBaoCao;
        this.ngayBaoCao = F.parse(ngayBaoCao);
        this.dsSinhVien = dsSinhVien;
        this.tenGiangVien = tenGiangVien;
        this.diemBaoCao = diemBaoCao;
    }


    // xuất báo cáo
    public void xuat() {
        if (this.diemBaoCao != 0) {
            System.out.printf("== == == == == ==  == == == == ==\nMã báo cáo: %s\nTên báo cáo: %s\nLink báo cáo: %s\nNgày báo cáo: %s\nDanh sách sinh viên: %s\nTên giảng viên: %s\nĐiểm: %.2f\n",
                    this.maBaoCao, this.tenBaoCao, this.linkBaoCao, F.format(this.ngayBaoCao), this.dsSinhVien, this.tenGiangVien, this.diemBaoCao);
        } else {
            System.out.printf("== == == == == ==  == == == == ==\nMã báo cáo: %s\nTên báo cáo: %s\nLink báo cáo: %s\nNgày báo cáo: %s\nDanh sách sinh viên: %s\nTên giảng viên: %s\n",
                    this.maBaoCao, this.tenBaoCao, this.linkBaoCao, F.format(this.ngayBaoCao), this.dsSinhVien, this.tenGiangVien);
        }

    }

    // Nhập báo cáo
    public void nhap() throws ParseException, FileNotFoundException {
        int n ;
        System.out.println("Mã báo cáo theo dạng gồm 5 chữ số, 2 chữ số đầu là tên loại báo cáo\nVí dụ nhập báo cáo thực tập: \"TT001\"");
        System.out.print("Nhập mã báo cáo: ");
        this.maBaoCao = s.nextLine().toUpperCase();
        System.out.print("Nhập tên báo cáo: ");
        this.tenBaoCao = s.nextLine();
        System.out.print("Nhập link báo cáo: ");
        this.linkBaoCao = s.nextLine();
        System.out.print("Nhập ngày báo cáo: ");
        this.ngayBaoCao = F.parse(s.nextLine());
        System.out.print("Nhập số sinh viên tham gia(tối đa 2 sinh viên): ");
        n = Integer.parseInt(s.nextLine());
        if(n >=1 && n <= 2) {
            System.out.println("Danh sách tên sinh viên: ");
            for (SinhVien sv: sinhViens.getSinhViens()) {
                System.out.println(sv.getHoTen() + " ");
            }
            for(int i = 1; i <= n; i++) {
                System.out.printf("Nhập tên sinh viên tham gia thứ %d: ", i );
                String ten = s.nextLine();
                for (SinhVien sv: sinhViens.getSinhViens()) {
                    if (sv.getHoTen().contains(ten)) {
                        dsSinhVien.add(sv);
                    }
                }
            }
        }
        System.out.print("Nhập tên giảng viên: ");
        this.tenGiangVien = s.nextLine();
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

    public ArrayList<SinhVien> getDsSinhVien() {
        return dsSinhVien;
    }

    public void setDsSinhVien(ArrayList<SinhVien> dsSinhVien) {
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
