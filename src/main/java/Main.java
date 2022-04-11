import java.text.ParseException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParseException {

        DanhSachBaoCao baoCaos = new DanhSachBaoCao();
        HoiDong hoiDongs = new HoiDong();
        BaoCaoDoAn bcda = new BaoCaoDoAn();
        BaoCaoKhoaLuan bckl = new BaoCaoKhoaLuan();
        BaoCaoThucTap bctt = new BaoCaoThucTap();
        int chon;
        Scanner input = new Scanner(System.in);
        BaoCao b1 = new BaoCao("TT001","Thuc Tap 1","abc.com","4-1-2002","Nguyễn Đức Hưng","Dương Hữu Thành",8.5);
        BaoCao b2 = new BaoCao("TT002","Thuc Tap 2","def.com","5-9-2002","Nguyễn Hồ Long","Dương Hữu Thành",10);
        BaoCao b3 = new BaoCao("TT003","Thuc Tap 3","ghc.com","30-4-2022","abcdcscds","Dương Hữu Thành",7.5);
        BaoCao b4 = new BaoCao("DA001", "Do An 1", "ccd.com", "20-6-2022", "owroriw", "Dương Hữu Thành", 5);
        BaoCao b5 = new BaoCao("DA002", "Do An 2", "oop.com", "9-4-2022", "Mai Thanh Binh", "Dương Hữu Thành", 10);
        BaoCao b6 = new BaoCao("KL001", "Khoa Luan 1", "uuu.com", "11-3-2022", "Lee Tien Hung", "Dương Hữu Thành", 8);
        BaoCao b7 = new BaoCao("KL002", "Khoa Luan 2", "qqq.com", "3-5-2020", "Nam", "Dương Hữu Thành", 5);
        baoCaos.add(b1);
        baoCaos.add(b2);
        baoCaos.add(b3);
        baoCaos.add(b4);
        baoCaos.add(b5);
        baoCaos.add(b6);
        baoCaos.add(b7);

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
                            bcda.nhap();
                            baoCaos.add(bcda);
                            System.out.println("Thêm thành công");
                        }
                        case 2 -> {
                            bckl.nhap();
                            baoCaos.add(bckl);
                            System.out.println("Thêm thành công");
                        }
                        case 3 -> {
                            bctt.nhap();
                            baoCaos.add(bctt);
                            System.out.println("Thêm thành công");
                        }
                    }
                }
                case 2 -> {
                    System.out.println("Xoa bao cao");
                    baoCaos.xoaBaoCao();
                }
                case 3 -> {
                    System.out.println("========== Các loại danh sách báo cáo ==========");
                    baoCaos.showList();
                }
                case 4 -> {
                    System.out.println("Sửa thông tin báo cáo");
//                    System.out.println("Chọn mã báo cáo muốn sửa: ");
//                    String s = input.nextLine();
//                    for(BaoCao b: baoCaos.getBaoCaos())
//                        if(s.equals(baoCaos.getBaoCaos()))
//                    baoCaos.suaMaBaoCao();
                    System.out.print("Nhập mã báo cáo muốn sửa: ");
                    String s = input.nextLine();
                    System.out.println(baoCaos.getBaoCaos());
//                    if (baoCaos.getBaoCaos().equals(s)) {
//                        showMenuSuaBaoCao();
//                        int a = input.nextInt();
//                        while(a >= 1 && a <= 9) {
//                            if (a == 1) {
//                                System.out.println("Sửa mã báo cáo: ");
////                                baoCaos.suaMaBaoCao();
//                                break;
//                            } else if (a == 2) {
//                                System.out.println("Sửa tên báo cáo");
//                                baoCaos.suaTenBaoCao();
//                                break;
//                            } else if (a == 3) {
//                                System.out.println("Sửa link báo cáo");
//                                baoCaos.suaLinkBaoCao();
//                                break;
//                            } else if (a == 4) {
//                                System.out.println("Sửa ngày báo cáo");
//                                baoCaos.suaNgayBaoCao();
//                                break;
//                            } else if (a == 5) {
//                                System.out.println("Sửa danh sách sinh viên báo cáo");
//                                baoCaos.suaDanhSachSinhVienThucHien();
//                                break;
//                            } else if (a == 6) {
//                                System.out.println("Sửa tên giảng viên");
//                                baoCaos.suaTenGiangVien();
//                                break;
//                            } else if (a == 7) {
//                                System.out.println("Sửa điểm báo cáo");
//                                baoCaos.suaDiemBaoCao();
//                                break;
//                            } else {
//                                System.out.println("Ban chon thoat");
//                                break;
//                            }
//                        }
//                    }
                }
                case 5 -> {
                    System.out.println("Nhập thành viên hội đồng");
                    System.out.println(baoCaos.getBaoCaos());
                }
                case 6 -> {
                    System.out.println("Xuất thành viên hội đồng");
                    hoiDongs.showThanhVienHoiDong();
                }
            }
        } while (chon >= 1 && chon <=8);

    }


    static void showMenu() {
        System.out.println("========== MENU ==========");
        System.out.println("1. Thêm báo cáo mới");
        System.out.println("2. Xóa báo cáo");
        System.out.println("3. Xem danh sách báo cáo");
        System.out.println("4. Sửa báo cáo");
        System.out.println("5. Thêm thành viên hội đồng");
        System.out.println("6. Xuất thành viên hội đồng");
    }
    static void showMenuBaoCao() {
        System.out.println("1. Thêm báo cáo Đồ Án");
        System.out.println("2. Thêm báo cáo Khóa Luận");
        System.out.println("3. Thêm báo cáo Thực tập");
    }
    static void showMenuDSBaoCao() {
        System.out.println("1. Báo cáo Đồ Án");
        System.out.println("2. Báo cáo Khóa Luận");
        System.out.println("3. Báo cáo Thực tập");
    }
    static void showMenuSuaBaoCao() {
        System.out.println("1. Sửa mã báo cáo");
        System.out.println("2. Sửa tên báo cáo");
        System.out.println("3. Sửa link báo cáo");
        System.out.println("4. Sửa ngày báo cáo");
        System.out.println("5. Sửa danh sách sinh viên thực hiện báo cáo");
        System.out.println("6. Sửa tên giảng viên");
        System.out.println("7. Sửa điểm báo cáo");
    }
}
