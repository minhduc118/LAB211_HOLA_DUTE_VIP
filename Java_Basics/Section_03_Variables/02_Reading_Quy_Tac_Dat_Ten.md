# Quy Tắc Đặt Tên Biến

## Quy tắc bắt buộc

| Quy tắc | Hợp lệ ✅ | Không hợp lệ ❌ |
|---------|----------|----------------|
| Bắt đầu bằng chữ cái, `_`, hoặc `$` | `name`, `_count`, `$price` | `1name`, `@value`, `#total` |
| Không chứa khoảng trắng | `firstName`, `last_name` | `first name` |
| Không dùng từ khóa Java | `myClass`, `myInt` | `class`, `int`, `for`, `while` |
| Phân biệt chữ hoa/thường | `Name` ≠ `name` ≠ `NAME` | - |
| Không chứa ký tự đặc biệt | `user_name`, `total$` | `user-name`, `total%` |

## Từ khóa Java (không được dùng làm tên biến)

```
abstract   assert     boolean    break      byte
case       catch      char       class      const
continue   default    do         double     else
enum       extends    final      finally    float
for        goto       if         implements import
instanceof int        interface  long       native
new        package    private    protected  public
return     short      static     strictfp   super
switch     synchronized this      throw      throws
transient  try        void       volatile   while
```

## Quy ước đặt tên (Naming Convention)

### 1. camelCase - Cho biến và phương thức
```java
// Viết thường từ đầu, viết hoa chữ cái đầu của các từ tiếp theo
int studentAge;
String firstName;
double totalAmount;
boolean isActive;

void calculateTotal() { }
void getUserName() { }
```

### 2. PascalCase - Cho Class và Interface
```java
class StudentInfo { }
class BankAccount { }
interface UserService { }
```

### 3. UPPER_SNAKE_CASE - Cho hằng số
```java
final int MAX_SIZE = 100;
final double TAX_RATE = 0.1;
final String DATABASE_URL = "localhost";
```

## Best Practices

### ✅ Nên làm:
```java
// Tên có ý nghĩa, dễ hiểu
int studentAge;
String customerName;
double accountBalance;
boolean isLoggedIn;
```

### ❌ Không nên làm:
```java
// Tên quá ngắn, không rõ nghĩa
int a;
String s;
double x;
boolean flag;

// Tên viết tắt khó hiểu
int stdAge;
String custNm;
```

## Ví dụ tổng hợp

```java
public class NamingExample {
    // Hằng số: UPPER_SNAKE_CASE
    public static final int MAX_RETRY = 3;
    
    // Instance variable: camelCase
    private String userName;
    private int userAge;
    
    // Method: camelCase
    public void calculateTotalPrice() {
        // Local variable: camelCase
        double itemPrice = 100.0;
        int quantity = 5;
        double totalPrice = itemPrice * quantity;
    }
}
```
