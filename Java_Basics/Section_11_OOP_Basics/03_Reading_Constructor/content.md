# Constructor (Hàm Khởi Tạo) trong Java

## Giới thiệu
**Constructor** là một phương thức đặc biệt được gọi tự động khi tạo đối tượng. Constructor dùng để khởi tạo giá trị ban đầu cho các thuộc tính của đối tượng.

---

## 1. Đặc Điểm của Constructor

- 📌 **Cùng tên với class**
- 📌 **Không có kiểu trả về** (kể cả `void`)
- 📌 **Tự động gọi** khi tạo object bằng `new`
- 📌 Có thể có tham số hoặc không
- 📌 Có thể overload (nhiều constructor)

---

## 2. Default Constructor

Nếu không khai báo constructor, Java tự động tạo **default constructor** (constructor mặc định không tham số).

```java
class HocSinh {
    String ten;
    int tuoi;
    
    // Default constructor (ẩn, do Java tạo)
    // HocSinh() { }
}

// Sử dụng
HocSinh hs = new HocSinh();  // Gọi default constructor
hs.ten = "An";
hs.tuoi = 16;
```

---

## 3. No-arg Constructor

Constructor không có tham số, do lập trình viên tự định nghĩa.

```java
class SinhVien {
    String ten;
    int tuoi;
    double diem;
    
    // No-arg constructor
    SinhVien() {
        ten = "Chưa đặt tên";
        tuoi = 0;
        diem = 0.0;
        System.out.println("Đã tạo sinh viên mới!");
    }
}

// Sử dụng
SinhVien sv = new SinhVien();
// Output: Đã tạo sinh viên mới!
System.out.println(sv.ten);  // Chưa đặt tên
```

---

## 4. Parameterized Constructor

Constructor có tham số, cho phép khởi tạo với giá trị cụ thể.

```java
class SinhVien {
    String ten;
    int tuoi;
    double diem;
    
    // Constructor có tham số
    SinhVien(String ten, int tuoi, double diem) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diem = diem;
    }
    
    void inThongTin() {
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Điểm: " + diem);
    }
}

// Sử dụng
SinhVien sv1 = new SinhVien("Nguyễn Văn A", 20, 8.5);
SinhVien sv2 = new SinhVien("Trần Thị B", 19, 9.0);

sv1.inThongTin();
// Tên: Nguyễn Văn A
// Tuổi: 20
// Điểm: 8.5
```

---

## 5. Constructor Overloading

Nhiều constructor với các tham số khác nhau.

```java
class SanPham {
    String ten;
    double gia;
    int soLuong;
    
    // Constructor không tham số
    SanPham() {
        ten = "Chưa đặt tên";
        gia = 0;
        soLuong = 0;
    }
    
    // Constructor 1 tham số
    SanPham(String ten) {
        this.ten = ten;
        gia = 0;
        soLuong = 0;
    }
    
    // Constructor 2 tham số
    SanPham(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
        soLuong = 0;
    }
    
    // Constructor đầy đủ
    SanPham(String ten, double gia, int soLuong) {
        this.ten = ten;
        this.gia = gia;
        this.soLuong = soLuong;
    }
}

// Sử dụng - nhiều cách tạo object
SanPham sp1 = new SanPham();
SanPham sp2 = new SanPham("Laptop");
SanPham sp3 = new SanPham("Điện thoại", 15000000);
SanPham sp4 = new SanPham("Tai nghe", 500000, 100);
```

---

## 6. Gọi Constructor khác với `this()`

Một constructor có thể gọi constructor khác trong cùng class bằng `this()`.

```java
class NhanVien {
    String ten;
    String phongBan;
    double luong;
    
    // Constructor đầy đủ
    NhanVien(String ten, String phongBan, double luong) {
        this.ten = ten;
        this.phongBan = phongBan;
        this.luong = luong;
    }
    
    // Constructor 2 tham số, gọi constructor đầy đủ
    NhanVien(String ten, String phongBan) {
        this(ten, phongBan, 5000000);  // Lương mặc định
    }
    
    // Constructor 1 tham số
    NhanVien(String ten) {
        this(ten, "Chưa phân công", 5000000);
    }
    
    // Constructor không tham số
    NhanVien() {
        this("Chưa đặt tên");
    }
}
```

> **Lưu ý:** `this()` phải là câu lệnh **đầu tiên** trong constructor.

---

## 7. So Sánh Constructor và Method

| Tiêu chí | Constructor | Method |
|----------|-------------|--------|
| Tên | Trùng với tên class | Tự đặt |
| Kiểu trả về | Không có | Có (hoặc void) |
| Gọi | Tự động khi `new` | Gọi thủ công |
| Mục đích | Khởi tạo object | Thực hiện hành vi |
| Kế thừa | Không kế thừa | Có thể kế thừa |

---

## 8. Ví Dụ Thực Tế

### Quản lý tài khoản ngân hàng
```java
class TaiKhoanNganHang {
    private String soTaiKhoan;
    private String chuTaiKhoan;
    private double soDu;
    
    // Constructor
    TaiKhoanNganHang(String soTaiKhoan, String chuTaiKhoan) {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = 0;  // Số dư ban đầu = 0
    }
    
    TaiKhoanNganHang(String soTaiKhoan, String chuTaiKhoan, double soDuBanDau) {
        this.soTaiKhoan = soTaiKhoan;
        this.chuTaiKhoan = chuTaiKhoan;
        this.soDu = soDuBanDau;
    }
    
    // Methods
    void nopTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Đã nộp: " + soTien);
        }
    }
    
    void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Đã rút: " + soTien);
        } else {
            System.out.println("Số dư không đủ!");
        }
    }
    
    void inThongTin() {
        System.out.println("Số TK: " + soTaiKhoan);
        System.out.println("Chủ TK: " + chuTaiKhoan);
        System.out.println("Số dư: " + soDu);
    }
}

// Sử dụng
TaiKhoanNganHang tk1 = new TaiKhoanNganHang("123456", "Nguyễn Văn A");
TaiKhoanNganHang tk2 = new TaiKhoanNganHang("789012", "Trần Thị B", 10000000);

tk1.nopTien(5000000);
tk1.inThongTin();
```

---

## 9. Best Practices

### ✅ Nên làm
```java
// Khởi tạo đầy đủ các thuộc tính bắt buộc
class User {
    private String username;
    private String password;
    
    User(String username, String password) {
        if (username == null || username.isEmpty()) {
            throw new IllegalArgumentException("Username không được rỗng");
        }
        this.username = username;
        this.password = password;
    }
}
```

### ❌ Không nên làm
```java
// Constructor làm quá nhiều việc
class BadExample {
    BadExample() {
        // Kết nối database
        // Đọc file
        // Gọi API
        // 100 dòng logic...
    }
}
```

---

## Tổng kết

| Loại Constructor | Mô tả |
|------------------|-------|
| Default | Java tự tạo nếu không khai báo |
| No-arg | Không có tham số, tự định nghĩa |
| Parameterized | Có tham số, khởi tạo linh hoạt |
| Overloaded | Nhiều constructor khác tham số |
| `this()` | Gọi constructor khác trong cùng class |
