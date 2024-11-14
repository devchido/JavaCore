package Lab2.baitap.bai7;

import java.util.Scanner;

public class TimSoLonNhatNhoNhat {
    // todo: Bài 7: Viết chương trình nhập vào 4 số nguyên. Tìm và in ra số lớn nhất. Hướng dẫn:
    //  Ta có 4 số nguyên a, b, c, d. Tìm 2 số nguyên lớn nhất x, y của 2 cặp (a, b) và (c, d).
    //  Sau đó so sánh 2 số nguyên x, y để tìm ra số nguyên lớn nhất.
    private int a, b, c, d;

    public void nhapDL() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập a= ");
            a = sc.nextInt();
            System.out.println("Nhập b = ");
            b = sc.nextInt();
            System.out.println("Nhập c = ");
            c = sc.nextInt();
            System.out.println("Nhập d = ");
            d = sc.nextInt();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void timMax() {
        // Sử dụng hàm so sánh tương tự Math.max
        int maxAB = Math.max(a, b);
        int maxCD = Math.max(c, d);

        // So sánh 2 số lớn nhất để tìm ra số lớn nhất
        int max = Math.max(maxAB, maxCD);
        System.out.println("Số lớn nhất là: " + max);
    }

    public void timMin() {
        int minAB = Math.min(a, b);
        int minCD = Math.min(c, d);
        int min = Math.min(minAB, minCD);
        System.out.println("Số nhỏ nhất là: " + min);
    }

    public static void main(String[] args) {
        TimSoLonNhatNhoNhat timSoLonNhatNhoNhat = new TimSoLonNhatNhoNhat();
        timSoLonNhatNhoNhat.nhapDL();
        timSoLonNhatNhoNhat.timMin();
        timSoLonNhatNhoNhat.timMax();
    }


}
