package Lab2.baitap.bai1;

import java.util.Scanner;

public class Person {
    // todo: Bài 1: Tạo class có tên là Person và có các thuộc tỉnh sau đây:
    //  private String name;
    //  private String address;
    //  private double salary;
    //  + Tạo hàm input(): nhập thông tin cho Person
    //  + Tạo hàm view(): hiển thị thông tin cho Person
    //  + Tạo hàm main() để kiểm tra chương trình
    private String name, address;
    private double salary;

    public void nhapDuLieu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thông tin person.");
        System.out.println("Name: ");
        name = scanner.nextLine();
        System.out.println("Address: ");
        address = scanner.nextLine();
        System.out.println("Salary: ");
        salary = scanner.nextDouble();
    }

    public void view() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.nhapDuLieu();
        person.view();
    }
}
