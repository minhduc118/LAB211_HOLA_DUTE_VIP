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

        // Nhập số cần tìm
        int target = scanner.nextInt();

        // TODO: Tìm vị trí đầu tiên của target trong mảng
        // In ra vị trí (0-indexed) hoặc -1 nếu không tìm thấy
        // Sử dụng break khi tìm thấy

        scanner.close();
    }
}
