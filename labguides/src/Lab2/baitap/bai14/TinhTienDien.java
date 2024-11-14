package Lab2.baitap.bai14;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TinhTienDien {
    // todo: Viết chương trình tính tiền điện gồm các khoảng sau: :
    //  Tiền thuê bao điện kế: 1000đ/tháng
    //  Định mức sử dụng điện cho mỗi hộ là: 50KW với giá 230đ/KW
    //  Nếu phần Vượt định mức <= 50KW thì tính giá 480đ/KW
    //  Nếu 50KW < phần vượt định mức < 100KW thì tính giá 700đ/KW
    //  Nếu phần vượt định mức <= 100KW thi tính giá 900đ/KW
    //  Chỉ số mới và cũ được nhập vào từ bản phím(chỉ số mới không được nhỏ hơn chỉ số cũ)
    //  In ra màn hình chỉ số cũ, chỉ số mới, tiền trả định mức, tiền trả vượt định mức, tổng tiền phải trả.

    private int chiSoCu, chiSoMoi;
    private int luongDienSuDung; // = chiSoMoi - chiSoCu;
    private int dinhMuc = 50; // Định mức sử dụng điện cho mỗi hộ là: 50 KW
    private int giaDinhMuc = 230; //Định mức sử dụng điện cho mỗi hộ là: 50 KW với giá 230đ/KW
    private int tienThueBaoDienKe = 1000; // Tiền thuê bao điện kế: 1000đ/tháng
    private int phanDinhMuc;
    private int phanVuotDinhMuc; // Lượng điện sử dụng quá phần định mức(quá 50KW: lượng điện sử dụng - định mức).
    private int giaVuotDinhMuc;
    private int tienTraDinhMuc; // số tiền phải trả theo lượng điện trong định mức
    private int tienTraVuotDinhMuc; // số tiền phải trả theo lượng điện vượt định mức
    private int tongTienPhaiTra;


    public void nhapDL() {
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Chỉ số cũ: ");
                chiSoCu = sc.nextInt();
                if (chiSoCu < 0) {
                    System.out.println("Giá trị không hợp lệ.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Giá trị nhập không hợp lệ! Vui lòng thử lại.");
                sc.next();
            }
        } while (true);
        do {
            try {
                System.out.println("Chỉ số mới: ");
                chiSoMoi = sc.nextInt();
                if (chiSoMoi < chiSoCu) {
                    System.out.println("Giá trị không hợp lệ.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Giá trị nhập không hợp lệ! Vui lòng thử lại.");
                sc.next();
            }
        } while (true);

    }

    public void xuLy() {
        luongDienSuDung = chiSoMoi - chiSoCu;
        // nếu lượng điện sử dụng quá định mức thì đã sử dụng hết phần định mức(giới hạn được chỉ định - 50)
        // phần vượt định mức sẽ lầ lượng điện sử dụng trừ đi phần định mức
        if (luongDienSuDung > dinhMuc) {
            phanDinhMuc = dinhMuc;
            phanVuotDinhMuc = luongDienSuDung - dinhMuc;
        } else {
            phanDinhMuc = luongDienSuDung;
            phanVuotDinhMuc = 0;
        }
        // phần Vượt định mức <= 50KW thì tính giá 480đ/KW
        if (phanVuotDinhMuc <= 50) {
            giaVuotDinhMuc = 480;
        }
        // 50KW < phần vượt định mức < 100KW thì tính giá 700đ/KW
        else if (phanVuotDinhMuc < 100) {
            giaVuotDinhMuc = 700;
        }
        // phần vượt định mức >= 100KW thi tính giá 900đ/KW
        else {
            giaVuotDinhMuc = 900;
        }
        tienTraDinhMuc = phanDinhMuc * giaDinhMuc;
        tienTraVuotDinhMuc = phanVuotDinhMuc * giaVuotDinhMuc;
        tongTienPhaiTra = tienTraDinhMuc + tienTraVuotDinhMuc + tienThueBaoDienKe;

    }

    public void hienThi() {
        System.out.println("Chỉ số cũ: " + chiSoCu);
        System.out.println("Chỉ số mới: " + chiSoMoi);
        System.out.println("Lượng điện sử dụng của bạn trong tháng này là: " + luongDienSuDung);
        System.out.println("Phần định mức sử dụng: " +phanVuotDinhMuc);
        System.out.println("Tiền thuê bao điện kế/tháng: " +tienThueBaoDienKe);
        System.out.println("Tiền trả định mức: "+ tienTraDinhMuc);
        System.out.println("Tiền trả vượt định mức: " + tienTraVuotDinhMuc);
        System.out.println("Tổng tiền phải trả: " + tongTienPhaiTra);
    }

    public static void main(String[] args) {
        TinhTienDien tinhTienDien = new TinhTienDien();
        tinhTienDien.nhapDL();
        tinhTienDien.xuLy();
        tinhTienDien.hienThi();
    }
}
