import java.io.IOException;
import java.lang.ref.Cleaner;
import java.text.ParseException;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws ParseException, IOException {

        DanhSachBaoCao baoCaos = new DanhSachBaoCao();
        HoiDong hoiDongs = new HoiDong();
        int chon;
        Scanner input = new Scanner(System.in);
        BaoCao b1 = new BaoCao("TT001","Thuc Tap 1","abc.com","4-1-2002","Nguyễn Đức Hưng","Dương Hữu Thành",8.5);
        BaoCao b2 = new BaoCao("TT002","Thuc Tap 2","def.com","5-9-2002","Nguyễn Hồ Long","Dương Hữu Thành",10);
        BaoCao b3 = new BaoCao("TT003","Thuc Tap 3","ghc.com","30-4-2022","abcdcscds","Dương Hữu Thành",7.5);
        baoCaos.add(b1);
        baoCaos.add(b2);
        baoCaos.add(b3);


        do {
            showMenu();
            System.out.print("Bạn chọn: ");
            chon = input.nextInt();
            switch (chon) {
                case 1:
                    System.out.println("Them bao cao");
                    showMenuBaoCao();
                    int choose = input.nextInt();
                    while(choose >= 1 && choose <=3){
                        if(choose == 1){
                            System.out.println("Them báo cáo đồ án");
                            break;
                        }
                        else if (choose ==2 ){
                            System.out.println("Them báo cáo khóa luận");
                            break;
                        }
                        else if (choose == 3){
                            System.out.println("Them báo cáo thực tập");
                            baoCaos.them();
                            break;
                        }
                        else {
                            System.out.println("Ban chon thoat");
                            break;
                        }
                    }
//                     for (int i = 0; i < 44; ++i) System.out.println();

                    break;
                case 2:
                    System.out.println("Xoa bao cao");
                    baoCaos.xoaBaoCao();
                    break;
                case 3:
                    System.out.println("Xem danh sach bao cao");
                    baoCaos.showList();
                    break;
                case 4:
                    System.out.println("Sua thong tin bao cao");
//                    System.out.println("Chọn mã báo cáo muốn sửa: ");
//                    String s = input.nextLine();
//                    for(BaoCao b: baoCaos.getBaoCaos())
//                        if(s.equals(baoCaos.getBaoCaos()))
//                    baoCaos.suaMaBaoCao();
                    System.out.print("Nhập mã báo cáo muốn sửa: ");
                    String s = input.nextLine();
                    baoCaos.getBaoCao();
                    if (baoCaos.getBaoCaos().equals(s)){
                        showMenuSuaBaoCao();
                        int a = input.nextInt();
                        while(a >= 1 && a <=9){
                            if(a == 1){
                                System.out.println("Sửa mã báo cáo: ");
//                                baoCaos.suaMaBaoCao();
                                break;
                            }
                            else if (a ==2 ){
                                System.out.println("Sửa tên báo cáo");
                                baoCaos.suaTenBaoCao();
                                break;
                            }
                            else if (a == 3){
                                System.out.println("Sửa link báo cáo");
                                baoCaos.suaLinkBaoCao();
                                break;
                            }
                            else if (a == 4){
                                System.out.println("Sửa ngày báo cáo");
                                baoCaos.suaNgayBaoCao();
                                break;
                            }
                            else if (a == 5){
                                System.out.println("Sửa danh sách sinh viên báo cáo");
                                baoCaos.suaDanhSachSinhVienThucHien();
                                break;
                            }
                            else if (a == 6){
                                System.out.println("Sửa tên giảng viên");
                                baoCaos.suaTenGiangVien();
                                break;
                            }
                            else if (a == 7){
                                System.out.println("Sửa điểm báo cáo");
                                baoCaos.suaDiemBaoCao();
                                break;
                            }

                            else {
                                System.out.println("Ban chon thoat");
                                break;
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.println("Nhập thành viên hội đồng");
                    System.out.println(baoCaos.getBaoCaos());
                    break;
                case 6:
                    System.out.println("Xuất thành viên hội đồng");
                    hoiDongs.showThanhVienHoiDong();
                    break;
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
