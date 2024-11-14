package Lab1;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        //todo: Giải phương trình bậc nhất: ax + b = 0.
        Scanner scanner = new Scanner(System.in);
        // Nhập các hệ số a và b từ người dùng
        System.out.print("Nhập hệ số a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập hệ số b: ");
        double b = scanner.nextDouble();
        // Kiểm tra xem phương trình có phải là phương trình bậc nhất hay không
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            // Giải phương trình bậc nhất
            double x = -b / a;
            System.out.println("Nghiệm của phương trình là x = " + x);
        }
        // Đóng đối tượng Scanner để tránh rò rỉ tài nguyên
        scanner.close();
    }
}
