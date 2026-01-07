# Đếm Tần Suất Từ

## Mô tả bài toán
Sử dụng HashMap để đếm số lần xuất hiện của mỗi từ trong một danh sách.

## Yêu cầu
1. Nhập N từ
2. Đếm số lần xuất hiện của mỗi từ
3. In ra kết quả theo thứ tự xuất hiện đầu tiên

## Định dạng Input
- Dòng 1: Số lượng từ N
- Dòng 2: N từ cách nhau bởi dấu cách (chữ thường)

## Định dạng Output
- Mỗi dòng: `từ: số_lần_xuất_hiện` (theo thứ tự xuất hiện đầu tiên)

## Ví dụ

**Input:**
```
6
apple banana apple orange banana apple
```

**Output:**
```
apple: 3
banana: 2
orange: 1
```

**Input:**
```
5
java java python java python
```

**Output:**
```
java: 3
python: 2
```

## Gợi ý
- Sử dụng `LinkedHashMap` để giữ thứ tự xuất hiện
- Dùng `getOrDefault(key, 0) + 1` để đếm
- Duyệt qua `entrySet()` để in kết quả
