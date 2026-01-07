# Regular Expression (Regex) trong Java

## Giới thiệu
**Regular Expression** (Regex) là một chuỗi ký tự đặc biệt dùng để mô tả một pattern (mẫu) tìm kiếm. Regex rất mạnh trong việc validate, tìm kiếm và thay thế chuỗi.

---

## 1. Cú pháp cơ bản

### Các ký tự đặc biệt

| Ký tự | Ý nghĩa | Ví dụ |
|-------|---------|-------|
| `.` | Bất kỳ ký tự nào | `a.c` → abc, adc, a1c |
| `*` | 0 hoặc nhiều lần | `ab*c` → ac, abc, abbc |
| `+` | 1 hoặc nhiều lần | `ab+c` → abc, abbc |
| `?` | 0 hoặc 1 lần | `ab?c` → ac, abc |
| `^` | Bắt đầu chuỗi | `^Hello` |
| `$` | Kết thúc chuỗi | `World$` |
| `\d` | Chữ số (0-9) | `\d+` → 123 |
| `\D` | Không phải chữ số | |
| `\w` | Word character (a-z, A-Z, 0-9, _) | |
| `\W` | Không phải word character | |
| `\s` | Khoảng trắng | |
| `\S` | Không phải khoảng trắng | |

### Quantifiers (Số lượng)

| Ký tự | Ý nghĩa |
|-------|---------|
| `{n}` | Đúng n lần |
| `{n,}` | Ít nhất n lần |
| `{n,m}` | Từ n đến m lần |

### Character Classes

| Ký tự | Ý nghĩa |
|-------|---------|
| `[abc]` | a hoặc b hoặc c |
| `[^abc]` | Không phải a, b, c |
| `[a-z]` | Chữ thường a đến z |
| `[A-Z]` | Chữ hoa A đến Z |
| `[0-9]` | Số 0 đến 9 |
| `[a-zA-Z]` | Chữ cái |
| `[a-zA-Z0-9]` | Chữ và số |

---

## 2. Sử dụng Regex trong Java

### Phương thức matches()
```java
String email = "test@email.com";
boolean valid = email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");
System.out.println(valid);  // true
```

### Pattern và Matcher
```java
import java.util.regex.Pattern;
import java.util.regex.Matcher;

String text = "Số điện thoại: 0901234567 và 0912345678";
Pattern pattern = Pattern.compile("\\d{10}");  // 10 chữ số
Matcher matcher = pattern.matcher(text);

while (matcher.find()) {
    System.out.println("Tìm thấy: " + matcher.group());
}
// Output:
// Tìm thấy: 0901234567
// Tìm thấy: 0912345678
```

---

## 3. Các Pattern phổ biến

### Số điện thoại Việt Nam
```java
// 10 số, bắt đầu bằng 0
String phonePattern = "^0\\d{9}$";

// Hoặc chi tiết hơn (các đầu số phổ biến)
String phonePattern2 = "^(03|05|07|08|09)\\d{8}$";

// Kiểm tra
String phone = "0901234567";
boolean valid = phone.matches(phonePattern);  // true
```

### Email
```java
String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";

String email = "test@email.com";
boolean valid = email.matches(emailPattern);  // true
```

### Username (chỉ chữ và số, 3-20 ký tự)
```java
String usernamePattern = "^[a-zA-Z0-9]{3,20}$";

String username = "john123";
boolean valid = username.matches(usernamePattern);  // true
```

### Password (ít nhất 8 ký tự, có chữ hoa, thường, số)
```java
String passwordPattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$";

String password = "Password123";
boolean valid = password.matches(passwordPattern);  // true
```

### Chỉ chứa chữ cái
```java
String letterPattern = "^[a-zA-Z]+$";

String name = "NguyenVanA";
boolean valid = name.matches(letterPattern);  // true
```

### Số nguyên dương
```java
String positiveIntPattern = "^[1-9]\\d*$";

String number = "123";
boolean valid = number.matches(positiveIntPattern);  // true
```

### Ngày tháng (dd/MM/yyyy)
```java
String datePattern = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}$";

String date = "15/06/2024";
boolean valid = date.matches(datePattern);  // true
```

---

## 4. Validation với Regex

### Tạo hàm validate Email
```java
public static boolean isValidEmail(String email) {
    String pattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    return email != null && email.matches(pattern);
}

// Sử dụng
if (isValidEmail("test@email.com")) {
    System.out.println("Email hợp lệ");
}
```

### Tạo hàm validate số điện thoại
```java
public static boolean isValidPhone(String phone) {
    String pattern = "^(03|05|07|08|09)\\d{8}$";
    return phone != null && phone.matches(pattern);
}
```

### Nhập với validation
```java
public static String nhapEmail(Scanner scanner) {
    String emailPattern = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
    
    while (true) {
        System.out.print("Nhập email: ");
        String email = scanner.nextLine().trim();
        
        if (email.matches(emailPattern)) {
            return email;
        }
        System.out.println("Email không hợp lệ! Ví dụ: example@email.com");
    }
}
```

---

## 5. Tìm kiếm và thay thế

### Tìm tất cả các số
```java
String text = "Điểm: Toán 8, Lý 9, Hóa 7";
Pattern pattern = Pattern.compile("\\d+");
Matcher matcher = pattern.matcher(text);

while (matcher.find()) {
    System.out.println(matcher.group());  // 8, 9, 7
}
```

### Thay thế
```java
String text = "Số điện thoại: 0901234567";

// Ẩn 6 số giữa
String hidden = text.replaceAll("(\\d{2})\\d{6}(\\d{2})", "$1******$2");
System.out.println(hidden);  // Số điện thoại: 09******67
```

### Xóa ký tự đặc biệt
```java
String input = "Hello! @World# $123";
String clean = input.replaceAll("[^a-zA-Z0-9\\s]", "");
System.out.println(clean);  // Hello World 123
```

---

## 6. Lưu ý quan trọng

### Escape trong Java
Trong Java, dấu `\` cần được escape thành `\\`:
```java
// Regex: \d+  →  Java: "\\d+"
// Regex: \s   →  Java: "\\s"
// Regex: \.   →  Java: "\\."
```

### Case-insensitive
```java
String text = "Hello World";
boolean match = text.matches("(?i)hello world");  // true
```

---

## 7. Ví dụ thực tế

### Validate form đăng ký
```java
public class UserValidator {
    public static boolean validateUsername(String username) {
        return username.matches("^[a-zA-Z][a-zA-Z0-9_]{2,19}$");
    }
    
    public static boolean validateEmail(String email) {
        return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");
    }
    
    public static boolean validatePhone(String phone) {
        return phone.matches("^(03|05|07|08|09)\\d{8}$");
    }
    
    public static boolean validatePassword(String password) {
        // Ít nhất 8 ký tự, có chữ hoa, thường, số
        return password.matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).{8,}$");
    }
}
```

---

## Tổng kết

| Pattern | Mô tả | Ví dụ |
|---------|-------|-------|
| `\\d{10}` | 10 chữ số | 0901234567 |
| `[a-zA-Z]+` | Chỉ chữ cái | Hello |
| `\\w+@\\w+\\.\\w+` | Email đơn giản | a@b.c |
| `^[A-Z]` | Bắt đầu bằng chữ hoa | |
| `\\d{2}/\\d{2}/\\d{4}` | Ngày dd/mm/yyyy | 01/01/2024 |
