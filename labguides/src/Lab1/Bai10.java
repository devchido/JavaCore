package Lab1;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        // todo: Giải phương trình bậc 2: ax² + bx +c = 0.
        Scanner scanner = new Scanner(System.in);

        // Nhập các hệ số a, b, và c từ người dùng
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();

        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();

        System.out.print("Nhập hệ số c: ");
        double c = scanner.nextDouble();

        // Tính delta
        double delta = (b * b) - (4 * a * c);

        // Kiểm tra giá trị của delta để xác định số nghiệm
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

        // Đóng đối tượng Scanner để tránh rò rỉ tài nguyên
        scanner.close();
    }
}
