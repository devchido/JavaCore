package Lab1;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        // todo: Tìm max, mìn của 3 số được nhập vào từ bàn phím
        Scanner scanner = new Scanner(System.in);
        // Nhập số thứ nhất
        System.out.print("Nhập số thứ nhất: ");
        int num1 = scanner.nextInt();
        // Nhập số thứ hai
        System.out.print("Nhập số thứ hai: ");
        int num2 = scanner.nextInt();
        // Nhập số thứ ba
        System.out.print("Nhập số thứ ba: ");
        int num3 = scanner.nextInt();
        // Tìm giá trị lớn nhất
        int max = Math.max(Math.max(num1, num2), num3);
        // Tìm giá trị nhỏ nhất
        int min = Math.min(Math.min(num1, num2), num3);
        // In kết quả
        System.out.println("Số lớn nhất là: " + max);
        System.out.println("Số nhỏ nhất là: " + min);
        // Đóng đối tượng Scanner để tránh rò rỉ tài nguyên
        scanner.close();
    }
}
