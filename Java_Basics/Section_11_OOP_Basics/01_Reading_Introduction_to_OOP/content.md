# Giới Thiệu Lập Trình Hướng Đối Tượng (OOP)

## OOP là gì?

**OOP (Object-Oriented Programming)** - Lập trình hướng đối tượng là một phương pháp lập trình dựa trên khái niệm **đối tượng (object)**, trong đó đối tượng chứa dữ liệu và các phương thức để thao tác dữ liệu đó.

---

## 1. Tại sao cần OOP?

### Lập trình thủ tục (Procedural)
```java
// Quản lý sinh viên - Cách thủ tục
String[] tenSV = new String[100];
int[] tuoiSV = new int[100];
double[] diemSV = new double[100];

void inThongTin(int index) {
    System.out.println("Tên: " + tenSV[index]);
    System.out.println("Tuổi: " + tuoiSV[index]);
    System.out.println("Điểm: " + diemSV[index]);
}
```

**Vấn đề:**
- Dữ liệu phân tán, khó quản lý
- Khó mở rộng
- Dễ gây lỗi

### Lập trình hướng đối tượng (OOP)
```java
// Quản lý sinh viên - Cách OOP
class SinhVien {
    String ten;
    int tuoi;
    double diem;
    
    void inThongTin() {
        System.out.println("Tên: " + ten);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Điểm: " + diem);
    }
}

SinhVien sv = new SinhVien();
sv.ten = "Nguyễn Văn A";
sv.tuoi = 20;
sv.diem = 8.5;
sv.inThongTin();
```

**Ưu điểm:**
- Dữ liệu và hành vi đóng gói trong một đơn vị
- Dễ quản lý và mở rộng
- Code dễ đọc và bảo trì

---

## 2. Bốn Tính Chất Của OOP

### 1️⃣ Đóng gói (Encapsulation)
Che giấu dữ liệu, chỉ cho phép truy cập qua các phương thức.

```java
class TaiKhoan {
    private double soDu;  // Ẩn dữ liệu
    
    public void nopTien(double tien) {
        if (tien > 0) {
            soDu += tien;
        }
    }
    
    public double laySoDu() {
        return soDu;
    }
}
```

### 2️⃣ Kế thừa (Inheritance)
Lớp con kế thừa thuộc tính và phương thức từ lớp cha.

```java
class DongVat {
    void an() {
        System.out.println("Đang ăn...");
    }
}

class Cho extends DongVat {
    void sua() {
        System.out.println("Gâu gâu!");
    }
}
```

### 3️⃣ Đa hình (Polymorphism)
Cùng một phương thức có thể hoạt động khác nhau ở các lớp khác nhau.

```java
class HinhHoc {
    double tinhDienTich() { return 0; }
}

class HinhTron extends HinhHoc {
    double banKinh;
    double tinhDienTich() {
        return Math.PI * banKinh * banKinh;
    }
}

class HinhVuong extends HinhHoc {
    double canh;
    double tinhDienTich() {
        return canh * canh;
    }
}
```

### 4️⃣ Trừu tượng (Abstraction)
Ẩn chi tiết phức tạp, chỉ hiển thị chức năng cần thiết.

```java
abstract class MayTinh {
    abstract void tinhToan();  // Chỉ khai báo, không cài đặt
}

class MayTinhCam extends MayTinh {
    void tinhToan() {
        System.out.println("Tính toán bằng máy tính cầm tay");
    }
}
```

---

## 3. Các Khái Niệm Cơ Bản

| Khái niệm | Mô tả | Ví dụ thực tế |
|-----------|-------|---------------|
| **Class** | Bản thiết kế, khuôn mẫu | Bản vẽ ngôi nhà |
| **Object** | Thực thể tạo từ class | Ngôi nhà thực tế |
| **Attribute** | Dữ liệu, đặc điểm | Màu sơn, số tầng |
| **Method** | Hành vi, chức năng | Mở cửa, bật đèn |
| **Constructor** | Khởi tạo đối tượng | Xây dựng ngôi nhà |

---

## 4. Class và Object

### Class - Lớp
**Class** là bản thiết kế (blueprint) định nghĩa cấu trúc và hành vi của đối tượng.

```java
// Định nghĩa class
class Xe {
    // Thuộc tính (Attributes)
    String mauSac;
    String hangXe;
    int tocDoToiDa;
    
    // Phương thức (Methods)
    void chay() {
        System.out.println("Xe đang chạy");
    }
    
    void dung() {
        System.out.println("Xe đã dừng");
    }
}
```

### Object - Đối tượng
**Object** là thực thể cụ thể được tạo ra từ class.

```java
// Tạo đối tượng từ class
Xe xeHonda = new Xe();
xeHonda.mauSac = "Đỏ";
xeHonda.hangXe = "Honda";
xeHonda.tocDoToiDa = 180;

Xe xeToyota = new Xe();
xeToyota.mauSac = "Trắng";
xeToyota.hangXe = "Toyota";
xeToyota.tocDoToiDa = 200;

// Gọi phương thức
xeHonda.chay();  // Output: Xe đang chạy
```

### So sánh Class và Object

| Class | Object |
|-------|--------|
| Là bản thiết kế | Là thực thể cụ thể |
| Không chiếm bộ nhớ | Chiếm bộ nhớ |
| Khai báo một lần | Tạo nhiều lần từ một class |
| Dùng từ khóa `class` | Dùng từ khóa `new` |

---

## 5. Ví Dụ Thực Tế

### Ví dụ: Quản lý học sinh
```java
class HocSinh {
    // Thuộc tính
    String hoTen;
    int tuoi;
    String lop;
    double diemTrungBinh;
    
    // Phương thức
    void hocBai() {
        System.out.println(hoTen + " đang học bài");
    }
    
    void kiemTra() {
        System.out.println(hoTen + " đang làm bài kiểm tra");
    }
    
    boolean datHocBong() {
        return diemTrungBinh >= 8.5;
    }
}

// Sử dụng
public class Main {
    public static void main(String[] args) {
        HocSinh hs1 = new HocSinh();
        hs1.hoTen = "Trần Văn B";
        hs1.tuoi = 16;
        hs1.lop = "10A1";
        hs1.diemTrungBinh = 9.0;
        
        hs1.hocBai();
        System.out.println("Học bổng: " + hs1.datHocBong());
    }
}
```

---

## Tổng kết

### 4 Tính Chất OOP
| Tính chất | Từ khóa | Mục đích |
|-----------|---------|----------|
| Đóng gói | `private`, getter/setter | Bảo vệ dữ liệu |
| Kế thừa | `extends` | Tái sử dụng code |
| Đa hình | `@Override` | Linh hoạt |
| Trừu tượng | `abstract`, `interface` | Đơn giản hóa |

### Lợi ích của OOP
- ✅ Code dễ tổ chức và quản lý
- ✅ Tái sử dụng code cao
- ✅ Dễ bảo trì và mở rộng
- ✅ Phản ánh thế giới thực
- ✅ Làm việc nhóm hiệu quả
