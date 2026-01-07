# Toán Tử So Sánh và Logic

## Toán tử so sánh (Comparison Operators)

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
```

## ⚠️ So sánh String - QUAN TRỌNG!

```java
// ❌ SAI - Không dùng == cho String
String s1 = "Hello";
String s2 = new String("Hello");
System.out.println(s1 == s2);      // false (so sánh địa chỉ)

// ✅ ĐÚNG - Dùng .equals()
System.out.println(s1.equals(s2)); // true (so sánh nội dung)
```

## Toán tử logic (Logical Operators)

| Toán tử | Tên | Mô tả |
|---------|-----|-------|
| `&&` | AND | true nếu **CẢ HAI** đều true |
| `\|\|` | OR | true nếu **MỘT TRONG HAI** true |
| `!` | NOT | Đảo ngược giá trị |

### Bảng chân trị

| A | B | A && B | A \|\| B | !A |
|---|---|--------|----------|-----|
| true | true | true | true | false |
| true | false | false | true | false |
| false | true | false | true | true |
| false | false | false | false | true |

### Ví dụ thực tế

```java
int age = 25;
boolean hasLicense = true;
boolean isWeekend = true;
boolean isHoliday = false;

// AND - Cả hai điều kiện phải đúng
boolean canDrive = (age >= 18) && hasLicense;
System.out.println("Có thể lái xe: " + canDrive); // true

// OR - Một trong hai điều kiện đúng
boolean dayOff = isWeekend || isHoliday;
System.out.println("Ngày nghỉ: " + dayOff); // true

// NOT - Phủ định
boolean isRaining = false;
boolean goOutside = !isRaining;
System.out.println("Đi ra ngoài: " + goOutside); // true
```

## Toán tử điều kiện (Ternary Operator)

**Cú pháp:**
```java
result = (condition) ? valueIfTrue : valueIfFalse;
```

**Ví dụ:**
```java
int age = 20;
String status = (age >= 18) ? "Người lớn" : "Trẻ em";
System.out.println(status); // Người lớn

// Tìm số lớn hơn
int a = 5, b = 8;
int max = (a > b) ? a : b;
System.out.println("Max: " + max); // 8
```

## Thứ tự ưu tiên toán tử

| Ưu tiên | Toán tử |
|---------|---------|
| 1 (cao nhất) | `()` Ngoặc đơn |
| 2 | `++`, `--`, `!` |
| 3 | `*`, `/`, `%` |
| 4 | `+`, `-` |
| 5 | `<`, `>`, `<=`, `>=` |
| 6 | `==`, `!=` |
| 7 | `&&` |
| 8 | `\|\|` |
| 9 (thấp nhất) | `=`, `+=`, `-=` |

```java
// Ví dụ về thứ tự ưu tiên
int result = 2 + 3 * 4;      // 14 (không phải 20)
int result2 = (2 + 3) * 4;   // 20

boolean check = 5 > 3 && 10 < 20;  // true && true = true
```
