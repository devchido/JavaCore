package Lab3.baitap.bai7;

import java.util.Scanner;

public class Bai7 {
    // todo: Bài 7: Nhập vào 1 số N > 0:
    //  a. In ra các số lẻ <N `
    //  b. Tính tổng bình phương của các số lẻ đó.
    //  c. In ra các số chẵn lớn hơn trung bình cộng của N số nguyên dương từ 1 tới N.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số nguyên N:");
        int n = sc.nextInt();
        int tongBinhPhuong = 0; // khai báo tổng bình phương của các số lẻ
        int tongLe = 0; // Khai báo tổng của các số lẻ
        int count = 0; // Khai báo biến đếm các số lẻ xuất hiện
        System.out.println("Các số lẻ nhỏ hơn " + n+" là:");

        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                System.out.print(i + "\t");
                tongBinhPhuong = tongBinhPhuong + i * i;
                tongLe += i;
                count++;
            }
        }
        System.out.println("\nTổng bình phương các số lẻ nhỏ hơn " + n + " là: " + tongBinhPhuong);

        // Tính trung bình cộng của số lẻ
        double trungBinhLe = (double) tongLe / count;

        // In ra các số chẵn lớn hơn trung bình cộng của số lẻ
        System.out.println("Trung bình cộng của số lẻ: " + trungBinhLe);

        System.out.println("Các số chẵn lớn hơn trung bình cộng:");
        for (int i = 2; i <= n; i += 2) {
            if (i > trungBinhLe) {
                System.out.print(i + "\t");
            }
        }
    }
}
