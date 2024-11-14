package Lab2.baitap.bai10;

import java.util.Scanner;

public class XacDinhColor {
    // todo: Bài 10: Viết chương trình xác định biến ký tự color rồi in ra thông báo:
    //  RED, nếu color = 'R' hoặc color = 'r'. GREEN, nếu color = 'G' hoặc color = 'g'.
    //  BLUE, nếu color = 'B' hoặc color = 'b'.
    //  BLACK, nếu color có giá trị khác.
    private String choice;
    public void nhapDL() {
        System.out.println("Nhập ký tự viết tắt của color:");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextLine();

    }
    public void hienThi(){
        if (choice.equalsIgnoreCase("r")) {
            System.out.println("Color: Red");
        } else if (choice.equalsIgnoreCase("g")) {
            System.out.println("Color: Green");
        } else if (choice.equalsIgnoreCase("b")) {
            System.out.println("Color: Blue");
        } else {
            System.out.println("Color: Black");
        }
    }

    public static void main(String[] args) {
        XacDinhColor xacDinhColor = new XacDinhColor();
        xacDinhColor.nhapDL();
        xacDinhColor.hienThi();
    }
}
