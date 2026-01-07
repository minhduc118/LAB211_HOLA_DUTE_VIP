# Quản Lý Danh Bạ Điện Thoại

## Mô tả bài toán
Sử dụng HashMap để tạo một ứng dụng danh bạ điện thoại đơn giản.

## Yêu cầu
1. Nhập N cặp thông tin (tên, số điện thoại)
2. Nhập tên cần tìm kiếm
3. In ra số điện thoại tương ứng hoặc thông báo không tìm thấy

## Định dạng Input
- Dòng 1: Số lượng liên hệ N
- N dòng tiếp theo: Mỗi dòng gồm `tên số_điện_thoại` (cách nhau bởi dấu cách)
- Dòng cuối: Tên cần tìm kiếm

## Định dạng Output
- Nếu tìm thấy: `số_điện_thoại`
- Nếu không tìm thấy: `Not found`

## Ví dụ

**Input:**
```
3
An 0901234567
Binh 0912345678
Chau 0923456789
Binh
```

**Output:**
```
0912345678
```

**Input:**
```
2
Nam 0987654321
Lan 0976543210
Hung
```

**Output:**
```
Not found
```

## Gợi ý
- Sử dụng `HashMap<String, String>` với key là tên, value là số điện thoại
- Dùng `containsKey()` hoặc `get()` để kiểm tra và lấy dữ liệu
- Chú ý input có thể chứa dấu cách trong tên
