package Lab2.baitap.bai8;

import java.util.Scanner;

public class InSoNgayTrongThang {
    private int ngay, thang, nam;

    public InSoNgayTrongThang() {
    }

    public void nhapDL() {
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Nhập vào năm: ");
            nam = sc.nextInt();
            try {
                if (nam <= 0) {
                    System.out.println("Năm phải lớn hơn 0");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (nam <= 0);

        do {
            System.out.println("Nhập vào tháng: ");
            thang = sc.nextInt();
            try {
                if (thang < 1 || thang > 12) {
                    System.out.println("Tháng phải lớn hơn hoặc bằng 1 và nhỏ hơn hoặc bằng 12");
                }
            } catch (Exception e){
                System.out.println(e.getMessage());
            }
        } while (thang < 1 || thang > 12);
    }

    public void inSoNgayTrongThang() {
        int soNgay = 0;

        switch (thang) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                soNgay = 31;
                break;
            case 4: case 6: case 9: case 11:
                soNgay = 30;
                break;
            case 2:
                // Kiểm tra năm nhuận
                if ((nam % 4 == 0 && nam % 100 != 0) || (nam % 400 == 0)) {
                    soNgay = 29;
                } else {
                    soNgay = 28;
                }
                break;
        }

        System.out.println("Tháng " + thang + " năm " + nam + " có " + soNgay + " ngày.");
    }

    public static void main(String[] args) {
        InSoNgayTrongThang inSoNgay = new InSoNgayTrongThang();
        inSoNgay.nhapDL();
        inSoNgay.inSoNgayTrongThang();
    }
}
