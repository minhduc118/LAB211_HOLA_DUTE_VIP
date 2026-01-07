# Cấu Hình IDE

## IDE là gì?
IDE (Integrated Development Environment) là môi trường phát triển tích hợp giúp viết, chạy và debug code hiệu quả.

## Các IDE phổ biến cho Java

| IDE | Ưu điểm | Phù hợp với |
|-----|---------|-------------|
| **IntelliJ IDEA** | Mạnh mẽ, nhiều tính năng, smart | Professional |
| **Eclipse** | Miễn phí, phổ biến, nhiều plugin | Beginner/Pro |
| **VS Code** | Nhẹ, linh hoạt, đa năng | Beginner |
| **NetBeans** | Tích hợp tốt với Java | Beginner |

## Cài đặt IntelliJ IDEA (Khuyến nghị)

### Bước 1: Tải IntelliJ IDEA
- Truy cập: [jetbrains.com/idea](https://www.jetbrains.com/idea/)
- Chọn **Community Edition** (Miễn phí)

### Bước 2: Cài đặt
1. Chạy installer
2. Chọn các option: Add to PATH, Create Desktop Shortcut
3. Hoàn tất cài đặt

### Bước 3: Tạo Project đầu tiên
1. Mở IntelliJ IDEA
2. Chọn **New Project**
3. Chọn **Java** → Chọn JDK đã cài
4. Đặt tên project và nhấn **Create**

## Chương trình Java đầu tiên

### Cấu trúc cơ bản:
```java
// 1. Package declaration (tùy chọn)
package com.example;

// 2. Import statements (tùy chọn)
import java.util.Scanner;

// 3. Class declaration
public class HelloWorld {
    
    // 4. Main method - điểm bắt đầu chương trình
    public static void main(String[] args) {
        // 5. Statements
        System.out.println("Hello, World!");
    }
}
```

### Chạy chương trình:
- Trong IDE: Nhấn nút Run (▶) hoặc Shift + F10
- Command line:
```bash
javac HelloWorld.java    # Biên dịch
java HelloWorld          # Chạy
```

## Lưu ý quan trọng
- Tên file phải **trùng với tên class**: `HelloWorld.java`
- Java phân biệt chữ hoa/thường
- Mỗi câu lệnh kết thúc bằng dấu `;`
