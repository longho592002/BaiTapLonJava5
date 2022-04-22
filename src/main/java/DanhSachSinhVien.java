import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSinhVien {
    private static ArrayList<SinhVien> sinhViens = new ArrayList<>();

    public void themSinhVien(SinhVien s) {
        sinhViens.add(s);
    }

    public void hienThi() {
        sinhViens.forEach(SinhVien::xuat);
    }

    public void read() throws FileNotFoundException {
        File f = new File("src/main/resource/sinhvien.txt");
        try (Scanner s = new Scanner(f)) {
            while (s.hasNextLine()) {
//                String mssv = s.nextLine();
                String hoTen = s.nextLine();
                int khoaHoc = Integer.parseInt(s.nextLine());
                String gioiTinh = s.nextLine();
                int namSinh = Integer.parseInt(s.nextLine());
                String chuyenNganh = s.nextLine();
                sinhViens.add(new SinhVien( hoTen, khoaHoc, gioiTinh, namSinh, chuyenNganh));
            }
        }
    }

    // Kiểm tra trùng lặp mã sinh viên
    public int checkMaBaoCao(String a){
        int check = 0;
        for(SinhVien b: this.getSinhViens()){
            String maSinhVien = b.getMssv();
            if (maSinhVien.equalsIgnoreCase(a)) {
                check = 1;
                break;
            } else {
                check = 2;
            }
        }
        return check;
    }

    public ArrayList<SinhVien> getSinhViens() {
        return sinhViens;
    }

    public void setSinhViens(ArrayList<SinhVien> sinhViens) {
        DanhSachSinhVien.sinhViens = sinhViens;
    }
}
