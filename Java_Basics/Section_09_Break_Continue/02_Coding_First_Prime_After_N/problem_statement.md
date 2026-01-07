# Tìm Số Nguyên Tố Đầu Tiên Lớn Hơn N

## Mô tả bài toán
Viết chương trình tìm số nguyên tố đầu tiên lớn hơn số N cho trước.

## Yêu cầu
1. Nhập một số nguyên dương N
2. Tìm số nguyên tố nhỏ nhất mà lớn hơn N
3. In ra số nguyên tố đó

## Định dạng Input
- Một số nguyên dương N (1 ≤ N ≤ 10000)

## Định dạng Output
- Số nguyên tố đầu tiên lớn hơn N

## Ví dụ

**Input:**
```
10
```

**Output:**
```
11
```

*Giải thích: 11 là số nguyên tố đầu tiên lớn hơn 10*

**Input:**
```
20
```

**Output:**
```
23
```

**Input:**
```
1
```

**Output:**
```
2
```

## Gợi ý
- Bắt đầu từ N + 1 và kiểm tra từng số
- Khi tìm được số nguyên tố, dùng `break` để thoát vòng lặp
- Sử dụng hàm kiểm tra số nguyên tố từ bài trước
- Có thể dùng vòng lặp `while(true)` với `break`
