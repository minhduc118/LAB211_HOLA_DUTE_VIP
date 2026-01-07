# Đếm Nguyên Âm và Phụ Âm

## Mô tả bài toán
Viết chương trình đếm số lượng nguyên âm và phụ âm trong một chuỗi.

## Yêu cầu
1. Nhập một chuỗi
2. Đếm số nguyên âm (a, e, i, o, u - không phân biệt hoa/thường)
3. Đếm số phụ âm (các chữ cái không phải nguyên âm)
4. Bỏ qua các ký tự không phải chữ cái

## Định dạng Input
- Một chuỗi (có thể chứa chữ cái, số, ký tự đặc biệt)

## Định dạng Output
- Dòng 1: Số nguyên âm
- Dòng 2: Số phụ âm

## Ví dụ

**Input:**
```
Hello World
```

**Output:**
```
3
7
```

*Nguyên âm: e, o, o = 3; Phụ âm: H, l, l, W, r, l, d = 7*

**Input:**
```
Java Programming 123
```

**Output:**
```
5
11
```

**Input:**
```
AEIOUaeiou
```

**Output:**
```
10
0
```

## Gợi ý
- Duyệt qua từng ký tự với `charAt()`
- Dùng `Character.isLetter()` để kiểm tra chữ cái
- Dùng `Character.toLowerCase()` để chuyển thường
- Kiểm tra nguyên âm: `"aeiou".contains(String.valueOf(ch))`
