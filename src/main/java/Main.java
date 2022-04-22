import java.io.FileNotFoundException;
import java.text.ParseException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        SinhVien sv;
        BaoCao bc;
        DanhSachSinhVien sinhViens = new DanhSachSinhVien();
        DanhSachBaoCao baoCaos = new DanhSachBaoCao();
        DanhSachHoiDong hoiDongs = new DanhSachHoiDong();
        sinhViens.read();

        SinhVien b11 = new SinhVien("Nguyễn Văn An",2020, "Nam", 2002, "CS" );
        SinhVien b12 = new SinhVien("Lê Gia Huy",1999, "Nam", 2001, "IT" );
        sinhViens.themSinhVien(b11);
        sinhViens.themSinhVien(b12);
        BaoCao b1 = new BaoCaoThucTap("TT001", "Thuc tap 01", "tt01.com", "4-1-2020", new ArrayList<>(sinhViens.getSinhViens().subList(1,2)), "Dương Hữu Thành", 8.5, "Amazing");
        BaoCao b2 = new BaoCaoThucTap("TT002", "Thuc tap 02", "tt02.com", "5-9-2018", new ArrayList<>(sinhViens.getSinhViens().subList(2,3)), "Dương Hữu Thành", 10, "Good jobs");
        BaoCao b3 = new BaoCaoDoAn("DA001", "Do an 01", "da01.com", "20-6-2029", new ArrayList<>(sinhViens.getSinhViens().subList(3,4)), "Dương Hữu Thành", 5, 0.1);
        BaoCao b4 = new BaoCaoDoAn("DA002", "Do an 02", "da02.com", "9-4-2022", new ArrayList<>(sinhViens.getSinhViens().subList(4,5)), "Dương Hữu Thành", 9, 0.5);
        BaoCao b5 = new BaoCaoKhoaLuan("KL001", "Khoa luan 01", "kl01.com", "11-3-2015",new ArrayList<>(sinhViens.getSinhViens().subList(1,3)), "Dương Hữu Thành", 0, 0.3);
        BaoCao b6 = new BaoCaoKhoaLuan("KL002", "Khoa luan 02", "kl02.com", "3-5-2021",new ArrayList<>(sinhViens.getSinhViens().subList(0,1)) , "Dương Hữu Thành", 0, 0.15);
        TvHoiDong b8 = new TvHoiDong("Nguyễn Hồ Long", "Giáo sư", "Tiến sĩ", "Chủ tịch hội đồng");
        TvHoiDong b9 = new TvHoiDong("Nguyễn Văn Doanh", "acsac", "Thạc sĩ", "Thư ký");
        TvHoiDong b10 = new TvHoiDong("Hồ Thị Tuyết", "sdadasda", "Thạc sĩ", "Thư ký");

        baoCaos.themBaoCao(b1);
        baoCaos.themBaoCao(b2);
        baoCaos.themBaoCao(b3);
        baoCaos.themBaoCao(b4);
        baoCaos.themBaoCao(b5);
        baoCaos.themBaoCao(b6);
        hoiDongs.getHoiDongs().add(b8);
        hoiDongs.getHoiDongs().add(b9);
        hoiDongs.getHoiDongs().add(b10);
        hoiDongs.bckl.listTV.add(b8);
        hoiDongs.bckl.listTV.add(b9);
        hoiDongs.bckl.listTV.add(b10);

        int chon;
        do {
            showMenu();
            System.out.print("Lựa chọn của bạn(chọn 0 để thoát): ");
            chon = Integer.parseInt(BaoCao.s.nextLine().trim());
            switch (chon) {
                case 1 -> {

                    showMenuBaoCao();
                    System.out.print("Chọn loại báo cáo muốn thêm: ");
                    int choose = Integer.parseInt(BaoCao.s.nextLine());
                    switch (choose) {
                        case 1 -> {
                            System.out.println("=========== Thêm báo cáo Đồ Án ===========");
                            bc = new BaoCaoDoAn();
                            bc.nhap();
                            if (baoCaos.checkMaBaoCao(bc.getMaBaoCao()) != 1 && bc.getMaBaoCao().startsWith("DA")) {
                                baoCaos.themBaoCao(bc);
                                System.out.println("Thêm thành công");
                            } else {
                                System.out.println("Bạn đã nhập trùng hoặc nhập không đúng mã báo cáo");
                            }
                        }
                        case 2 -> {
                            System.out.println("=========== Thêm báo cáo khóa luận ===========");
                            bc = new BaoCaoKhoaLuan();
                            bc.nhap();
                            if (baoCaos.checkMaBaoCao(bc.getMaBaoCao()) != 1 && bc.getMaBaoCao().startsWith("KL")) {
                                baoCaos.themBaoCao(bc);
                                System.out.println("Thêm thành công");
                            } else {
                                System.out.println("Bạn đã nhập trùng hoặc nhập không đúng mã báo cáo");
                            }
                        }
                        case 3 -> {
                            System.out.println("=========== Thêm báo cáo thực tập ===========");
                            bc = new BaoCaoThucTap();
                            bc.nhap();
                            if(baoCaos.checkMaBaoCao(bc.getMaBaoCao()) != 1 && bc.getMaBaoCao().startsWith("TT")) {
                                baoCaos.themBaoCao(bc);
                                System.out.println("Thêm thành công");
                            } else {
                                System.out.println("Bạn đã nhập trùng hoặc nhập không đúng mã báo cáo");
                            }
                        }
                    }
                }
                case 2 -> {
                    System.out.println("========== Xóa báo cáo =============");
                    baoCaos.xoaBaoCao();
                }
                case 3 -> {
                    System.out.println("========== Các loại danh sách báo cáo ==========");
                    baoCaos.showList();
                }
                case 4 -> {
                    showMenuBaoCao();
                    System.out.print("Chọn loại báo cáo muốn sửa: ");
                    int a = Integer.parseInt(BaoCao.s.nextLine());
                    switch (a) {
                        case 1 -> baoCaos.suaThongTinDoAn();

                        case 2 -> baoCaos.suaThongTinKhoaLuan();

                        case 3 -> baoCaos.suaThongTinThucTap();
                    }
                }
                case 5 -> {
                    System.out.println("=========== Nhập thành viên hội đồng =============");
                    if (hoiDongs.getHoiDongs().size() >= 1 || hoiDongs.getHoiDongs().size() <=5) {
                        hoiDongs.themThanhVienHoiDong();
                    } else {
                        System.out.println("Đã thành lập hội đồng");
                    }
                }
                case 6 -> {
                    System.out.println("============ Xuất thành viên hội đồng =============");
                    hoiDongs.xuatThanhVienHoiDong();
                }
                case 7 -> {
                    System.out.println("=========== Chấm điểm cho báo cáo khóa luận ============");
                    BaoCaoKhoaLuan x = null;
                    x = (BaoCaoKhoaLuan) baoCaos.timBaoCao();
                    if (x != null) {
                        int n = 0;
                        double diemTong = 0,  diemTongKet , avg ;
                        if (hoiDongs.getHoiDongs().isEmpty()) {
                            System.out.println("Cần thành lập hội đồng trước khi chấm điểm");
                            break;
                        }
                        for (TvHoiDong b : hoiDongs.getHoiDongs()) {
                            System.out.printf("========== %s %s =========== ", b.nhiemVu, b.hoTen);
                            System.out.print("Nhập điểm: ");
                            b.diem = Double.parseDouble(BaoCao.s.nextLine());
                            System.out.print("Nhập nhận xét: ");
                            b.nhanXet = BaoCao.s.nextLine();
                            x.getNhanXet().add(b.nhanXet);
                            n = n + 1;
                            diemTong += b.diem;
                            diemTongKet = diemTong / n;
                            avg = diemTongKet;
                            x.setDiemBaoCao(avg);
                            x.getTen().add(b.hoTen);
                            x.getListTV().add(b);
                        }
                    } else {
                        System.out.println("Không tìm thấy báo cáo để chấm điểm");
                    }
                }
                case 8 -> {
                    showMenuSapXep();
                    System.out.print("Chọn cách sắp xếp báo cáo: ");
                    int a = Integer.parseInt(BaoCao.s.nextLine());
                    switch (a) {
                        case 1 -> {
                            baoCaos.sortByName();
                            System.out.println("Đã sắp xếp");
                        }
                        case 2 -> {
                            baoCaos.sortByDate();
                            System.out.println("Đã sắp xếp");
                        }
                        case 3 -> baoCaos.sortAndFilterByName();
                        case 4 -> baoCaos.sortAndFilterByDate();
                    }
                }
                case 9 -> {
                    showMenuTimKiem();
                    System.out.print("Chọn kiểu tìm kiếm: ");
                    int a = Integer.parseInt(BaoCao.s.nextLine());
                    switch (a) {
                        case 1 -> baoCaos.timTheoTen();
                        case 2 -> baoCaos.timTheoNgay();
                    }
                }
                case 10 -> {
                    System.out.println("===========Thêm sinh viên===========");
                    System.out.print("Nhập số sinh viên muốn thêm: ");
                    int num = Integer.parseInt(BaoCao.s.nextLine());
                    if (num > 0) {
                        for (int i = 1 ;i <= num; i++) {
                            System.out.printf("=======  Nhập sinh viên thứ %d\n", i);
                            sv = new SinhVien();
                            sv.nhap();
                            if(sinhViens.checkMaBaoCao(sv.getMssv()) != 1 && sv.getMssv().startsWith("SV")) {
                                sinhViens.themSinhVien(sv);
                                System.out.println("========== Thêm sinh viên thành công ==========");
                            } else {
                                System.out.println("Bạn đã nhập trùng mã hoặc không đúng mã sinh viên");
                            }
                        }
                    }
                }
                case 11 -> {
                    System.out.println("==============Danh sách sinh viên=================");
                    sinhViens.hienThi();
                }
            }
        } while (chon >= 1 && chon <= 11);
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
        System.out.println("9. Tìm kiếm");
        System.out.println("10. Thêm sinh viên");
        System.out.println("11. Xuất danh sách sinh viên");
    }
    static void showMenuBaoCao() {
        System.out.println("========= Các loại báo cáo =========");
        System.out.println("1. Thêm báo cáo Đồ Án");
        System.out.println("2. Thêm báo cáo Khóa Luận");
        System.out.println("3. Thêm báo cáo Thực Tập");
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
    static void showMenuTimKiem() {
        System.out.println("=========== Menu tìm kiếm báo cáo ===========");
        System.out.println("1. Tìm kiếm theo tên");
        System.out.println("2. Tìm kiếm theo ngày");
    }
}
