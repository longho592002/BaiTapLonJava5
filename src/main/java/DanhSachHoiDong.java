import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachHoiDong {
    public ArrayList<TvHoiDong>  hoiDongs = new ArrayList<>();

    Scanner input = new Scanner(System.in);

    public  void themThanhVienHoiDong(){
        int n;
        System.out.print("Nhập số thành viên hội đồng muốn thêm: ");
        n = input.nextInt();
        String a = "chủ tịch hội đồng", b = "thư ký", c ="phản biện", d = "ủy viên hội đồng";
        int a1=0, b1=0, c1=0, d1=0;
        if (n>=3 && n<=5) {
            for (int i = 0; i < n; i++){
                System.out.printf("Nhập thành viên hội đồng thứ %d\n", i + 1);
                TvHoiDong e = new TvHoiDong();
                e.nhapThanhVien();
                if (!e.nhiemVu.equalsIgnoreCase(a) && !e.nhiemVu.equalsIgnoreCase(b) && !e.nhiemVu.equalsIgnoreCase(c) && !e.nhiemVu.equalsIgnoreCase(d)){
                    System.out.println("Nhập sai nhiệm vụ");
                    break;
                } else {
                    hoiDongs.add(e);
                }
            }
        } else {
            System.out.println("Nhập sai, nhập lại");
        }
    }

    public void xuatThanhVienHoiDong(){
        for(TvHoiDong b: this.hoiDongs){
            b.xuatThanhVien();
        }
    }




    public ArrayList<TvHoiDong> getHoiDongs() {
        return hoiDongs;
    }

    public void setHoiDongs(ArrayList<TvHoiDong> hoiDongs) {
        this.hoiDongs = hoiDongs;
    }
}
