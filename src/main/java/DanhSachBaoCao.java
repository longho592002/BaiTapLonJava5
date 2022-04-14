import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachBaoCao {
    public ArrayList<BaoCao> baoCaos = new ArrayList<>();
    public static SimpleDateFormat F = new SimpleDateFormat("dd-MM-yyyy");
    Scanner input = new Scanner(System.in);
    // getter setter
    public ArrayList<BaoCao> getBaoCaos() {
        return baoCaos;
    }

    public void add(BaoCao b) {
        this.getBaoCaos().add(b);
    }


// Kiểm tra trùng lặp mã
    public int checkMa(String a){
        int check = 0;
        for(BaoCao b: this.getBaoCaos()){
            String maBaoCao = b.getMaBaoCao();
           if (maBaoCao.equalsIgnoreCase(a)) {
                check = 1;
               break;
           } else {
               check = 2;
           }
        }
        return check;
    }

//    public void them() throws ParseException {
//        int n;
//        System.out.println("Nhập số báo cáo cần thêm: ");
//        n = Integer.parseInt(input.nextLine());
//        for (int i=0;i<n;i++) {
//            System.out.printf("Nhap bao cao thu %d\n", i + 1);
//            BaoCao b = new BaoCao();
//            b.nhap();
//            if (!getBaoCaos().contains(b.maBaoCao)) {
//                getBaoCaos().add(b);
//                System.out.println("Them thanh cong\n");
//            }
//        }
//    }
    public void showList() {
        System.out.println("Hai chữ cái đầu tiên của mã báo cáo là viết tắt tên loại báo cáo");
        System.out.println("Ví dụ muốn xem danh sách đồ án ta nhập 2 chữ cái \"DA\"");
        System.out.print("Nhập loại báo cáo muốn xem: ");
        String s = input.nextLine();

        for (BaoCao b: this.getBaoCaos() ){
            if (b.getMaBaoCao().startsWith(s)){
                b.xuat();
            }
        }
    }


//    public void suaThongTinKhoaLuan() throws ParseException {
//        BaoCaoKhoaLuan tam = null;
//        tam = (BaoCaoKhoaLuan) timBaoCao();
//        if(tam != null) {
//            Main.showMenuSuaBaoCao();
//            System.out.print("Nhập thông tin muốn sửa: ");
//            String a = input.nextLine();
//            switch (a) {
//                case "1" -> {
//                    System.out.print("Nhập mã báo cáo: ");
//                    tam.maBaoCao = input.nextLine();
//                }
//                case "2" -> {
//                    System.out.print("Nhập tên báo cáo: ");
//                    tam.tenBaoCao = input.nextLine();
//                }
//                case "3" -> {
//                    System.out.print("Nhập link báo cáo: ");
//                    tam.linkBaoCao = input.nextLine();
//                }
//                case "4" -> {
//                    System.out.print("Nhập ngày báo cáo: ");
//                    tam.ngayBaoCao = F.parse(input.nextLine());
//                }
//                case "5" -> {
//                    System.out.print("Nhập danh sách sinh viên thực hiện báo cáo: ");
//                    tam.dsSinhVien = input.nextLine();
//                }
//                case "6" -> {
//                    System.out.print("Nhập tên giảng viên: ");
//                    tam.tenGiangVien = input.nextLine();
//                }
//                case "7" -> {
//                    System.out.print("Nhập điểm báo cáo: ");
//                    tam.diemBaoCao = input.nextDouble();
//                }
//                case "8" -> {
//                    System.out.println("Nhập tỷ lệ đạo văn: ");
//                    tam.tyLeDaoVan = input.nextDouble();
//                }
//            }
//        } else {
//            System.out.println("Không tìm thấy báo cáo để sửa");
//        }
//    }
//    public void suaThongTinDoAn() throws ParseException {
//        BaoCaoDoAn tam = null;
//        tam = (BaoCaoDoAn) timBaoCao();
//        if(tam != null) {
//            Main.showMenuSuaBaoCao();
//            System.out.print("Nhập thông tin muốn sửa: ");
//            String a = input.nextLine();
//            switch (a) {
//                case "1" -> {
//                    System.out.print("Nhập mã báo cáo: ");
//                    tam.maBaoCao = input.nextLine();
//                }
//                case "2" -> {
//                    System.out.print("Nhập tên báo cáo: ");
//                    tam.tenBaoCao = input.nextLine();
//                }
//                case "3" -> {
//                    System.out.print("Nhập link báo cáo: ");
//                    tam.linkBaoCao = input.nextLine();
//                }
//                case "4" -> {
//                    System.out.print("Nhập ngày báo cáo: ");
//                    tam.ngayBaoCao = F.parse(input.nextLine());
//                }
//                case "5" -> {
//                    System.out.print("Nhập danh sách sinh viên thực hiện báo cáo: ");
//                    tam.dsSinhVien = input.nextLine();
//                }
//                case "6" -> {
//                    System.out.print("Nhập tên giảng viên: ");
//                    tam.tenGiangVien = input.nextLine();
//                }
//                case "7" -> {
//                    System.out.print("Nhập điểm báo cáo: ");
//                    tam.diemBaoCao = input.nextDouble();
//                }
//                case "8" -> {
//                    System.out.println("Nhập tỷ lệ đạo văn: ");
//                    tam.getTyLeDaoVan() = input.nextDouble();
//                }
//            }
//        } else {
//            System.out.println("Không tìm thấy báo cáo để sửa");
//        }
//    }
//    public void suaThongTinThucTap() throws ParseException {
//        BaoCaoThucTap tam = null;
//        tam = (BaoCaoThucTap) timBaoCao();
//        if(tam != null) {
//            Main.showMenuSuaBaoCao();
//            System.out.print("Nhập thông tin muốn sửa: ");
//            String a = input.nextLine();
//            switch (a) {
//                case "1" -> {
//                    System.out.print("Nhập mã báo cáo: ");
//                    tam.maBaoCao = input.nextLine();
//                }
//                case "2" -> {
//                    System.out.print("Nhập tên báo cáo: ");
//                    tam.tenBaoCao = input.nextLine();
//                }
//                case "3" -> {
//                    System.out.print("Nhập link báo cáo: ");
//                    tam.linkBaoCao = input.nextLine();
//                }
//                case "4" -> {
//                    System.out.print("Nhập ngày báo cáo: ");
//                    tam.ngayBaoCao = F.parse(input.nextLine());
//                }
//                case "5" -> {
//                    System.out.print("Nhập danh sách sinh viên thực hiện báo cáo: ");
//                    tam.dsSinhVien = input.nextLine();
//                }
//                case "6" -> {
//                    System.out.print("Nhập tên giảng viên: ");
//                    tam.tenGiangVien = input.nextLine();
//                }
//                case "7" -> {
//                    System.out.print("Nhập điểm báo cáo: ");
//                    tam.diemBaoCao = input.nextDouble();
//                }
//                case "8" -> {
//                    System.out.println("Nhập tỷ lệ đạo văn: ");
//                    tam.thongTinDanhGia = input.nextLine();
//                }
//            }
//        } else {
//            System.out.println("Không tìm thấy báo cáo để sửa");
//        }
//
//    }
//
//
//
//
////    Tìm báo cáo
//    public BaoCao timBaoCao(){
//        System.out.print("Nhập mã báo cáo cần tìm: ");
//        String ma = input.nextLine();
//        BaoCao tim = null;
//        for(BaoCao b: this.getBaoCaos()) {
//            if(b.maBaoCao.contains(ma)){
//                tim = b;
//                break;
//            }
//        }
////        if(tim!=null) {
////            System.out.println("Báo cáo bạn cần tìm: ");
////            tim.xuat();
////        } else {
////            System.out.println("Không tìm thấy báo cáo");
////        }
//        return tim;
//    }
//
//
//
//    // xóa báo cáo
    public void xoaBaoCao() {
        String s;
        System.out.print("Nhập mã báo cáo muốn xóa: ");
        s = input.nextLine();
        for (BaoCao b: this.getBaoCaos())
            if(s.equals(b.getMaBaoCao())) {
                this.getBaoCaos().remove(b);
                System.out.println("Xoa thanh cong");
                break;
            }
            else {
                System.out.println("Xoa khong thanh cong");
            }
    }

    public void setBaoCaos(ArrayList<BaoCao> baoCaos) {
        this.baoCaos = baoCaos;
    }
}
