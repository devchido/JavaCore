package Lab3.baitap.bai4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SoNguyenTo {
    // todo: Kiểm tra một số có là số nguyên tố hay không?
    public static boolean soNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập số: ");
            int n = sc.nextInt();
            if (soNguyenTo(n)) {
                System.out.println(n + " là số nguyên tố.");
            } else {
                System.out.println(n + " không phải số nguyên tố.");
            }
            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("Giá trị nhập không hợp lệ.");
            sc.next();
        }
    }
}
