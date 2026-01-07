# Khai Báo Biến Trong Java

## Biến là gì?
Biến là **vùng nhớ** dùng để lưu trữ dữ liệu trong chương trình. Mỗi biến có:
- **Tên** (identifier): Định danh để truy cập
- **Kiểu dữ liệu** (data type): Xác định loại dữ liệu
- **Giá trị** (value): Dữ liệu được lưu trữ

## Cú pháp khai báo biến

```java
// Cú pháp 1: Khai báo
dataType variableName;

// Cú pháp 2: Khai báo + khởi tạo
dataType variableName = value;

// Cú pháp 3: Khai báo nhiều biến cùng kiểu
dataType var1, var2, var3;
dataType var1 = value1, var2 = value2;
```

## Ví dụ

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
char grade = 'A';

// Khai báo nhiều biến
int a, b, c;
int x = 1, y = 2, z = 3;
```

## Các loại biến

| Loại biến | Vị trí khai báo | Phạm vi | Ví dụ |
|-----------|-----------------|---------|-------|
| **Local Variable** | Trong method/block | Chỉ trong method/block | Biến trong main() |
| **Instance Variable** | Trong class, ngoài method | Toàn bộ object | Thuộc tính của class |
| **Static Variable** | Trong class với `static` | Toàn bộ class | Biến dùng chung |

```java
public class Example {
    // Instance variable
    String instanceVar = "Instance";
    
    // Static variable
    static int staticVar = 10;
    
    public void method() {
        // Local variable
        int localVar = 5;
    }
}
```

## Hằng số (Constants)

Sử dụng từ khóa `final` để khai báo hằng số - giá trị không thể thay đổi:

```java
final int MAX_STUDENTS = 50;
final double PI = 3.14159;
final String COMPANY_NAME = "DUTE";

// Lỗi: không thể gán lại giá trị cho hằng số
// MAX_STUDENTS = 60; // ❌ Error!
```

> **Quy ước**: Hằng số viết UPPER_SNAKE_CASE
