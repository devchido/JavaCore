package Lab2.baitap.bai11;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CongTruNhanChia {
    // todo: Bài 11: Viết chương trình nhập vào 2 số x, y và 1 trong 4 toán tử +, -, *, |.
    //  Nếu là + thì in ra kết quả x + y, nếu là — thì in ra x — y, nếu là * thì in ra x * y,
    //  nếu là / thì in ra x / y (nếu y = 0 thì thông bảo không chia được).
    private double x, y;
    private int choice;
    private boolean nhapLai;

    public void nhapDL() {
        Scanner sc = new Scanner(System.in);
        do {
            try {
                nhapLai = false;
                System.out.println("Nhập giá trị của x: ");
                x = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Giá trị không hợp lệ.");
                sc.next(); // Đọc và loại bỏ giá trị không hợp lệ khỏi bộ đệm
                nhapLai = true;
            }
        }
        while (nhapLai);
        do {
            try {
                nhapLai = false;
                System.out.println("Nhập giá trị của y: ");
                y = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Giá trị không hợp lệ.");
                sc.next(); // Đọc và loại bỏ giá trị không hợp lệ khỏi bộ đệm
                nhapLai = true;
            }
        } while (nhapLai);
        do {
            try {
                nhapLai = false;
                System.out.println("Phương thức tính: ");
                System.out.println("1. Cộng \t 2. Trừ \t 3. Nhân \t 4. Chia");
                choice = sc.nextInt();
                if (choice < 1 || choice > 4) {
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                    nhapLai = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("phương thức không hợp lệ.");
                sc.next(); // Đọc và loại bỏ giá trị không hợp lệ khỏi bộ đệm
                nhapLai = true;
            }
        } while (nhapLai);
        hienThi();
    }

    public void hienThi() {
        switch (choice) {
            case 1:
                System.out.println(x + " + " + y + " = " + (x + y));
                break;
            case 2:
                System.out.println(x + " - " + y + " = " + (x - y));
                break;
            case 3:
                System.out.println(x + " x " + y + " = " + (x * y));
                break;
            case 4:
                if (y == 0) {
                    System.out.println("Không chia được.");
                } else {
                    System.out.println(x + " : " + y + " = " + (x / y));
                }
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
                break;
        }
    };
    public static void main(String[] args) {
        CongTruNhanChia congTruNhanChia = new CongTruNhanChia();
        congTruNhanChia.nhapDL();
    }
}
