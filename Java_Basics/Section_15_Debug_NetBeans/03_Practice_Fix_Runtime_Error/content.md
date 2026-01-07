# Thực Hành Debug: Sửa Lỗi Runtime

## Mô tả bài toán
Đoạn code dưới đây tìm phần tử lớn nhất trong mảng nhưng **BỊ CRASH** khi chạy. Hãy sử dụng Debug để tìm và sửa lỗi.

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
        
        // Tìm max - CÓ LỖI
        int max = arr[0];
        int maxIndex = 0;
        
        for (int i = 0; i <= arr.length; i++) {  // Lỗi
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        
        System.out.println(max);
        
        scanner.close();
    }
}
```

## Yêu cầu
1. Chạy code và quan sát lỗi
2. Sử dụng Debug để tìm nguyên nhân
3. Sửa code cho đúng

## Định dạng Input
- Dòng 1: Số lượng phần tử N
- Dòng 2: N số nguyên

## Định dạng Output
- Phần tử lớn nhất

## Ví dụ

**Input:**
```
5
3 7 2 9 5
```

**Expected Output:**
```
9
```

## Gợi ý Debug
1. Chạy chương trình, xem thông báo lỗi
2. Đặt breakpoint trong vòng lặp for
3. Theo dõi giá trị `i` và `arr.length`
4. Tìm điều kiện sai trong vòng lặp
