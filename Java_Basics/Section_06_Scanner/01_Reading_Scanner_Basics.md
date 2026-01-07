# Scanner - Nhập Dữ Liệu Cơ Bản

## Scanner là gì?
`Scanner` là một class trong package `java.util` dùng để đọc dữ liệu từ bàn phím (hoặc các nguồn khác như file).

## Cách sử dụng Scanner

### Bước 1: Import
```java
import java.util.Scanner;
```

### Bước 2: Tạo đối tượng Scanner
```java
Scanner scanner = new Scanner(System.in);
```

### Bước 3: Sử dụng để nhập dữ liệu
```java
int number = scanner.nextInt();
String text = scanner.nextLine();
```

### Bước 4: Đóng Scanner (best practice)
```java
scanner.close();
```

## Ví dụ hoàn chỉnh

```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        // Tạo Scanner
        Scanner scanner = new Scanner(System.in);
        
        // Nhập tên
        System.out.print("Nhập tên: ");
        String name = scanner.nextLine();
        
        // Nhập tuổi
        System.out.print("Nhập tuổi: ");
        int age = scanner.nextInt();
        
        // In kết quả
        System.out.println("Xin chào " + name + ", " + age + " tuổi!");
        
        // Đóng scanner
        scanner.close();
    }
}
```

## Các phương thức nhập cơ bản

| Phương thức | Kiểu dữ liệu | Mô tả |
|-------------|--------------|-------|
| `nextInt()` | int | Đọc số nguyên |
| `nextDouble()` | double | Đọc số thực |
| `nextLine()` | String | Đọc cả dòng |
| `next()` | String | Đọc một từ (đến khoảng trắng) |
| `nextBoolean()` | boolean | Đọc true/false |

## Lưu ý quan trọng
- `nextLine()` đọc **cả dòng** (bao gồm khoảng trắng)
- `next()` chỉ đọc **một từ** (dừng ở khoảng trắng)
- Luôn import `java.util.Scanner` trước khi sử dụng
