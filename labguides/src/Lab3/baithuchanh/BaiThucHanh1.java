package Lab3.baithuchanh;

public class BaiThucHanh1 {
    // todo: Bài thực hành 1: Viết một chương trình in ra màn hình các chữ cái từ A đến Z.
    //  Bước 1: khởi tạo class có hàm main có tên là DemoLoop.
    //  Bước 2: vận dụng vòng lặp for để viết chương trình in ra chữ cái.
    //  Lưu ý là mã mỗi chữ cái là 1 số kiểu int, khi in ra cần ép kiều về char.
    public static void main(String[] args) {
        for (int i = 'A'; i <= 'Z'; i++) {
            System.out.println((char) i);
        }
    }
}
