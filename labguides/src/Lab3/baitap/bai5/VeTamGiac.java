package Lab3.baitap.bai5;

import java.util.Scanner;

public class VeTamGiac {
    // todo: Viêt chương trình vẽ một tam giác cân rỗng bằng các dấu *.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nhập chiều cao của tam giác
        System.out.print("Nhập chiều cao của tam giác: ");
        int chieuCao = sc.nextInt();

        // Vẽ tam giác cân
        veTamGiacCan(chieuCao);
    }
    public static void veTamGiacCan(int chieuCao) {
        for (int i = 0; i < chieuCao; i++) {
            for (int j = 0; j < 2 * chieuCao - 1; j++) {
                if (i == chieuCao - 1 || i + j == chieuCao - 1 || j - i == chieuCao - 1) {
                    System.out.print('*');
                } else {
                    if (i > 0 && (i + j == chieuCao - 1 || j - i == chieuCao - 1)) {
                        System.out.print('*');
                    } else {
                        System.out.print(' ');
                    }
                }
            }
            System.out.println();
        }
    }
}
