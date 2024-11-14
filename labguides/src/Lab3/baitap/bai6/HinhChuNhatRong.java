package Lab3.baitap.bai6;

import java.util.Scanner;

public class HinhChuNhatRong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chiều dài và chiều rộng của hình chữ nhật từ người dùng
        System.out.print("Nhập chiều dài của hình chữ nhật: ");
        int chieuDai = scanner.nextInt();
        System.out.print("Nhập chiều rộng của hình chữ nhật: ");
        int chieuRong = scanner.nextInt();

        // Vẽ hình chữ nhật rỗng
        veHinhChuNhatRong(chieuDai, chieuRong);
    }

    // Hàm để vẽ hình chữ nhật rỗng
    static void veHinhChuNhatRong(int chieuDai, int chieuRong) {
        for (int i = 0; i < chieuRong; i++) {
            for (int j = 0; j < chieuDai; j++) {
                // Kiểm tra xem có phải là biên của hình chữ nhật không
                if (i == 0 || i == chieuRong - 1 || j == 0 || j == chieuDai - 1) {
                    // Nếu là biên, in dấu '*' để tạo hình chữ nhật
                    System.out.print("* ");
                } else {
                    // Nếu không phải biên, in khoảng trắng để tạo hình rỗng
                    System.out.print("  ");
                }
            }
            // Xuống dòng sau khi hoàn thành một dòng của hình chữ nhật
            System.out.println();
        }
    }
}
