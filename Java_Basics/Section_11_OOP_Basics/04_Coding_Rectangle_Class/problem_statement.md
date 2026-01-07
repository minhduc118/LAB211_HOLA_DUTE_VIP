# Tạo Class Hình Chữ Nhật

## Mô tả bài toán
Tạo một class `Rectangle` (Hình chữ nhật) với các thuộc tính và phương thức cơ bản.

## Yêu cầu
1. Tạo class `Rectangle` với 2 thuộc tính:
   - `length` (chiều dài) - kiểu double
   - `width` (chiều rộng) - kiểu double

2. Tạo các phương thức:
   - `calculateArea()`: tính diện tích (dài × rộng)
   - `calculatePerimeter()`: tính chu vi (2 × (dài + rộng))

3. Nhập chiều dài và chiều rộng
4. In ra diện tích và chu vi (làm tròn 2 chữ số thập phân)

## Định dạng Input
- Dòng 1: Chiều dài (double)
- Dòng 2: Chiều rộng (double)

## Định dạng Output
- Dòng 1: Diện tích
- Dòng 2: Chu vi

## Ví dụ

**Input:**
```
5.0
3.0
```

**Output:**
```
15.00
16.00
```

**Input:**
```
10.5
4.2
```

**Output:**
```
44.10
29.40
```

## Gợi ý
- Tạo class Rectangle với 2 thuộc tính length và width
- Tạo phương thức `calculateArea()` trả về `length * width`
- Tạo phương thức `calculatePerimeter()` trả về `2 * (length + width)`
- Sử dụng `String.format("%.2f", value)` để làm tròn 2 chữ số
