# Các Phương Thức Scanner Chi Tiết

## Bảng tổng hợp phương thức

| Phương thức | Kiểu trả về | Mô tả |
|-------------|-------------|-------|
| `nextByte()` | byte | Đọc số byte |
| `nextShort()` | short | Đọc số short |
| `nextInt()` | int | Đọc số nguyên |
| `nextLong()` | long | Đọc số long |
| `nextFloat()` | float | Đọc số thực float |
| `nextDouble()` | double | Đọc số thực double |
| `nextBoolean()` | boolean | Đọc true/false |
| `next()` | String | Đọc một từ |
| `nextLine()` | String | Đọc cả dòng |

## Ví dụ chi tiết với các kiểu dữ liệu

```java
import java.util.Scanner;

public class ScannerMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Nhập số nguyên
        System.out.print("Nhập tuổi (int): ");
        int age = sc.nextInt();
        
        // Nhập số thực
        System.out.print("Nhập điểm (double): ");
        double score = sc.nextDouble();
        
        // Nhập boolean
        System.out.print("Là sinh viên? (true/false): ");
        boolean isStudent = sc.nextBoolean();
        
        // Nhập một từ
        System.out.print("Nhập họ: ");
        String lastName = sc.next();
        
        // Clear buffer trước nextLine()
        sc.nextLine();
        
        // Nhập cả dòng
        System.out.print("Nhập họ tên đầy đủ: ");
        String fullName = sc.nextLine();
        
        // In kết quả
        System.out.println("\n=== THÔNG TIN ===");
        System.out.println("Tuổi: " + age);
        System.out.println("Điểm: " + score);
        System.out.println("Sinh viên: " + isStudent);
        System.out.println("Họ: " + lastName);
        System.out.println("Họ tên: " + fullName);
        
        sc.close();
    }
}
```

## ⚠️ Lỗi phổ biến: nextLine() sau nextInt()

### Vấn đề:
```java
Scanner sc = new Scanner(System.in);

System.out.print("Nhập số: ");
int number = sc.nextInt();       // Nhập: 5 + Enter

System.out.print("Nhập tên: ");
String name = sc.nextLine();     // ❌ BỊ BỎ QUA!
```

**Nguyên nhân**: `nextInt()` không đọc ký tự Enter (`\n`), để lại trong buffer. `nextLine()` đọc ngay ký tự Enter đó.

### Giải pháp 1: Thêm nextLine() để clear buffer
```java
Scanner sc = new Scanner(System.in);

System.out.print("Nhập số: ");
int number = sc.nextInt();
sc.nextLine();  // ✅ Đọc bỏ ký tự Enter

System.out.print("Nhập tên: ");
String name = sc.nextLine();  // Hoạt động đúng!
```

### Giải pháp 2: Dùng nextLine() + Integer.parseInt()
```java
Scanner sc = new Scanner(System.in);

System.out.print("Nhập số: ");
int number = Integer.parseInt(sc.nextLine());

System.out.print("Nhập tên: ");
String name = sc.nextLine();  // ✅ Không cần clear buffer
```

## Kiểm tra dữ liệu trước khi đọc

```java
Scanner sc = new Scanner(System.in);

System.out.print("Nhập số nguyên: ");

if (sc.hasNextInt()) {
    int num = sc.nextInt();
    System.out.println("Bạn nhập: " + num);
} else {
    System.out.println("Đó không phải số nguyên!");
}

sc.close();
```

| Phương thức kiểm tra | Mô tả |
|---------------------|-------|
| `hasNext()` | Có dữ liệu để đọc? |
| `hasNextInt()` | Dữ liệu tiếp theo là int? |
| `hasNextDouble()` | Dữ liệu tiếp theo là double? |
| `hasNextLine()` | Còn dòng tiếp theo? |
