package Lab3.baithuchanh;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BaiThucHanh6 {
    // todo: Bài thực hành 6: Viết 1 menu giống như sau,
    //  yêu cầu liên tục hiển thị lại sau mỗi lựa chọn cho đến khi chọn thoát.
    //  ======= MENU =======
    //  1. Nhập thông tin sinh viên.
    //  2. Hiển thị thông tin sinh viên.
    //  3. Tìm kiếm sinh viên.
    //  4. Sinh viên xuất sắc nhất.
    //  5. Thoát.
    //  === Mời nhập từ 1 --> 5 ===
    //  đề tài chỉ tạo menu -- chưa cần thực hiện chức năng
    public void nhapDL() {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("======= MENU =======");
            System.out.println("1. Nhập thông tin sinh viên.");
            System.out.println("2. Hiển thị thông tin sinh viên.");
            System.out.println("3. Tìm kiếm sinh viên.");
            System.out.println("4. Sinh viên xuất sắc nhất.");
            System.out.println("5. Thoát.");
            System.out.println("=== Mời nhập từ 1 --> 5 ===");
            try {
                choice = sc.nextInt();
                hienThi(choice);
            } catch (InputMismatchException e) {
                System.out.println("Giá trị nhập không hợp lệ. Vui lòng thử lại.");
                sc.next();
                choice = 0;
            }
        } while (choice != 5);
        sc.close();
    }

    public void hienThi(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Nhập thông tin sinh viên");
                break;
            case 2:
                System.out.println("Hiển thị thông tin sinh viên.");
                break;
            case 3:
                System.out.println("Tìm kiếm sinh viên.");
                break;
            case 4:
                System.out.println("Sinh viên xuất sắc nhất.");
                break;
            case 5:
                System.out.println("Thoát.");
                break;
            default:
                System.out.println("Lựa chọn không có sẵn. Vui lòng nhập lại.");
                break;
        }
    }

    public static void main(String[] args) {
        BaiThucHanh6 bth6 = new BaiThucHanh6();
        bth6.nhapDL();
    }
}
