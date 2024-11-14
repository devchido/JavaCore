package Lab3.baitap.bai9;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {
    // todo: In ra 1 menu lựa chọn. Dùng SWITCH—CASE để thực hiện các menu đó.
    //  Ví dụ: Cuối tuần bạn muốn làm gì?
    //  1. Đi học Java
    //  2. Đi chơi Công viên ngắm gấu.
    //  3. Đi (về) nhà nghỉ
    //  4. Ra sông Hồng tắm tiên
    //  5. Ngủ cả ngày
    //  6. Thoát(System.exit(0))
    //  Lặp đi lặp lại các lựa chọn trên.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Cuối tuần bạn muốn làm gì?");
            System.out.println("1. Đi học Java");
            System.out.println("2. Đi chơi Công viên ngắm gấu");
            System.out.println("3. Đi (về) nhà nghỉ");
            System.out.println("4. Ra sông Hồng tắm tiên");
            System.out.println("5. Ngủ cả ngày");
            System.out.println("6. Thoát");
            try {
                int choice = sc.nextInt();
                if (choice == 6){
                    System.out.println("Thoát chương trình.");
                    System.exit(0);
                } else {
                    luaChon(choice);
                }
            } catch (InputMismatchException e) {
                System.out.println("Lựa chọn không hợp lệ.");
                sc.next();
            }
        }
    }

    public static void luaChon(int choice) {
        switch (choice) {
            case 1:
                System.out.println("Đi học Java");
                break;
            case 2:
                System.out.println("2. Đi chơi Công viên ngắm gấu");
                break;
            case 3:
                System.out.println("3. Đi (về) nhà nghỉ");
                break;
            case 4:
                System.out.println("4. Ra sông Hồng tắm tiên");
                break;
            case 5:
                System.out.println("5. Ngủ cả ngày");
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
                break;
        }
    }
}
