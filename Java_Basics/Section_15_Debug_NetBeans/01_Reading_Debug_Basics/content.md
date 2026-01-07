# Debug (Gỡ Lỗi) trong NetBeans

## Giới thiệu
**Debug** (gỡ lỗi) là kỹ năng quan trọng giúp lập trình viên tìm và sửa lỗi trong chương trình. NetBeans IDE cung cấp các công cụ debug mạnh mẽ giúp bạn theo dõi, phân tích và sửa lỗi hiệu quả.

---

## 1. Các loại lỗi trong lập trình

| Loại lỗi | Mô tả | Ví dụ |
|----------|-------|-------|
| **Syntax Error** | Lỗi cú pháp, phát hiện khi biên dịch | Thiếu `;`, thiếu `}` |
| **Runtime Error** | Lỗi khi chạy chương trình | Chia cho 0, null pointer |
| **Logic Error** | Kết quả sai, chương trình vẫn chạy | Công thức sai, điều kiện sai |

---

## 2. Cửa sổ Debug trong NetBeans

Khi debug, NetBeans hiển thị các cửa sổ hữu ích:

- **Variables**: Xem giá trị các biến
- **Watches**: Theo dõi biến/biểu thức cụ thể
- **Call Stack**: Xem stack các method đang gọi
- **Breakpoints**: Quản lý các điểm dừng
- **Output**: Xem output của chương trình

---

## 3. Breakpoint (Điểm dừng)

### Đặt Breakpoint
**Breakpoint** là điểm dừng - nơi chương trình sẽ tạm dừng để bạn kiểm tra.

**Cách đặt:**
1. Click vào số dòng bên trái editor
2. Hoặc nhấn `Ctrl + F8` tại dòng cần đặt
3. Dòng sẽ hiển thị dấu chấm đỏ

![Breakpoint](breakpoint.png)

### Các loại Breakpoint
- **Line Breakpoint**: Dừng tại dòng code
- **Conditional Breakpoint**: Dừng khi điều kiện đúng
- **Exception Breakpoint**: Dừng khi có exception

### Đặt Conditional Breakpoint
1. Click phải vào breakpoint đã đặt
2. Chọn **Breakpoint** → **Properties**
3. Trong **Condition**, nhập điều kiện (ví dụ: `i == 5`)
4. Chương trình chỉ dừng khi điều kiện đúng

---

## 4. Các nút điều khiển Debug

### Thanh công cụ Debug

| Icon | Phím tắt | Chức năng |
|------|----------|-----------|
| ▶️ **Continue** | `F5` | Tiếp tục chạy đến breakpoint tiếp theo |
| ⏸️ **Pause** | | Tạm dừng chương trình |
| ⏹️ **Stop** | `Shift + F5` | Dừng debug |
| ⏭️ **Step Over** | `F8` | Chạy qua dòng hiện tại (không đi vào method) |
| ⬇️ **Step Into** | `F7` | Đi vào trong method |
| ⬆️ **Step Out** | `Ctrl + F7` | Thoát ra khỏi method hiện tại |
| 🔄 **Run to Cursor** | `F4` | Chạy đến vị trí con trỏ |

### Giải thích chi tiết

#### Step Over (F8)
Chạy dòng code hiện tại và chuyển sang dòng tiếp theo. Nếu là method call, chạy xong method nhưng **không đi vào** bên trong.

```java
int a = 5;           // Dừng ở đây
int b = tinh(a);     // F8 → chạy xong tinh(), không đi vào
System.out.println(b); // Dừng ở đây
```

#### Step Into (F7)
Nếu dòng hiện tại gọi method, **đi vào bên trong** method đó.

```java
int a = 5;           // Dừng ở đây
int b = tinh(a);     // F7 → đi vào trong method tinh()
```

#### Step Out (Ctrl + F7)
**Thoát ra** khỏi method hiện tại, quay về method gọi nó.

---

## 5. Xem giá trị biến

### Cửa sổ Variables
- Mở tự động khi debug
- Hiển thị tất cả biến trong scope hiện tại
- Double-click để xem chi tiết object

### Hover để xem nhanh
- Di chuột lên biến trong editor
- Giá trị sẽ hiển thị ngay dưới con trỏ

### Cửa sổ Watches
Theo dõi biến hoặc biểu thức cụ thể:
1. Click phải vào biến → **New Watch**
2. Hoặc vào **Debug** → **New Watch**
3. Nhập tên biến hoặc biểu thức (ví dụ: `arr.length`, `a + b`)

---

## 6. Bắt đầu Debug

### Cách 1: Debug cả project
1. Click nút **Debug Project** (icon xanh lá với bug)
2. Hoặc nhấn `Ctrl + F5`

### Cách 2: Debug file hiện tại
1. Click phải vào file → **Debug File**
2. Hoặc nhấn `Ctrl + Shift + F5`

---

## 7. Ví dụ Debug thực tế

### Ví dụ 1: Tìm lỗi trong vòng lặp

```java
public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;
        
        for (int i = 0; i <= arr.length; i++) {  // Lỗi: <= thay vì <
            sum += arr[i];  // Đặt breakpoint ở đây
        }
        
        System.out.println("Sum: " + sum);
    }
}
```

**Cách debug:**
1. Đặt breakpoint tại dòng `sum += arr[i];`
2. Nhấn `Ctrl + F5` để debug
3. Xem giá trị `i` và `arr.length` trong cửa sổ Variables
4. Nhấn `F8` để step over qua từng lần lặp
5. Khi `i = 5`, phát hiện lỗi (index out of bounds)

### Ví dụ 2: Debug method

```java
public class Calculator {
    public static int divide(int a, int b) {
        return a / b;  // Đặt breakpoint ở đây
    }
    
    public static void main(String[] args) {
        int x = 10;
        int y = 0;
        int result = divide(x, y);  // Lỗi: chia cho 0
        System.out.println(result);
    }
}
```

**Cách debug:**
1. Đặt breakpoint tại `return a / b;`
2. Debug và kiểm tra giá trị `a` và `b`
3. Phát hiện `b = 0` → lỗi chia cho 0

---

## 8. Mẹo Debug hiệu quả

### ✅ Nên làm
- Đặt breakpoint ở vị trí nghi ngờ có lỗi
- Sử dụng Conditional Breakpoint cho vòng lặp lớn
- Kiểm tra giá trị biến trước và sau mỗi thao tác
- Dùng Step Into để đi vào method cần kiểm tra

### ❌ Không nên làm
- Đặt quá nhiều breakpoint
- Step Into vào method của thư viện (JDK)
- Bỏ qua bước kiểm tra biến

---

## 9. Debug với Console Input

Khi chương trình cần nhập từ bàn phím:

```java
Scanner scanner = new Scanner(System.in);
System.out.print("Nhập số: ");
int n = scanner.nextInt();  // Chờ input
```

**Lưu ý:**
- Cửa sổ **Output** sẽ chờ bạn nhập dữ liệu
- Nhập xong, nhấn Enter để tiếp tục
- Chương trình sẽ dừng tại breakpoint tiếp theo

---

## 10. Bảng phím tắt Debug trong NetBeans

| Phím tắt | Chức năng |
|----------|-----------|
| `Ctrl + F5` | Debug Project |
| `Ctrl + Shift + F5` | Debug File |
| `Shift + F5` | Stop Debug |
| `F5` | Continue |
| `F7` | Step Into |
| `F8` | Step Over |
| `Ctrl + F7` | Step Out |
| `F4` | Run to Cursor |
| `Ctrl + F8` | Toggle Breakpoint |
| `Ctrl + Shift + F8` | New Breakpoint |

---

## 11. Kiểm tra Exception

Khi có exception, NetBeans sẽ:
1. Dừng tại dòng gây lỗi
2. Hiển thị thông báo exception
3. Cho phép kiểm tra stack trace

Bạn có thể đặt **Exception Breakpoint**:
1. **Debug** → **New Breakpoint**
2. Chọn **Breakpoint Type**: Exception
3. Nhập tên exception (ví dụ: `NullPointerException`)
4. Chương trình sẽ dừng mỗi khi exception đó xảy ra

---

## Tổng kết

| Thao tác | Mô tả |
|----------|-------|
| Breakpoint | Điểm dừng để kiểm tra |
| Step Over | Chạy qua không đi vào method |
| Step Into | Đi vào trong method |
| Step Out | Thoát khỏi method |
| Variables | Xem giá trị biến |
| Watches | Theo dõi biểu thức |
| Continue | Tiếp tục đến breakpoint tiếp |

### Quy trình Debug cơ bản
1. ✅ Xác định vùng code nghi ngờ có lỗi
2. ✅ Đặt breakpoint
3. ✅ Chạy Debug
4. ✅ Kiểm tra giá trị biến
5. ✅ Step through code
6. ✅ Tìm và sửa lỗi
7. ✅ Test lại
