# Tính Tổng N Số

## Mô tả bài toán
Viết chương trình tính tổng các số từ 1 đến N.

## Yêu cầu
1. Nhập một số nguyên dương N
2. Tính tổng: 1 + 2 + 3 + ... + N
3. In ra kết quả

## Định dạng Input
- Một số nguyên dương N (1 ≤ N ≤ 1000)

## Định dạng Output
- Tổng các số từ 1 đến N

## Ví dụ

**Input:**
```
5
```

**Output:**
```
15
```

*Giải thích: 1 + 2 + 3 + 4 + 5 = 15*

**Input:**
```
10
```

**Output:**
```
55
```

**Input:**
```
100
```

**Output:**
```
5050
```

## Gợi ý
- Sử dụng vòng lặp `for` để duyệt từ 1 đến N
- Khởi tạo biến `sum = 0` trước vòng lặp
- Trong mỗi lần lặp: `sum = sum + i` hoặc `sum += i`
