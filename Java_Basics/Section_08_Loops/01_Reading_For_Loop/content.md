# Vòng Lặp For trong Java

## Giới thiệu
Vòng lặp `for` cho phép thực thi một khối code nhiều lần với số lần lặp xác định trước. Đây là vòng lặp được sử dụng phổ biến nhất trong Java.

---

## 1. Cú pháp cơ bản

```java
for (khởi_tạo; điều_kiện; cập_nhật) {
    // Code thực thi mỗi lần lặp
}
```

### Giải thích
- **khởi_tạo**: Chạy một lần trước khi vòng lặp bắt đầu
- **điều_kiện**: Kiểm tra trước mỗi lần lặp, lặp tiếp nếu `true`
- **cập_nhật**: Chạy sau mỗi lần lặp

### Luồng thực thi
```
khởi_tạo → điều_kiện? → [true] → code → cập_nhật → điều_kiện? → ...
                     ↓
                  [false] → thoát
```

---

## 2. Ví dụ cơ bản

### Ví dụ 1: In số từ 1 đến 5
```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
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

### Ví dụ 2: In số chẵn từ 0 đến 10
```java
for (int i = 0; i <= 10; i += 2) {
    System.out.println(i);
}
```

**Output:**
```
0
2
4
6
8
10
```

### Ví dụ 3: Đếm ngược
```java
for (int i = 10; i >= 1; i--) {
    System.out.println(i);
}
```

---

## 3. Tính tổng với for

### Tính tổng từ 1 đến n
```java
int n = 100;
int tong = 0;

for (int i = 1; i <= n; i++) {
    tong += i;  // tong = tong + i
}

System.out.println("Tổng = " + tong);  // Output: Tổng = 5050
```

### Tính giai thừa
```java
int n = 5;
long giaiThua = 1;

for (int i = 1; i <= n; i++) {
    giaiThua *= i;  // giaiThua = giaiThua * i
}

System.out.println(n + "! = " + giaiThua);  // Output: 5! = 120
```

---

## 4. Vòng lặp lồng nhau (Nested Loop)

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        System.out.println("i=" + i + ", j=" + j);
    }
}
```

**Output:**
```
i=1, j=1
i=1, j=2
i=1, j=3
i=2, j=1
i=2, j=2
i=2, j=3
i=3, j=1
i=3, j=2
i=3, j=3
```

### Ví dụ: In bảng cửu chương
```java
for (int i = 2; i <= 9; i++) {
    System.out.println("Bảng " + i + ":");
    for (int j = 1; j <= 10; j++) {
        System.out.println(i + " x " + j + " = " + (i * j));
    }
    System.out.println();
}
```

---

## 5. Duyệt mảng với for

### Duyệt bằng chỉ số
```java
int[] mangSo = {10, 20, 30, 40, 50};

for (int i = 0; i < mangSo.length; i++) {
    System.out.println("Phần tử thứ " + i + ": " + mangSo[i]);
}
```

### Duyệt bằng for-each
```java
int[] mangSo = {10, 20, 30, 40, 50};

for (int so : mangSo) {
    System.out.println(so);
}
```

---

## 6. For-each (Enhanced For)

Cú pháp đơn giản hơn để duyệt mảng hoặc Collection.

### Cú pháp
```java
for (kiểu_dữ_liệu biến : mảng_hoặc_collection) {
    // Code xử lý mỗi phần tử
}
```

### So sánh for truyền thống và for-each

```java
String[] tenHoa = {"Hồng", "Lan", "Cúc", "Mai"};

// For truyền thống
for (int i = 0; i < tenHoa.length; i++) {
    System.out.println(tenHoa[i]);
}

// For-each (gọn hơn)
for (String hoa : tenHoa) {
    System.out.println(hoa);
}
```

### Khi nào dùng for-each?
- ✅ Duyệt qua tất cả phần tử
- ✅ Không cần chỉ số
- ❌ Cần sửa đổi phần tử
- ❌ Cần duyệt ngược hoặc nhảy cách

---

## 7. Các biến thể của for

### For không có khởi tạo
```java
int i = 0;
for (; i < 5; i++) {
    System.out.println(i);
}
```

### For không có cập nhật
```java
for (int i = 0; i < 5; ) {
    System.out.println(i);
    i++;
}
```

### Vòng lặp vô hạn
```java
for (;;) {
    // Lặp mãi mãi
    // Cần có break để thoát
}
```

---

## 8. Một số lỗi thường gặp

### Off-by-one Error
```java
// Sai: chỉ lặp 4 lần (0, 1, 2, 3)
for (int i = 0; i < 5; i++) {
    System.out.println(i);  // 0-4
}

// Sai: lặp 6 lần (0, 1, 2, 3, 4, 5)
for (int i = 0; i <= 5; i++) {
    System.out.println(i);  // 0-5
}
```

### Vòng lặp vô hạn vô tình
```java
// Sai: i-- thay vì i++
for (int i = 0; i < 10; i--) {
    System.out.println(i);  // Lặp vô hạn!
}
```

---

## Bài tập thực hành

### Bài 1: Tính tổng n số tự nhiên đầu tiên
### Bài 2: In các số chia hết cho 3 trong khoảng 1-100
### Bài 3: Tính giai thừa của n
### Bài 4: In hình tam giác sao
```
*
**
***
****
*****
```

---

## Tổng kết

| Loại | Cú pháp | Khi sử dụng |
|------|---------|-------------|
| for cơ bản | `for (i=0; i<n; i++)` | Biết số lần lặp |
| for-each | `for (x : array)` | Duyệt mảng/collection |
| for lồng | Nhiều for | Ma trận, bảng 2D |
