package Lab2.baitap.bai5;

import java.util.Scanner;

public class KiemTraChanLe {
    // todo: Nhập vào số nguyên N. Kiểm tra xem N là sô chẵn hay sô lẻ.
    private int n;
    private boolean status = true;

    public void nhapDl() {
        while (status) {
            System.out.println("Nhập số nguyên n= ");
            Scanner sc = new Scanner(System.in);
            try {
                n = sc.nextInt();
                status = false;
            } catch (Exception e) {
                System.out.println("Vui lòng nhập lại.");
                sc.next();
            }
        }
    }

    public void view() {
        if (n % 2 == 0) {
            System.out.println(n + " là số chẵn.");
        } else {
            System.out.println(n + " là số lẻ.");
        }
    }

    public static void main(String[] args) {
        KiemTraChanLe kiemTraChanLe = new KiemTraChanLe();
        kiemTraChanLe.nhapDl();
        kiemTraChanLe.view();
    }
}
