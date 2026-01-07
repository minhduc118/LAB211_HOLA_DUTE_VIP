# Câu Lệnh Điều Kiện If-Else trong Java

## Giới thiệu
Câu lệnh điều kiện cho phép chương trình thực hiện các hành động khác nhau dựa trên điều kiện cụ thể. Đây là nền tảng quan trọng để xây dựng logic trong lập trình.

---

## 1. Câu lệnh if

Câu lệnh `if` thực thi một đoạn code khi điều kiện là **true**.

### Cú pháp
```java
if (điều_kiện) {
    // Code thực thi khi điều kiện đúng
}
```

### Ví dụ
```java
int tuoi = 18;

if (tuoi >= 18) {
    System.out.println("Bạn đủ tuổi bầu cử");
}
```

---

## 2. Câu lệnh if-else

Câu lệnh `if-else` cho phép thực thi code khác khi điều kiện là **false**.

### Cú pháp
```java
if (điều_kiện) {
    // Code thực thi khi điều kiện đúng
} else {
    // Code thực thi khi điều kiện sai
}
```

### Ví dụ
```java
int diem = 45;

if (diem >= 50) {
    System.out.println("Đậu");
} else {
    System.out.println("Rớt");
}
```

**Output:** `Rớt`

---

## 3. Câu lệnh if-else-if (Ladder)

Sử dụng khi cần kiểm tra nhiều điều kiện.

### Cú pháp
```java
if (điều_kiện_1) {
    // Code khi điều kiện 1 đúng
} else if (điều_kiện_2) {
    // Code khi điều kiện 2 đúng
} else if (điều_kiện_3) {
    // Code khi điều kiện 3 đúng
} else {
    // Code khi tất cả điều kiện sai
}
```

### Ví dụ: Xếp loại điểm
```java
int diem = 75;
String xepLoai;

if (diem >= 90) {
    xepLoai = "A";
} else if (diem >= 80) {
    xepLoai = "B";
} else if (diem >= 70) {
    xepLoai = "C";
} else if (diem >= 60) {
    xepLoai = "D";
} else {
    xepLoai = "F";
}

System.out.println("Xếp loại: " + xepLoai);
```

**Output:** `Xếp loại: C`

---

## 4. Câu lệnh if lồng nhau (Nested if)

Có thể đặt câu lệnh `if` bên trong một câu lệnh `if` khác.

### Ví dụ
```java
int tuoi = 25;
boolean coGiayPhep = true;

if (tuoi >= 18) {
    if (coGiayPhep) {
        System.out.println("Được phép lái xe");
    } else {
        System.out.println("Cần có giấy phép lái xe");
    }
} else {
    System.out.println("Chưa đủ tuổi lái xe");
}
```

---

## 5. Toán tử ba ngôi (Ternary Operator)

Cách viết gọn của if-else đơn giản.

### Cú pháp
```java
biến = (điều_kiện) ? giá_trị_nếu_đúng : giá_trị_nếu_sai;
```

### Ví dụ
```java
int tuoi = 20;
String ketQua = (tuoi >= 18) ? "Người lớn" : "Trẻ em";
System.out.println(ketQua);  // Output: Người lớn

// Tương đương với:
String ketQua2;
if (tuoi >= 18) {
    ketQua2 = "Người lớn";
} else {
    ketQua2 = "Trẻ em";
}
```

---

## 6. Một số lưu ý quan trọng

### ✅ Nên làm
```java
// Sử dụng dấu ngoặc nhọn ngay cả khi chỉ có 1 dòng code
if (x > 0) {
    System.out.println("Số dương");
}
```

### ❌ Không nên làm
```java
// Dễ gây lỗi khi thêm code sau này
if (x > 0)
    System.out.println("Số dương");
```

### So sánh với ==
```java
// Với kiểu nguyên thủy (primitive): dùng ==
int a = 5;
if (a == 5) { ... }

// Với String: dùng .equals()
String ten = "Java";
if (ten.equals("Java")) { ... }

// KHÔNG làm thế này với String
if (ten == "Java") { ... }  // Sai!
```

---

## Bài tập thực hành

### Bài 1: Kiểm tra số dương/âm/zero
Viết chương trình nhập một số và in ra số đó là dương, âm hay bằng 0.

### Bài 2: Tìm số lớn nhất
Viết chương trình nhập 3 số và tìm số lớn nhất.

### Bài 3: Xếp loại học lực
Viết chương trình nhập điểm và xếp loại:
- 90-100: Xuất sắc
- 80-89: Giỏi
- 70-79: Khá
- 60-69: Trung bình
- < 60: Yếu

---

## Tổng kết

| Cấu trúc | Mô tả |
|----------|-------|
| `if` | Thực thi code khi điều kiện đúng |
| `if-else` | Thực thi 1 trong 2 khối code |
| `if-else-if` | Kiểm tra nhiều điều kiện |
| `Nested if` | if lồng trong if khác |
| `? :` | Toán tử ba ngôi - viết gọn if-else |
