import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachSinhVien {
    private ArrayList<SinhVien> sinhViens = new ArrayList<>();

    public void themSinhVien(SinhVien s) {
        this.sinhViens.add(s);
    }

    public void hienThi() {
        this.sinhViens.forEach(s -> s.xuat());
    }

    public void read() throws FileNotFoundException {
        File f = new File("src/main/resource/sinhvien.txt");
        try (Scanner s = new Scanner(f)) {
            while (s.hasNextLine()) {
                String mssv = s.nextLine();
                String hoTen = s.nextLine();
                int khoaHoc = Integer.parseInt(s.nextLine());
                String gioiTinh = s.nextLine();
                int namSinh = Integer.parseInt(s.nextLine());
                String chuyenNganh = s.nextLine();
                sinhViens.add(new SinhVien(mssv, hoTen, khoaHoc, gioiTinh, namSinh, chuyenNganh));
            }
        }
    }

    public ArrayList<SinhVien> getSinhViens() {
        return sinhViens;
    }

    public void setSinhViens(ArrayList<SinhVien> sinhViens) {
        this.sinhViens = sinhViens;
    }
}
