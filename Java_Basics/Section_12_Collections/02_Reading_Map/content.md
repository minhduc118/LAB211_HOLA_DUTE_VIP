# Collection Framework - Map trong Java

## Giới thiệu
**Map** là một cấu trúc dữ liệu lưu trữ các cặp **key-value** (khóa-giá trị). Mỗi key là duy nhất và ánh xạ đến một value tương ứng.

---

## 1. Đặc điểm của Map

- ✅ **Key-Value pairs**: Lưu trữ theo cặp khóa-giá trị
- ✅ **Key duy nhất**: Không cho phép key trùng lặp
- ✅ **Value có thể trùng**: Nhiều key có thể có cùng value
- ✅ **Null key**: HashMap cho phép 1 null key
- ❌ **Không có thứ tự** (HashMap), có thứ tự (LinkedHashMap, TreeMap)

---

## 2. Các Implementation của Map

| Class | Đặc điểm |
|-------|----------|
| `HashMap` | Nhanh nhất, không có thứ tự |
| `LinkedHashMap` | Giữ thứ tự thêm vào |
| `TreeMap` | Sắp xếp theo key |
| `Hashtable` | Thread-safe, chậm hơn |

---

## 3. HashMap

### Khai báo và khởi tạo
```java
import java.util.HashMap;
import java.util.Map;

// Cách 1: Khai báo với HashMap
HashMap<String, Integer> map1 = new HashMap<>();

// Cách 2: Khai báo với interface Map (khuyến khích)
Map<String, Integer> map2 = new HashMap<>();

// Key: String, Value: Integer
Map<String, String> userInfo = new HashMap<>();
```

### Các phương thức cơ bản

#### Thêm/Cập nhật phần tử
```java
Map<String, Integer> scores = new HashMap<>();

// Thêm cặp key-value
scores.put("An", 85);
scores.put("Bình", 90);
scores.put("Châu", 78);

// Cập nhật giá trị (key đã tồn tại)
scores.put("An", 88);  // An: 85 → 88

// Thêm nếu key chưa tồn tại
scores.putIfAbsent("Dũng", 92);  // Thêm
scores.putIfAbsent("An", 100);   // Không thêm (An đã có)
```

#### Truy cập phần tử
```java
// Lấy value theo key
int anScore = scores.get("An");  // 88

// Lấy với giá trị mặc định nếu không tồn tại
int unknown = scores.getOrDefault("XYZ", 0);  // 0

// Kiểm tra tồn tại key
boolean hasAn = scores.containsKey("An");  // true

// Kiểm tra tồn tại value
boolean has90 = scores.containsValue(90);  // true

// Lấy kích thước
int size = scores.size();  // 4

// Kiểm tra rỗng
boolean isEmpty = scores.isEmpty();  // false
```

#### Xóa phần tử
```java
// Xóa theo key
scores.remove("Châu");

// Xóa theo key và value (đúng cả 2 mới xóa)
scores.remove("An", 88);  // Xóa nếu An = 88

// Xóa tất cả
scores.clear();
```

---

## 4. Duyệt Map

### Cách 1: Duyệt qua keySet
```java
Map<String, Integer> scores = new HashMap<>();
scores.put("An", 85);
scores.put("Bình", 90);
scores.put("Châu", 78);

for (String key : scores.keySet()) {
    System.out.println(key + ": " + scores.get(key));
}
```

### Cách 2: Duyệt qua values
```java
for (Integer value : scores.values()) {
    System.out.println(value);
}
```

### Cách 3: Duyệt qua entrySet (khuyến khích)
```java
for (Map.Entry<String, Integer> entry : scores.entrySet()) {
    System.out.println(entry.getKey() + ": " + entry.getValue());
}
```

### Cách 4: forEach với Lambda (Java 8+)
```java
scores.forEach((key, value) -> {
    System.out.println(key + ": " + value);
});
```

---

## 5. LinkedHashMap - Giữ thứ tự

```java
import java.util.LinkedHashMap;
import java.util.Map;

Map<String, Integer> orderedMap = new LinkedHashMap<>();
orderedMap.put("Một", 1);
orderedMap.put("Hai", 2);
orderedMap.put("Ba", 3);

// In ra theo thứ tự thêm vào
orderedMap.forEach((k, v) -> System.out.println(k + ": " + v));
// Một: 1
// Hai: 2
// Ba: 3
```

---

## 6. TreeMap - Sắp xếp theo Key

```java
import java.util.TreeMap;
import java.util.Map;

Map<String, Integer> sortedMap = new TreeMap<>();
sortedMap.put("Châu", 3);
sortedMap.put("An", 1);
sortedMap.put("Bình", 2);

// Tự động sắp xếp theo key (A-Z)
sortedMap.forEach((k, v) -> System.out.println(k + ": " + v));
// An: 1
// Bình: 2
// Châu: 3
```

---

## 7. Map với Object làm Value

```java
class Student {
    String name;
    double gpa;
    
    Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
}

// Key: Mã sinh viên, Value: Đối tượng Student
Map<String, Student> studentMap = new HashMap<>();
studentMap.put("SV001", new Student("Nguyễn Văn A", 8.5));
studentMap.put("SV002", new Student("Trần Thị B", 9.0));

// Truy cập
Student sv = studentMap.get("SV001");
System.out.println(sv.name + ": " + sv.gpa);
```

---

## 8. Các thao tác hữu ích

### Đếm tần suất xuất hiện
```java
String[] words = {"apple", "banana", "apple", "orange", "banana", "apple"};
Map<String, Integer> wordCount = new HashMap<>();

for (String word : words) {
    wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
}

// {apple=3, banana=2, orange=1}
System.out.println(wordCount);
```

### Chuyển đổi List sang Map
```java
List<Student> students = Arrays.asList(
    new Student("SV001", "An", 8.5),
    new Student("SV002", "Bình", 9.0)
);

Map<String, Student> studentMap = new HashMap<>();
for (Student s : students) {
    studentMap.put(s.id, s);
}
```

### Tìm key có value lớn nhất
```java
Map<String, Integer> scores = new HashMap<>();
scores.put("An", 85);
scores.put("Bình", 92);
scores.put("Châu", 78);

String topStudent = null;
int maxScore = Integer.MIN_VALUE;

for (Map.Entry<String, Integer> entry : scores.entrySet()) {
    if (entry.getValue() > maxScore) {
        maxScore = entry.getValue();
        topStudent = entry.getKey();
    }
}

System.out.println("Top: " + topStudent + " - " + maxScore);
// Top: Bình - 92
```

---

## 9. So sánh List và Map

| Tiêu chí | List | Map |
|----------|------|-----|
| Cấu trúc | Danh sách | Cặp key-value |
| Truy cập | Theo index | Theo key |
| Trùng lặp | Cho phép | Key không, Value có |
| Thứ tự | Có (ArrayList) | Tùy loại |
| Khi dùng | Danh sách có thứ tự | Tra cứu nhanh theo key |

---

## 10. Ví dụ thực tế

### Từ điển Anh-Việt
```java
Map<String, String> dictionary = new HashMap<>();
dictionary.put("hello", "xin chào");
dictionary.put("goodbye", "tạm biệt");
dictionary.put("thank you", "cảm ơn");

Scanner scanner = new Scanner(System.in);
System.out.print("Nhập từ tiếng Anh: ");
String word = scanner.nextLine();

String meaning = dictionary.getOrDefault(word, "Không tìm thấy");
System.out.println("Nghĩa: " + meaning);
```

### Quản lý điểm sinh viên
```java
Map<String, List<Double>> studentScores = new HashMap<>();

// Thêm điểm cho từng sinh viên
studentScores.put("An", new ArrayList<>(Arrays.asList(8.0, 7.5, 9.0)));
studentScores.put("Bình", new ArrayList<>(Arrays.asList(9.0, 8.5, 9.5)));

// Tính điểm trung bình
for (Map.Entry<String, List<Double>> entry : studentScores.entrySet()) {
    double avg = entry.getValue().stream()
                      .mapToDouble(d -> d)
                      .average()
                      .orElse(0);
    System.out.println(entry.getKey() + ": " + String.format("%.2f", avg));
}
```

---

## Tổng kết

| Phương thức | Mô tả |
|-------------|-------|
| `put(key, value)` | Thêm/cập nhật cặp key-value |
| `get(key)` | Lấy value theo key |
| `getOrDefault(key, default)` | Lấy value hoặc default |
| `remove(key)` | Xóa theo key |
| `containsKey(key)` | Kiểm tra key tồn tại |
| `containsValue(value)` | Kiểm tra value tồn tại |
| `keySet()` | Lấy tất cả keys |
| `values()` | Lấy tất cả values |
| `entrySet()` | Lấy tất cả entries |
| `size()` | Số lượng cặp key-value |
