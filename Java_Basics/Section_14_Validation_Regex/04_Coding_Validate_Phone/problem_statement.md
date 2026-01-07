# Validate Số Điện Thoại

## Mô tả bài toán
Viết chương trình kiểm tra xem một chuỗi có phải là số điện thoại Việt Nam hợp lệ hay không.

## Yêu cầu
1. Nhập một chuỗi số điện thoại
2. Kiểm tra số điện thoại có hợp lệ không theo quy tắc:
   - Gồm 10 chữ số
   - Bắt đầu bằng các đầu số: 03, 05, 07, 08, 09
3. In ra `Valid` hoặc `Invalid`

## Định dạng Input
- Một chuỗi số điện thoại

## Định dạng Output
- `Valid` nếu hợp lệ
- `Invalid` nếu không hợp lệ

## Ví dụ

**Input:**
```
0901234567
```

**Output:**
```
Valid
```

**Input:**
```
1234567890
```

**Output:**
```
Invalid
```

**Input:**
```
0312345678
```

**Output:**
```
Valid
```

## Gợi ý
- Pattern đầu số: `^(03|05|07|08|09)`
- Tiếp theo là 8 chữ số: `\\d{8}$`
- Pattern đầy đủ: `^(03|05|07|08|09)\\d{8}$`
