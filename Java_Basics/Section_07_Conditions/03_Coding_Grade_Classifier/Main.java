import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập điểm
        int score = scanner.nextInt();

        // TODO: Xếp loại học lực dựa trên điểm
        // 90-100: Excellent
        // 80-89: Good
        // 70-79: Fair
        // 60-69: Average
        // < 60: Poor

        scanner.close();
    }
}
