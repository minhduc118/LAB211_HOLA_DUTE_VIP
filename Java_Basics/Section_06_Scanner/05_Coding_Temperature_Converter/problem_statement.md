# Chuyển Đổi Nhiệt Độ

## Mô tả bài toán
Viết chương trình chuyển đổi nhiệt độ từ Celsius sang Fahrenheit.

**Công thức:**
```
Fahrenheit = (Celsius × 9/5) + 32
```

## Yêu cầu
1. Nhập nhiệt độ Celsius (số thực)
2. Chuyển đổi sang Fahrenheit
3. In ra kết quả (làm tròn 2 chữ số thập phân)

## Định dạng Input
- Một số thực đại diện cho nhiệt độ Celsius

## Định dạng Output
- Nhiệt độ Fahrenheit tương ứng (làm tròn 2 chữ số thập phân)

## Ví dụ

**Input:**
```
0
```

**Output:**
```
32.00
```

**Input:**
```
100
```

**Output:**
```
212.00
```

**Input:**
```
37.5
```

**Output:**
```
99.50
```

## Gợi ý
- Công thức: `F = (C * 9.0 / 5.0) + 32`
- Lưu ý: Dùng `9.0 / 5.0` thay vì `9 / 5` để tránh chia nguyên
- Sử dụng `printf("%.2f", fahrenheit)` để in 2 chữ số thập phân
