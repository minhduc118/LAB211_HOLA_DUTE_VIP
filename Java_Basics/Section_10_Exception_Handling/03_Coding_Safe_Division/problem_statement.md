# Phép Chia An Toàn

## Mô tả bài toán
Viết chương trình thực hiện phép chia hai số nguyên với xử lý ngoại lệ.

## Yêu cầu
1. Nhập hai số nguyên a và b
2. Tính a / b (phép chia lấy phần nguyên)
3. Xử lý trường hợp chia cho 0
4. In ra kết quả hoặc thông báo lỗi

## Định dạng Input
- Dòng 1: Số nguyên a
- Dòng 2: Số nguyên b

## Định dạng Output
- Nếu b ≠ 0: In ra kết quả phép chia
- Nếu b = 0: In ra `Error: Division by zero`

## Ví dụ

**Input:**
```
10
2
```

**Output:**
```
5
```

**Input:**
```
15
0
```

**Output:**
```
Error: Division by zero
```

**Input:**
```
7
3
```

**Output:**
```
2
```

## Gợi ý
- Sử dụng try-catch để bắt `ArithmeticException`
- Có thể kiểm tra b == 0 trước khi chia
- Chú ý đây là phép chia lấy phần nguyên
