package Lab3.baitap.bai2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TongTu1DenN {
    // todo: Tính tổng từ 1 đên N
    //  N nhập từ bàn phím
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.println("Nhập giá trị n = ");
        try {
            int n = sc.nextInt();

            for (int i = 1; i <= n; i++) {
                count += i;
            }
            System.out.println("Tổng từ 1 đến " + n + " là: " + count);
        } catch (InputMismatchException e) {
            System.out.println("Giá trị nhập không hợp lệ.");
            sc.next();
        }

    }
}
