package Lab2.baitap.bai13;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TinhLuong {
    // todo: Viết chương trình nhập số giờ làm và lương theo giờ rồi tính số tiền lương tổng cộng.
    //  Nếu số giờ làm lớn hơn 40 thì những giờ làm dời ra được tính 1,5 lần.
    private int soGioLam, luongGio;

    public void nhapDL() {
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Nhập số giờ đã làm: ");
                soGioLam = sc.nextInt();
                if (soGioLam <= 0) {
                    System.out.println("Số giờ làm không hợp lệ.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Giá trị nhập không hợp lệ! Vui lòng thử lại.");
                sc.next();
            }
        } while (true);
        do {
            try {
                System.out.println("Nhập giá trị mức lương theo giờ(đ/1h): ");
                luongGio = sc.nextInt();
                if (luongGio <= 0) {
                    System.out.println("Số lương theo giờ không hợp lệ.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Giá trị nhập không hợp lệ! Vui lòng thử lại.");
                sc.next();
            }
        } while (true);

    }

    public void tinhLuong() {
        if (soGioLam <= 40) {
            System.out.println("Lương của bạn là: " + (soGioLam * luongGio));
        } else {
            System.out.println("Lương của bạn là: " + ((40 * luongGio) + (soGioLam - 40) * luongGio * 1.5));
        }
    }

    public static void main(String[] args) {
        TinhLuong tinhLuong = new TinhLuong();
        tinhLuong.nhapDL();
        tinhLuong.tinhLuong();
    }
}
