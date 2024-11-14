package Lab1;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        //todo: Nhập 2 số nguyên n, m từ bản phim và hiển thị kết quả là tổng của 2 số này.
        System.out.println("Nhập số nguyên n: ");
        int m, n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        System.out.println(n + " + " + m + " = " + (m + n));
    }
}
