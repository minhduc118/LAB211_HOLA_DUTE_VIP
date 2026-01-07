# Method (Phương Thức) trong Java

## Giới thiệu
**Method** (phương thức) là một khối code thực hiện một chức năng cụ thể. Method giúp tái sử dụng code và tổ chức chương trình tốt hơn.

---

## 1. Cú Pháp Khai Báo Method

```java
[access_modifier] [static] kiểu_trả_về tênMethod(tham_số) {
    // Thân method
    return giá_trị;  // Nếu có kiểu trả về
}
```

### Các thành phần
| Thành phần | Mô tả | Ví dụ |
|------------|-------|-------|
| Access Modifier | Phạm vi truy cập | `public`, `private`, `protected` |
| static | Method thuộc class, không thuộc object | `static` |
| Kiểu trả về | Kiểu dữ liệu trả về | `int`, `String`, `void` |
| Tên method | Tên gọi method | `tinhTong`, `inThongTin` |
| Tham số | Dữ liệu đầu vào | `(int a, int b)` |

---

## 2. Các Loại Method

### Method không có tham số, không có giá trị trả về
```java
void chaoMung() {
    System.out.println("Xin chào!");
}

// Gọi method
chaoMung();  // Output: Xin chào!
```

### Method có tham số, không có giá trị trả về
```java
void chao(String ten) {
    System.out.println("Xin chào " + ten + "!");
}

// Gọi method
chao("An");  // Output: Xin chào An!
```

### Method không có tham số, có giá trị trả về
```java
int laySoNgauNhien() {
    return (int)(Math.random() * 100);
}

// Gọi method
int so = laySoNgauNhien();
System.out.println(so);  // Output: số ngẫu nhiên 0-99
```

### Method có tham số, có giá trị trả về
```java
int tinhTong(int a, int b) {
    return a + b;
}

// Gọi method
int ketQua = tinhTong(5, 3);
System.out.println(ketQua);  // Output: 8
```

---

## 3. Method trong Class

```java
class MayTinh {
    // Method cộng
    int cong(int a, int b) {
        return a + b;
    }
    
    // Method trừ
    int tru(int a, int b) {
        return a - b;
    }
    
    // Method nhân
    int nhan(int a, int b) {
        return a * b;
    }
    
    // Method chia
    double chia(int a, int b) {
        if (b == 0) {
            System.out.println("Không thể chia cho 0");
            return 0;
        }
        return (double) a / b;
    }
}

// Sử dụng
public class Main {
    public static void main(String[] args) {
        MayTinh mt = new MayTinh();
        
        System.out.println("5 + 3 = " + mt.cong(5, 3));
        System.out.println("5 - 3 = " + mt.tru(5, 3));
        System.out.println("5 * 3 = " + mt.nhan(5, 3));
        System.out.println("5 / 3 = " + mt.chia(5, 3));
    }
}
```

---

## 4. Method Overloading (Nạp chồng)

Cùng tên method nhưng khác tham số (số lượng hoặc kiểu dữ liệu).

```java
class TinhToan {
    // Cộng 2 số nguyên
    int cong(int a, int b) {
        return a + b;
    }
    
    // Cộng 3 số nguyên
    int cong(int a, int b, int c) {
        return a + b + c;
    }
    
    // Cộng 2 số thực
    double cong(double a, double b) {
        return a + b;
    }
    
    // Cộng chuỗi
    String cong(String a, String b) {
        return a + b;
    }
}

// Sử dụng
TinhToan tt = new TinhToan();
System.out.println(tt.cong(5, 3));           // 8
System.out.println(tt.cong(5, 3, 2));        // 10
System.out.println(tt.cong(5.5, 3.2));       // 8.7
System.out.println(tt.cong("Xin ", "chào")); // Xin chào
```

---

## 5. Static Method vs Instance Method

### Static Method
- Thuộc về **class**, không thuộc về object
- Gọi trực tiếp qua tên class
- Không thể truy cập thuộc tính non-static

```java
class TienIch {
    static int tinhBinhPhuong(int n) {
        return n * n;
    }
    
    static boolean laSoNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}

// Gọi trực tiếp, không cần tạo object
int bp = TienIch.tinhBinhPhuong(5);  // 25
boolean nt = TienIch.laSoNguyenTo(7);  // true
```

### Instance Method
- Thuộc về **object**
- Cần tạo object trước khi gọi
- Có thể truy cập thuộc tính của object

```java
class HinhChuNhat {
    int chieuDai;
    int chieuRong;
    
    // Instance method - truy cập thuộc tính của object
    int tinhDienTich() {
        return chieuDai * chieuRong;
    }
}

// Cần tạo object trước
HinhChuNhat hcn = new HinhChuNhat();
hcn.chieuDai = 5;
hcn.chieuRong = 3;
int dt = hcn.tinhDienTich();  // 15
```

---

## 6. Từ khóa `this`

`this` đại diện cho đối tượng hiện tại.

```java
class NhanVien {
    String ten;
    double luong;
    
    void setThongTin(String ten, double luong) {
        this.ten = ten;        // this.ten là thuộc tính
        this.luong = luong;    // ten là tham số
    }
    
    void inThongTin() {
        System.out.println("Tên: " + this.ten);
        System.out.println("Lương: " + this.luong);
    }
}
```

---

## 7. Truyền tham số

### Truyền giá trị (Primitive types)
```java
void tangGiaTri(int x) {
    x = x + 10;  // Chỉ thay đổi bản sao
}

int a = 5;
tangGiaTri(a);
System.out.println(a);  // Output: 5 (không đổi)
```

### Truyền tham chiếu (Objects)
```java
void tangTuoi(SinhVien sv) {
    sv.tuoi = sv.tuoi + 1;  // Thay đổi object gốc
}

SinhVien sv = new SinhVien();
sv.tuoi = 20;
tangTuoi(sv);
System.out.println(sv.tuoi);  // Output: 21 (đã đổi)
```

---

## 8. Best Practices

### ✅ Nên làm
```java
// Tên method mô tả rõ chức năng (camelCase)
double tinhDienTichHinhTron(double banKinh) {
    return Math.PI * banKinh * banKinh;
}

// Method ngắn gọn, làm một việc
boolean kiemTraSoAm(int so) {
    return so < 0;
}
```

### ❌ Không nên làm
```java
// Tên không rõ ràng
void doIt(int x) { ... }

// Method quá dài, làm nhiều việc
void xuLyTatCa() {
    // 200 dòng code...
}
```

---

## Tổng kết

| Loại Method | Cú pháp | Khi sử dụng |
|-------------|---------|-------------|
| void | `void tenMethod()` | Không cần trả về giá trị |
| return | `int tenMethod()` | Cần trả về giá trị |
| static | `static void tenMethod()` | Không cần tạo object |
| overload | Cùng tên, khác tham số | Linh hoạt với nhiều kiểu input |
