# Tính Diện Tích Hình Chữ Nhật

## Mô tả bài toán
Viết chương trình nhập vào chiều dài và chiều rộng của hình chữ nhật, sau đó tính và in ra diện tích.

## Yêu cầu
1. Nhập chiều dài (length) - số thực
2. Nhập chiều rộng (width) - số thực
3. Tính diện tích: area = length × width
4. In ra diện tích (làm tròn 2 chữ số thập phân)

## Định dạng Input
- Dòng 1: Chiều dài (double)
- Dòng 2: Chiều rộng (double)

## Định dạng Output
- Diện tích làm tròn 2 chữ số thập phân

## Ví dụ

**Input:**
```
5.0
3.0
```

**Output:**
```
15.00
```

**Input:**
```
7.5
4.2
```

**Output:**
```
31.50
```

## Gợi ý
- Sử dụng `scanner.nextDouble()` để nhập số thực
- Sử dụng `System.out.printf("%.2f", area)` để in 2 chữ số thập phân
- Hoặc dùng `String.format("%.2f", area)`
