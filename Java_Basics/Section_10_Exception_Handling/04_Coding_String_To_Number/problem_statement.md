# Chuyển Đổi Chuỗi Sang Số

## Mô tả bài toán
Viết chương trình chuyển đổi một chuỗi sang số nguyên với xử lý ngoại lệ.

## Yêu cầu
1. Nhập một chuỗi
2. Chuyển đổi chuỗi sang số nguyên
3. Xử lý trường hợp chuỗi không phải số hợp lệ
4. In ra số hoặc thông báo lỗi

## Định dạng Input
- Một chuỗi (có thể là số hoặc không)

## Định dạng Output
- Nếu chuỗi là số hợp lệ: In ra số đó
- Nếu chuỗi không hợp lệ: In ra `Error: Invalid number format`

## Ví dụ

**Input:**
```
123
```

**Output:**
```
123
```

**Input:**
```
abc
```

**Output:**
```
Error: Invalid number format
```

**Input:**
```
-456
```

**Output:**
```
-456
```

**Input:**
```
12.5
```

**Output:**
```
Error: Invalid number format
```

*Vì 12.5 là số thực, không phải số nguyên*

## Gợi ý
- Sử dụng `Integer.parseInt()` để chuyển đổi
- Bắt `NumberFormatException` khi chuỗi không hợp lệ
- Lưu ý: số âm có dấu "-" ở đầu là hợp lệ
