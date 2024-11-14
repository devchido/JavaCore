package Lab2.baitap.bai6;

import java.util.Scanner;

public class TinhChuViDIenTichTamGiac {
    // todo: Nhập vào 3 số a, b, c.
    //  kiểm tra 3 cạnh có tạo thành tam giác không?
    //  nếu có hãy tính chu vi và diện tích tam giác.
    private double a, b, c, chuvi, dientich;

    public void nhapDL() {
        System.out.println("Nhập các cạnh của tam giác: ");
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Cạnh a = ");
            a = sc.nextDouble();
            try {
                if (a <= 0) {
                    System.out.println("Cạnh a phải là số dương. Vui lòng nhập lại.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (a <= 0);

        do {
            System.out.println("Cạnh b = ");
            b = sc.nextDouble();
            try {
                if (b <= 0) {
                    System.out.println("Cạnh b phải là số dương. Vui lòng nhập lại.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (b <= 0);

        do {
            System.out.println("Cạnh c = ");
            c = sc.nextDouble();
            try {
                if (c <= 0) {
                    System.out.println("Cạnh c phải là số dương. Vui lòng nhập lại.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Vui lòng nhập số.");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (c <= 0);

        // Kiểm tra điều kiện tam giác
        if (a + b <= c || a + c <= b || b + c <= a) {
            System.out.println("Các giá trị không tạo thành tam giác. Vui lòng nhập lại.");
        } else {
            tinhChuVi();
            tinhDientich();
        }
    }

    public void tinhChuVi() {
        chuvi = a + b + c;
    }

    public void tinhDientich() {
        double p = (a + b + c) / 2;
        dientich = Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public void hienThi() {
        System.out.println("Giá trị các cạnh: a = " + a + ", b = " + b + ", c = " + c);
        System.out.println("Chu vi tam giác là: " + chuvi);
        System.out.println("Diện tích tam giác là: " + dientich);
    }

    public static void main(String[] args) {
        TinhChuViDIenTichTamGiac tinhChuViDIenTichTamGiac = new TinhChuViDIenTichTamGiac();
        tinhChuViDIenTichTamGiac.nhapDL();
        tinhChuViDIenTichTamGiac.hienThi();
    }
}
