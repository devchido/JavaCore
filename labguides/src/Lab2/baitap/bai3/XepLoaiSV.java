package Lab2.baitap.bai3;

import java.util.Scanner;

public class XepLoaiSV {
    // todo: Bài 3: Viết chương trình nhập thôngtin của sinh viên với các thông tin cần lưu trữ là
    //  tên, mã sinh viên, điểm lý thuyết Java, điểm thực hành Java và hiển thị xếp loại.
    //  » Nếu Lý thuyết dưới 4 hiển thị "Thi lại lý thuyết".
    //  > Nếu Thực hành dưới 4 biến thị "Thi lại thực hành".
    //  › Nếu điểm trung binh LT, TH dưới 4 thì hiển thị "Sinh viên phải học lại".
    //  › Nếu điểm trung bình LT, TH từ 4 đến 7 thì hiển thị "Sinh viên đạt môn Java".
    //  > Nếu điểm trung bình LT, TH trên 7 thì hiển thị "Sinh viên xuất sắc môn Java".

    private String maSV, tenSV;
    private float diemLT, diemTH;

    public void nhapDuLieu() {
        System.out.println("Nhập thông tin sinh viên: ");
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Nhập mã sinh viên: ");
            maSV = sc.nextLine();
            if (maSV.trim().isEmpty()) {
                System.out.println("Mã sinh viên không được để trống. Vui lòng nhập lại.");
            }
        } while (maSV.trim().isEmpty());

        do {
            System.out.println("Nhập tên sinh viên: ");
            tenSV = sc.nextLine();
            if (tenSV.trim().isEmpty()) {
                System.out.println("Tên sinh viên không được để trống. Vui lòng nhập lại.");
            }
        } while (tenSV.trim().isEmpty());

        do {
            System.out.println("Nhập điểm lý thuyết: ");
            try {
                diemLT = sc.nextFloat();
                if (diemLT < 0 || diemLT > 10) {
                    System.out.println("Điểm lý thuyết không hợp lệ. Vui lòng nhập lại.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập một số hợp lệ.");
            }
        } while (diemLT < 0 || diemLT > 10);
        do {
            System.out.println("Nhập điểm thực hành: ");
            try {
                diemTH = sc.nextFloat();
                if (diemTH < 0 || diemTH > 10) {
                    System.out.println("Điểm thực hành không hợp lệ. Vui lòng nhập lại.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập một số hợp lệ.");
            }
        } while (diemTH < 0 || diemTH > 10);
        sc.close();
    }

    public void hienThiXepLoai() {
        System.out.println("Mã sinh viên: " + maSV);
        System.out.println("Tên sinh viên: " + tenSV);
        System.out.println("Điểm lý thuyết: " + diemLT);
        System.out.println("Điểm thực hành: " + diemTH);
        System.out.println("Xếp loại đánh giá: " + (diemLT * 0.4 + diemTH * 0.6));
        if (diemLT < 4) {
            System.out.println("Thi lại lý thuyết.");
        } else if (diemTH < 4) {
            System.out.println("Thi lại thực hành.");
        } else if ((diemLT * 0.4 + diemTH * 0.6) < 4) {
            System.out.println("Sinh viên phải học lại.");
        } else if ((diemLT * 0.4 + diemTH * 0.6) >= 4 || (diemLT * 0.4 + diemTH * 0.6) <= 7) {
            System.out.println("Sinh viên đạt môn Java.");
        } else if ((diemLT * 0.4 + diemTH * 0.6) > 7) {
            System.out.println("Sinh viên xuất sắc môn Java.");
        }
    }

    public static void main(String[] args) {
        XepLoaiSV xepLoaiSV = new XepLoaiSV();
        xepLoaiSV.nhapDuLieu();
        xepLoaiSV.hienThiXepLoai();
    }
}
