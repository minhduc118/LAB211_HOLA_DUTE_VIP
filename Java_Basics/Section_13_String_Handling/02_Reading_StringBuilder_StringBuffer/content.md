# StringBuilder và StringBuffer trong Java

## Giới thiệu
Vì String là immutable, việc nối chuỗi nhiều lần sẽ tạo ra nhiều object và gây tốn bộ nhớ. **StringBuilder** và **StringBuffer** là giải pháp cho vấn đề này - chúng là **mutable** (có thể thay đổi).

---

## 1. Vấn đề với String Concatenation

```java
// Cách tệ: tạo nhiều object trung gian
String result = "";
for (int i = 0; i < 10000; i++) {
    result = result + i;  // Mỗi lần tạo String mới!
}
// Tạo ra khoảng 10000 String objects → Chậm và tốn bộ nhớ

// Cách tốt: dùng StringBuilder
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 10000; i++) {
    sb.append(i);  // Sửa đổi trực tiếp, không tạo object mới
}
String result = sb.toString();
```

---

## 2. StringBuilder

### Đặc điểm
- ✅ **Mutable**: Có thể thay đổi nội dung
- ✅ **Nhanh**: Không tạo object mới khi sửa đổi
- ❌ **Không thread-safe**: Không an toàn trong môi trường đa luồng
- ✅ **Khuyến khích**: Dùng khi không cần thread-safe

### Khởi tạo
```java
// Khởi tạo rỗng
StringBuilder sb1 = new StringBuilder();

// Khởi tạo với kích thước ban đầu
StringBuilder sb2 = new StringBuilder(100);

// Khởi tạo với chuỗi
StringBuilder sb3 = new StringBuilder("Hello");
```

### Các phương thức cơ bản

#### append() - Nối thêm
```java
StringBuilder sb = new StringBuilder();

sb.append("Hello");
sb.append(" ");
sb.append("World");
sb.append(123);
sb.append(true);

System.out.println(sb.toString());  // "Hello World123true"

// Method chaining
StringBuilder sb2 = new StringBuilder()
    .append("Hello")
    .append(" ")
    .append("World");
```

#### insert() - Chèn vào vị trí
```java
StringBuilder sb = new StringBuilder("Hello World");

sb.insert(6, "Beautiful ");
System.out.println(sb);  // "Hello Beautiful World"

sb.insert(0, ">>> ");
System.out.println(sb);  // ">>> Hello Beautiful World"
```

#### delete() - Xóa
```java
StringBuilder sb = new StringBuilder("Hello World");

// Xóa từ index 5 đến 10
sb.delete(5, 11);
System.out.println(sb);  // "Hello"

// Xóa ký tự tại index
sb.deleteCharAt(4);
System.out.println(sb);  // "Hell"
```

#### replace() - Thay thế
```java
StringBuilder sb = new StringBuilder("Hello World");

sb.replace(6, 11, "Java");
System.out.println(sb);  // "Hello Java"
```

#### reverse() - Đảo ngược
```java
StringBuilder sb = new StringBuilder("Hello");

sb.reverse();
System.out.println(sb);  // "olleH"
```

#### Các phương thức khác
```java
StringBuilder sb = new StringBuilder("Hello World");

// Lấy độ dài
int length = sb.length();  // 11

// Lấy ký tự tại vị trí
char ch = sb.charAt(0);  // 'H'

// Đặt ký tự tại vị trí
sb.setCharAt(0, 'h');
System.out.println(sb);  // "hello World"

// Lấy substring
String sub = sb.substring(0, 5);  // "hello"

// Chuyển thành String
String str = sb.toString();
```

---

## 3. StringBuffer

### Đặc điểm
- ✅ **Mutable**: Có thể thay đổi nội dung
- ✅ **Thread-safe**: An toàn trong môi trường đa luồng
- ❌ **Chậm hơn StringBuilder**: Do synchronized
- ✅ **Dùng khi**: Cần thread-safe

### Cách sử dụng (giống StringBuilder)
```java
StringBuffer sb = new StringBuffer();

sb.append("Hello");
sb.append(" World");
sb.insert(5, " Beautiful");
sb.reverse();

System.out.println(sb.toString());
```

---

## 4. So sánh String, StringBuilder, StringBuffer

| Tiêu chí | String | StringBuilder | StringBuffer |
|----------|--------|---------------|--------------|
| Mutable | ❌ Không | ✅ Có | ✅ Có |
| Thread-safe | ✅ Có | ❌ Không | ✅ Có |
| Hiệu suất | Chậm nhất | Nhanh nhất | Trung bình |
| Khi dùng | Chuỗi ít thay đổi | Single-thread | Multi-thread |

### Performance Demo
```java
// Test với 100000 lần nối chuỗi

// String - Rất chậm (~5000ms)
String s = "";
for (int i = 0; i < 100000; i++) {
    s = s + i;
}

// StringBuilder - Rất nhanh (~5ms)
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 100000; i++) {
    sb.append(i);
}

// StringBuffer - Nhanh (~10ms)
StringBuffer sbf = new StringBuffer();
for (int i = 0; i < 100000; i++) {
    sbf.append(i);
}
```

---

## 5. Khi nào dùng cái nào?

### Dùng String khi:
- Chuỗi **ít hoặc không thay đổi**
- Cần **immutability** cho security
- Số lần nối chuỗi **rất ít** (< 5 lần)

### Dùng StringBuilder khi:
- Nối chuỗi **nhiều lần** trong vòng lặp
- Chương trình **single-threaded**
- Cần **hiệu suất cao nhất**

### Dùng StringBuffer khi:
- Nối chuỗi **nhiều lần** trong vòng lặp
- Chương trình **multi-threaded**
- Cần **thread-safety**

---

## 6. Ví dụ thực tế

### Xây dựng HTML
```java
public static String buildHtmlTable(String[][] data) {
    StringBuilder html = new StringBuilder();
    
    html.append("<table>\n");
    for (String[] row : data) {
        html.append("  <tr>\n");
        for (String cell : row) {
            html.append("    <td>").append(cell).append("</td>\n");
        }
        html.append("  </tr>\n");
    }
    html.append("</table>");
    
    return html.toString();
}
```

### Đảo ngược chuỗi
```java
public static String reverseString(String str) {
    return new StringBuilder(str).reverse().toString();
}

System.out.println(reverseString("Hello"));  // "olleH"
```

### Kiểm tra Palindrome
```java
public static boolean isPalindrome(String str) {
    String reversed = new StringBuilder(str).reverse().toString();
    return str.equalsIgnoreCase(reversed);
}

System.out.println(isPalindrome("Madam"));  // true
```

---

## 7. Best Practices

### ✅ Nên làm
```java
// Khởi tạo với capacity nếu biết trước kích thước
StringBuilder sb = new StringBuilder(1000);

// Dùng StringBuilder trong vòng lặp
StringBuilder result = new StringBuilder();
for (String item : items) {
    result.append(item).append(",");
}
```

### ❌ Không nên làm
```java
// Không dùng String trong vòng lặp
String result = "";
for (String item : items) {
    result += item + ",";  // Tệ!
}
```

---

## Tổng kết

| Phương thức | Mô tả |
|-------------|-------|
| `append(x)` | Nối thêm vào cuối |
| `insert(index, x)` | Chèn vào vị trí |
| `delete(start, end)` | Xóa từ start đến end |
| `deleteCharAt(index)` | Xóa ký tự tại vị trí |
| `replace(start, end, str)` | Thay thế |
| `reverse()` | Đảo ngược |
| `toString()` | Chuyển thành String |
| `length()` | Lấy độ dài |
| `charAt(index)` | Lấy ký tự tại vị trí |
