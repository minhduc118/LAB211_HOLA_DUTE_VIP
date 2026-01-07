# Finally, Throw và Throws trong Java

## Phần 1: Khối Finally

### Giới thiệu
Khối `finally` chứa code **luôn được thực thi** dù có xảy ra exception hay không. Thường dùng để giải phóng tài nguyên (đóng file, kết nối database...).

### Cú pháp
```java
try {
    // Code có thể gây exception
} catch (Exception e) {
    // Xử lý exception
} finally {
    // Code LUÔN chạy
}
```

---

### Ví dụ Finally

#### Trường hợp không có exception
```java
try {
    System.out.println("Trong try");
    int ketQua = 10 / 2;  // Không lỗi
    System.out.println("Kết quả: " + ketQua);
} catch (ArithmeticException e) {
    System.out.println("Trong catch");
} finally {
    System.out.println("Trong finally");
}
```

**Output:**
```
Trong try
Kết quả: 5
Trong finally
```

#### Trường hợp có exception
```java
try {
    System.out.println("Trong try");
    int ketQua = 10 / 0;  // Có lỗi
    System.out.println("Kết quả: " + ketQua);
} catch (ArithmeticException e) {
    System.out.println("Trong catch");
} finally {
    System.out.println("Trong finally");
}
```

**Output:**
```
Trong try
Trong catch
Trong finally
```

---

### Ứng dụng thực tế của Finally

#### Đóng tài nguyên
```java
FileReader reader = null;

try {
    reader = new FileReader("data.txt");
    // Đọc file...
} catch (IOException e) {
    System.out.println("Lỗi đọc file: " + e.getMessage());
} finally {
    // Luôn đóng file, dù có lỗi hay không
    if (reader != null) {
        try {
            reader.close();
        } catch (IOException e) {
            System.out.println("Lỗi đóng file");
        }
    }
}
```

#### Try-with-resources (Java 7+) - Cách tốt hơn
```java
try (FileReader reader = new FileReader("data.txt")) {
    // Đọc file...
} catch (IOException e) {
    System.out.println("Lỗi: " + e.getMessage());
}
// reader tự động đóng
```

---

### Finally với return

`finally` vẫn chạy ngay cả khi có `return` trong try hoặc catch:

```java
public static int test() {
    try {
        System.out.println("Try");
        return 1;
    } catch (Exception e) {
        System.out.println("Catch");
        return 2;
    } finally {
        System.out.println("Finally");  // Vẫn chạy!
    }
}

// Output khi gọi test():
// Try
// Finally
// Return: 1
```

---

## Phần 2: Throw

### Giới thiệu
`throw` dùng để **ném ra một exception** một cách chủ động.

### Cú pháp
```java
throw new LoạiException("Thông điệp lỗi");
```

---

### Ví dụ Throw

#### Kiểm tra tuổi hợp lệ
```java
public static void kiemTraTuoi(int tuoi) {
    if (tuoi < 0) {
        throw new IllegalArgumentException("Tuổi không thể âm!");
    }
    if (tuoi > 150) {
        throw new IllegalArgumentException("Tuổi không hợp lệ!");
    }
    System.out.println("Tuổi hợp lệ: " + tuoi);
}

public static void main(String[] args) {
    try {
        kiemTraTuoi(-5);
    } catch (IllegalArgumentException e) {
        System.out.println("Lỗi: " + e.getMessage());
    }
}
```

**Output:** `Lỗi: Tuổi không thể âm!`

#### Validate input
```java
public static void kiemTraChuoi(String str) {
    if (str == null) {
        throw new NullPointerException("Chuỗi không được null!");
    }
    if (str.isEmpty()) {
        throw new IllegalArgumentException("Chuỗi không được rỗng!");
    }
    System.out.println("Chuỗi hợp lệ: " + str);
}
```

---

### Các Exception thường throw

| Exception | Khi sử dụng |
|-----------|-------------|
| `IllegalArgumentException` | Tham số không hợp lệ |
| `NullPointerException` | Giá trị null không được chấp nhận |
| `IllegalStateException` | Trạng thái đối tượng không phù hợp |
| `IndexOutOfBoundsException` | Index ngoài phạm vi |

---

## Phần 3: Throws

### Giới thiệu
`throws` khai báo rằng method **có thể ném ra exception**, và **chuyển trách nhiệm xử lý** cho nơi gọi method.

### Cú pháp
```java
public void tênMethod() throws LoạiException1, LoạiException2 {
    // Code có thể gây exception
}
```

---

### Ví dụ Throws

#### Đọc file
```java
import java.io.*;

public class Main {
    // Method khai báo có thể ném IOException
    public static void docFile(String tenFile) throws IOException {
        FileReader reader = new FileReader(tenFile);
        // Đọc file...
        reader.close();
    }
    
    public static void main(String[] args) {
        try {
            docFile("data.txt");
        } catch (IOException e) {
            System.out.println("Lỗi đọc file: " + e.getMessage());
        }
    }
}
```

#### Nhiều exception
```java
public static int tinhChia(String a, String b) 
        throws NumberFormatException, ArithmeticException {
    int so1 = Integer.parseInt(a);
    int so2 = Integer.parseInt(b);
    return so1 / so2;
}
```

---

### So sánh throw và throws

| Tiêu chí | throw | throws |
|----------|-------|--------|
| Vị trí | Trong thân method | Sau khai báo method |
| Mục đích | Ném exception | Khai báo exception có thể ném |
| Số lượng | Một exception | Nhiều exception |
| Ví dụ | `throw new Exception()` | `method() throws Exception` |

```java
// throws: khai báo
public void method() throws IOException {
    // throw: ném
    throw new IOException("Lỗi I/O");
}
```

---

## Phần 4: Checked vs Unchecked Exception

### Checked Exception
- **Bắt buộc** xử lý hoặc khai báo throws
- Compile-time exception
- Ví dụ: `IOException`, `SQLException`, `FileNotFoundException`

```java
// Bắt buộc try-catch hoặc throws
public void docFile() throws IOException {
    FileReader reader = new FileReader("file.txt");
}
```

### Unchecked Exception
- **Không bắt buộc** xử lý
- Runtime exception
- Ví dụ: `NullPointerException`, `ArithmeticException`, `ArrayIndexOutOfBoundsException`

```java
// Không bắt buộc try-catch
public void tinh() {
    int x = 10 / 0;  // Có thể crash
}
```

### Sơ đồ phân cấp
```
Throwable
├── Error (Lỗi hệ thống, không xử lý)
│   ├── OutOfMemoryError
│   └── StackOverflowError
└── Exception
    ├── RuntimeException (Unchecked)
    │   ├── NullPointerException
    │   ├── ArithmeticException
    │   └── ArrayIndexOutOfBoundsException
    └── Checked Exception
        ├── IOException
        ├── SQLException
        └── FileNotFoundException
```

---

## Phần 5: Tạo Custom Exception

```java
// Custom Exception
public class TuoiKhongHopLeException extends Exception {
    public TuoiKhongHopLeException(String message) {
        super(message);
    }
}

// Sử dụng
public class Main {
    public static void kiemTraTuoi(int tuoi) throws TuoiKhongHopLeException {
        if (tuoi < 0 || tuoi > 150) {
            throw new TuoiKhongHopLeException("Tuổi phải từ 0 đến 150");
        }
        System.out.println("Tuổi hợp lệ: " + tuoi);
    }
    
    public static void main(String[] args) {
        try {
            kiemTraTuoi(-5);
        } catch (TuoiKhongHopLeException e) {
            System.out.println("Lỗi: " + e.getMessage());
        }
    }
}
```

---

## Best Practices

### ✅ Nên làm
```java
// Sử dụng finally để cleanup
try {
    // code
} finally {
    closeResources();
}

// Throw exception cụ thể với message rõ ràng
if (age < 0) {
    throw new IllegalArgumentException("Age cannot be negative: " + age);
}
```

### ❌ Không nên làm
```java
// Throws Exception chung chung
public void method() throws Exception {  // Quá chung
    // code
}

// Không bao giờ throw Exception cha
throw new Exception();  // Quá chung
```

---

## Tổng kết

| Từ khóa | Mô tả |
|---------|-------|
| `finally` | Code luôn chạy sau try-catch |
| `throw` | Ném exception chủ động |
| `throws` | Khai báo exception có thể ném |
| Checked | Bắt buộc xử lý |
| Unchecked | Không bắt buộc xử lý |
