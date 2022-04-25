import java.util.Scanner;

public class TvHoiDong  implements  Cloneable{
    protected String hoTen;
    protected String hocHam;
    protected String hocVi;
    protected String nhiemVu;
    protected double diem;
    public  String nhanXet;
    Scanner S = new Scanner(System.in);



    public TvHoiDong(){

    }
    public TvHoiDong(String hoTen, String hocHam, String hocVi, String nhiemVu){
        this.hoTen = hoTen;
        this.hocHam = hocHam;
        this.hocVi = hocVi;
        this.nhiemVu = nhiemVu;
    }
    public void nhapThanhVien() {
        System.out.print("Nhập họ và tên: ");
        hoTen = S.nextLine();
        System.out.print("Nhập học hàm: ");
        hocHam = S.nextLine();
        System.out.print("Nhập học vị: ");
        hocVi = S.nextLine();
        System.out.print("Nhập nhiệm vụ: ");
        nhiemVu = S.nextLine();
    }
    public void  xuatThanhVien() {
        System.out.printf("Họ và tên: %s\n Học Hàm: %s\n Học Vị: %s\n Nhiệm vụ: %s\n",
                this.hoTen, this.hocHam, this.hocVi, this.nhiemVu);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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
