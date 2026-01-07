# Toán Tử Số Học (Arithmetic Operators)

## Các toán tử số học cơ bản

| Toán tử | Tên | Ví dụ | Kết quả |
|---------|-----|-------|---------|
| `+` | Cộng | `5 + 3` | `8` |
| `-` | Trừ | `5 - 3` | `2` |
| `*` | Nhân | `5 * 3` | `15` |
| `/` | Chia | `5 / 3` | `1` (chia nguyên) |
| `%` | Chia lấy dư (Modulo) | `5 % 3` | `2` |

## Ví dụ chi tiết

```java
public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10, b = 3;
        
        System.out.println("a + b = " + (a + b));  // 13
        System.out.println("a - b = " + (a - b));  // 7
        System.out.println("a * b = " + (a * b));  // 30
        System.out.println("a / b = " + (a / b));  // 3 (chia nguyên!)
        System.out.println("a % b = " + (a % b));  // 1
    }
}
```

## ⚠️ Lưu ý: Chia số nguyên vs Chia số thực

```java
// Chia số nguyên - kết quả là số nguyên
int result1 = 10 / 3;        // 3 (không phải 3.33)
int result2 = 7 / 2;         // 3 (không phải 3.5)

// Chia số thực - kết quả chính xác
double result3 = 10.0 / 3;   // 3.333...
double result4 = 7.0 / 2;    // 3.5

// Ép kiểu để chia số thực
int x = 10, y = 3;
double result5 = (double) x / y;  // 3.333...
```

## Toán tử gán kết hợp

| Toán tử | Ví dụ | Tương đương |
|---------|-------|-------------|
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

## Toán tử tăng/giảm (Increment/Decrement)

| Toán tử | Tên | Mô tả |
|---------|-----|-------|
| `++x` | Pre-increment | Tăng trước, dùng sau |
| `x++` | Post-increment | Dùng trước, tăng sau |
| `--x` | Pre-decrement | Giảm trước, dùng sau |
| `x--` | Post-decrement | Dùng trước, giảm sau |

```java
int a = 5;

// Post-increment
System.out.println(a++);  // In: 5, sau đó a = 6

// Pre-increment  
System.out.println(++a);  // a = 7, In: 7

// Post-decrement
System.out.println(a--);  // In: 7, sau đó a = 6

// Pre-decrement
System.out.println(--a);  // a = 5, In: 5
```

## Ứng dụng toán tử Modulo (%)

```java
// Kiểm tra số chẵn/lẻ
int num = 7;
if (num % 2 == 0) {
    System.out.println("Số chẵn");
} else {
    System.out.println("Số lẻ");
}

// Lấy chữ số hàng đơn vị
int number = 1234;
int lastDigit = number % 10;  // 4

// Kiểm tra chia hết
if (number % 5 == 0) {
    System.out.println("Chia hết cho 5");
}
```
