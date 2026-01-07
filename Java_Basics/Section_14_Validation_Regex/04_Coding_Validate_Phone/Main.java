import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số điện thoại
        String phone = scanner.nextLine();

        // TODO: Kiểm tra số điện thoại Việt Nam hợp lệ
        // - 10 chữ số
        // - Bắt đầu bằng: 03, 05, 07, 08, 09
        // In "Valid" hoặc "Invalid"

        scanner.close();
    }
}
