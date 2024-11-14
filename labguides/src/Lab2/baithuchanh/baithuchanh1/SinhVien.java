package Lab2.baithuchanh.baithuchanh1;

import java.util.Scanner;

public class SinhVien {

    // Tạo một class có tên là SinhVien với các thông tin cân lưu trữ:
    String name; // Tên sinh viên
    String address; // Địa chỉ thường trú
    int soLanThi; // Số lần thì
    float diemThi; // Điểm thi môn Java
    double lePhiThi; // Lệ phí đóng thì lại
    boolean gioiTinh; // Giới tính: Nam = true; Nữ = false

    // todo: Viết hàm nhập thông tin cho lớp SinhVien
    // thực hiện điền thông tin và hiển thị kết quả
    public void nhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên: ");
        name = scanner.nextLine();
        System.out.println("Nhập address: ");
        address = scanner.nextLine();
        System.out.println("Nhập số lần thi: ");
        soLanThi = scanner.nextShort();
        System.out.println("Nhập điểm thi: ");
        diemThi = scanner.nextFloat();
        System.out.println("Nhập lệ phí thi: ");
        lePhiThi = scanner.nextDouble();
        System.out.println("Nhập giới tính: ");
        gioiTinh = scanner.nextBoolean();
        scanner.close();
    }

    public static void main(String[] args) {
        SinhVien sinhVienBK = new SinhVien();
        sinhVienBK.nhapThongTin();
        System.out.println(
                "Tên sinh viên: " + sinhVienBK.name
                + "\nAddress: " + sinhVienBK.address
                + "\nSố lần thi: " + sinhVienBK.soLanThi
                + "\nĐiểm thi: " + sinhVienBK.diemThi
                + "\nLệ phí thi: " + sinhVienBK.lePhiThi
                + "\nGiới tính: " + (sinhVienBK.gioiTinh ? "Nam" : "Nữ")
        );

    }
}
