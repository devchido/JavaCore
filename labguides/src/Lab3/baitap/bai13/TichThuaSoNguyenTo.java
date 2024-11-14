package Lab3.baitap.bai13;

import java.util.Scanner;

public class TichThuaSoNguyenTo {
    // todo: Viết chương trình phân tích số nguyên n thành các thừa số nguyên tố trong Java.
    //  Ví dụ: 12 = 2 x 2 x 3.
    //  Số nguyên dương n được nhập từ bàn phím.
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so nguyen: ");
        n = sc.nextInt();
        while (n < 2) {
            System.out.println("Ban vua nhap mot so khong hop le. Vui long nhap lai: ");
            n = sc.nextInt();
        }
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                n = n / i;
                if (n == 1)
                    System.out.print(i);
                else
                    System.out.print(i + " x ");
            }
            if (n == 1)
                break;
        }
    }
}
