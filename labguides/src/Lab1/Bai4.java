package Lab1;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        //TODO: Nhập 1 số nguyên n và một số thực m, một xâu ký tự từ bàn phím và hiển thị giá trị vừa nhập ra màn hình.
        System.out.println("Nhập số nguyên n:");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println("Nhập số thực m:");
        float m = scanner.nextFloat();
        System.out.println("Nhập xâu ký tự:");
        scanner.nextLine();
        String s = scanner.nextLine();
        System.out.println("Số nguyên n: " + n + "\nSố thực m: " + m + "\nXâu ký tự: " + s);
    }
}
