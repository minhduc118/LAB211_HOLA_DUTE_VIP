# Kiểm Tra Số Chẵn Lẻ

## Mô tả bài toán
Viết chương trình kiểm tra một số nguyên là số chẵn hay số lẻ.

## Yêu cầu
1. Nhập một số nguyên
2. Kiểm tra và in ra số đó là "even" (chẵn) hay "odd" (lẻ)

## Định dạng Input
- Một số nguyên n

## Định dạng Output
- In ra `even` nếu n là số chẵn
- In ra `odd` nếu n là số lẻ

## Ví dụ

**Input:**
```
4
```

**Output:**
```
even
```

**Input:**
```
7
```

**Output:**
```
odd
```

**Input:**
```
0
```

**Output:**
```
even
```

## Gợi ý
- Số chẵn là số chia hết cho 2 (phần dư = 0)
- Sử dụng toán tử `%` (modulo) để lấy phần dư
- Điều kiện: `n % 2 == 0` → số chẵn
