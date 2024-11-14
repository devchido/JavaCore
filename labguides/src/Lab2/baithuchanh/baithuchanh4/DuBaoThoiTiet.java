package Lab2.baithuchanh.baithuchanh4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DuBaoThoiTiet {
    // todo: Bài thực hành 1: Viết một chương trình dự báo thời tiết theo tục ngữ:
    //  Chuồn chuồn bay thấp thì mưa, bay cao thì nắng, bay vừa thì râm.
    int status;
    public void nhapDuLieu() {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("Chương trình dự báo thời tiết Chuồn chuồn");
            System.out.println("1. Bay thấp");
            System.out.println("2. Bay cao");
            System.out.println("3. Bay vừa");
            System.out.println("4. Say rượu cmn rồi! Dừng hỏi đáp");
            System.out.println("Mời nhập từ 1 -—> 4");
            try {
                status = input.nextInt();
                System.out.println("Cám ơn đã nhập");
                hienThiDuLieu();
            } catch (InputMismatchException e){
                System.out.println("Lựa chọn không hợp lệ. Xin vui lòng nhập lại.");
                input.next(); // Đọc và loại bỏ dữ liệu không hợp lệ khỏi bộ đệm
            }
        }
    }

    public void hienThiDuLieu() {
        switch (status) {
            case 1:
                System.out.println("Dự báo: Mưa, khi ra khỏi nhà nhớ mang áo mưa");
                break;
            case 2:
                System.out.println(",Dự báo: Nắng, nhở mang ô nhé!");
                break;
            case 3:
                System.out.println("Dự báo: Râm, mát trời.");
                break;
            case 4:
                System.out.println("Dự bảo: xin lỗi, do nhậu say nên ko trả lời.");
                System.exit(0);
                break;
            default:
                System.out.println("Chuồn chuồn thử *beep* 404 lần nhưng ko có kết quả.");
                break;
        }
    }

    public static void main(String[] args) {
        DuBaoThoiTiet duBaoThoiTiet = new DuBaoThoiTiet();
        duBaoThoiTiet.nhapDuLieu();
    }
}
