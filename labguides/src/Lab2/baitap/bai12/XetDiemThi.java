package Lab2.baitap.bai12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class XetDiemThi {
    // todo: Viết chương trình nhập vào điểm 3 môn thi: Toán, Lý, Hóa của học sinh.
    //  Nếu tổng điểm >= 15 và không có môn nào dưới 4 thì in kết quả đậu.
    //  Nếu đậu mà các môn đều lớn hơn 5 thì in ra lời phê "Học đều các môn",
    //  ngược lại in ra "Học chưa đều các môn",
    //  các trường hợp khác là "Thi hỏng".
    private float diemToan, diemLy, diemHoa;
    private boolean status;

    public void nhapDL() {
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println("Nhập điêm toán: ");
                diemToan = sc.nextFloat();
                if (diemToan < 0 || diemToan > 10) {
                    System.out.println("Điểm thi không hợp lệ.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Định dạng không hợp lệ. Vui lòng nhập lại.");
                sc.next();
            }
        } while (true);

        do {
            try {
                System.out.println("Nhập điểm lý: ");
                diemLy = sc.nextFloat();
                if (diemLy < 0 || diemLy > 10) {
                    System.out.println("Điểm thi không hợp lệ.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Định dạng không hợp lệ. Vui lòng nhập lại.");
                sc.next();
            }
        } while (true);

        do {
            try {
                System.out.println("Nhập điểm hoá: ");
                diemHoa = sc.nextFloat();
                if (diemHoa < 0 || diemHoa > 10) {
                    System.out.println("Điểm thi không hợp lệ.");
                } else {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Định dạng không hợp lệ. Vui lòng nhập lại.");
                sc.next();
            }
        } while (true);

        hienThi();
        xetDiem();
    }

    public void xetDiem() {
        float tongDiem = diemToan + diemLy + diemHoa;

        if (tongDiem >= 15 && diemToan >= 4 && diemLy >= 4 && diemHoa >= 4) {
            System.out.println("Thi đậu.");
            // Lời phê
            if (diemToan > 5 && diemLy > 5 && diemHoa > 5) {
                System.out.println("Học đều các môn.");
            } else {
                System.out.println("Học chưa đều các môn.");
            }
        } else {
            System.out.println("Thi hỏng.");
        }
    }

    public void hienThi() {
        System.out.println("Điểm toán: " + diemToan);
        System.out.println("Điểm lý: " + diemLy);
        System.out.println("Điểm hoá: " + diemHoa);
    }

    public static void main(String[] args) {
        XetDiemThi xetDiemThi = new XetDiemThi();
        xetDiemThi.nhapDL();


    }
}
