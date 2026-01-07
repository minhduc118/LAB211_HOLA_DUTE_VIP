import java.util.Scanner;

// TODO: Tạo class Calculator với method overloading
// - add(int a, int b): cộng 2 số nguyên
// - add(int a, int b, int c): cộng 3 số nguyên  
// - add(double a, double b): cộng 2 số thực

class Calculator {
    // TODO: Method cộng 2 số nguyên

    // TODO: Method cộng 3 số nguyên

    // TODO: Method cộng 2 số thực
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập 2 số nguyên
        int a1 = scanner.nextInt();
        int b1 = scanner.nextInt();

        // Nhập 3 số nguyên
        int a2 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int c2 = scanner.nextInt();

        // Nhập 2 số thực
        double a3 = scanner.nextDouble();
        double b3 = scanner.nextDouble();

        // TODO: Tạo object Calculator

        // TODO: Gọi 3 phương thức add() và in kết quả

        scanner.close();
    }
}
