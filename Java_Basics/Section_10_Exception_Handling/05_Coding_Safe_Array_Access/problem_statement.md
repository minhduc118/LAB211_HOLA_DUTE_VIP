# Truy Cập Mảng An Toàn

## Mô tả bài toán
Viết chương trình truy cập phần tử trong mảng với xử lý ngoại lệ khi index không hợp lệ.

## Yêu cầu
1. Nhập số lượng phần tử N
2. Nhập N số nguyên vào mảng
3. Nhập index cần truy cập
4. In ra giá trị tại index đó hoặc thông báo lỗi nếu index không hợp lệ

## Định dạng Input
- Dòng 1: Số nguyên N (số phần tử)
- Dòng 2: N số nguyên cách nhau bởi dấu cách
- Dòng 3: Index cần truy cập

## Định dạng Output
- Nếu index hợp lệ: In ra giá trị phần tử
- Nếu index không hợp lệ: In ra `Error: Index out of bounds`

## Ví dụ

**Input:**
```
5
10 20 30 40 50
2
```

**Output:**
```
30
```

**Input:**
```
3
1 2 3
10
```

**Output:**
```
Error: Index out of bounds
```

**Input:**
```
4
5 10 15 20
-1
```

**Output:**
```
Error: Index out of bounds
```

## Gợi ý
- Sử dụng try-catch để bắt `ArrayIndexOutOfBoundsException`
- Index hợp lệ: 0 đến N-1
- Cả index âm và index >= N đều không hợp lệ
