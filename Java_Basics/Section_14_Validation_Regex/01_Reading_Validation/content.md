# Validation - Xác Thực Dữ Liệu trong Java

## Giới thiệu
**Validation** (xác thực) là quá trình kiểm tra dữ liệu đầu vào để đảm bảo dữ liệu hợp lệ trước khi xử lý. Đây là bước quan trọng để đảm bảo chương trình hoạt động đúng và an toàn.

---

## 1. Tại sao cần Validation?

### Không có Validation
```java
Scanner scanner = new Scanner(System.in);
System.out.print("Nhập tuổi: ");
int tuoi = scanner.nextInt();  // Nếu nhập "abc" → Crash!
```

### Có Validation
```java
Scanner scanner = new Scanner(System.in);
int tuoi = 0;
boolean hopLe = false;

while (!hopLe) {
    System.out.print("Nhập tuổi: ");
    try {
        tuoi = Integer.parseInt(scanner.nextLine());
        if (tuoi > 0 && tuoi <= 150) {
            hopLe = true;
        } else {
            System.out.println("Tuổi phải từ 1-150!");
        }
    } catch (NumberFormatException e) {
        System.out.println("Vui lòng nhập số!");
    }
}
```

---

## 2. Các loại Validation phổ biến

| Loại | Mô tả | Ví dụ |
|------|-------|-------|
| Kiểu dữ liệu | Kiểm tra đúng kiểu | Số nguyên, số thực |
| Khoảng giá trị | Kiểm tra min/max | Tuổi 1-150 |
| Độ dài | Kiểm tra length | Password 6-20 ký tự |
| Format | Kiểm tra định dạng | Email, số điện thoại |
| Null/Empty | Kiểm tra rỗng | Tên không được trống |

---

## 3. Validation với Try-Catch

### Kiểm tra số nguyên
```java
public static int nhapSoNguyen(Scanner scanner, String prompt) {
    while (true) {
        System.out.print(prompt);
        try {
            return Integer.parseInt(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Vui lòng nhập số nguyên!");
        }
    }
}

// Sử dụng
int tuoi = nhapSoNguyen(scanner, "Nhập tuổi: ");
```

### Kiểm tra số thực
```java
public static double nhapSoThuc(Scanner scanner, String prompt) {
    while (true) {
        System.out.print(prompt);
        try {
            return Double.parseDouble(scanner.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Vui lòng nhập số!");
        }
    }
}
```

---

## 4. Validation với điều kiện

### Kiểm tra khoảng giá trị
```java
public static int nhapTrongKhoang(Scanner scanner, String prompt, int min, int max) {
    while (true) {
        System.out.print(prompt);
        try {
            int value = Integer.parseInt(scanner.nextLine().trim());
            if (value >= min && value <= max) {
                return value;
            }
            System.out.println("Lỗi: Giá trị phải từ " + min + " đến " + max);
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Vui lòng nhập số nguyên!");
        }
    }
}

// Sử dụng
int thang = nhapTrongKhoang(scanner, "Nhập tháng (1-12): ", 1, 12);
```

### Kiểm tra chuỗi không rỗng
```java
public static String nhapChuoiKhongRong(Scanner scanner, String prompt) {
    while (true) {
        System.out.print(prompt);
        String input = scanner.nextLine().trim();
        if (!input.isEmpty()) {
            return input;
        }
        System.out.println("Lỗi: Không được để trống!");
    }
}
```

### Kiểm tra độ dài chuỗi
```java
public static String nhapChuoiDoiDai(Scanner scanner, String prompt, int minLen, int maxLen) {
    while (true) {
        System.out.print(prompt);
        String input = scanner.nextLine().trim();
        if (input.length() >= minLen && input.length() <= maxLen) {
            return input;
        }
        System.out.println("Lỗi: Độ dài phải từ " + minLen + " đến " + maxLen + " ký tự!");
    }
}

// Sử dụng
String password = nhapChuoiDoiDai(scanner, "Nhập mật khẩu (6-20 ký tự): ", 6, 20);
```

---

## 5. Validation Yes/No

```java
public static boolean xacNhan(Scanner scanner, String prompt) {
    while (true) {
        System.out.print(prompt + " (Y/N): ");
        String input = scanner.nextLine().trim().toUpperCase();
        if (input.equals("Y") || input.equals("YES")) {
            return true;
        } else if (input.equals("N") || input.equals("NO")) {
            return false;
        }
        System.out.println("Lỗi: Vui lòng nhập Y hoặc N!");
    }
}

// Sử dụng
if (xacNhan(scanner, "Bạn có muốn tiếp tục không?")) {
    System.out.println("Tiếp tục...");
} else {
    System.out.println("Thoát!");
}
```

---

## 6. Validation Menu

```java
public static int chonMenu(Scanner scanner, String[] options) {
    while (true) {
        System.out.println("\n=== MENU ===");
        for (int i = 0; i < options.length; i++) {
            System.out.println((i + 1) + ". " + options[i]);
        }
        System.out.print("Chọn: ");
        
        try {
            int choice = Integer.parseInt(scanner.nextLine().trim());
            if (choice >= 1 && choice <= options.length) {
                return choice;
            }
            System.out.println("Lỗi: Vui lòng chọn từ 1 đến " + options.length);
        } catch (NumberFormatException e) {
            System.out.println("Lỗi: Vui lòng nhập số!");
        }
    }
}

// Sử dụng
String[] menu = {"Thêm mới", "Xem danh sách", "Tìm kiếm", "Thoát"};
int choice = chonMenu(scanner, menu);
```

---

## 7. Tạo Class Validation tiện ích

```java
public class Validation {
    private Scanner scanner;
    
    public Validation() {
        this.scanner = new Scanner(System.in);
    }
    
    public int getInt(String prompt, String error) {
        while (true) {
            System.out.print(prompt);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println(error);
            }
        }
    }
    
    public int getIntInRange(String prompt, int min, int max, String error) {
        while (true) {
            int value = getInt(prompt, error);
            if (value >= min && value <= max) {
                return value;
            }
            System.out.println(error);
        }
    }
    
    public String getString(String prompt, String error) {
        while (true) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            if (!input.isEmpty()) {
                return input;
            }
            System.out.println(error);
        }
    }
    
    public boolean getYesNo(String prompt) {
        while (true) {
            System.out.print(prompt + " (Y/N): ");
            String input = scanner.nextLine().trim().toUpperCase();
            if (input.equals("Y")) return true;
            if (input.equals("N")) return false;
            System.out.println("Vui lòng nhập Y hoặc N!");
        }
    }
}

// Sử dụng
Validation val = new Validation();
String name = val.getString("Nhập tên: ", "Tên không được rỗng!");
int age = val.getIntInRange("Nhập tuổi: ", 1, 150, "Tuổi phải từ 1-150!");
```

---

## 8. Best Practices

### ✅ Nên làm
```java
// Thông báo lỗi rõ ràng
System.out.println("Lỗi: Tuổi phải là số từ 1 đến 150");

// Cho phép nhập lại
while (!hopLe) {
    // Nhập và kiểm tra
}

// Trim input
String input = scanner.nextLine().trim();
```

### ❌ Không nên làm
```java
// Thông báo lỗi chung chung
System.out.println("Lỗi!");

// Không cho nhập lại, thoát luôn
if (!hopLe) {
    System.exit(0);
}

// Không trim - dễ lỗi với khoảng trắng
String input = scanner.nextLine();
```

---

## Tổng kết

| Phương thức kiểm tra | Mô tả |
|---------------------|-------|
| `Integer.parseInt()` | Chuyển String sang int |
| `Double.parseDouble()` | Chuyển String sang double |
| `isEmpty()` | Kiểm tra chuỗi rỗng |
| `length()` | Lấy độ dài chuỗi |
| `trim()` | Xóa khoảng trắng đầu/cuối |
| `matches(regex)` | Kiểm tra theo pattern |
