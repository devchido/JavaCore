package Lab3.baitap.bai11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TimSoHoanHao {
    // todo: In ra các số hoàn hảo từ 1 đến n
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số N: ");
        int n = 0;
        try {
            n = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Giá trị nhập không hợp lệ.");
        }
        System.out.println("Các số hoàn hảo từ 1 đến " + n + " là:");
        for (int i = 1; i <= n; i++) {
            if (sohoanhao(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean sohoanhao(int a) {
        int sum = 0; // khai báo sum
        // tạo vòng lặp for để tìm ước số của a
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                sum += i;// tổng các ước số của a
            }
        }
        if (sum == a) {
            return true;
        }
        return false;
    }
}
