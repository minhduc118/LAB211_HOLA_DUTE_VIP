# Tính Tổng Số Dương

## Mô tả bài toán
Cho một dãy số nguyên, viết chương trình tính tổng của các số dương trong dãy (bỏ qua các số âm và số 0).

## Yêu cầu
1. Nhập số lượng phần tử N
2. Nhập N số nguyên
3. Tính tổng chỉ các số dương (> 0)
4. In ra kết quả

## Định dạng Input
- Dòng 1: Số nguyên N (số lượng phần tử)
- Dòng 2: N số nguyên cách nhau bởi dấu cách

## Định dạng Output
- Tổng các số dương

## Ví dụ

**Input:**
```
6
5 -3 8 -1 12 -7
```

**Output:**
```
25
```

*Giải thích: 5 + 8 + 12 = 25 (bỏ qua -3, -1, -7)*

**Input:**
```
5
-1 -2 -3 -4 -5
```

**Output:**
```
0
```

**Input:**
```
4
10 0 20 30
```

**Output:**
```
60
```

*Giải thích: 10 + 20 + 30 = 60 (bỏ qua 0)*

## Gợi ý
- Sử dụng `continue` để bỏ qua các số ≤ 0
- Hoặc sử dụng điều kiện `if` để kiểm tra
- Khởi tạo tổng = 0 trước khi lặp
