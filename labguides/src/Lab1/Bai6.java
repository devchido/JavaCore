package Lab1;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        /** todo: Nhập 2 số nguyên n1, m1; 2 số thực n2, m2 từ bàn phím.
         * Tính tổng của 2 số nguyên, tổng của 2 số thực,
         * tính tổng của n1+n2 và hiện thị các kết quả ra màn hình.
         **/
        int n1, m1;
        float n2, m2;
        System.out.println("Nhập số nguyên n1:");
        Scanner scanner = new Scanner(System.in);
        n1 = scanner.nextInt();
        System.out.println("Nhập số nguyên m1:");
        m1 = scanner.nextInt();
        System.out.println("Nhập số thực n2:");
        n2 = scanner.nextFloat();
        System.out.println("Nhập số thực m2:");
        m2 = scanner.nextFloat();
        System.out.println("Số nguyên n1 = " + n1
                + "\nSố nguyên m1 = " + m1
                + "\nSố thực n2 = " + n2
                + "\nSố thực m2 = " + m2
                + "\nTổng của n1 và n2: " + (n1 + n2));
    }
}
