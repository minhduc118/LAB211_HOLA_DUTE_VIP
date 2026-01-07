# Java Basics: Hướng Dẫn Toàn Diện
## Setup, Variable, Data Type, Operator, Scanner

---

## Mục Lục
1. [Giới thiệu về Java](#1-giới-thiệu-về-java)
2. [Cài đặt môi trường (Setup)](#2-cài-đặt-môi-trường-setup)
3. [Biến (Variable)](#3-biến-variable)
4. [Kiểu dữ liệu (Data Type)](#4-kiểu-dữ-liệu-data-type)
5. [Toán tử (Operator)](#5-toán-tử-operator)
6. [Scanner - Nhập dữ liệu](#6-scanner---nhập-dữ-liệu)
7. [Bài tập thực hành](#7-bài-tập-thực-hành)

---

## 1. Giới thiệu về Java

### 1.1. Java là gì?
Java là một ngôn ngữ lập trình hướng đối tượng (OOP), được phát triển bởi **Sun Microsystems** (nay thuộc Oracle) vào năm 1995.

### 1.2. Đặc điểm của Java
| Đặc điểm | Mô tả |
|----------|-------|
| **Platform Independent** | "Write Once, Run Anywhere" - Chạy trên mọi nền tảng có JVM |
| **Object-Oriented** | Hỗ trợ lập trình hướng đối tượng hoàn toàn |
| **Simple** | Cú pháp đơn giản, dễ học |
| **Secure** | Bảo mật cao với nhiều tính năng an toàn |
| **Robust** | Mạnh mẽ với cơ chế quản lý bộ nhớ tự động |

### 1.3. Cách Java hoạt động

```
┌─────────────────┐    ┌─────────────────┐    ┌─────────────────┐
│   Source Code   │ => │    Bytecode     │ => │   Machine Code  │
│   (.java file)  │    │   (.class file) │    │                 │
└─────────────────┘    └─────────────────┘    └─────────────────┘
        ↓                      ↓                      ↓
    Viết code            javac compile           JVM thực thi
```

---

## 2. Cài đặt môi trường (Setup)

### 2.1. Cài đặt JDK (Java Development Kit)

#### Bước 1: Tải JDK
- Truy cập: [Oracle JDK Download](https://www.oracle.com/java/technologies/downloads/)
- Hoặc sử dụng **OpenJDK**: [AdoptOpenJDK](https://adoptium.net/)

#### Bước 2: Cài đặt JDK
- Chạy file installer đã tải
- Chọn đường dẫn cài đặt (mặc định: `C:\Program Files\Java\jdk-xx`)

#### Bước 3: Cấu hình biến môi trường

**Windows:**
```
1. Mở System Properties → Advanced → Environment Variables
2. Thêm biến JAVA_HOME:
   - Variable name: JAVA_HOME
   - Variable value: C:\Program Files\Java\jdk-xx

3. Thêm vào PATH:
   - %JAVA_HOME%\bin
```

**macOS/Linux:**
```bash
# Thêm vào file ~/.bashrc hoặc ~/.zshrc
export JAVA_HOME=/usr/lib/jvm/java-xx
export PATH=$PATH:$JAVA_HOME/bin
```

#### Bước 4: Kiểm tra cài đặt
```bash
java -version
javac -version
```

**Kết quả mong đợi:**
```
java version "17.0.x" 2024-xx-xx LTS
Java(TM) SE Runtime Environment (build 17.0.x+xx)
Java HotSpot(TM) 64-Bit Server VM (build 17.0.x+xx, mixed mode)
```

### 2.2. Cài đặt IDE

| IDE | Ưu điểm | Link tải |
|-----|---------|----------|
| **IntelliJ IDEA** | Mạnh mẽ, nhiều tính năng | [Download](https://www.jetbrains.com/idea/) |
| **Eclipse** | Miễn phí, phổ biến | [Download](https://www.eclipse.org/) |
| **VS Code** | Nhẹ, linh hoạt | [Download](https://code.visualstudio.com/) |
| **NetBeans** | Tích hợp tốt với Java | [Download](https://netbeans.apache.org/) |

### 2.3. Chương trình Java đầu tiên

```java
// File: HelloWorld.java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

**Biên dịch và chạy:**
```bash
javac HelloWorld.java    # Biên dịch → tạo HelloWorld.class
java HelloWorld          # Chạy chương trình
```

### 2.4. Cấu trúc cơ bản của chương trình Java

```java
// 1. Package declaration (tùy chọn)
package com.example;

// 2. Import statements (tùy chọn)
import java.util.Scanner;

// 3. Class declaration
public class ClassName {
    
    // 4. Main method - điểm bắt đầu chương trình
    public static void main(String[] args) {
        // 5. Statements - các câu lệnh
        System.out.println("Hello!");
    }
}
```

---

## 3. Biến (Variable)

### 3.1. Biến là gì?
Biến là **vùng nhớ** dùng để lưu trữ dữ liệu trong chương trình. Mỗi biến có:
- **Tên** (identifier)
- **Kiểu dữ liệu** (data type)
- **Giá trị** (value)

### 3.2. Khai báo biến

**Cú pháp:**
```java
dataType variableName;              // Khai báo
dataType variableName = value;      // Khai báo + khởi tạo
```

**Ví dụ:**
```java
// Khai báo biến
int age;
double salary;
String name;

// Khai báo và khởi tạo
int age = 25;
double salary = 50000.50;
String name = "Nguyen Van A";
boolean isStudent = true;
```

### 3.3. Quy tắc đặt tên biến

| Quy tắc | Hợp lệ | Không hợp lệ |
|---------|--------|--------------|
| Bắt đầu bằng chữ cái, `_`, hoặc `$` | `_count`, `$price`, `name` | `1name`, `@value` |
| Không chứa khoảng trắng | `firstName` | `first name` |
| Không dùng từ khóa Java | `myClass` | `class`, `int`, `for` |
| Phân biệt chữ hoa/thường | `Name` ≠ `name` | - |

### 3.4. Quy ước đặt tên (Naming Convention)

```java
// camelCase cho biến và phương thức
int studentAge;
String firstName;
double totalAmount;

// PascalCase cho class
class StudentInfo { }
class BankAccount { }

// UPPER_SNAKE_CASE cho hằng số
final int MAX_SIZE = 100;
final double PI = 3.14159;
```

### 3.5. Các loại biến

```java
public class VariableTypes {
    
    // 1. Instance Variable (Biến đối tượng)
    String instanceVar = "Instance";
    
    // 2. Static Variable (Biến tĩnh/Class variable)
    static int staticVar = 10;
    
    public void method() {
        // 3. Local Variable (Biến cục bộ)
        int localVar = 5;
        
        // 4. Parameter (Tham số)
    }
    
    public void example(int parameter) {
        // parameter là biến tham số
    }
}
```

| Loại biến | Phạm vi | Thời gian sống |
|-----------|---------|----------------|
| **Local** | Trong method/block | Khi method chạy |
| **Instance** | Trong class | Khi object tồn tại |
| **Static** | Trong class | Khi class được load |

### 3.6. Hằng số (Constants)

```java
// Khai báo hằng số với từ khóa final
final int MAX_STUDENTS = 50;
final double PI = 3.14159;
final String COMPANY_NAME = "DUTE Corporation";

// Không thể thay đổi giá trị
// MAX_STUDENTS = 60; // Lỗi: cannot assign a value to final variable
```

---

## 4. Kiểu dữ liệu (Data Type)

### 4.1. Phân loại kiểu dữ liệu

```
                    Data Types
                        │
        ┌───────────────┴───────────────┐
        │                               │
   Primitive                       Reference
   (Nguyên thủy)                   (Tham chiếu)
        │                               │
   ┌────┴────┐                    ┌─────┴─────┐
   │         │                    │           │
Numeric   Boolean               Class      Array
   │                           String      int[]
   │                           Object      String[]
┌──┴──┐
│     │
Integer  Floating-point
byte     float
short    double
int
long
char
```

### 4.2. Kiểu dữ liệu nguyên thủy (Primitive Types)

#### Bảng tổng hợp:

| Kiểu | Kích thước | Giá trị mặc định | Phạm vi |
|------|------------|------------------|---------|
| `byte` | 1 byte | 0 | -128 đến 127 |
| `short` | 2 bytes | 0 | -32,768 đến 32,767 |
| `int` | 4 bytes | 0 | -2³¹ đến 2³¹-1 |
| `long` | 8 bytes | 0L | -2⁶³ đến 2⁶³-1 |
| `float` | 4 bytes | 0.0f | ~±3.4E38 |
| `double` | 8 bytes | 0.0d | ~±1.7E308 |
| `char` | 2 bytes | '\u0000' | 0 đến 65,535 |
| `boolean` | 1 bit | false | true / false |

#### Ví dụ chi tiết:

```java
public class PrimitiveTypes {
    public static void main(String[] args) {
        
        // === KIỂU SỐ NGUYÊN ===
        byte byteVar = 127;              // Số nhỏ
        short shortVar = 32000;          // Số trung bình
        int intVar = 2000000000;         // Số thường dùng
        long longVar = 9000000000000L;   // Số rất lớn (có L ở cuối)
        
        // === KIỂU SỐ THỰC ===
        float floatVar = 3.14f;          // Độ chính xác đơn (có f)
        double doubleVar = 3.14159265;   // Độ chính xác kép
        
        // === KIỂU KÝ TỰ ===
        char charVar = 'A';              // Một ký tự
        char charUnicode = '\u0041';     // Ký tự Unicode (A)
        char charInt = 65;               // Ký tự từ số ASCII (A)
        
        // === KIỂU BOOLEAN ===
        boolean isActive = true;
        boolean isCompleted = false;
        
        // In ra màn hình
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + isActive);
    }
}
```

### 4.3. Kiểu dữ liệu tham chiếu (Reference Types)

```java
// String - Chuỗi ký tự
String greeting = "Hello, World!";
String name = new String("Java");

// Array - Mảng
int[] numbers = {1, 2, 3, 4, 5};
String[] names = {"An", "Binh", "Chi"};

// Object - Đối tượng
Object obj = new Object();

// Class tự định nghĩa
class Student {
    String name;
    int age;
}
Student student = new Student();
```

### 4.4. Ép kiểu (Type Casting)

#### Ép kiểu ngầm định (Widening/Implicit)
```java
// Tự động: nhỏ → lớn
byte → short → int → long → float → double

int intValue = 100;
long longValue = intValue;      // Tự động chuyển
double doubleValue = longValue; // Tự động chuyển

System.out.println(doubleValue); // 100.0
```

#### Ép kiểu tường minh (Narrowing/Explicit)
```java
// Cần khai báo: lớn → nhỏ
double → float → long → int → short → byte

double doubleValue = 9.78;
int intValue = (int) doubleValue;    // Cần (int)

System.out.println(intValue); // 9 (mất phần thập phân)
```

#### Ví dụ thực tế:
```java
public class TypeCasting {
    public static void main(String[] args) {
        // Widening - Tự động
        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myDouble); // 9.0
        
        // Narrowing - Cần ép kiểu
        double x = 9.78;
        int y = (int) x;
        System.out.println(y); // 9
        
        // String to int
        String str = "123";
        int num = Integer.parseInt(str);
        
        // int to String
        int number = 456;
        String text = String.valueOf(number);
        // hoặc
        String text2 = Integer.toString(number);
        String text3 = "" + number;
    }
}
```

### 4.5. Wrapper Classes

| Primitive | Wrapper Class |
|-----------|---------------|
| byte | Byte |
| short | Short |
| int | Integer |
| long | Long |
| float | Float |
| double | Double |
| char | Character |
| boolean | Boolean |

```java
// Boxing - primitive → object
int primitiveInt = 5;
Integer wrapperInt = Integer.valueOf(primitiveInt);
Integer autoBoxed = 10; // Auto-boxing

// Unboxing - object → primitive
Integer wrapperValue = 20;
int primitiveValue = wrapperValue.intValue();
int autoUnboxed = wrapperValue; // Auto-unboxing

// Các phương thức hữu ích
Integer.parseInt("123");        // String → int
Integer.toString(123);          // int → String
Integer.MAX_VALUE;              // Giá trị lớn nhất
Integer.MIN_VALUE;              // Giá trị nhỏ nhất
```

---

## 5. Toán tử (Operator)

### 5.1. Toán tử số học (Arithmetic Operators)

| Toán tử | Tên | Ví dụ | Kết quả |
|---------|-----|-------|---------|
| `+` | Cộng | `5 + 3` | `8` |
| `-` | Trừ | `5 - 3` | `2` |
| `*` | Nhân | `5 * 3` | `15` |
| `/` | Chia | `5 / 3` | `1` (chia nguyên) |
| `%` | Chia lấy dư | `5 % 3` | `2` |

```java
public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10, b = 3;
        
        System.out.println("a + b = " + (a + b));  // 13
        System.out.println("a - b = " + (a - b));  // 7
        System.out.println("a * b = " + (a * b));  // 30
        System.out.println("a / b = " + (a / b));  // 3 (chia nguyên)
        System.out.println("a % b = " + (a % b));  // 1
        
        // Chia số thực
        double x = 10.0, y = 3.0;
        System.out.println("x / y = " + (x / y)); // 3.3333...
    }
}
```

### 5.2. Toán tử gán (Assignment Operators)

| Toán tử | Ví dụ | Tương đương |
|---------|-------|-------------|
| `=` | `x = 5` | `x = 5` |
| `+=` | `x += 3` | `x = x + 3` |
| `-=` | `x -= 3` | `x = x - 3` |
| `*=` | `x *= 3` | `x = x * 3` |
| `/=` | `x /= 3` | `x = x / 3` |
| `%=` | `x %= 3` | `x = x % 3` |

```java
int x = 10;
x += 5;   // x = 15
x -= 3;   // x = 12
x *= 2;   // x = 24
x /= 4;   // x = 6
x %= 4;   // x = 2
```

### 5.3. Toán tử so sánh (Comparison Operators)

| Toán tử | Tên | Ví dụ | Kết quả |
|---------|-----|-------|---------|
| `==` | Bằng | `5 == 3` | `false` |
| `!=` | Không bằng | `5 != 3` | `true` |
| `>` | Lớn hơn | `5 > 3` | `true` |
| `<` | Nhỏ hơn | `5 < 3` | `false` |
| `>=` | Lớn hơn hoặc bằng | `5 >= 5` | `true` |
| `<=` | Nhỏ hơn hoặc bằng | `5 <= 3` | `false` |

```java
int a = 5, b = 3;

System.out.println(a == b);  // false
System.out.println(a != b);  // true
System.out.println(a > b);   // true
System.out.println(a < b);   // false
System.out.println(a >= 5);  // true
System.out.println(a <= 5);  // true

// So sánh String - KHÔNG dùng ==
String s1 = "Hello";
String s2 = "Hello";
System.out.println(s1.equals(s2)); // true (đúng cách)
```

### 5.4. Toán tử logic (Logical Operators)

| Toán tử | Tên | Mô tả |
|---------|-----|-------|
| `&&` | AND | true nếu CẢ HAI đều true |
| `\|\|` | OR | true nếu MỘT TRONG HAI true |
| `!` | NOT | Đảo ngược giá trị |

**Bảng chân trị:**

| A | B | A && B | A \|\| B | !A |
|---|---|--------|----------|-----|
| true | true | true | true | false |
| true | false | false | true | false |
| false | true | false | true | true |
| false | false | false | false | true |

```java
int age = 25;
boolean hasLicense = true;

// AND - cả hai điều kiện phải đúng
boolean canDrive = (age >= 18) && hasLicense;
System.out.println("Can drive: " + canDrive); // true

// OR - một trong hai điều kiện đúng
boolean isWeekend = true;
boolean isHoliday = false;
boolean dayOff = isWeekend || isHoliday;
System.out.println("Day off: " + dayOff); // true

// NOT - phủ định
boolean isRaining = false;
boolean goOutside = !isRaining;
System.out.println("Go outside: " + goOutside); // true
```

### 5.5. Toán tử tăng/giảm (Increment/Decrement)

| Toán tử | Tên | Mô tả |
|---------|-----|-------|
| `++x` | Pre-increment | Tăng trước, dùng sau |
| `x++` | Post-increment | Dùng trước, tăng sau |
| `--x` | Pre-decrement | Giảm trước, dùng sau |
| `x--` | Post-decrement | Dùng trước, giảm sau |

```java
int a = 5;

// Post-increment: dùng giá trị cũ, rồi tăng
System.out.println(a++); // In: 5, a = 6

// Pre-increment: tăng trước, rồi dùng
System.out.println(++a); // In: 7, a = 7

// Post-decrement
System.out.println(a--); // In: 7, a = 6

// Pre-decrement
System.out.println(--a); // In: 5, a = 5
```

### 5.6. Toán tử điều kiện (Ternary Operator)

**Cú pháp:**
```java
result = (condition) ? valueIfTrue : valueIfFalse;
```

```java
int age = 20;
String status = (age >= 18) ? "Người lớn" : "Trẻ em";
System.out.println(status); // Người lớn

// Tương đương với if-else
String status2;
if (age >= 18) {
    status2 = "Người lớn";
} else {
    status2 = "Trẻ em";
}

// Nested ternary (không khuyến khích)
int score = 85;
String grade = (score >= 90) ? "A" :
               (score >= 80) ? "B" :
               (score >= 70) ? "C" :
               (score >= 60) ? "D" : "F";
```

### 5.7. Thứ tự ưu tiên toán tử

| Ưu tiên | Toán tử | Mô tả |
|---------|---------|-------|
| 1 (cao nhất) | `()` | Ngoặc đơn |
| 2 | `++`, `--`, `!` | Unary |
| 3 | `*`, `/`, `%` | Nhân, chia |
| 4 | `+`, `-` | Cộng, trừ |
| 5 | `<`, `>`, `<=`, `>=` | So sánh |
| 6 | `==`, `!=` | Bằng, khác |
| 7 | `&&` | AND logic |
| 8 | `\|\|` | OR logic |
| 9 (thấp nhất) | `=`, `+=`, `-=` | Gán |

```java
// Ví dụ về thứ tự ưu tiên
int result = 2 + 3 * 4;      // 14 (không phải 20)
int result2 = (2 + 3) * 4;   // 20

boolean check = 5 > 3 && 10 < 20;  // true && true = true
```

---

## 6. Scanner - Nhập dữ liệu

### 6.1. Giới thiệu Scanner
`Scanner` là một class trong package `java.util` dùng để đọc dữ liệu từ các nguồn khác nhau (bàn phím, file, String).

### 6.2. Khởi tạo Scanner

```java
import java.util.Scanner;

public class ScannerBasics {
    public static void main(String[] args) {
        // Tạo Scanner đọc từ bàn phím
        Scanner scanner = new Scanner(System.in);
        
        // Sử dụng scanner...
        
        // Đóng scanner khi không dùng nữa
        scanner.close();
    }
}
```

### 6.3. Các phương thức nhập liệu

| Phương thức | Kiểu dữ liệu | Mô tả |
|-------------|--------------|-------|
| `nextByte()` | byte | Đọc số byte |
| `nextShort()` | short | Đọc số short |
| `nextInt()` | int | Đọc số nguyên |
| `nextLong()` | long | Đọc số long |
| `nextFloat()` | float | Đọc số thực float |
| `nextDouble()` | double | Đọc số thực double |
| `nextBoolean()` | boolean | Đọc true/false |
| `next()` | String | Đọc một từ (đến khoảng trắng) |
| `nextLine()` | String | Đọc cả dòng |

### 6.4. Ví dụ chi tiết

```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Nhập số nguyên
        System.out.print("Nhập tuổi: ");
        int age = scanner.nextInt();
        
        // Nhập số thực
        System.out.print("Nhập điểm trung bình: ");
        double gpa = scanner.nextDouble();
        
        // Nhập một từ
        System.out.print("Nhập họ: ");
        String lastName = scanner.next();
        
        // Xử lý buffer trước nextLine()
        scanner.nextLine(); // Đọc bỏ ký tự Enter còn lại
        
        // Nhập cả dòng
        System.out.print("Nhập tên đầy đủ: ");
        String fullName = scanner.nextLine();
        
        // Nhập boolean
        System.out.print("Bạn là sinh viên? (true/false): ");
        boolean isStudent = scanner.nextBoolean();
        
        // In kết quả
        System.out.println("\n=== THÔNG TIN ===");
        System.out.println("Tuổi: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Họ: " + lastName);
        System.out.println("Họ tên: " + fullName);
        System.out.println("Sinh viên: " + isStudent);
        
        scanner.close();
    }
}
```

### 6.5. Xử lý lỗi nextLine() sau next()/nextInt()

**Vấn đề phổ biến:**
```java
Scanner sc = new Scanner(System.in);

System.out.print("Nhập số: ");
int number = sc.nextInt();       // Nhập: 5 + Enter

System.out.print("Nhập tên: ");
String name = sc.nextLine();     // Bị bỏ qua! (đọc ký tự Enter)
```

**Giải pháp:**
```java
Scanner sc = new Scanner(System.in);

System.out.print("Nhập số: ");
int number = sc.nextInt();
sc.nextLine();  // Đọc bỏ ký tự Enter còn lại

System.out.print("Nhập tên: ");
String name = sc.nextLine();     // Hoạt động đúng
```

**Hoặc sử dụng nextLine() + parse:**
```java
Scanner sc = new Scanner(System.in);

System.out.print("Nhập số: ");
int number = Integer.parseInt(sc.nextLine());

System.out.print("Nhập tên: ");
String name = sc.nextLine();     // Không cần xử lý buffer
```

### 6.6. Kiểm tra dữ liệu nhập (Validation)

```java
import java.util.Scanner;

public class InputValidation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Kiểm tra trước khi đọc số nguyên
        System.out.print("Nhập một số nguyên: ");
        
        while (!scanner.hasNextInt()) {
            System.out.println("Đó không phải là số nguyên!");
            System.out.print("Vui lòng nhập lại: ");
            scanner.next(); // Đọc bỏ input không hợp lệ
        }
        
        int number = scanner.nextInt();
        System.out.println("Bạn đã nhập: " + number);
        
        scanner.close();
    }
}
```

### 6.7. Bảng các phương thức kiểm tra

| Phương thức | Mô tả |
|-------------|-------|
| `hasNext()` | Có dữ liệu để đọc? |
| `hasNextInt()` | Dữ liệu tiếp theo là int? |
| `hasNextDouble()` | Dữ liệu tiếp theo là double? |
| `hasNextLine()` | Còn dòng tiếp theo? |
| `hasNextBoolean()` | Dữ liệu tiếp theo là boolean? |

### 6.8. Ví dụ thực tế: Nhập thông tin sinh viên

```java
import java.util.Scanner;

public class StudentInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== NHẬP THÔNG TIN SINH VIÊN ===");
        
        // Nhập mã sinh viên
        System.out.print("Mã sinh viên: ");
        String studentId = scanner.nextLine();
        
        // Nhập họ tên
        System.out.print("Họ và tên: ");
        String fullName = scanner.nextLine();
        
        // Nhập tuổi với validation
        int age = 0;
        boolean validAge = false;
        while (!validAge) {
            System.out.print("Tuổi (18-60): ");
            if (scanner.hasNextInt()) {
                age = scanner.nextInt();
                if (age >= 18 && age <= 60) {
                    validAge = true;
                } else {
                    System.out.println("Tuổi phải từ 18 đến 60!");
                }
            } else {
                System.out.println("Vui lòng nhập số!");
                scanner.next();
            }
        }
        scanner.nextLine(); // Clear buffer
        
        // Nhập điểm
        System.out.print("Điểm trung bình (0-10): ");
        double gpa = scanner.nextDouble();
        
        // Hiển thị thông tin
        System.out.println("\n=== THÔNG TIN SINH VIÊN ===");
        System.out.println("Mã SV: " + studentId);
        System.out.println("Họ tên: " + fullName);
        System.out.println("Tuổi: " + age);
        System.out.printf("GPA: %.2f%n", gpa);
        
        // Xếp loại
        String rank;
        if (gpa >= 9.0) rank = "Xuất sắc";
        else if (gpa >= 8.0) rank = "Giỏi";
        else if (gpa >= 6.5) rank = "Khá";
        else if (gpa >= 5.0) rank = "Trung bình";
        else rank = "Yếu";
        
        System.out.println("Xếp loại: " + rank);
        
        scanner.close();
    }
}
```

---

## 7. Bài tập thực hành

### Bài 1: Tính toán cơ bản
Viết chương trình nhập 2 số, in ra kết quả các phép tính +, -, *, /, %.

```java
import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập số thứ nhất: ");
        double a = sc.nextDouble();
        
        System.out.print("Nhập số thứ hai: ");
        double b = sc.nextDouble();
        
        System.out.println("\n=== KẾT QUẢ ===");
        System.out.println(a + " + " + b + " = " + (a + b));
        System.out.println(a + " - " + b + " = " + (a - b));
        System.out.println(a + " * " + b + " = " + (a * b));
        System.out.println(a + " / " + b + " = " + (a / b));
        System.out.println(a + " % " + b + " = " + (a % b));
        
        sc.close();
    }
}
```

### Bài 2: Tính diện tích và chu vi
Viết chương trình tính diện tích và chu vi hình chữ nhật.

```java
import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập chiều dài: ");
        double length = sc.nextDouble();
        
        System.out.print("Nhập chiều rộng: ");
        double width = sc.nextDouble();
        
        double area = length * width;
        double perimeter = 2 * (length + width);
        
        System.out.printf("Diện tích: %.2f%n", area);
        System.out.printf("Chu vi: %.2f%n", perimeter);
        
        sc.close();
    }
}
```

### Bài 3: Chuyển đổi nhiệt độ
Viết chương trình chuyển đổi từ Celsius sang Fahrenheit và ngược lại.

```java
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Celsius -> Fahrenheit");
        System.out.println("2. Fahrenheit -> Celsius");
        System.out.print("Chọn (1/2): ");
        int choice = sc.nextInt();
        
        if (choice == 1) {
            System.out.print("Nhập nhiệt độ Celsius: ");
            double celsius = sc.nextDouble();
            double fahrenheit = (celsius * 9/5) + 32;
            System.out.printf("%.2f°C = %.2f°F%n", celsius, fahrenheit);
        } else if (choice == 2) {
            System.out.print("Nhập nhiệt độ Fahrenheit: ");
            double fahrenheit = sc.nextDouble();
            double celsius = (fahrenheit - 32) * 5/9;
            System.out.printf("%.2f°F = %.2f°C%n", fahrenheit, celsius);
        } else {
            System.out.println("Lựa chọn không hợp lệ!");
        }
        
        sc.close();
    }
}
```

### Bài 4: Kiểm tra số chẵn/lẻ
```java
import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập một số nguyên: ");
        int number = sc.nextInt();
        
        String result = (number % 2 == 0) ? "chẵn" : "lẻ";
        System.out.println(number + " là số " + result);
        
        sc.close();
    }
}
```

### Bài 5: Swap hai số
```java
import java.util.Scanner;

public class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Nhập số a: ");
        int a = sc.nextInt();
        
        System.out.print("Nhập số b: ");
        int b = sc.nextInt();
        
        System.out.println("Trước khi swap: a = " + a + ", b = " + b);
        
        // Cách 1: Dùng biến tạm
        int temp = a;
        a = b;
        b = temp;
        
        // Cách 2: Không dùng biến tạm
        // a = a + b;
        // b = a - b;
        // a = a - b;
        
        System.out.println("Sau khi swap: a = " + a + ", b = " + b);
        
        sc.close();
    }
}
```

---

## Tổng kết

| Chủ đề | Nội dung chính |
|--------|----------------|
| **Setup** | Cài đặt JDK, cấu hình PATH, chọn IDE |
| **Variable** | Khai báo, đặt tên, phạm vi biến |
| **Data Type** | 8 kiểu nguyên thủy, kiểu tham chiếu, ép kiểu |
| **Operator** | Số học, gán, so sánh, logic, tăng/giảm, điều kiện |
| **Scanner** | Nhập dữ liệu từ bàn phím với các phương thức nextXxx() |

---

## Tài liệu tham khảo
- [Oracle Java Documentation](https://docs.oracle.com/en/java/)
- [W3Schools Java Tutorial](https://www.w3schools.com/java/)
- [GeeksforGeeks Java](https://www.geeksforgeeks.org/java/)
- [Baeldung](https://www.baeldung.com/)

---

*Tài liệu được biên soạn bởi DUTE Corporation - LAB211*
