# Break và Continue trong Java

## Giới thiệu
`break` và `continue` là hai từ khóa điều khiển luồng quan trọng trong Java, giúp kiểm soát hành vi của vòng lặp một cách linh hoạt.

---

## 1. Lệnh Break

### Công dụng
- **Thoát ngay lập tức** khỏi vòng lặp gần nhất
- Được dùng trong `for`, `while`, `do-while` và `switch`

### Cú pháp
```java
for (...) {
    if (điều_kiện) {
        break;  // Thoát khỏi vòng lặp
    }
}
```

---

## 2. Ví dụ Break

### Ví dụ 1: Tìm số đầu tiên chia hết cho 7
```java
for (int i = 1; i <= 100; i++) {
    if (i % 7 == 0) {
        System.out.println("Số đầu tiên chia hết cho 7: " + i);
        break;  // Thoát ngay khi tìm thấy
    }
}
```

**Output:** `Số đầu tiên chia hết cho 7: 7`

### Ví dụ 2: Tìm kiếm trong mảng
```java
int[] mangSo = {5, 23, 17, 42, 9, 15};
int canTim = 42;
boolean timThay = false;

for (int i = 0; i < mangSo.length; i++) {
    if (mangSo[i] == canTim) {
        System.out.println("Tìm thấy " + canTim + " tại vị trí " + i);
        timThay = true;
        break;  // Không cần tìm tiếp
    }
}

if (!timThay) {
    System.out.println("Không tìm thấy " + canTim);
}
```

### Ví dụ 3: Nhập liệu đến khi gặp 0
```java
Scanner scanner = new Scanner(System.in);
int tong = 0;

while (true) {  // Vòng lặp vô hạn
    System.out.print("Nhập số (0 để thoát): ");
    int so = scanner.nextInt();
    
    if (so == 0) {
        break;  // Thoát khi nhập 0
    }
    
    tong += so;
}

System.out.println("Tổng = " + tong);
```

---

## 3. Lệnh Continue

### Công dụng
- **Bỏ qua** phần còn lại của lần lặp hiện tại
- **Chuyển sang** lần lặp tiếp theo
- Vòng lặp **vẫn tiếp tục** chạy

### Cú pháp
```java
for (...) {
    if (điều_kiện) {
        continue;  // Bỏ qua, đi đến lần lặp tiếp theo
    }
    // Code này bị bỏ qua nếu continue được gọi
}
```

---

## 4. Ví dụ Continue

### Ví dụ 1: In số lẻ từ 1 đến 10
```java
for (int i = 1; i <= 10; i++) {
    if (i % 2 == 0) {
        continue;  // Bỏ qua số chẵn
    }
    System.out.println(i);
}
```

**Output:**
```
1
3
5
7
9
```

### Ví dụ 2: Bỏ qua số âm khi tính tổng
```java
int[] mangSo = {5, -3, 8, -1, 12, -7, 4};
int tong = 0;

for (int so : mangSo) {
    if (so < 0) {
        continue;  // Bỏ qua số âm
    }
    tong += so;
}

System.out.println("Tổng các số dương: " + tong);  // Output: 29
```

### Ví dụ 3: Validation dữ liệu
```java
String[] emails = {"john@email.com", "invalid", "jane@mail.org", "", "bob@test.net"};

for (String email : emails) {
    if (!email.contains("@")) {
        System.out.println("Bỏ qua email không hợp lệ: " + email);
        continue;
    }
    System.out.println("Xử lý: " + email);
}
```

**Output:**
```
Xử lý: john@email.com
Bỏ qua email không hợp lệ: invalid
Xử lý: jane@mail.org
Bỏ qua email không hợp lệ: 
Xử lý: bob@test.net
```

---

## 5. So sánh Break và Continue

| Tiêu chí | break | continue |
|----------|-------|----------|
| Tác dụng | Thoát vòng lặp | Bỏ qua lần lặp hiện tại |
| Vòng lặp | Kết thúc | Tiếp tục chạy |
| Khi dùng | Đã tìm thấy kết quả | Cần bỏ qua trường hợp |

### Minh họa trực quan
```java
// Break
for (int i = 1; i <= 5; i++) {
    if (i == 3) break;
    System.out.print(i + " ");
}
// Output: 1 2

// Continue
for (int i = 1; i <= 5; i++) {
    if (i == 3) continue;
    System.out.print(i + " ");
}
// Output: 1 2 4 5
```

---

## 6. Break và Continue trong vòng lặp lồng nhau

### Vấn đề
`break` và `continue` chỉ ảnh hưởng đến **vòng lặp gần nhất**.

```java
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        if (j == 2) {
            break;  // Chỉ thoát vòng lặp j
        }
        System.out.println("i=" + i + ", j=" + j);
    }
}
```

**Output:**
```
i=1, j=1
i=2, j=1
i=3, j=1
```

### Giải pháp: Labeled Break/Continue

#### Labeled Break
```java
outerLoop:  // Nhãn
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        if (j == 2) {
            break outerLoop;  // Thoát cả 2 vòng lặp
        }
        System.out.println("i=" + i + ", j=" + j);
    }
}
```

**Output:** `i=1, j=1`

#### Labeled Continue
```java
outerLoop:
for (int i = 1; i <= 3; i++) {
    for (int j = 1; j <= 3; j++) {
        if (j == 2) {
            continue outerLoop;  // Chuyển sang lần lặp tiếp theo của i
        }
        System.out.println("i=" + i + ", j=" + j);
    }
}
```

**Output:**
```
i=1, j=1
i=2, j=1
i=3, j=1
```

---

## 7. Best Practices

### ✅ Nên làm
```java
// Sử dụng break khi tìm kiếm
for (int item : list) {
    if (item == target) {
        found = true;
        break;  // Tối ưu: không cần duyệt tiếp
    }
}

// Sử dụng continue để lọc dữ liệu
for (int num : numbers) {
    if (num < 0) continue;  // Rõ ràng: bỏ qua số âm
    process(num);
}
```

### ❌ Không nên làm
```java
// Quá nhiều break/continue làm code khó đọc
for (int i = 0; i < n; i++) {
    if (condition1) continue;
    if (condition2) break;
    if (condition3) continue;
    if (condition4) break;
    // Khó theo dõi luồng chạy
}
```

---

## 8. Ứng dụng thực tế

### Tìm kiếm trong danh sách
```java
public Student findStudentById(List<Student> students, String id) {
    for (Student student : students) {
        if (student.getId().equals(id)) {
            return student;  // Tương tự break
        }
    }
    return null;
}
```

### Validate và xử lý
```java
public void processOrders(List<Order> orders) {
    for (Order order : orders) {
        if (!order.isValid()) {
            log("Bỏ qua đơn hàng không hợp lệ: " + order.getId());
            continue;
        }
        processOrder(order);
    }
}
```

---

## Bài tập thực hành

### Bài 1: Tìm số nguyên tố đầu tiên lớn hơn N
### Bài 2: Tính tổng các số dương trong mảng (bỏ qua số âm)
### Bài 3: Tìm vị trí phần tử trong mảng

---

## Tổng kết

| Từ khóa | Tác dụng | Vòng lặp sau đó |
|---------|----------|-----------------|
| `break` | Thoát khỏi vòng lặp | Kết thúc |
| `continue` | Bỏ qua lần lặp | Tiếp tục |
| `break label` | Thoát vòng lặp có nhãn | Kết thúc |
| `continue label` | Bỏ qua đến vòng lặp có nhãn | Tiếp tục |
