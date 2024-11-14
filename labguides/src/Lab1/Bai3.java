package Lab1;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        // todo: Nhập 1 số nguyên n và một số thực m từ bản phim và hiển thị giá trị vừa nhập ra màn hình.
        System.out.println("Nhập số nguyên n:");
        Scanner scanner = new Scanner(System.in);
        int n;
        n = scanner.nextInt();
        System.out.println("Nhập số thực m:");
        float m;
        m = scanner.nextFloat();
        System.out.println("Giá trị số nguyên vừa nhập: " + n + "\nGiá trị số thực vừa nhập: " + m);
        scanner.close();
    }
}
