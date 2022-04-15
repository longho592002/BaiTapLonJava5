import java.text.ParseException;

public class Main {
    public static void main(String[] args) throws ParseException {
        DanhSachBaoCao baoCaos = new DanhSachBaoCao();
        DanhSachHoiDong hoiDongs = new DanhSachHoiDong();
        DiemCuaHoiDong diems = new DiemCuaHoiDong();
//        HoiDong hoiDongs = new HoiDong();
        BaoCao bcda = new BaoCaoDoAn();
        BaoCao bckl = new BaoCaoKhoaLuan();
        BaoCao bctt = new BaoCaoThucTap();

        BaoCao b1 = new BaoCaoThucTap("TT001", "Duc Hung", "abc.com", "4-1-2002", "Nguyễn Đức Hưng", "Dương Hữu Thành", 8.5, "Amazing");
        BaoCao b2 = new BaoCaoThucTap("TT002", "Ho Long", "def.com", "5-9-2002", "Nguyễn Hồ Long", "Dương Hữu Thành", 10, "Good jobs");
        BaoCao b3 = new BaoCaoThucTap("TT003", "Thanh Binh", "ghc.com", "30-4-2022", "Mai Thanh Bình", "Dương Hữu Thành", 7.5, "Excellent");
        BaoCao b4 = new BaoCaoDoAn("DA001", "Truong Nguyen", "ccd.com", "20-6-2022", "Nguyễn Trường Nguyên", "Dương Hữu Thành", 5, 10);
        BaoCao b5 = new BaoCaoDoAn("DA002", "Phu Tuan", "oop.com", "9-4-2022", "Mai Thanh Bình", "Dương Hữu Thành", 5, 50);
        BaoCao b6 = new BaoCaoKhoaLuan("KL001", "Van An", "uuu.com", "11-3-2022", "Lê Tiến Hưng", "Dương Hữu Thành", 0, 30);
        BaoCao b7 = new BaoCaoKhoaLuan("KL002", "Cam Giang", "qqq.com", "3-5-2020", "Nguyễn Văn An", "Dương Hữu Thành", 0, 15);
        TvHoiDong b8 = new TvHoiDong("Nguyễn Hồ Long", "Giáo sư", "Tiến sĩ", "Chủ tịch hội đồng");
        TvHoiDong b9 = new TvHoiDong("Nguyễn Văn Doanh", "acsac", "Thạc sĩ", "Thư ký");
        TvHoiDong b10 = new TvHoiDong("Hồ Thị Tuyết", "sdadasda", "Thạc sĩ", "Thư ký");

        baoCaos.themBaoCao(b1);
        baoCaos.themBaoCao(b2);
        baoCaos.themBaoCao(b3);
        baoCaos.themBaoCao(b4);
        baoCaos.themBaoCao(b5);
        baoCaos.themBaoCao(b6);
        baoCaos.themBaoCao(b7);
        hoiDongs.getHoiDongs().add(b8);
        hoiDongs.getHoiDongs().add(b9);
        hoiDongs.getHoiDongs().add(b10);

        int chon;
        do {
            showMenu();
            System.out.print("Bạn chọn: ");
            chon = BaoCao.s.nextInt();
            switch (chon) {
                case 1 -> {
                    System.out.println("========= Các loại báo cáo =========");
                    showMenuBaoCao();
                    System.out.print("Chọn loại báo cáo để tạo: ");
                    int choose = BaoCao.s.nextInt();
                    switch (choose) {
                        case 1 -> {
                            System.out.println("=========== Thêm báo cáo Đồ Án ===========");
                            bcda.nhap();
                            if (baoCaos.checkMa(bcda.getMaBaoCao()) == 1) {
                                System.out.println("Nhập trùng mã, vui lòng nhập lại");
                            } else {
                                baoCaos.themBaoCao(bcda);
                                System.out.println("Thêm thành công");
                            }
                        }
                        case 2 -> {
                            System.out.println("=========== Thêm báo cáo khóa luận ===========");
                            bckl.nhap();
                            if (baoCaos.checkMa(bckl.getMaBaoCao()) == 1) {
                                System.out.println("Nhập trùng mã, vui lòng nhập lại");
                            } else {
                                baoCaos.themBaoCao(bckl);
                                System.out.println("Thêm thành công");
                            }
//                            ArrayList<BaoCao> a = baoCaos.getBaoCaos();
//                            BaoCao b = new BaoCao();
//                            String c = b4.getMaBaoCao();
//                            System.out.println(c);
                        }
                        case 3 -> {
                            System.out.println("=========== Thêm báo cáo thực tập ===========");
                            bctt.nhap();
                            if (baoCaos.checkMa(bctt.getMaBaoCao()) == 1) {
                                System.out.println("Nhập trùng mã, vui lòng nhập lại");
                            } else {
                                baoCaos.themBaoCao(bctt);
                                System.out.println("Thêm thành công");
                            }
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
                    showMenuDSBaoCao();
                    System.out.print("Chọn loại báo cáo muốn sửa: ");
                    int a = BaoCao.s.nextInt();
                    switch (a) {
                        case 1 -> {
                            baoCaos.suaThongTinDoAn();
                        }
                        case 2 -> {
                            baoCaos.suaThongTinKhoaLuan();
                        }
                        case 3 -> {
                            baoCaos.suaThongTinThucTap();
                        }
                    }
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
                    BaoCaoKhoaLuan a = null;
//                    a = (BaoCaoKhoaLuan) baoCaos.timBaoCao();
                    if (a != null) {
                        int n = 0;
                        double diemTong = 0, diemTongKet = 0;
                        for (TvHoiDong b : hoiDongs.getHoiDongs()) {
                            System.out.printf("========== %s %s =========== ", b.nhiemVu, b.hoTen);
                            System.out.print("Nhập điểm: ");
                            b.diem = BaoCao.s.nextDouble();
                            String y = BaoCao.s.nextLine();
                            System.out.print("Nhập nhận xét: ");
                            b.nhanXet = BaoCao.s.nextLine();
                            a.getNhanXet().add(b.nhanXet);
                            n = n + 1;
                            diemTong += b.diem;
                            diemTongKet = diemTong / n;
                        }
//                        a.diemBaoCao = diemTongKet;
                    } else {
                        System.out.println("Không tìm thấy báo cáo để chấm điểm");
                    }
                }
//                case 8 -> {
//                    showMenuSapXep();
//                    System.out.print("Chọn cách sắp xếp báo cáo: ");
//                    int a = BaoCao.s.nextInt();
//                    switch (a) {
//                        case 1:
//                            baoCaos.sortByName();
//                            break;
//                        case 2:
//                            baoCaos.sortByDate();
//                            break;
//                        case 3:
//                            showMenuDSBaoCao();
//                            int aa = BaoCao.s.nextInt();
//                            switch (aa) {
//                                case 1:
//
//                            }
//                    }
//                }
            }
        } while (chon >= 1 && chon <= 12);
    }

    static void showMenu() {
        System.out.println("========== MENU QUẢN LÝ ĐỒ ÁN SINH VIÊN ==========");
        System.out.println("1. Thêm báo cáo");
        System.out.println("2. Xóa báo cáo");
        System.out.println("3. Xem danh sách báo cáo");
        System.out.println("4. Sửa báo cáo");
        System.out.println("5. Thêm thành viên hội đồng");
        System.out.println("6. Xuất thành viên hội đồng");
        System.out.println("7. Chấm điểm báo cáo khóa luận");
        System.out.println("8. Sắp xếp danh sách báo cáo");
    }
    static void showMenuBaoCao() {
        System.out.println("1. Thêm báo cáo Đồ Án");
        System.out.println("2. Thêm báo cáo Khóa Luận");
        System.out.println("3. Thêm báo cáo Thực Tập");
    }
    static void showMenuDSBaoCao() {
        System.out.println("========== Menu các loại báo cáo ==========");
        System.out.println("1. Báo cáo Đồ Án");
        System.out.println("2. Báo cáo Khóa Luận");
        System.out.println("3. Báo cáo Thực Tập");
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
    static void showMenuSapXep() {
        System.out.println("=========== Menu sắp xếp báo cáo ===========");
        System.out.println("1. Sắp xếp theo tên");
        System.out.println("2. Sắp xếp theo ngày");
        System.out.println("3. Sắp xếp theo tên + lọc");
        System.out.println("4. Sắp xếp theo ngày + lọc");
    }
}
