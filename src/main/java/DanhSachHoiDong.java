import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachHoiDong {
    public ArrayList<TvHoiDong>  hoiDongs = new ArrayList<>(5);
    public BaoCaoKhoaLuan bckl = new BaoCaoKhoaLuan();
    Scanner input = new Scanner(System.in);

    public  void themThanhVienHoiDong(){
        int temp = hoiDongs.size();
        if (temp == 0) {
            System.out.print("Nhập số thành viên hội đồng muốn thêm, tối thiểu là 3 và tối đa là 5 thành viên: ");
        } else {
            System.out.printf("Hiện tại đã có %d thành viên, chỉ được thêm %d thành viên, nhập số thành viên cần thêm: ", temp, 5-temp);
        }
        int n = Integer.parseInt(String.valueOf(input.nextInt()));
        String a = "chủ tịch hội đồng", b = "thư ký", c ="giảng viên phản biện", d = "ủy viên hội đồng";
        int a1=0, b1=0, c1=0, d1=0;
        int fails = 0;
        if (( (temp < 3) && (n>=3 && n<=5)) || ((temp >=3 && temp<=5) && (n<=(5-temp)))) {
            for (int i = 0; i < n; i++){
                if (temp >= 3) {
                    System.out.printf("Nhập thành viên hội đồng thứ %d\n", temp + 1);
                } else  {
                    System.out.printf("Nhập thành viên hội đồng thứ %d\n", i + 1);
                }
                TvHoiDong e = new TvHoiDong();
                e.nhapThanhVien();
                if (!e.nhiemVu.equalsIgnoreCase(a) && !e.nhiemVu.equalsIgnoreCase(b) && !e.nhiemVu.equalsIgnoreCase(c) && !e.nhiemVu.equalsIgnoreCase(d)){
                    System.out.println("Nhập sai nhiệm vụ");
                    fails += 1;
                    break;
                } else {
                    hoiDongs.add(e);
                    temp += 1;
                }
            }
            hoiDongs.trimToSize();
            for(TvHoiDong tv: this.hoiDongs) {
                if (tv.nhiemVu.equalsIgnoreCase(a)){
                    a1 += 1;
                } else if (tv.nhiemVu.equalsIgnoreCase(b)) {
                    b1 += 1;
                }
            }
            if(a1 == 0 || b1 == 0){
                System.out.println("Yêu cầu phải có ít nhất một chủ tịch hội đồng và và  một thư ký");
                hoiDongs.clear();
            }
            if (fails == 0) {
                System.out.println("Thêm thành công");
            } else {
                System.out.println("Thêm thất bại");
            }

        } else if (temp == 5) {
            System.out.println("Hội đồng đã đủ thành viên");
        } else {
            System.out.println("Nhập sai số lượng thành viên hội đồng");
        }
    }

    public void xuatThanhVienHoiDong(){
        if(!hoiDongs.isEmpty()) {
            for(TvHoiDong b: this.hoiDongs){
                b.xuatThanhVien();
            }
        }
        if(bckl.listTV.isEmpty()) {
            System.out.println("Chưa tạo hội đồng, hãy thêm thành viên hội đồng để chấm điểm");
        }
    }




    public ArrayList<TvHoiDong> getHoiDongs() {
        return hoiDongs;
    }

    public void setHoiDongs(ArrayList<TvHoiDong> hoiDongs) {
        this.hoiDongs = hoiDongs;
    }
}
