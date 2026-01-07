# Kiểm Tra Số Nguyên Tố

## Mô tả bài toán
Viết chương trình kiểm tra một số có phải là số nguyên tố hay không.

## Kiến thức cần biết
- **Số nguyên tố** là số tự nhiên lớn hơn 1, chỉ chia hết cho 1 và chính nó.
- Các số nguyên tố đầu tiên: 2, 3, 5, 7, 11, 13, 17, 19, 23, 29...
- Số 1 **không phải** là số nguyên tố.
- Số 2 là số nguyên tố chẵn duy nhất.

## Yêu cầu
1. Nhập một số nguyên dương N
2. Kiểm tra N có phải số nguyên tố không
3. In ra `Prime` nếu là số nguyên tố, `Not Prime` nếu không phải

## Định dạng Input
- Một số nguyên dương N (1 ≤ N ≤ 10000)

## Định dạng Output
- `Prime` hoặc `Not Prime`

## Ví dụ

**Input:**
```
7
```

**Output:**
```
Prime
```

**Input:**
```
12
```

**Output:**
```
Not Prime
```

**Input:**
```
2
```

**Output:**
```
Prime
```

**Input:**
```
1
```

**Output:**
```
Not Prime
```

## Gợi ý
- Kiểm tra nếu N < 2, in "Not Prime"
- Dùng vòng lặp kiểm tra từ 2 đến căn bậc 2 của N
- Nếu N chia hết cho bất kỳ số nào, không phải số nguyên tố
- Có thể dùng `Math.sqrt(n)` để lấy căn bậc 2
