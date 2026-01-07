# Xếp Loại Học Lực

## Mô tả bài toán
Viết chương trình nhập điểm của học sinh và xếp loại học lực.

## Yêu cầu
1. Nhập một số nguyên từ 0-100 (điểm số)
2. Xếp loại theo thang điểm sau:
   - **90-100**: Xuất sắc (Excellent)
   - **80-89**: Giỏi (Good)
   - **70-79**: Khá (Fair)
   - **60-69**: Trung bình (Average)
   - **Dưới 60**: Yếu (Poor)

## Định dạng Input
- Một số nguyên n (0 ≤ n ≤ 100)

## Định dạng Output
- In ra xếp loại tương ứng (tiếng Anh)

## Ví dụ

**Input:**
```
85
```

**Output:**
```
Good
```

**Input:**
```
92
```

**Output:**
```
Excellent
```

**Input:**
```
55
```

**Output:**
```
Poor
```

## Gợi ý
- Sử dụng câu lệnh `if-else-if` để kiểm tra điểm
- Kiểm tra từ điểm cao xuống thấp
- Chú ý đến biên của khoảng điểm
