import java.text.ParseException;
import java.util.*;

public class DanhSachBaoCao {
    private List<BaoCao> baoCaos = new ArrayList<>();
    DanhSachHoiDong  hoiDongs = new DanhSachHoiDong();
    DanhSachSinhVien sinhViens = new DanhSachSinhVien();

    public void themBaoCao(BaoCao b) {
        this.baoCaos.add(b);
    }

    public void showList() {
        System.out.println("Hai chữ cái đầu tiên của mã báo cáo là viết tắt tên loại báo cáo");
        System.out.println("Ví dụ muốn xem danh sách đồ án ta nhập 2 chữ cái \"DA\"");
        System.out.print("Nhập loại báo cáo muốn xem(xem tất cả không nhập): ");
        String s = BaoCao.s.nextLine().toUpperCase().trim();
        for (BaoCao b: this.getBaoCaos()) {
            if (b.getMaBaoCao().startsWith(s)){
                b.xuat();
            }
        }
    }

    public void showList2() {
       this.baoCaos.forEach(BaoCao::xuat);
    }

    public void xoaBaoCao() {
        System.out.print("Nhập mã báo cáo muốn xóa: ");
        String str = BaoCao.s.nextLine();
        int tam = 0;
        for (BaoCao b: this.getBaoCaos()) {
            if (str.equals(b.getMaBaoCao())) {
                this.getBaoCaos().remove(b);
                System.out.println("Xóa thành công");
                tam += 1;
                break;
            }
        }
        if(tam == 0) {
            System.out.println("Xóa không thành công");
        }
    }

// Kiểm tra trùng lặp mã
    public int checkMaBaoCao(String a){
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

    public void suaThongTinKhoaLuan() throws ParseException {
        BaoCaoKhoaLuan tam = null;
        try {
            tam = (BaoCaoKhoaLuan) timBaoCao();
        } catch(Exception e) {
            System.out.println("Bạn nhập sai mã báo cáo");
        }
        if(tam != null) {
            Main.showMenuSuaBaoCao();
            System.out.print("Nhập thông tin muốn sửa: ");
            String a = BaoCao.s.nextLine();
            switch (a) {
                case "1" -> {
                    System.out.print("Nhập mã báo cáo: ");
                    tam.setMaBaoCao(BaoCao.s.nextLine());
                }
                case "2" -> {
                    System.out.print("Nhập tên báo cáo: ");
                    tam.setTenBaoCao(BaoCao.s.nextLine());
                }
                case "3" -> {
                    System.out.print("Nhập link báo cáo: ");
                    tam.setLinkBaoCao(BaoCao.s.nextLine());
                }
                case "4" -> {
                    System.out.print("Nhập ngày báo cáo: ");
                    tam.setNgayBaoCao(BaoCao.F.parse(BaoCao.s.nextLine()));
                }
                case "5" -> {
                    tam.setDsSinhVien(new ArrayList<>());
                    System.out.print("Nhập số sinh viên tham gia(tối đa 2 sinh viên): ");
                    int n = Integer.parseInt(BaoCao.s.nextLine());
                    if(n >=1 && n <= 2) {
                        System.out.println("Danh sách tên sinh viên: ");
                        for (SinhVien sv: sinhViens.getSinhViens()) {
                            System.out.println(sv.getHoTen() + " ");
                        }
                        for(int i = 1; i <= n; i++) {
                            System.out.printf("Nhập tên sinh viên tham gia thứ %d: ", i );
                            String ten = BaoCao.s.nextLine();
                            for (SinhVien sv: sinhViens.getSinhViens()) {
                                if (sv.getHoTen().contains(ten)) {
                                    tam.getDsSinhVien().add(sv);
                                }
                            }
                        }
                        System.out.println("Mở lại báo cáo để xem kết quả");
                    } else
                        System.out.println("Nhập sai số sinh viên tham gia");
                }
                case "6" -> {
                    System.out.print("Nhập tên giảng viên: ");
                    tam.setTenGiangVien(BaoCao.s.nextLine());
                }
                case "7" -> {
                    System.out.print("Nhập điểm báo cáo: ");
                    tam.setDiemBaoCao(Double.parseDouble(BaoCao.s.nextLine()));
                }
                case "8" -> {
                    System.out.println("Nhập tỷ lệ đạo văn: ");
                    tam.setTyLeDaoVan(Double.parseDouble(BaoCao.s.nextLine()));
                }
                default -> System.out.println("Nhập sai thông tin cần sửa");
            }
        } else {
            System.out.println("Không tìm thấy báo cáo để sửa");
        }
    }

    public void suaThongTinDoAn() throws ParseException {
        BaoCaoDoAn tam = null;
        try {
            tam = (BaoCaoDoAn) timBaoCao();
        } catch (Exception e) {
            System.out.println("Bạn nhập sai mã báo cáo");
        }
        if(tam != null) {
            Main.showMenuSuaBaoCao();
            System.out.print("Nhập thông tin muốn sửa: ");
            String a = BaoCao.s.nextLine();
            switch (a) {
                case "1" -> {
                    System.out.print("Nhập mã báo cáo: ");
                    tam.setMaBaoCao(BaoCao.s.nextLine());
                }
                case "2" -> {
                    System.out.print("Nhập tên báo cáo: ");
                    tam.setTenBaoCao(BaoCao.s.nextLine());
                }
                case "3" -> {
                    System.out.print("Nhập link báo cáo: ");
                    tam.setLinkBaoCao(BaoCao.s.nextLine());
                }
                case "4" -> {
                    System.out.print("Nhập ngày báo cáo: ");
                    tam.setNgayBaoCao(BaoCao.F.parse(BaoCao.s.nextLine()));
                }
                case "5" -> {
                    tam.setDsSinhVien(new ArrayList<>());
                    System.out.print("Nhập số sinh viên tham gia(tối đa 2 sinh viên): ");
                    int n = Integer.parseInt(BaoCao.s.nextLine());
                    if(n >=1 && n <= 2) {
                        System.out.println("Danh sách tên sinh viên: ");
                        for (SinhVien sv: sinhViens.getSinhViens()) {
                            System.out.println(sv.getHoTen() + " ");
                        }
                        for(int i = 1; i <= n; i++) {
                            System.out.printf("Nhập tên sinh viên tham gia thứ %d: ", i );
                            String ten = BaoCao.s.nextLine();
                            for (SinhVien sv: sinhViens.getSinhViens()) {
                                if (sv.getHoTen().contains(ten)) {
                                    tam.getDsSinhVien().add(sv);
                                }
                            }
                        }
                        System.out.println("Mở lại báo cáo để xem kết quả");
                    } else
                        System.out.println("Nhập sai số sinh viên tham gia");
                }
                case "6" -> {
                    System.out.print("Nhập tên giảng viên: ");
                    tam.setTenGiangVien(BaoCao.s.nextLine());
                }
                case "7" -> {
                    System.out.print("Nhập điểm báo cáo: ");
                    tam.setDiemBaoCao(Double.parseDouble(BaoCao.s.nextLine()));
                }
                case "8" -> {
                    System.out.println("Nhập tỷ lệ đạo văn: ");
                    tam.setTyLeDaoVan(Double.parseDouble(BaoCao.s.nextLine()));
                }
                default -> System.out.println("Nhập sai thông tin cần sửa");
            }
        } else {
            System.out.println("Không tìm thấy báo cáo để sửa");
        }
    }

    public void suaThongTinThucTap() throws ParseException {
        BaoCaoThucTap tam = null;
        try {
            tam = (BaoCaoThucTap) timBaoCao();
        } catch (Exception e) {
            System.out.println("Bạn nhập sai mã báo cáo");
        }
        if(tam != null) {
            Main.showMenuSuaBaoCao();
            System.out.print("Nhập thông tin muốn sửa: ");
            String a = BaoCao.s.nextLine();
            switch (a) {
                case "1" -> {
                    System.out.print("Nhập mã báo cáo: ");
                    tam.setMaBaoCao(BaoCao.s.nextLine());
                }
                case "2" -> {
                    System.out.print("Nhập tên báo cáo: ");
                    tam.setTenBaoCao(BaoCao.s.nextLine());
                }
                case "3" -> {
                    System.out.print("Nhập link báo cáo: ");
                    tam.setLinkBaoCao(BaoCao.s.nextLine());
                }
                case "4" -> {
                    System.out.print("Nhập ngày báo cáo: ");
                    tam.setNgayBaoCao(BaoCao.F.parse(BaoCao.s.nextLine()));
                }
                case "5" -> {
                    tam.setDsSinhVien(new ArrayList<>());
                    System.out.print("Nhập số sinh viên tham gia(tối đa 2 sinh viên): ");
                    int n = Integer.parseInt(BaoCao.s.nextLine());
                    if(n >=1 && n <= 2) {
                        System.out.println("Danh sách tên sinh viên: ");
                        for (SinhVien sv: sinhViens.getSinhViens()) {
                            System.out.println(sv.getHoTen() + " ");
                        }
                        for(int i = 1; i <= n; i++) {
                            System.out.printf("Nhập tên sinh viên tham gia thứ %d: ", i );
                            String ten = BaoCao.s.nextLine();
                            for (SinhVien sv: sinhViens.getSinhViens()) {
                                if (sv.getHoTen().contains(ten)) {
                                    tam.getDsSinhVien().add(sv);
                                }
                            }
                        }
                        System.out.println("Mở lại báo cáo để xem kết quả");
                    } else
                        System.out.println("Nhập sai số sinh viên tham gia");
                }
                case "6" -> {
                    System.out.print("Nhập tên giảng viên: ");
                    tam.setTenGiangVien(BaoCao.s.nextLine());
                }
                case "7" -> {
                    System.out.print("Nhập điểm báo cáo: ");
                    tam.setDiemBaoCao(Double.parseDouble(BaoCao.s.nextLine()));
                }
                case "8" -> {
                    System.out.print("Nhập đánh giá của doanh nghiệp: ");
                    tam.setThongTinDanhGia(BaoCao.s.nextLine());
                }
                default -> System.out.println("Nhập sai thông tin cần sửa");
            }
        } else {
            System.out.println("Không tìm thấy báo cáo để sửa");
        }

    }

//    Tìm báo cáo
    public BaoCao timBaoCao(){
        System.out.print("Nhập mã báo cáo cần tìm: ");
        String ma = BaoCao.s.nextLine().toUpperCase().trim();
        BaoCao tim = null;
        for(BaoCao b: this.getBaoCaos()) {
            if(b.getMaBaoCao().contains(ma)){
                tim = b;
                break;
            }
        }
        if (tim == null) {
            System.out.println("Nhập sai mã báo cáo");
        }
        return tim;
    }
    public BaoCao timTheoTen() {
        BaoCao bc = null;
        System.out.print("Nhập tên báo cáo cần tìm: ");
        String s = BaoCao.s.nextLine();
        for (BaoCao b: this.getBaoCaos()) {
            if (s.equals(b.getTenBaoCao())) {
                System.out.println("Đã tìm thấy báo cáo");
                b.xuat();
                bc = b;
            }
        }
        return bc;
    }

    public BaoCao timTheoNgay() throws ParseException {
        BaoCao bc = null;
        System.out.print("Nhập ngày báo cáo cần tìm: ");
        Date d = BaoCao.F.parse(BaoCao.s.nextLine());
        for (BaoCao b: this.getBaoCaos()) {
            if (d.compareTo(b.getNgayBaoCao()) == 0) {
                System.out.println("Đã tìm thấy báo cáo");
                b.xuat();
                bc = b;
            }
        }
        return bc;
    }

    public void sortByName() {
        baoCaos.sort((o1, o2) -> {
            String name1 = o1.getTenBaoCao();
            String name2 = o2.getTenBaoCao();
            String n1 = name1.substring(name1.lastIndexOf(" ") + 1);
            String n2 = name2.substring(name2.lastIndexOf(" ") + 1);
            int compareName = n1.compareTo(n2);
            if (compareName == 0) {
                String l1 = name1.substring(0, name1.indexOf(" "));
                String l2 = name2.substring(0, name2.indexOf(" "));
                return l1.compareTo(l2);
            } else {
                return compareName;
            }
        });
    }

    public void sortAndFilterByName() {
        DanhSachBaoCao ds = new DanhSachBaoCao();
        System.out.print("Chọn loại báo cáo để sắp xếp(DA - TT - KL): ");
        String s = BaoCao.s.nextLine();
        for (BaoCao b: this.getBaoCaos()) {
            if(b.getMaBaoCao().startsWith(s)) {
                ds.themBaoCao(b);
            }
        }
        ds.sortByName();
        System.out.println("Đã sắp xếp");
        ds.showList2();
    }

    public void sortByDate() {
        baoCaos.sort(Comparator.comparing(BaoCao::getNgayBaoCao));
    }

    public void sortAndFilterByDate() {
        DanhSachBaoCao ds = new DanhSachBaoCao();
        System.out.print("Chọn loại báo cáo để sắp xếp(DA - TT - KL): ");
        String s = BaoCao.s.nextLine();
        for (BaoCao b: this.getBaoCaos()) {
            if(b.getMaBaoCao().startsWith(s)) {
                ds.themBaoCao(b);
            }
        }
        ds.sortByDate();
        System.out.println("Đã sắp xếp");
        ds.showList2();
    }

    public List<BaoCao> getBaoCaos() {
        return baoCaos;
    }

    public void setBaoCaos(List<BaoCao> baoCaos) {
        this.baoCaos = baoCaos;
    }
}
