package Lab3.baithuchanh;

public class BaiThucHanh3 {
    // todo: Bài thực hành 3: Viết một chương trình in ra màn hình tam giác vuông đặc bằng
    //  dấu * có chiều cao = 10.
    public void drawTriangle() {
        // vẽ tam giác vuông
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        // vẽ tam giác vuông đảo ngược
        for (int i = 10; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        BaiThucHanh3 baiThucHanh3 = new BaiThucHanh3();
        baiThucHanh3.drawTriangle();
    }
}
