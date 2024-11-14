package Lab3.baitap.bai8;

import java.util.Scanner;

public class TinhGiaiThua {
    // todo: Bài 8: Nhập số N > 0; Tính và in ra giai thừa của n: n! = 1*2 *3 *… *(n—l)*n;
    //  Chú ý: quy ước 0! = 1.
    //  Đặt biến phụ double giaiThua = 1;
    //  For (i=1 ;i<n;i++) giaiThua = giaiThua * i;
    //  (chỉ nhập với n nhỏ hơn 16).
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập N: ");
        int n = sc.nextInt();
        System.out.println("Giai thừa của " + n + " là: " + tinhGiaiThua(n));
    }

    public static double tinhGiaiThua(int n) {
        double giaiThua = 1;
        if (n == 0) {
            return 1;
        } else {
            for (int i = 1; i <= n; i++) {
                giaiThua = giaiThua * i;
            }
            return giaiThua;
        }
    }
}
