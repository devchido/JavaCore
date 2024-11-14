package Lab3.baithuchanh;

public class BaiThucHanh2 {
    // todo: Chạy vòng lặp từ 0 tới 100, in ra màn hình những số là số chẵn,
    //  nếu tìm thấy số 69 thì in ra dòng chữ "Ơ Rê Ka — Tìm ra rồi!".
    //  Bước 1: Trong class DemoLoop tạo ở bài trên, viết thêm 1 hàm có tên là finder69()
    //  Bước 2: Dùng vòng lặp for để chạy i từ 0 đến 100, mỗi lần i tăng 1 đơn vị (i++).
    //  Bước 3: Để biết được số nào là chẵn ta chia lấy dư cho 2(ỉ%2) nếu bằng 0 tức là
    //  chẵn và in số đó ra màn hình.
    //  Bước 4: Viết mã code kiểm tra nếu i = 69 thì hiển thị ra màn hình câu thông báo. 0
    //  Bước 5: Trong hàm main gọi và chạy hàm finder69().

    public void finder69() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            if (i == 69) {
                System.out.println( i + " Tìm ra rồi.");
            }
        }
    }

    public static void main(String[] args) {
        BaiThucHanh2 bth2 = new BaiThucHanh2();
        bth2.finder69();
    }
}
