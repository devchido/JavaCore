package Lab3.baitap.bai10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SoHoanHao {
    // todo: Kiểm tra một số hoàn hảo (là số có tổng các ước nhỏ hơn nó, bằng chính nó)
    // ex: 6=1+2+3
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số hoàn hảo cần kiểm tra");
        int a = 0;
        try {
            a = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Giá trị nhập không hợp lệ.");
        }
        if (sohoanhao(a)) {
            System.out.println("\n" + a + " là số hoàn hảo.");
        } else {
            System.out.println("\n" + a + " không phải là số hoàn hảo.");
        }
    }

    public static boolean sohoanhao(int a) {
        int sum = 0; // khai báo sum
        // tạo vòng lặp for để tìm ước số của a
        System.out.println("Các ước của a: ");
        for (int i = 1; i <= a / 2; i++) {
            if (a % i == 0) {
                sum += i;// tổng các ước số của a
                System.out.print(i + "\t"); // in ra các ước số
            }
        }
        if (sum == a) {
            return true;
        }
        return false;

    }
}
