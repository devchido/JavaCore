package Lab3.baitap.bai1;

public class TinhTongTu1Den100 {
    // todo: Tính tổng từ 1 đến 100
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 100; i++) {
            count += i;
        }
        System.out.println("Tổng từ 1 - 100: " + count);
    }
}
