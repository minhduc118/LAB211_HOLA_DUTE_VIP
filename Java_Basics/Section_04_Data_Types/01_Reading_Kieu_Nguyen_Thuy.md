# Kiểu Dữ Liệu Nguyên Thủy (Primitive Types)

## Phân loại kiểu dữ liệu

Java có 2 loại kiểu dữ liệu:
1. **Primitive Types** (Kiểu nguyên thủy): 8 kiểu cơ bản
2. **Reference Types** (Kiểu tham chiếu): String, Array, Object...

## 8 Kiểu dữ liệu nguyên thủy

| Kiểu | Kích thước | Giá trị mặc định | Phạm vi |
|------|------------|------------------|---------|
| `byte` | 1 byte | 0 | -128 đến 127 |
| `short` | 2 bytes | 0 | -32,768 đến 32,767 |
| `int` | 4 bytes | 0 | -2³¹ đến 2³¹-1 |
| `long` | 8 bytes | 0L | -2⁶³ đến 2⁶³-1 |
| `float` | 4 bytes | 0.0f | ~±3.4E38 |
| `double` | 8 bytes | 0.0d | ~±1.7E308 |
| `char` | 2 bytes | '\u0000' | 0 đến 65,535 (Unicode) |
| `boolean` | 1 bit | false | true / false |

## Ví dụ chi tiết

### Kiểu số nguyên (Integer types)
```java
byte byteVar = 127;              // Số nhỏ, tiết kiệm bộ nhớ
short shortVar = 32000;          // Số trung bình
int intVar = 2000000000;         // Số thường dùng nhất
long longVar = 9000000000000L;   // Số rất lớn (có L ở cuối)
```

### Kiểu số thực (Floating-point types)
```java
float floatVar = 3.14f;          // Độ chính xác đơn (có f)
double doubleVar = 3.14159265;   // Độ chính xác kép (mặc định)
```

### Kiểu ký tự (Character type)
```java
char charVar = 'A';              // Một ký tự đơn
char charUnicode = '\u0041';     // Ký tự Unicode (A)
char charInt = 65;               // Ký tự từ số ASCII (A)
```

### Kiểu boolean
```java
boolean isActive = true;
boolean isCompleted = false;
```

## Khi nào dùng kiểu nào?

| Trường hợp | Kiểu nên dùng |
|------------|---------------|
| Tuổi, số lượng nhỏ | `int` hoặc `byte` |
| Số lớn (ID database) | `long` |
| Tiền tệ, điểm số | `double` |
| Cờ trạng thái | `boolean` |
| Một ký tự | `char` |

## Lưu ý quan trọng

```java
// ✅ Đúng
long bigNumber = 9000000000L;  // Phải có L
float price = 19.99f;          // Phải có f

// ❌ Sai - sẽ báo lỗi
// long bigNumber = 9000000000;  // Lỗi: integer too large
// float price = 19.99;          // Lỗi: possible lossy conversion
```
