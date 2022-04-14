import java.text.ParseException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParseException {

        DanhSachBaoCao baoCaos = new DanhSachBaoCao();
        DanhSachHoiDong hoiDongs = new DanhSachHoiDong();
        DiemCuaHoiDong diems = new DiemCuaHoiDong();
//        HoiDong hoiDongs = new HoiDong();
        BaoCaoDoAn bcda = new BaoCaoDoAn();
        BaoCaoKhoaLuan bckl = new BaoCaoKhoaLuan();
        BaoCaoThucTap bctt = new BaoCaoThucTap();
        int chon;
        Scanner input = new Scanner(System.in);
        BaoCaoThucTap b1 = new BaoCaoThucTap("TT001","Thuc Tap 1","abc.com","4-1-2002","Nguyễn Đức Hưng","Dương Hữu Thành",8.5, "Amazing");
        BaoCaoThucTap b2 = new BaoCaoThucTap("TT002","Thuc Tap 2","def.com","5-9-2002","Nguyễn Hồ Long","Dương Hữu Thành",10, "good jobs");
        BaoCaoThucTap b3 = new BaoCaoThucTap("TT003","Thuc Tap 3","ghc.com","30-4-2022","abcdcscds","Dương Hữu Thành",7.5, "Excelent");
        BaoCaoDoAn b4 = new BaoCaoDoAn("DA001", "Do An 1", "ccd.com", "20-6-2022", "owroriw", "Dương Hữu Thành", 10);
        BaoCaoDoAn b5 = new BaoCaoDoAn("DA002", "Do An 2", "oop.com", "9-4-2022", "Mai Thanh Binh", "Dương Hữu Thành", 1);
        BaoCaoKhoaLuan b6 = new BaoCaoKhoaLuan("KL001", "Khoa Luan 1", "uuu.com", "11-3-2022", "Lee Tien Hung", "Dương Hữu Thành", 20);
        BaoCaoKhoaLuan b7 = new BaoCaoKhoaLuan("KL002", "Khoa Luan 2", "qqq.com", "3-5-2020", "Nam", "Dương Hữu Thành", 5);
        TvHoiDong b8 = new TvHoiDong("Nguyễn Hồ Long", "Giáo Sư", "Tiến Sĩ", "chủ tịch hội đồng");
        TvHoiDong b9 = new TvHoiDong("Nguyễn Văn Doanh", "acsac", "cdscdsc", "Thư ký");
        TvHoiDong b10 = new TvHoiDong("Hồ Thị Tuyết", "sdadasda", "dsdasdas", "Thư Ký");
        baoCaos.add(b1);
        baoCaos.add(b2);
        baoCaos.add(b3);
        baoCaos.add(b4);
        baoCaos.add(b5);
        baoCaos.add(b6);
        baoCaos.add(b7);
        hoiDongs.getHoiDongs().add(b8);
        hoiDongs.getHoiDongs().add(b9);
        hoiDongs.getHoiDongs().add(b10);


        do {
            showMenu();
            System.out.print("Bạn chọn: ");
            chon = input.nextInt();
            switch (chon) {
                case 1 -> {
                    System.out.println("========= Các loại báo cáo =========");
                    showMenuBaoCao();
                    System.out.print("Chọn loại báo cáo để tạo: ");
                    int choose = input.nextInt();
                    switch (choose) {
                        case 1 -> {
                            System.out.println("=========== Thêm báo cáo Đồ Án ===========");
                            bcda.nhap();
                            if(baoCaos.checkMa(bcda.getMaBaoCao()) == 1){
                                System.out.println("Nhập trùng mã, vui lòng nhập lại");
                            } else {
                                baoCaos.add(bcda);
                                System.out.println("Thêm thành công");
                            }
                        }
                        case 2 -> {
//                            System.out.println("=========== Thêm báo cáo khóa luận ===========");
//                            bckl.nhap();
//                            if(baoCaos.checkMa(bckl.getMaBaoCao()) == 1){
//                                System.out.println("Nhập trùng mã, vui lòng nhập lại");
//                            } else {
//                                baoCaos.add(bckl);
//                                System.out.println("Thêm thành công");
//                            }
                            String a = bckl.getMaBaoCao();
                            System.out.println(a);
                        }
//                        case 3 -> {
//                            System.out.println("=========== Thêm báo cáo thực tập ===========");
//                            bctt.nhap();
//                            if(baoCaos.checkMa(bctt.maBaoCao) == 1){
//                                System.out.println("Nhập trùng mã, vui lòng nhập lại");
//                            } else {
//                                baoCaos.add(bctt);
//                                System.out.println("Thêm thành công");
//                            }
//                        }
                    }
                }
                case 2 -> {
                    System.out.println("Xoa bao cao");
//                    baoCaos.xoaBaoCao();
                }
                case 3 -> {
                    System.out.println("========== Các loại danh sách báo cáo ==========");
                    baoCaos.showList();
                }
                case 4 -> {
                    showMenuDSBaoCao();
                    System.out.println("Chọn loại báo cáo muốn sửa: ");
                    int a = input.nextInt();
//                    switch (a) {
//                        case 1 -> {
//                            baoCaos.suaThongTinDoAn();
//                        }
//                        case 2 -> {
//                            baoCaos.suaThongTinKhoaLuan();
//                        }
//                        case 3 -> {
//                            baoCaos.suaThongTinThucTap();
//                        }
//                    }

                }
                case 5 -> {
//                    System.out.println("Nhập thành viên hội đồng");
                    hoiDongs.themThanhVienHoiDong();
                }
                case 6 -> {
                    System.out.println("============ Xuất thành viên hội đồng =============");
                    hoiDongs.xuatThanhVienHoiDong();
                }
                case 7 -> {
                    System.out.println("=========== Chấm điểm cho báo cáo khóa luận ============");
                    BaoCaoKhoaLuan a =null;
//                    a = (BaoCaoKhoaLuan) baoCaos.timBaoCao();
                    if(a!=null) {
                        int n = 0;
                        double diemTong = 0, diemTongKet = 0;
                        for(TvHoiDong b: hoiDongs.getHoiDongs()) {
                            System.out.printf("========== %s %s =========== ", b.nhiemVu, b.hoTen);
                            System.out.print("Nhập điểm: ");
                            b.diem = input.nextDouble();
                            String y = input.nextLine();
                            System.out.print("Nhập nhận xét: ");
                            b.nhanXet = input.nextLine();
                            a.getNhanXet().add(b.nhanXet);
                            n = n + 1;
                            diemTong += b.diem;
                            diemTongKet = diemTong / n;
                        }
//                        a.diemBaoCao = diemTongKet;
                    }   else {
                        System.out.println("Không tìm thấy báo cáo để chấm điểm");
                    }
                }
            }
        } while (chon >= 1 && chon <=12);

    }


    static void showMenu() {
        System.out.println("========== MENU ==========");
        System.out.println("1. Thêm báo cáo mới");
        System.out.println("2. Xóa báo cáo");
        System.out.println("3. Xem danh sách báo cáo");
        System.out.println("4. Sửa báo cáo");
        System.out.println("5. Thêm thành viên hội đồng");
        System.out.println("6. Xuất thành viên hội đồng");
        System.out.println("7. Chấm điểm báo cáo khóa luận");
    }
    static void showMenuBaoCao() {
        System.out.println("1. Thêm báo cáo Đồ Án");
        System.out.println("2. Thêm báo cáo Khóa Luận");
        System.out.println("3. Thêm báo cáo Thực tập");
    }
    static void showMenuDSBaoCao() {
        System.out.println("========== Menu các loại báo cáo ==========");
        System.out.println("1. Báo cáo Đồ Án");
        System.out.println("2. Báo cáo Khóa Luận");
        System.out.println("3. Báo cáo Thực tập");
    }
    static void showMenuSuaBaoCao() {
        System.out.println("=========== Menu Sửa Thông Tin Báo Cáo =========");
        System.out.println("1. Sửa mã báo cáo");
        System.out.println("2. Sửa tên báo cáo");
        System.out.println("3. Sửa link báo cáo");
        System.out.println("4. Sửa ngày báo cáo");
        System.out.println("5. Sửa danh sách sinh viên thực hiện báo cáo");
        System.out.println("6. Sửa tên giảng viên");
        System.out.println("7. Sửa điểm báo cáo");
    }
}
