# Tính Giai Thừa

## Mô tả bài toán
Viết chương trình tính giai thừa của số N.

## Kiến thức cần biết
Giai thừa của N (ký hiệu N!) là tích của tất cả các số nguyên dương từ 1 đến N:
- N! = 1 × 2 × 3 × ... × N
- Đặc biệt: 0! = 1

## Yêu cầu
1. Nhập một số nguyên không âm N
2. Tính N!
3. In ra kết quả

## Định dạng Input
- Một số nguyên N (0 ≤ N ≤ 12)

## Định dạng Output
- Giá trị N!

## Ví dụ

**Input:**
```
5
```

**Output:**
```
120
```

*Giải thích: 5! = 1 × 2 × 3 × 4 × 5 = 120*

**Input:**
```
0
```

**Output:**
```
1
```

**Input:**
```
10
```

**Output:**
```
3628800
```

## Gợi ý
- Khởi tạo biến `factorial = 1` (không phải 0!)
- Sử dụng vòng lặp từ 1 đến N
- Nhân dần: `factorial = factorial * i`
- Xử lý trường hợp đặc biệt: 0! = 1
