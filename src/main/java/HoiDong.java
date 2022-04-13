//import java.util.ArrayList;
//import java.util.Scanner;
//
//public class HoiDong {
////    public TvHoiDong[] thanhVienHoiDong;
//
//    public ArrayList<TvHoiDong>  Hoidongs = new ArrayList<>();
//    Scanner input = new Scanner(System.in);
//    public ArrayList<TvHoiDong> getHoidongs() {
//        return Hoidongs;
//    }
//
//    public void themThanhVienHoiDong(){
//        int n;
//        System.out.println("Nhập số thành viên cần thêm: ");
//        n = Integer.parseInt(input.nextLine());
//        if (n >=3 && n <=5) {
//            for (int i=0;i<n;i++) {
//                System.out.printf("Nhập thành viên thu %d\n", i + 1);
//                TvHoiDong hd = new TvHoiDong();
////                hd.nhapThanhVienHoiDon();
//                getHoidongs().add(hd);
//                System.out.println("Them thanh cong\n");
//            }
//        } else {
//            System.out.println("Nhập sai số lượng thành viên hội đồng");
//        }
//    }
//    public void showThanhVienHoiDong() {
//        for (TvHoiDong hd: this.getHoidongs())
////            hd.xuatThanhVienHoiDong();
//
//        System.out.println();
//    }
//    public void add(TvHoiDong hd) {
//        this.getHoidongs().add(hd);
//    }
//
//    public void setHoidongs(ArrayList<TvHoiDong> hoidongs) {
//        Hoidongs = hoidongs;
//    }
//}
