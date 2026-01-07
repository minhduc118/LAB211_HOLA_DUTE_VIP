# Validate Email

## Mô tả bài toán
Viết chương trình kiểm tra xem một chuỗi có phải là địa chỉ email hợp lệ hay không.

## Yêu cầu
1. Nhập một chuỗi email
2. Kiểm tra email có hợp lệ không theo các quy tắc:
   - Có đúng 1 ký tự `@`
   - Phần trước `@` chỉ chứa chữ, số, dấu chấm, gạch dưới
   - Phần sau `@` chứa tên domain và đuôi (ví dụ: gmail.com)
   - Đuôi email có ít nhất 2 ký tự
3. In ra `Valid` hoặc `Invalid`

## Định dạng Input
- Một chuỗi email

## Định dạng Output
- `Valid` nếu email hợp lệ
- `Invalid` nếu email không hợp lệ

## Ví dụ

**Input:**
```
test@email.com
```

**Output:**
```
Valid
```

**Input:**
```
invalid.email
```

**Output:**
```
Invalid
```

**Input:**
```
user123@domain.org
```

**Output:**
```
Valid
```

## Gợi ý
- Sử dụng Regex pattern: `^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$`
- Dùng phương thức `matches()` của String
- Nhớ escape ký tự `\` thành `\\` trong Java
