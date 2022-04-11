import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachBaoCao {
    public ArrayList<BaoCao> baoCaos = new ArrayList<BaoCao>();
    public static SimpleDateFormat F = new SimpleDateFormat("dd-MM-yyyy");
    Scanner input = new Scanner(System.in);
    // getter setter
    public ArrayList<BaoCao> getBaoCaos() {
        return baoCaos;
    }

    public void add(BaoCao b) {
        this.getBaoCaos().add(b);
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
            if (b.maBaoCao.startsWith(s)){
                b.xuat();
            }
            if(!b.maBaoCao.startsWith(s)) {
                System.out.println("Nhập sai tên loại báo cáo");
                break;
            }

        }
    }

//    public void suaMaBaoCao() {
//        BaoCao index;
//        for (BaoCao b: this.getBaoCaos()){
////             index = baoCaos.get(Integer.parseInt(b.maBaoCao));
////            System.out.println(index);
//
//        }


    //    }
    public void suaTenBaoCao() {
        for (BaoCao b: this.getBaoCaos())
            b.tenBaoCao = input.nextLine();
    }
    public void suaLinkBaoCao() {
        for (BaoCao b: this.getBaoCaos())
            b.linkBaoCao = input.nextLine();
    }
    public void suaNgayBaoCao() throws ParseException {
        for (BaoCao b: this.getBaoCaos())
            b.ngayBaoCao =  F.parse(input.nextLine());
    }
    public void suaDanhSachSinhVienThucHien() {
        for (BaoCao b: this.getBaoCaos())
            b.dsSinhVien = input.nextLine();
    }
    public void suaTenGiangVien() {
        for (BaoCao b: this.getBaoCaos())
            b.tenGiangVien = input.nextLine();
    }
    public void suaDiemBaoCao() {
        for (BaoCao b: this.getBaoCaos())
            b.diemBaoCao = input.nextDouble();
    }

    private String input(String maBaoCao) {

        return maBaoCao;
    }
    // Lấy mã báo cáo để sửa
    public Integer getBaoCao() {
        String s;
        System.out.print("Nhập mã báo cáo muốn sửa: ");
        s = input.nextLine();
//        for (BaoCao b: this.getBaoCaos())
//            System.out.println(getBaoCaos().get(Integer.parseInt(b.maBaoCao)));
        return 0;
    }
    // xóa báo cáo
    public void xoaBaoCao() {
        String s;
        System.out.print("Nhập mã báo cáo muốn xóa: ");
        s = input.nextLine();
        for (BaoCao b: this.getBaoCaos())
            if(s.equals(b.maBaoCao)) {
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
