package Lab3.baithuchanh;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BaiThucHanh5 {
    // todo: Bài thực hành 5: Viết một chương trình nhập vào một số bất kỳ từ 0-100 rồi in ra
    //  màn hình số viết bằng chữ.
    //  Ví dụ: nhập 69 thì in ra là "Sáu mươi chín".

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Nhập số cần chuyển đổi(Chỉ đọc đến hàng trăm tỷ): ");
            long number = scanner.nextLong();
            System.out.println("Chữ tiếng Việt: " + convertToWords(number));

        } catch (InputMismatchException e) {
            System.out.println("Giá trị nhập không hợp lệ, vui lòng thử lại.");
        }
    }

    // Hàm chuyển đổi số thành chữ tiếng Việt
    private static String convertToWords(long number) {
        // Trường hợp số 0
        if (number == 0) {
            return "không";
        }
        String result = ""; // Kết quả chữ tiếng Việt
        int lopIndex = 0; // Index của lớp (nghìn, triệu, tỷ)
        // Lặp qua từng lớp của số
        while (number > 0) {
            // Lấy 3 chữ số cuối cùng
            int chunk = (int) (number % 1000);
            if (chunk > 0) {
                // Chuyển đổi từng lớp thành chữ tiếng Việt và thêm vào kết quả
                String chunkWords = convertChunkToWords(chunk);
                if (lopIndex > 0) {
                    chunkWords += " " + convertLopToWords(lopIndex);
                }
                result = chunkWords + " " + result;
            }
            number /= 1000; // Loại bỏ 3 chữ số cuối cùng
            lopIndex++; // Chuyển sang lớp tiếp theo
        }
        // Trả về kết quả sau khi loại bỏ khoảng trắng ở đầu hoặc cuối
        return result.trim();
    }

    // Hàm chuyển đổi 3 chữ số thành chữ tiếng Việt
    private static String convertChunkToWords(int chunk) {
        String result = "";
        int tram = chunk / 100; // Chữ số hàng trăm
        int chuc = (chunk % 100) / 10; // Chữ số hàng chục
        int donvi = chunk % 10; // Index của lớp (nghìn, triệu, tỷ)
        // Chuyển đổi từng phần của 3 chữ số thành chữ tiếng Việt
        result += convertTramToWords(tram) + " " + convertChucToWords(chuc) + " " + convertDonViToWords(donvi, chuc);
        // Trả về kết quả sau khi loại bỏ khoảng trắng ở đầu hoặc cuối
        return result.trim();
    }

    // Hàm chuyển đổi chữ số hàng đơn vị thành chữ tiếng Việt
    private static String convertDonViToWords(int donvi, int chuc) {
        // Sử dụng switch để chuyển đổi từng chữ số thành chữ tiếng Việt
        switch (donvi) {
            case 0:
                return "";
            case 1:
                return (chuc > 1) ? "mốt" : "một";
            case 2:
                return "hai";
            case 3:
                return "ba";
            case 4:
                return (chuc > 0) ? "tư" : "bốn";
            case 5:
                return (chuc == 0 || chuc > 1) ? "lăm" : "năm";
            case 6:
                return "sáu";
            case 7:
                return "bảy";
            case 8:
                return "tám";
            case 9:
                return "chín";
            default:
                return "";
        }
    }

    // Hàm chuyển đổi từng lớp thành chữ tiếng Việt (nghìn, triệu, tỷ)
    private static String convertLopToWords(int lopIndex) {
        switch (lopIndex) {
            case 0:
                return "";
            case 1:
                return "nghìn";
            case 2:
                return "triệu";
            case 3:
                return "tỷ";
            default:
                return "";
        }
    }

    // Hàm chuyển đổi chữ số hàng chục thành chữ tiếng Việt
    private static String convertChucToWords(int chuc) {
        switch (chuc) {
            case 0:
                return "linh";
            case 1:
                return "mười";
            case 2:
                return "hai mươi";
            case 3:
                return "ba mươi";
            case 4:
                return "bốn mươi";
            case 5:
                return "năm mươi";
            case 6:
                return "sáu mươi";
            case 7:
                return "bảy mươi";
            case 8:
                return "tám mươi";
            case 9:
                return "chín mươi";
            default:
                return "";
        }
    }

    // Hàm chuyển đổi chữ số hàng trăm thành chữ tiếng Việt
    private static String convertTramToWords(int tram) {
        switch (tram) {
            case 0:
                return "";
            case 1:
                return "một trăm";
            case 2:
                return "hai trăm";
            case 3:
                return "ba trăm";
            case 4:
                return "bốn trăm";
            case 5:
                return "năm trăm";
            case 6:
                return "sáu trăm";
            case 7:
                return "bảy trăm";
            case 8:
                return "tám trăm";
            case 9:
                return "chín trăm";
            default:
                return "";
        }
    }
}