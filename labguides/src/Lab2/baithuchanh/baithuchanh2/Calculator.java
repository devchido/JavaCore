package Lab2.baithuchanh.baithuchanh2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    /* todo: Bài thực hành 2: Viết một chương trình máy tính đơn giản thực hiện các phép toán
    như: cộng, trừ, nhân, chia.
    */
    float soA, soB;

    public void phepCong() {
        System.out.println("Bạn đã chọn phép cộng.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số hạng A: ");
        soA = scanner.nextFloat();
        System.out.println("Nhập số hạng B: ");
        soB = scanner.nextFloat();
        System.out.println("Kết quả: " + soA + " + " + soB + " = " + (soA + soB));
    }

    public void phepTru() {
        System.out.println("Bạn đã chọn phép trừ.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số bị trừ A: ");
        soA = scanner.nextFloat();
        System.out.println("Nhập số trừ B: ");
        soB = scanner.nextFloat();
        System.out.println("Kết quả: " + soA + " - " + soB + " = " + (soA - soB));
    }

    public void phepNhan() {
        System.out.println("Bạn đã chọn phép nhân.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nhân A: ");
        soA = scanner.nextFloat();
        System.out.println("Nhập số B: ");
        soB = scanner.nextFloat();
        System.out.println("Kết quả: " + soA + " x " + soB + " = " + (soA * soB));
    }

    public void phepChia() {
        System.out.println("Bạn đã chọn phép chia.");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số bị chia A: ");
        soA = scanner.nextFloat();
        System.out.println("Nhập số chia B: ");
        soB = scanner.nextFloat();
        System.out.println("Kết quả: " + soA + " / " + soB + " = " + (soA / soB));
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            try {
                System.out.println(
                        "Chọn loại phép tính cần thực hiện: " +
                                "\n1.Phép cộng" +
                                "\t2.Phép trừ" +
                                "\t3.Phép nhân" +
                                "\t4.Phép chia" +
                                "\t5.Dừng chương trình.\n");

                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        calculator.phepCong();
                        break;
                    case 2:
                        calculator.phepTru();
                        break;
                    case 3:
                        calculator.phepNhan();
                        break;
                    case 4:
                        calculator.phepChia();
                        break;
                    case 5:
                        System.out.println("Kết thúc chương trình.");
                        sc.close();
                        System.exit(0); // Kết thúc chương trình
                    default:
                        System.out.println("Lựa chọn không có sẵn!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Lựa chọn không hợp lệ! Vui lòng thử lại.");
                sc.next();
            }
        }
    }
}
