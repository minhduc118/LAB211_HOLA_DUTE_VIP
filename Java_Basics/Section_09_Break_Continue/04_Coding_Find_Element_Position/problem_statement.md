# Tìm Vị Trí Phần Tử

## Mô tả bài toán
Cho một dãy số nguyên và một số cần tìm, viết chương trình tìm vị trí đầu tiên của số đó trong dãy.

## Yêu cầu
1. Nhập số lượng phần tử N
2. Nhập N số nguyên
3. Nhập số cần tìm
4. Tìm và in ra vị trí đầu tiên (bắt đầu từ 0) của số đó
5. Nếu không tìm thấy, in ra -1

## Định dạng Input
- Dòng 1: Số nguyên N
- Dòng 2: N số nguyên cách nhau bởi dấu cách
- Dòng 3: Số cần tìm

## Định dạng Output
- Vị trí đầu tiên của số cần tìm (0-indexed)
- Hoặc -1 nếu không tìm thấy

## Ví dụ

**Input:**
```
5
10 20 30 40 50
30
```

**Output:**
```
2
```

*Giải thích: 30 ở vị trí thứ 2 (đếm từ 0)*

**Input:**
```
6
5 3 8 3 12 3
3
```

**Output:**
```
1
```

*Giải thích: 3 xuất hiện nhiều lần, nhưng vị trí đầu tiên là 1*

**Input:**
```
4
1 2 3 4
100
```

**Output:**
```
-1
```

## Gợi ý
- Dùng vòng lặp duyệt qua từng phần tử
- Khi tìm thấy, dùng `break` để thoát vòng lặp
- Lưu lại vị trí tìm thấy hoặc dùng biến đánh dấu
