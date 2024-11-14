package Lab2.baitap.bai4;

import java.util.Scanner;

public class GiaiPTBac2 {
    private float a, b, c, delta;

    public void nhapDL() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Giải phương trình bậc 2: ax² + bx +c = 0");
        try {

            System.out.println("a = ");
            a = sc.nextFloat();
        } catch (NumberFormatException e) {
            System.out.println("Nhập lại số a.");
        }
        try {
            System.out.println("b = ");
            b = sc.nextFloat();

        } catch (NumberFormatException e) {
            System.out.println("Nhập lại b.");
        }
        try {
            System.out.println("c = ");
            c = sc.nextFloat();
        } catch (NumberFormatException e) {
            System.out.println("Nhập lại c.");
        }
        delta = (b * b) - (4 * a * c);
        sc.close();
    }

    public void hienThi() {
        System.out.println("PT bậc 2: " + a + "x² + " + b + "x + " + c + " = 0");
        System.out.println("delta = " + delta);
        if (delta > 0) {
            // Hai nghiệm phân biệt
            // Hàm Math.sqrt() được sử dụng để tính "căn bậc hai" của một số
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có hai nghiệm phân biệt:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            // Một nghiệm kép
            double x = -b / (2 * a);
            System.out.println("Phương trình có một nghiệm kép:");
            System.out.println("x = " + x);
        } else {
            // Phương trình vô nghiệm
            System.out.println("Phương trình vô nghiệm.");
        }
    }

    public static void main(String[] args) {
        GiaiPTBac2 giaiPTBac2 = new GiaiPTBac2();
        giaiPTBac2.nhapDL();
        giaiPTBac2.hienThi();
    }
}
