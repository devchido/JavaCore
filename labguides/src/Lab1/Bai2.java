package Lab1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        //TODO: Bài 2: Nhập 1 số nguyên n từ bàn phím và hiển thị giá trị vừa nhập ra màn hình.
        System.out.println("Nhập số nguyên n: ");
        Scanner scanner = new Scanner(System.in);
        int n;
        try {
            n = scanner.nextInt();
            System.out.println("Giá trị vừa nhập là: " + n);
        } catch (
                InputMismatchException e
        ) {
            System.out.println("Đầu vào không phải là số nguyên.");
        } finally {
            // Đóng đối tượng Scanner để tránh rò rỉ tài nguyên
            scanner.close();
        }
    }
}
