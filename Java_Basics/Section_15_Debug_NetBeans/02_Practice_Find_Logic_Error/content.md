# Thực Hành Debug: Tìm Lỗi Logic

## Mô tả bài toán
Đoạn code dưới đây tính trung bình cộng của một mảng số nguyên nhưng cho kết quả **SAI**. Hãy sử dụng công cụ Debug của NetBeans để tìm và sửa lỗi.

## Code có lỗi

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // Tính trung bình - CÓ LỖI
        int sum = 0;
        for (int i = 1; i <= n; i++) {  // Lỗi 1
            sum += arr[i];
        }
        
        double average = sum / n;  // Lỗi 2
        
        System.out.printf("%.2f", average);
        
        scanner.close();
    }
}
```

## Yêu cầu
1. Copy code vào NetBeans
2. Đặt breakpoint và debug để tìm lỗi
3. Sửa code cho đúng
4. Chương trình phải in ra trung bình cộng đúng (2 chữ số thập phân)

## Định dạng Input
- Dòng 1: Số lượng phần tử N
- Dòng 2: N số nguyên cách nhau bởi dấu cách

## Định dạng Output
- Trung bình cộng (làm tròn 2 chữ số thập phân)

## Ví dụ

**Input:**
```
5
10 20 30 40 50
```

**Expected Output:**
```
30.00
```

## Gợi ý Debug
1. Đặt breakpoint tại dòng `sum += arr[i];`
2. Chạy debug và theo dõi giá trị `i`
3. Kiểm tra xem vòng lặp có đúng không
4. Kiểm tra công thức tính average
