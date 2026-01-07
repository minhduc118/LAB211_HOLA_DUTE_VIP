# Câu Lệnh Switch-Case trong Java

## Giới thiệu
Câu lệnh `switch` là một cấu trúc điều kiện cho phép kiểm tra một giá trị với nhiều trường hợp (case) khác nhau. Đây là cách thay thế gọn gàng hơn so với nhiều câu `if-else-if`.

---

## 1. Cú pháp cơ bản

```java
switch (biểu_thức) {
    case giá_trị_1:
        // Code thực thi
        break;
    case giá_trị_2:
        // Code thực thi
        break;
    case giá_trị_3:
        // Code thực thi
        break;
    default:
        // Code thực thi khi không khớp case nào
}
```

---

## 2. Ví dụ cơ bản

### Ví dụ 1: Hiển thị tên ngày trong tuần
```java
int ngay = 3;
String tenNgay;

switch (ngay) {
    case 1:
        tenNgay = "Chủ nhật";
        break;
    case 2:
        tenNgay = "Thứ hai";
        break;
    case 3:
        tenNgay = "Thứ ba";
        break;
    case 4:
        tenNgay = "Thứ tư";
        break;
    case 5:
        tenNgay = "Thứ năm";
        break;
    case 6:
        tenNgay = "Thứ sáu";
        break;
    case 7:
        tenNgay = "Thứ bảy";
        break;
    default:
        tenNgay = "Không hợp lệ";
}

System.out.println(tenNgay);  // Output: Thứ ba
```

---

## 3. Tầm quan trọng của break

Nếu không có `break`, chương trình sẽ tiếp tục thực thi các case bên dưới (**fall-through**).

### Ví dụ không có break (Lỗi)
```java
int so = 1;

switch (so) {
    case 1:
        System.out.println("Một");
    case 2:
        System.out.println("Hai");
    case 3:
        System.out.println("Ba");
}

// Output:
// Một
// Hai
// Ba
```

### Ví dụ có break (Đúng)
```java
int so = 1;

switch (so) {
    case 1:
        System.out.println("Một");
        break;
    case 2:
        System.out.println("Hai");
        break;
    case 3:
        System.out.println("Ba");
        break;
}

// Output: Một
```

---

## 4. Gộp nhiều case

Khi nhiều case có cùng hành động, có thể gộp chung.

### Ví dụ: Kiểm tra ngày làm việc
```java
int ngay = 3;

switch (ngay) {
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
        System.out.println("Ngày làm việc");
        break;
    case 7:
    case 1:
        System.out.println("Cuối tuần");
        break;
    default:
        System.out.println("Không hợp lệ");
}
```

---

## 5. Switch với String (Java 7+)

Từ Java 7, có thể sử dụng String trong switch.

```java
String thang = "Feb";
int soNgay;

switch (thang) {
    case "Jan":
    case "Mar":
    case "May":
    case "Jul":
    case "Aug":
    case "Oct":
    case "Dec":
        soNgay = 31;
        break;
    case "Apr":
    case "Jun":
    case "Sep":
    case "Nov":
        soNgay = 30;
        break;
    case "Feb":
        soNgay = 28;
        break;
    default:
        soNgay = 0;
}

System.out.println("Số ngày: " + soNgay);  // Output: Số ngày: 28
```

---

## 6. Switch Expression (Java 14+)

Cú pháp mới gọn gàng hơn với arrow syntax.

### Cú pháp mới
```java
int ngay = 3;

String tenNgay = switch (ngay) {
    case 1 -> "Chủ nhật";
    case 2 -> "Thứ hai";
    case 3 -> "Thứ ba";
    case 4 -> "Thứ tư";
    case 5 -> "Thứ năm";
    case 6 -> "Thứ sáu";
    case 7 -> "Thứ bảy";
    default -> "Không hợp lệ";
};

System.out.println(tenNgay);  // Output: Thứ ba
```

### Gộp case với arrow syntax
```java
String loaiNgay = switch (ngay) {
    case 2, 3, 4, 5, 6 -> "Ngày làm việc";
    case 7, 1 -> "Cuối tuần";
    default -> "Không hợp lệ";
};
```

---

## 7. So sánh switch và if-else

| Tiêu chí | switch | if-else |
|----------|--------|---------|
| Kiểm tra | Giá trị cố định | Điều kiện phức tạp |
| Kiểu dữ liệu | int, char, String, enum | Mọi boolean expression |
| Hiệu suất | Tốt hơn với nhiều case | Tốt với ít điều kiện |
| Đọc code | Dễ đọc khi nhiều case | Linh hoạt hơn |

### Khi nào dùng switch?
- Khi so sánh **một giá trị** với nhiều **giá trị cố định**
- Khi có nhiều nhánh điều kiện (> 3)

### Khi nào dùng if-else?
- Khi cần kiểm tra **điều kiện phức tạp** (>, <, >=, <=)
- Khi cần **nhiều điều kiện kết hợp** (&&, ||)

---

## 8. Các kiểu dữ liệu hỗ trợ

Switch hỗ trợ các kiểu sau:
- `byte`, `short`, `int`, `char`
- `Byte`, `Short`, `Integer`, `Character` (Wrapper classes)
- `String` (từ Java 7)
- `enum`

**Không hỗ trợ:** `long`, `float`, `double`, `boolean`

---

## Bài tập thực hành

### Bài 1: Máy tính đơn giản
Cho 2 số và phép toán (+, -, *, /), tính kết quả.

### Bài 2: Xếp loại điểm
Nhập điểm (1-10), hiển thị xếp loại:
- 9-10: Xuất sắc
- 7-8: Khá
- 5-6: Trung bình
- < 5: Yếu

### Bài 3: Số ngày trong tháng
Nhập số tháng (1-12), hiển thị số ngày trong tháng đó.

---

## Tổng kết

| Từ khóa | Mô tả |
|---------|-------|
| `switch` | Bắt đầu khối switch |
| `case` | Định nghĩa một trường hợp |
| `break` | Thoát khỏi switch |
| `default` | Trường hợp mặc định |
| `->` | Arrow syntax (Java 14+) |
