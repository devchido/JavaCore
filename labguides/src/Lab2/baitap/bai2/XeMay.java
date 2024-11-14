package Lab2.baitap.bai2;

import java.util.Scanner;

public class XeMay {
    // todo: Bài 2: Tạo class XeMay có các thuộc tỉnh sau: {
    //  String ten
    //  String nhaSanXuat
    //  int soLuongBanhXe
    //  Co 2 method
    //  void nhapThongTin()
    //  void hienThiThongTin()
    //  Trong ham main goi cac method : nhapThongTin(), hienThiThongTin()
    private String ten;
    private String nhaSanXuat;
    private int soLuongBanhXe;

    public void nhapThongTin() {
        System.out.println("Nhập thông tin xe: ");
        Scanner sc = new Scanner(System.in);
        System.out.println("Tên xe: ");
        ten = sc.nextLine();
        System.out.println("Nhà sản xuất: ");
        nhaSanXuat = sc.nextLine();
        System.out.println("Số lượng bánh xe: ");
        soLuongBanhXe = sc.nextInt();
    }

    public void hienThiThongTin() {
        System.out.println("Tên xe: " + ten
                + "\nNhà sản xuất: " + nhaSanXuat
                + "\nSố lượng bánh xe: " + soLuongBanhXe);
    }

    public static void main(String[] args) {
        XeMay xeMay = new XeMay();
        xeMay.nhapThongTin();
        xeMay.hienThiThongTin();
    }
}
