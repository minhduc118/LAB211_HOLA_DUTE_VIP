# Ép Kiểu (Type Casting)

## Ép kiểu là gì?
Ép kiểu là quá trình chuyển đổi dữ liệu từ kiểu này sang kiểu khác.

## 2 loại ép kiểu

### 1. Ép kiểu ngầm định (Widening / Implicit)
Chuyển từ kiểu **nhỏ → lớn**: Java tự động thực hiện

```
byte → short → int → long → float → double
```

```java
int intValue = 100;
long longValue = intValue;      // Tự động: int → long
double doubleValue = longValue; // Tự động: long → double

System.out.println(doubleValue); // 100.0
```

### 2. Ép kiểu tường minh (Narrowing / Explicit)
Chuyển từ kiểu **lớn → nhỏ**: Cần khai báo rõ ràng

```
double → float → long → int → short → byte
```

```java
double doubleValue = 9.78;
int intValue = (int) doubleValue;  // Cần (int)

System.out.println(intValue); // 9 (mất phần thập phân!)
```

## Ví dụ thực tế

```java
public class TypeCasting {
    public static void main(String[] args) {
        // === WIDENING (Tự động) ===
        int myInt = 9;
        double myDouble = myInt;
        System.out.println("int to double: " + myDouble); // 9.0
        
        // === NARROWING (Cần ép kiểu) ===
        double x = 9.78;
        int y = (int) x;
        System.out.println("double to int: " + y); // 9
        
        // === Chú ý với số lớn ===
        int bigInt = 130;
        byte smallByte = (byte) bigInt;
        System.out.println("int 130 to byte: " + smallByte); // -126 (overflow!)
    }
}
```

## Chuyển đổi String ↔ Số

### String → Số
```java
String strInt = "123";
String strDouble = "3.14";

int num = Integer.parseInt(strInt);        // 123
double d = Double.parseDouble(strDouble);  // 3.14
long l = Long.parseLong("999999999");      // 999999999
```

### Số → String
```java
int number = 456;

// Cách 1: valueOf
String str1 = String.valueOf(number);

// Cách 2: toString
String str2 = Integer.toString(number);

// Cách 3: Nối chuỗi rỗng
String str3 = "" + number;
```

## Wrapper Classes

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
// Auto-boxing: primitive → wrapper
int primitiveInt = 5;
Integer wrapperInt = primitiveInt;

// Auto-unboxing: wrapper → primitive
Integer wrapperValue = 20;
int primitiveValue = wrapperValue;
```

## ⚠️ Lưu ý quan trọng

```java
// Cẩn thận với NumberFormatException
String invalid = "abc";
// int num = Integer.parseInt(invalid); // ❌ Lỗi!

// Kiểm tra trước khi chuyển đổi
try {
    int num = Integer.parseInt(invalid);
} catch (NumberFormatException e) {
    System.out.println("Không thể chuyển đổi!");
}
```
