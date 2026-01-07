# Xử Lý Ngoại Lệ với Try-Catch trong Java

## Giới thiệu
**Exception (Ngoại lệ)** là sự kiện xảy ra trong quá trình thực thi chương trình, làm gián đoạn luồng hoạt động bình thường. Java cung cấp cơ chế xử lý ngoại lệ giúp chương trình ổn định và đáng tin cậy hơn.

---

## 1. Tại sao cần xử lý ngoại lệ?

### Không có xử lý ngoại lệ
```java
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int ketQua = a / b;  // Lỗi! Chia cho 0
        System.out.println("Kết quả: " + ketQua);  // Không bao giờ chạy đến
    }
}
```

**Kết quả:** Chương trình crash với `ArithmeticException`

### Có xử lý ngoại lệ
```java
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        
        try {
            int ketQua = a / b;
            System.out.println("Kết quả: " + ketQua);
        } catch (ArithmeticException e) {
            System.out.println("Lỗi: Không thể chia cho 0!");
        }
        
        System.out.println("Chương trình vẫn tiếp tục chạy");
    }
}
```

**Kết quả:** 
```
Lỗi: Không thể chia cho 0!
Chương trình vẫn tiếp tục chạy
```

---

## 2. Cú pháp Try-Catch

### Cú pháp cơ bản
```java
try {
    // Code có thể gây ra ngoại lệ
} catch (LoạiNgoạiLệ tênBiến) {
    // Code xử lý khi ngoại lệ xảy ra
}
```

### Luồng thực thi
```
try block → [Có lỗi?] → catch block → tiếp tục chương trình
                ↓ [Không]
           tiếp tục chương trình
```

---

## 3. Các loại Exception phổ biến

| Exception | Nguyên nhân |
|-----------|-------------|
| `ArithmeticException` | Lỗi toán học (chia cho 0) |
| `NullPointerException` | Truy cập đối tượng null |
| `ArrayIndexOutOfBoundsException` | Truy cập index ngoài mảng |
| `NumberFormatException` | Chuyển đổi chuỗi không hợp lệ sang số |
| `InputMismatchException` | Input không đúng kiểu (Scanner) |
| `FileNotFoundException` | Không tìm thấy file |

---

## 4. Ví dụ các loại Exception

### ArithmeticException
```java
try {
    int ketQua = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Không thể chia cho 0!");
}
```

### ArrayIndexOutOfBoundsException
```java
int[] mang = {1, 2, 3};

try {
    System.out.println(mang[5]);  // Index 5 không tồn tại
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Index vượt quá kích thước mảng!");
}
```

### NullPointerException
```java
String chuoi = null;

try {
    System.out.println(chuoi.length());
} catch (NullPointerException e) {
    System.out.println("Chuỗi chưa được khởi tạo!");
}
```

### NumberFormatException
```java
try {
    int so = Integer.parseInt("abc");  // "abc" không phải số
} catch (NumberFormatException e) {
    System.out.println("Chuỗi không phải là số hợp lệ!");
}
```

### InputMismatchException
```java
import java.util.Scanner;
import java.util.InputMismatchException;

Scanner scanner = new Scanner(System.in);

try {
    System.out.print("Nhập số nguyên: ");
    int so = scanner.nextInt();  // Người dùng nhập "abc"
    System.out.println("Bạn đã nhập: " + so);
} catch (InputMismatchException e) {
    System.out.println("Vui lòng nhập số nguyên!");
}
```

---

## 5. Bắt nhiều Exception

### Cách 1: Nhiều khối catch riêng biệt
```java
try {
    int[] mang = {1, 2, 3};
    System.out.println(mang[5]);
    int ketQua = 10 / 0;
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Lỗi: Vượt quá kích thước mảng");
} catch (ArithmeticException e) {
    System.out.println("Lỗi: Chia cho 0");
}
```

### Cách 2: Gộp nhiều exception (Java 7+)
```java
try {
    // Code có thể gây nhiều loại exception
} catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
    System.out.println("Đã xảy ra lỗi: " + e.getMessage());
}
```

### Cách 3: Bắt tất cả với Exception
```java
try {
    // Code có thể gây exception
} catch (Exception e) {
    System.out.println("Đã xảy ra lỗi: " + e.getMessage());
}
```

> **Lưu ý:** Nên catch exception cụ thể trước, exception chung sau.

---

## 6. Các phương thức hữu ích của Exception

```java
try {
    int ketQua = 10 / 0;
} catch (ArithmeticException e) {
    // Lấy thông điệp lỗi
    System.out.println(e.getMessage());  // "/ by zero"
    
    // In ra stack trace (để debug)
    e.printStackTrace();
    
    // Lấy tên class của exception
    System.out.println(e.getClass().getName());  // java.lang.ArithmeticException
}
```

---

## 7. Nested Try-Catch

Có thể lồng try-catch bên trong nhau:

```java
try {
    System.out.println("Khối try ngoài");
    
    try {
        int ketQua = 10 / 0;
    } catch (ArithmeticException e) {
        System.out.println("Bắt trong khối try lồng");
    }
    
    int[] mang = {1, 2};
    System.out.println(mang[5]);
    
} catch (ArrayIndexOutOfBoundsException e) {
    System.out.println("Bắt ở khối try ngoài");
}
```

---

## 8. Best Practices

### ✅ Nên làm
```java
// Catch exception cụ thể
try {
    int so = Integer.parseInt(input);
} catch (NumberFormatException e) {
    System.out.println("Vui lòng nhập số hợp lệ");
}

// Log đầy đủ thông tin lỗi
catch (Exception e) {
    logger.error("Lỗi xử lý: " + e.getMessage(), e);
}
```

### ❌ Không nên làm
```java
// Catch và không làm gì (swallow exception)
try {
    // code
} catch (Exception e) {
    // Im lặng - RẤT TỆ!
}

// Catch quá chung
try {
    // code
} catch (Exception e) {
    System.out.println("Có lỗi!");  // Không biết lỗi gì
}
```

---

## Bài tập thực hành

### Bài 1: Xử lý chia số
Viết chương trình chia 2 số, xử lý trường hợp chia cho 0.

### Bài 2: Parse số an toàn
Viết chương trình chuyển đổi chuỗi sang số, xử lý chuỗi không hợp lệ.

### Bài 3: Truy cập mảng an toàn
Viết chương trình truy cập phần tử mảng, xử lý index không hợp lệ.

---

## Tổng kết

| Từ khóa | Mô tả |
|---------|-------|
| `try` | Bao bọc code có thể gây exception |
| `catch` | Bắt và xử lý exception |
| `Exception` | Class cha của mọi exception |
| `getMessage()` | Lấy thông điệp lỗi |
| `printStackTrace()` | In stack trace (debug) |
