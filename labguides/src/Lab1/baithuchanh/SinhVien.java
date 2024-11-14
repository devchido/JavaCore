package Lab1.baithuchanh;

import java.util.Scanner;

public class SinhVien {
    public static void main(String[] args) {
        /**
         * todo: Viết chương trình yêu cầu
         * nhập tên sinh viên, tuổi, điểm lý thuyết, điểm thực hành,
         * tính toán điểm trung hình bằng trung bình cộng của 2 điểm trên.
         * Hiển thị kết quả ra màn hình.
         */
        String tenSV;
        int tuoi;
        float diemlythuyet, diemthuchanh;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        tenSV = scanner.nextLine();
        System.out.println("Nhập tuổi của sinh viên: ");
        tuoi = scanner.nextInt();
        System.out.println("Nhập điểm lý thuyết: ");
        diemlythuyet = scanner.nextFloat();
        System.out.println("Nhập điểm thực hành: ");
        diemthuchanh = scanner.nextFloat();
        float diemtrungbinh = (diemlythuyet + diemthuchanh) / 2;
        System.out.println("Tên sinh viên: " + tenSV
                + "\nTuổi: " + tuoi
                + "\nĐiểm lý thuyết: " + diemlythuyet
                + "\nĐiểm thực hành: " + diemthuchanh
                + "\nĐiểm trung bình: " + diemtrungbinh);
    }
}
