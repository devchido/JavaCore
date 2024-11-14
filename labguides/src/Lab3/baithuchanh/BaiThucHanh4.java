package Lab3.baithuchanh;

public class BaiThucHanh4 {
    // todo: Bài thực hành 4: Tìm trong khoảng từ 0—1000 tất cả những số chia hết cho 3,
    //  điều kiện là tìm đủ 10 số như vậy thì dừng.
    private void timSo() {
        System.out.println("Những số chia hết cho 3 là: ");
        for (int i = 0, count =0; i <= 1000; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
                count++;
                if (count == 10) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        BaiThucHanh4 bth4 = new BaiThucHanh4();
        bth4.timSo();
    }
}