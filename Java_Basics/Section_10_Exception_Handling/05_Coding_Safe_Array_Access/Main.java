import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập số lượng phần tử
        int n = scanner.nextInt();

        // Nhập mảng
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // Nhập index cần truy cập
        int index = scanner.nextInt();

        // TODO: Truy cập phần tử tại index với xử lý ngoại lệ
        // Nếu index hợp lệ, in ra giá trị
        // Nếu không hợp lệ, in "Error: Index out of bounds"

        scanner.close();
    }
}
