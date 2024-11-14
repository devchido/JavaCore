package Lab1;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        // todo: Tìm max, min của 2 số được nhập vào từ bàn phím
        float m, n;
        System.out.println("Nhập số thực n:");
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextFloat();
        System.out.println("Nhập số thực m:");
        m = scanner.nextFloat();
        float max, min;
        max = Math.max(m, n);
        min = Math.min(m,n);
        System.out.println("Max: "+max+"\nMin: "+min);
    }
}
