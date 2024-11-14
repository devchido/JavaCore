package Lab3.baitap.bai12;

import java.util.Scanner;

public class DaySoFibonacci {
    // todo: In ra dãy fibonacci( 1 2 3 5 8 13 …)
    public static void main(String[] args) {
        int count;
        //Yêu cầu người dùng nhập số lớn nhất
        System.out.println("Enter the number of terms:");
        Scanner sc = new Scanner(System.in);
        count = sc.nextInt();
        // In dãy số fibonacci bằng vòng lặp
        vongLap(count);
        // In dãy số fibonacci bằng đệ quy
        deQuy(count);
    }
    public static void vongLap(int count) {
        // In dãy số fibonacci bằng vòng lặp
        System.out.println("In dãy số fibonacci bằng vòng lặp");
        int first_term = 0, second_term = 1, next_term, i;
        System.out.println("First " + count + " terms of Fibonacci series:");
        for (i = 0; i < count; i++) {
            if (i <= 1)
                next_term = i;
            else {
                next_term = first_term + second_term;
                first_term = second_term;
                second_term = next_term;
            }
            System.out.println(next_term);
        }
    }
    public static void deQuy(int count) {
        System.out.println("In dãy số fibonacci bằng đệ quy");
        int c = 0, i;
        System.out.println("Fibonacci series:");
        for (i = 1; i <= count; i++) {
            System.out.println(fibonacci_series(c));
            c++;
        }
    }
    public static int fibonacci_series(int num) {
        if (num == 0)
            return 0;
        else if (num == 1)
            return 1;
        else
            return (fibonacci_series(num - 1) + fibonacci_series(num - 2));
    }
}
