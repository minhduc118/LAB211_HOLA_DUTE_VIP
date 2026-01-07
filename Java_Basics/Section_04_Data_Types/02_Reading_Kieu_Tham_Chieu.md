# Kiểu Dữ Liệu Tham Chiếu (Reference Types)

## Reference Types là gì?
Khác với Primitive Types lưu trực tiếp giá trị, **Reference Types** lưu địa chỉ tham chiếu đến đối tượng trong bộ nhớ.

## Các kiểu Reference phổ biến

### 1. String (Chuỗi ký tự)
```java
// Cách 1: String literal
String greeting = "Hello, World!";

// Cách 2: Sử dụng new
String name = new String("Java");

// Nối chuỗi
String fullName = "Nguyen" + " " + "Van A";

// Các phương thức String phổ biến
String text = "Hello Java";
int length = text.length();           // 10
String upper = text.toUpperCase();    // "HELLO JAVA"
String lower = text.toLowerCase();    // "hello java"
char firstChar = text.charAt(0);      // 'H'
boolean contains = text.contains("Java"); // true
```

### 2. Array (Mảng)
```java
// Khai báo và khởi tạo mảng
int[] numbers = {1, 2, 3, 4, 5};
String[] names = {"An", "Binh", "Chi"};

// Khai báo với kích thước
int[] scores = new int[5];

// Truy cập phần tử (index từ 0)
int firstNumber = numbers[0];  // 1
String firstName = names[0];   // "An"

// Độ dài mảng
int size = numbers.length;     // 5
```

### 3. Object
```java
// Mọi class đều kế thừa từ Object
Object obj = new Object();
Object str = "Hello";  // String cũng là Object
Object num = 100;      // Auto-boxing
```

### 4. Class tự định nghĩa
```java
// Định nghĩa class
class Student {
    String name;
    int age;
}

// Tạo đối tượng
Student student = new Student();
student.name = "An";
student.age = 20;
```

## So sánh Primitive vs Reference

| Đặc điểm | Primitive | Reference |
|----------|-----------|-----------|
| Lưu trữ | Giá trị trực tiếp | Địa chỉ tham chiếu |
| Giá trị mặc định | 0, false, '\u0000' | null |
| Kích thước | Cố định | Tùy đối tượng |
| So sánh | `==` so sánh giá trị | `==` so sánh địa chỉ |

## Lưu ý khi so sánh String

```java
String s1 = "Hello";
String s2 = "Hello";
String s3 = new String("Hello");

// So sánh địa chỉ (không nên dùng cho String)
System.out.println(s1 == s2);      // true (cùng literal pool)
System.out.println(s1 == s3);      // false (khác địa chỉ)

// So sánh nội dung (ĐÚNG CÁCH)
System.out.println(s1.equals(s3)); // true ✅
```

## Giá trị null

```java
String name = null;  // Không tham chiếu đến đối tượng nào

// Kiểm tra null trước khi sử dụng
if (name != null) {
    System.out.println(name.length());
}
```
