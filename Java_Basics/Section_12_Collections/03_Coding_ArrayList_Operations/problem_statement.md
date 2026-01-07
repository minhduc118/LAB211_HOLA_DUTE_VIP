# Quản Lý Danh Sách Số

## Mô tả bài toán
Sử dụng ArrayList để quản lý một danh sách số nguyên và thực hiện các thao tác cơ bản.

## Yêu cầu
1. Nhập N số nguyên vào ArrayList
2. Tính và in ra:
   - Tổng các số
   - Số lớn nhất
   - Số nhỏ nhất

## Định dạng Input
- Dòng 1: Số lượng phần tử N
- Dòng 2: N số nguyên cách nhau bởi dấu cách

## Định dạng Output
- Dòng 1: Tổng các số
- Dòng 2: Số lớn nhất
- Dòng 3: Số nhỏ nhất

## Ví dụ

**Input:**
```
5
10 5 8 3 12
```

**Output:**
```
38
12
3
```

**Input:**
```
4
-5 10 -3 8
```

**Output:**
```
10
10
-5
```

## Gợi ý
- Sử dụng `ArrayList<Integer>` để lưu trữ
- Duyệt qua ArrayList để tính tổng, tìm max, min
- Có thể dùng `Collections.max()` và `Collections.min()`
