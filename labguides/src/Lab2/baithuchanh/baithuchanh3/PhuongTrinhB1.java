package Lab2.baithuchanh.baithuchanh3;

import java.util.Scanner;

public class PhuongTrinhB1 {
    // Bài thực hành 3: Viết một chương trình giải phương trình bậc nhất (ax + b = c).
    // Bước ]: Tạo một class có tên là PhuongTrinhB1
    // Bước 2: Khai báo biến số a, b và c
    // Bước 3: Viết hàm nhapDuLieu để thực hiện nhập.
    // Bước 4: Viết hàm giaiPhuongTrinhB1 để thực hiện giải.
    // Bước 5: Viết hàm main() và kiểm thử mà giải phương trình bậc nhất của bạn.
    float soA, soB, soC;
    public void nhapDuLieu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số a: ");
        soA = scanner.nextFloat();
        System.out.println("Nhập số b: ");
        soB = scanner.nextFloat();
        System.out.println("Nhập số c: ");
        soC = scanner.nextFloat();
        scanner.close();
    }
    public void giaiPhuongTrinhB1() {
        if (soA == 0) {
            if (soB == soC) {
                System.out.println("Phương trình có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            // Giải phương trình bậc nhất
            double x = (soC -soB) / soA;
            System.out.println("Nghiệm của phương trình là x = " + x);
        }
    }

    public static void main(String[] args) {
        PhuongTrinhB1 phuongTrinhB1 = new PhuongTrinhB1();
        phuongTrinhB1.nhapDuLieu();
        phuongTrinhB1.giaiPhuongTrinhB1();
    }
}
