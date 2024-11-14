package Lab2.baitap.bai9;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class KeoBuaBao {
    private int choice, choiceMay;
    private boolean status = true;

    public void nhapDL() {
        Scanner sc = new Scanner(System.in);
        while (status) {
            try {
                System.out.println("Chọn chiêu thức của bạn: ");
                System.out.println("1. Búa \t 2. Kéo \t 3. Bao");
                choice = sc.nextInt();
                if (choice >= 1 && choice <= 3) {
                    System.out.println("Lựa chọn của bạn là: " + getTenChieuThuc(choice));
                    status = false;  // Exit the loop if a valid choice is made
                } else {
                    System.out.println("Lựa chọn không có sẵn. Vui lòng chọn lại.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Lựa chọn không hợp lệ!");
                sc.next();
            }
        }
    }

    public void luaChonCuaMay() {
        Random random = new Random();
        choiceMay = random.nextInt(3) + 1;
        System.out.println("Lựa chọn của máy là: " + getTenChieuThuc(choiceMay));
    }

    private String getTenChieuThuc(int choice) {
        switch (choice) {
            case 1:
                return "Búa";
            case 2:
                return "Kéo";
            case 3:
                return "Bao";
            default:
                return "Lỗi!";
        }
    }

    public void hienThi() {
        System.out.println("Kết quả thi đấu: ");
        if (choice == choiceMay) {
            System.out.println("Hoà");
        } else if ((choice == 1 && choiceMay == 2) || (choice == 2 && choiceMay == 3 || choice == 3 && choiceMay == 1)) {
            System.out.println("Bạn thắng.");
        } else {
            System.out.println("Máy thắng.");
        }
    }

    public static void main(String[] args) {
        KeoBuaBao keoBuaBao = new KeoBuaBao();
        keoBuaBao.nhapDL();
        keoBuaBao.luaChonCuaMay();
        keoBuaBao.hienThi();

    }
}
