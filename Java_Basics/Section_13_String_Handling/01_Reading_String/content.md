# String trong Java

## Giới thiệu
**String** là một trong những class được sử dụng nhiều nhất trong Java. String đại diện cho một chuỗi các ký tự và là **immutable** (bất biến) - nghĩa là một khi được tạo, giá trị của String không thể thay đổi.

---

## 1. Khai báo và khởi tạo String

### Cách 1: String Literal
```java
String str1 = "Hello World";
String str2 = "Hello World";

// str1 và str2 trỏ đến cùng một object trong String Pool
System.out.println(str1 == str2);  // true
```

### Cách 2: Dùng từ khóa new
```java
String str3 = new String("Hello World");
String str4 = new String("Hello World");

// str3 và str4 là 2 object khác nhau trong Heap
System.out.println(str3 == str4);  // false
System.out.println(str3.equals(str4));  // true
```

---

## 2. String Pool

**String Pool** là vùng nhớ đặc biệt trong Heap lưu trữ các String literals.

```java
String s1 = "Java";  // Tạo trong String Pool
String s2 = "Java";  // Tái sử dụng từ Pool
String s3 = new String("Java");  // Tạo mới trong Heap

System.out.println(s1 == s2);  // true (cùng reference)
System.out.println(s1 == s3);  // false (khác reference)
System.out.println(s1.equals(s3));  // true (cùng nội dung)
```

---

## 3. Các phương thức String cơ bản

### Lấy thông tin
```java
String str = "Hello World";

// Độ dài
int len = str.length();  // 11

// Lấy ký tự tại vị trí
char ch = str.charAt(0);  // 'H'

// Kiểm tra rỗng
boolean empty = str.isEmpty();  // false
boolean blank = str.isBlank();  // false (Java 11+)
```

### Tìm kiếm
```java
String str = "Hello World";

// Tìm vị trí
int index = str.indexOf("World");  // 6
int lastIndex = str.lastIndexOf("o");  // 7

// Kiểm tra chứa
boolean contains = str.contains("World");  // true

// Kiểm tra bắt đầu/kết thúc
boolean starts = str.startsWith("Hello");  // true
boolean ends = str.endsWith("World");  // true
```

### Trích xuất chuỗi con
```java
String str = "Hello World";

// Substring
String sub1 = str.substring(6);      // "World"
String sub2 = str.substring(0, 5);   // "Hello"
```

### Chuyển đổi
```java
String str = "Hello World";

// Chuyển hoa/thường
String upper = str.toUpperCase();  // "HELLO WORLD"
String lower = str.toLowerCase();  // "hello world"

// Trim khoảng trắng
String s = "  Hello  ";
String trimmed = s.trim();  // "Hello"
String stripped = s.strip();  // "Hello" (Java 11+)
```

### Thay thế
```java
String str = "Hello World";

// Thay thế
String replaced = str.replace("World", "Java");  // "Hello Java"
String replacedAll = str.replaceAll("l", "L");  // "HeLLo WorLd"
```

### So sánh
```java
String str1 = "Hello";
String str2 = "hello";

// So sánh chính xác
boolean equal = str1.equals(str2);  // false

// So sánh không phân biệt hoa/thường
boolean equalIgnore = str1.equalsIgnoreCase(str2);  // true

// So sánh theo thứ tự từ điển
int compare = str1.compareTo(str2);  // số âm (H < h)
```

### Chia và nối
```java
// Chia chuỗi
String str = "apple,banana,orange";
String[] fruits = str.split(",");  // ["apple", "banana", "orange"]

// Nối chuỗi
String joined = String.join("-", "a", "b", "c");  // "a-b-c"
String joined2 = String.join(", ", fruits);  // "apple, banana, orange"
```

---

## 4. String Formatting

### Sử dụng String.format()
```java
String name = "An";
int age = 20;
double gpa = 8.5;

String result = String.format("Tên: %s, Tuổi: %d, GPA: %.2f", name, age, gpa);
// "Tên: An, Tuổi: 20, GPA: 8.50"
```

### Format specifiers phổ biến
| Specifier | Mô tả | Ví dụ |
|-----------|-------|-------|
| `%s` | String | `"Hello"` |
| `%d` | Integer | `123` |
| `%f` | Float/Double | `3.14` |
| `%.2f` | Float 2 số thập phân | `3.14` |
| `%n` | Xuống dòng | |
| `%%` | Ký tự % | `%` |

---

## 5. String Immutability (Bất biến)

String là **immutable** - mỗi thao tác tạo ra String mới:

```java
String str = "Hello";
str = str + " World";  // Tạo String mới, không sửa đổi String cũ

// Minh họa
String s1 = "Hello";
String s2 = s1;
s1 = s1 + " World";

System.out.println(s1);  // "Hello World"
System.out.println(s2);  // "Hello" (không đổi)
```

### Tại sao String là Immutable?
- **An toàn (Security)**: String thường dùng cho password, URL
- **Thread-safe**: An toàn trong môi trường đa luồng
- **Caching**: Có thể cache hashcode
- **String Pool**: Cho phép tái sử dụng

---

## 6. So sánh == và .equals()

```java
String s1 = "Hello";
String s2 = "Hello";
String s3 = new String("Hello");

// == so sánh reference (địa chỉ bộ nhớ)
System.out.println(s1 == s2);  // true (cùng String Pool)
System.out.println(s1 == s3);  // false (khác vùng nhớ)

// .equals() so sánh nội dung
System.out.println(s1.equals(s2));  // true
System.out.println(s1.equals(s3));  // true
```

> **Quy tắc**: Luôn dùng `.equals()` để so sánh nội dung String!

---

## 7. Chuyển đổi kiểu dữ liệu

### Số sang String
```java
int num = 123;
String str1 = String.valueOf(num);    // "123"
String str2 = Integer.toString(num);  // "123"
String str3 = num + "";               // "123"
```

### String sang số
```java
String str = "123";
int num1 = Integer.parseInt(str);     // 123
Integer num2 = Integer.valueOf(str);  // 123

String doubleStr = "3.14";
double d = Double.parseDouble(doubleStr);  // 3.14
```

---

## 8. Ví dụ thực tế

### Kiểm tra Palindrome
```java
public static boolean isPalindrome(String str) {
    str = str.toLowerCase().replaceAll(" ", "");
    int left = 0;
    int right = str.length() - 1;
    
    while (left < right) {
        if (str.charAt(left) != str.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }
    return true;
}

System.out.println(isPalindrome("A man a plan a canal Panama"));  // true
```

### Đếm từ
```java
public static int countWords(String str) {
    if (str == null || str.isEmpty()) return 0;
    String[] words = str.trim().split("\\s+");
    return words.length;
}

System.out.println(countWords("Hello World Java"));  // 3
```

---

## Tổng kết

| Phương thức | Mô tả |
|-------------|-------|
| `length()` | Độ dài chuỗi |
| `charAt(i)` | Ký tự tại vị trí i |
| `substring(start, end)` | Lấy chuỗi con |
| `indexOf(str)` | Tìm vị trí chuỗi con |
| `contains(str)` | Kiểm tra chứa chuỗi con |
| `equals(str)` | So sánh nội dung |
| `toUpperCase()` | Chuyển hoa |
| `toLowerCase()` | Chuyển thường |
| `trim()` | Xóa khoảng trắng đầu cuối |
| `replace(old, new)` | Thay thế |
| `split(regex)` | Chia chuỗi |
