import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinhVien {
    private String mssv;
    private String hoTen;
    private String khoaHoc;
    private String gioiTinh;
    private int namSinh;
    private String chuyenNganh;
    DanhSachSinhVien sVL = new DanhSachSinhVien();
    public SinhVien() {
    }

    public SinhVien(String mssv, String hoTen, String khoaHoc, String gioiTinh, int namSinh, String chuyenNganh) {
        this.mssv = mssv;
        this.hoTen = hoTen;
        this.khoaHoc = khoaHoc;
        this.gioiTinh = gioiTinh;
        this.namSinh = namSinh;
        this.chuyenNganh = chuyenNganh;
    }

//    public void read() {
//        try  {
//            File f = new File("src\\main\\java\\SinhVienList.txt");
//            Scanner s = new Scanner(f);
//            while (s.hasNextLine()) {
//                String mssv = s.nextLine();
//                String hoTen = s.nextLine();
//                String khoaHoc = s.nextLine();
//                String gioiTinh = s.nextLine();
//                int namSinh = Integer.parseInt(s.nextLine());
//                String chuyenNganh = s.nextLine();
//                System.out.printf("MSSV: %s\nHo ten: %s\nKhoa hoc: %d\nGioi tinh: %s\nNam sinh: %d\nChuyen nganh: %s\n",mssv,hoTen,khoaHoc,gioiTinh,namSinh,chuyenNganh);
//            }
//            s.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//    }

    public void xuatSVList() {
            System.out.printf("Mã số: %s\n Họ tên: %s\n Khóa học: %s\n Giới tính: %s\n Năm sinh: %d\n Chuyên ngành: %s\n", this.getMssv(), this.hoTen, this.khoaHoc,
            this.gioiTinh, this.namSinh, this.chuyenNganh);
//            System.out.println("Danh sách sinh viên trống");
    }

    public String getMssv() {
        return mssv;
    }

    public void setMssv(String mssv) {
        this.mssv = mssv;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(String khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }


}
