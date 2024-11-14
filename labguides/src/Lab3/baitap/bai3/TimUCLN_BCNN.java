package Lab3.baitap.bai3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TimUCLN_BCNN {
    // todo: Tìm ước chung lớn nhất, bội chung nhỏ nhất
    //  của hai số được nhập từ bàn phím

    public void nhapDL() {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập số thứ nhất: ");
            int n1 = sc.nextInt();
            System.out.println("Nhập số thứ 2: ");
            int n2 = sc.nextInt();
            int ucln = uocChungLonNhat(n1, n2);
            int bcnn = boiChungNhoNhat(n1, n2);
            System.out.println("Ước chung lớn nhất của " + n1 + " và " + n2 + " là: " + ucln);
            System.out.println("Bội chung nhỏ nhất của " + n1 + " và " + n2 + " là: " + bcnn);
        } catch (InputMismatchException e) {
            System.out.println("Giá trị nhập không hợp lệ.");
        }
    }

    public static Integer uocChungLonNhat(int a, int b) {
        // UCLN của hai số nguyên không thay đổi khi thay 1 trong 2 số thành số dư của nó với số còn lại.
        // Có nghĩa là UCLN(a, b) = UCLN(b, a % b)
        // Quá trình thay thế này được lặp đi lặp lại cho tới khi 1 trong 2 số bằng 0, khi đó UCLN chính là số còn lại
        while (b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    // BCNN(a, b) = a * b / UCLN(a, b).
    public Integer boiChungNhoNhat(int a, int b) {
        return (a * b) / uocChungLonNhat(a, b); // a / ucln(a, b) * b
    }

    public static void main(String[] args) {
        TimUCLN_BCNN  timUCLNBcnn = new TimUCLN_BCNN();
        timUCLNBcnn.nhapDL();
    }
}
