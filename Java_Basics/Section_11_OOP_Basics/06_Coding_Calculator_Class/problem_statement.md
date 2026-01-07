# Tạo Class Máy Tính với Method Overloading

## Mô tả bài toán
Tạo một class `Calculator` với các phương thức tính toán sử dụng method overloading.

## Yêu cầu
1. Tạo class `Calculator` với các phương thức `add()` được overload:
   - `add(int a, int b)`: cộng 2 số nguyên
   - `add(int a, int b, int c)`: cộng 3 số nguyên
   - `add(double a, double b)`: cộng 2 số thực

2. Nhập lần lượt:
   - 2 số nguyên
   - 3 số nguyên
   - 2 số thực

3. In ra kết quả 3 phép cộng

## Định dạng Input
- Dòng 1: 2 số nguyên cách nhau bởi dấu cách
- Dòng 2: 3 số nguyên cách nhau bởi dấu cách
- Dòng 3: 2 số thực cách nhau bởi dấu cách

## Định dạng Output
- Dòng 1: Kết quả cộng 2 số nguyên
- Dòng 2: Kết quả cộng 3 số nguyên
- Dòng 3: Kết quả cộng 2 số thực (2 chữ số thập phân)

## Ví dụ

**Input:**
```
5 3
1 2 3
2.5 3.5
```

**Output:**
```
8
6
6.00
```

**Input:**
```
10 20
5 10 15
1.1 2.2
```

**Output:**
```
30
30
3.30
```

## Gợi ý
- Method overloading: cùng tên nhưng khác tham số
- Java tự động chọn method phù hợp dựa trên tham số truyền vào
- Sử dụng `String.format("%.2f", value)` cho số thực
