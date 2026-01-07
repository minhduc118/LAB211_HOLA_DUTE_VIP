# Tạo Class Sinh Viên với Constructor

## Mô tả bài toán
Tạo một class `Student` với constructor để khởi tạo thông tin sinh viên.

## Yêu cầu
1. Tạo class `Student` với các thuộc tính:
   - `name` (tên) - kiểu String
   - `age` (tuổi) - kiểu int
   - `gpa` (điểm trung bình) - kiểu double

2. Tạo constructor với 3 tham số để khởi tạo đầy đủ thông tin

3. Tạo phương thức `displayInfo()` in ra thông tin theo định dạng:
   - `Name: [tên]`
   - `Age: [tuổi]`
   - `GPA: [điểm - 1 chữ số thập phân]`

4. Nhập thông tin và hiển thị

## Định dạng Input
- Dòng 1: Tên sinh viên (String)
- Dòng 2: Tuổi (int)
- Dòng 3: Điểm GPA (double)

## Định dạng Output
```
Name: [tên]
Age: [tuổi]
GPA: [điểm]
```

## Ví dụ

**Input:**
```
Nguyen Van A
20
8.5
```

**Output:**
```
Name: Nguyen Van A
Age: 20
GPA: 8.5
```

**Input:**
```
Tran Thi B
19
9.2
```

**Output:**
```
Name: Tran Thi B
Age: 19
GPA: 9.2
```

## Gợi ý
- Sử dụng từ khóa `this` trong constructor để phân biệt thuộc tính và tham số
- Constructor có cùng tên với class và không có kiểu trả về
- Sử dụng `scanner.nextLine()` để đọc tên có dấu cách
