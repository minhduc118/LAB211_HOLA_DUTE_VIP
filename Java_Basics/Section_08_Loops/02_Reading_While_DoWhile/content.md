# Vòng Lặp While và Do-While trong Java

## Giới thiệu
Ngoài vòng lặp `for`, Java còn cung cấp hai vòng lặp khác: `while` và `do-while`. Chúng thường được sử dụng khi không biết trước số lần lặp.

---

## 1. Vòng lặp While

### Cú pháp
```java
while (điều_kiện) {
    // Code thực thi khi điều kiện đúng
}
```

### Đặc điểm
- Kiểm tra điều kiện **trước** mỗi lần lặp
- Nếu điều kiện sai ngay từ đầu, code bên trong **không chạy lần nào**
- Thường dùng khi không biết số lần lặp cụ thể

### Luồng thực thi
```
điều_kiện? → [true] → code → điều_kiện? → ...
          ↓
       [false] → thoát
```

---

## 2. Ví dụ While

### Ví dụ 1: In số từ 1 đến 5
```java
int i = 1;

while (i <= 5) {
    System.out.println(i);
    i++;
}
```

**Output:**
```
1
2
3
4
5
```

### Ví dụ 2: Tính tổng đến khi nhập số âm
```java
Scanner scanner = new Scanner(System.in);
int tong = 0;
int so;

System.out.println("Nhập các số (nhập số âm để dừng):");

so = scanner.nextInt();
while (so >= 0) {
    tong += so;
    so = scanner.nextInt();
}

System.out.println("Tổng = " + tong);
```

### Ví dụ 3: Đếm số chữ số
```java
int so = 12345;
int demSoChuSo = 0;

while (so > 0) {
    demSoChuSo++;
    so /= 10;  // Bỏ chữ số cuối
}

System.out.println("Số chữ số: " + demSoChuSo);  // Output: 5
```

---

## 3. Vòng lặp Do-While

### Cú pháp
```java
do {
    // Code thực thi ít nhất 1 lần
} while (điều_kiện);
```

### Đặc điểm
- Kiểm tra điều kiện **sau** mỗi lần lặp
- Code bên trong **luôn chạy ít nhất 1 lần**
- Có dấu `;` sau `while(điều_kiện)`

### Luồng thực thi
```
code → điều_kiện? → [true] → code → ...
                 ↓
              [false] → thoát
```

---

## 4. Ví dụ Do-While

### Ví dụ 1: In số từ 1 đến 5
```java
int i = 1;

do {
    System.out.println(i);
    i++;
} while (i <= 5);
```

### Ví dụ 2: Menu chương trình
```java
Scanner scanner = new Scanner(System.in);
int luaChon;

do {
    System.out.println("\n=== MENU ===");
    System.out.println("1. Xem thông tin");
    System.out.println("2. Thêm mới");
    System.out.println("3. Thoát");
    System.out.print("Chọn: ");
    
    luaChon = scanner.nextInt();
    
    switch (luaChon) {
        case 1:
            System.out.println("Đang xem thông tin...");
            break;
        case 2:
            System.out.println("Đang thêm mới...");
            break;
        case 3:
            System.out.println("Tạm biệt!");
            break;
        default:
            System.out.println("Lựa chọn không hợp lệ!");
    }
} while (luaChon != 3);
```

### Ví dụ 3: Validate input
```java
Scanner scanner = new Scanner(System.in);
int tuoi;

do {
    System.out.print("Nhập tuổi (1-120): ");
    tuoi = scanner.nextInt();
    
    if (tuoi < 1 || tuoi > 120) {
        System.out.println("Tuổi không hợp lệ, vui lòng nhập lại!");
    }
} while (tuoi < 1 || tuoi > 120);

System.out.println("Tuổi của bạn là: " + tuoi);
```

---

## 5. So sánh While và Do-While

### Điều kiện sai ngay từ đầu
```java
int x = 10;

// While - không chạy lần nào
while (x < 5) {
    System.out.println("While: " + x);
    x++;
}

// Do-While - chạy 1 lần
do {
    System.out.println("Do-While: " + x);
    x++;
} while (x < 5);
```

**Output:**
```
Do-While: 10
```

### Bảng so sánh

| Tiêu chí | while | do-while |
|----------|-------|----------|
| Kiểm tra điều kiện | Trước mỗi lần lặp | Sau mỗi lần lặp |
| Số lần lặp tối thiểu | 0 | 1 |
| Khi dùng | Có thể không cần chạy | Cần chạy ít nhất 1 lần |
| Ví dụ | Đọc file cho đến hết | Menu, validate input |

---

## 6. So sánh For, While, Do-While

```java
// For - biết số lần lặp
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}

// While - không biết số lần lặp, có thể không lặp
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}

// Do-While - không biết số lần lặp, lặp ít nhất 1 lần
int j = 1;
do {
    System.out.println(j);
    j++;
} while (j <= 5);
```

### Khi nào dùng loại nào?

| Vòng lặp | Khi sử dụng |
|----------|-------------|
| `for` | Biết trước số lần lặp |
| `while` | Không biết số lần lặp, có thể không cần lặp |
| `do-while` | Cần thực hiện ít nhất 1 lần (menu, validate) |

---

## 7. Vòng lặp vô hạn

### Với while
```java
while (true) {
    // Lặp mãi mãi
    // Cần break để thoát
}
```

### Với do-while
```java
do {
    // Lặp mãi mãi
    // Cần break để thoát
} while (true);
```

---

## 8. Một số lỗi thường gặp

### Quên cập nhật biến điều khiển
```java
int i = 0;
while (i < 5) {
    System.out.println(i);
    // Quên i++ → vòng lặp vô hạn!
}
```

### Điều kiện sai logic
```java
int i = 10;
// Sai: điều kiện luôn đúng → vòng lặp vô hạn
while (i > 0) {
    System.out.println(i);
    i++;  // i tăng lên, không bao giờ <= 0
}
```

### Quên dấu chấm phẩy ở do-while
```java
do {
    System.out.println("Hello");
} while (false)  // Thiếu ; → lỗi biên dịch
```

---

## Bài tập thực hành

### Bài 1: Đảo ngược số
Nhập số nguyên, in ra số đảo ngược (123 → 321)

### Bài 2: Tìm UCLN
Nhập 2 số, tìm ước chung lớn nhất

### Bài 3: Kiểm tra số nguyên tố
Nhập số nguyên, kiểm tra có phải số nguyên tố không

### Bài 4: ATM Mini
Tạo menu rút tiền, gửi tiền, kiểm tra số dư

---

## Tổng kết

| Vòng lặp | Cú pháp | Đặc điểm |
|----------|---------|----------|
| `while` | `while(dk) {...}` | Kiểm tra trước, có thể không chạy |
| `do-while` | `do {...} while(dk);` | Kiểm tra sau, chạy ít nhất 1 lần |
