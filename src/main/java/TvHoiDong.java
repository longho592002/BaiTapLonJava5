import java.util.Scanner;

public class TvHoiDong extends HoiDong {
    private String hoTen;
    private String hocHam;
    private String hocVi;
    private String nhiemVu;
    private double diem;
    Scanner S = new Scanner(System.in);


    public TvHoiDong(){

    }
    public TvHoiDong(String hoTen, String hocHam, String hocVi, String nhiemVu, double diem){
        this.hoTen = hoTen;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.nhiemVu = nhiemVu;
        this.diem = diem;
    }
    public void nhapThanhVienHoiDon() {
        System.out.print("Nhập họ và tên: ");
        hoTen = S.nextLine();
        System.out.print("Nhập học hàm: ");
        hocHam = S.nextLine();
        System.out.print("Nhập học vị: ");
        hocVi = S.nextLine();
        System.out.print("Nhập nhiệm vụ");
        nhiemVu = S.nextLine();
        System.out.print("Nhập điểm: ");
        diem = S.nextDouble();
    }
    public void  xuatThanhVienHoiDong() {
        System.out.printf("Họ và tên: %s\n Học Hàm: %s\n Học Vị: %s\n Nhiệm vụ: %s\n  Điểm: %.2f\n",
                this.hoTen, this.hocHam, this.hocVi, this.nhiemVu, this.diem);
    }
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getHocHam() {
        return hocHam;
    }

    public void setHocHam(String hocHam) {
        this.hocHam = hocHam;
    }

    public String getHocVi() {
        return hocVi;
    }

    public void setHocVi(String hocVi) {
        this.hocVi = hocVi;
    }

    public String getNhiemVu() {
        return nhiemVu;
    }

    public void setNhiemVu(String nhiemVu) {
        this.nhiemVu = nhiemVu;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
}
