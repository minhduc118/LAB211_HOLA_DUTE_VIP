# Kiểm Tra Palindrome

## Mô tả bài toán
Viết chương trình kiểm tra xem một chuỗi có phải là **palindrome** (đọc xuôi và đọc ngược giống nhau) hay không.

## Yêu cầu
1. Nhập một chuỗi
2. Kiểm tra chuỗi có phải palindrome không (không phân biệt hoa/thường)
3. Bỏ qua dấu cách khi kiểm tra
4. In ra `Yes` hoặc `No`

## Định dạng Input
- Một chuỗi (có thể chứa dấu cách, chữ hoa/thường)

## Định dạng Output
- `Yes` nếu là palindrome
- `No` nếu không phải

## Ví dụ

**Input:**
```
Madam
```

**Output:**
```
Yes
```

**Input:**
```
A man a plan a canal Panama
```

**Output:**
```
Yes
```

*Sau khi bỏ dấu cách và chuyển thường: "amanaplanacanalpanama"*

**Input:**
```
Hello World
```

**Output:**
```
No
```

## Gợi ý
- Chuyển chuỗi về chữ thường với `toLowerCase()`
- Xóa dấu cách với `replace(" ", "")` hoặc `replaceAll("\\s", "")`
- Dùng `StringBuilder.reverse()` để đảo ngược
- So sánh với `equals()`
