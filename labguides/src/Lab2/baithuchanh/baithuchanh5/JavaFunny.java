package Lab2.baithuchanh.baithuchanh5;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaFunny {
    // todo: Bài thực hành 2: Viết một chương trình Java funny(vui vẻ) về việc tán gái có chọn lọc.
    //  Hiển thị các tùy chọn cho người dùng nhập vào ví dụ như 1,2,3, Y-Yes, N—No.
    //  > Thấy gái: xinh thì tản, xấu thì chuyển cho thằng trọ cùng phòng.
    //  > Nếu gái xấu mà nhà mặt phố, bố làm to thì đành nhắm "tình yêu là không có biên giới" :D
    //  > Nếu gái xinh: kiêm tra có người yêu chưa, nêu có tôi thì tản luôn bạn trai của nàng, chưa có thì tản ngay.
    //  > Nếu đông ý thì đưa đi ăn, chơi ...

    int choice;
    boolean status = true;

    public static void main(String[] args) {
        JavaFunny javaFunny = new JavaFunny();
        javaFunny.nhapDuLieu();
        javaFunny.hienThi();
    }

    public void nhapDuLieu() {
        Scanner scanner = new Scanner(System.in);
        while (status) {
            System.out.println("Phỏng vấn hẹn hò vui vẻ:");
            System.out.println("Bạn trông thấy cô gái phía trước như nào? :D");
            System.out.println("1. Rất tốt \t 2. Không thích hợp \t 0. Dừng cuộc trò chuyện");
            try {
                choice = scanner.nextInt();
                hienThi();
            } catch (InputMismatchException e) {
                System.out.println("Lựa chọn không hợp lệ. Xin vui lòng nhập lại.");
                scanner.next(); // Đọc và loại bỏ dữ liệu không hợp lệ khỏi bộ đệm
            }
        }
    }

    public void hienThi() {
        Scanner scanner = new Scanner(System.in);
        switch (choice) {
            case 0:
                System.out.println("Dừng cuộc trò chuyện.");
                status = false;
                break;
            case 1:
                System.out.println("Cô ấy rất xinh a. Không biết đã có người yêu chưa?");
                do {
                    System.out.println("3. Cô ấy chưa có ny.");
                    System.out.println("4. Cô ấy đã có ny rồi.");
                    try {
                        choice = scanner.nextInt();
                        switch (choice) {
                            case 3:
                                System.out.println("Hãy dũng cảm lên chàng trai, lên tán cô ấy đi nào.");
                                break;
                            case 4:
                                System.out.println("Vậy thì đập chậu cướp hoa, tán luôn bạn trai nàng.");
                                break;
                            default:
                                System.out.println("Vui lòng thử lại.");
                                break;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Chọn lại phương án.");
                        scanner.next();
                    }
                } while (choice != 3 && choice != 4);
                break;
            case 2:
                System.out.println("Xấu nhưng nhỡ đâu kết cấu lại đẹp.");
                do {
                    System.out.println("3. Cô ấy nhà mặt phố, bố làm to.");
                    System.out.println("4. Cô ấy mờ nhạt.");
                    try {
                        choice = scanner.nextInt();
                        switch (choice) {
                            case 3:
                                System.out.println("Tình yêu là không có biên giới.");
                                break;
                            case 4:
                                System.out.println("Phúc này nên chuyển cho thằng trọ cùng phòng hưởng.");
                                break;
                            default:
                                System.out.println("Lựa chọn không hợp lệ.");
                                break;
                        }
                    } catch (InputMismatchException e) {
                        System.out.println("Chọn lại phương án.");
                        scanner.next();
                    }
                } while (choice != 3 && choice != 4);
                break;
            default:
                System.out.println("Vui lòng thử lại.");
                break;
        }
    }
}

