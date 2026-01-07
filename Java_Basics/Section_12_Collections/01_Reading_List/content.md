# Collection Framework - List trong Java

## Giới thiệu
**Collection Framework** là một tập hợp các interface và class trong Java để lưu trữ và xử lý dữ liệu. `List` là một trong những collection phổ biến nhất, cho phép lưu trữ danh sách các phần tử có thứ tự và có thể trùng lặp.

---

## 1. Tổng quan Collection Framework

```
Collection (Interface)
├── List (Interface)
│   ├── ArrayList
│   ├── LinkedList
│   └── Vector
├── Set (Interface)
│   ├── HashSet
│   ├── LinkedHashSet
│   └── TreeSet
└── Queue (Interface)
    ├── PriorityQueue
    └── LinkedList

Map (Interface) - Không kế thừa Collection
├── HashMap
├── LinkedHashMap
├── TreeMap
└── Hashtable
```

---

## 2. List Interface

### Đặc điểm của List
- ✅ **Có thứ tự**: Phần tử được lưu theo thứ tự thêm vào
- ✅ **Cho phép trùng lặp**: Có thể có nhiều phần tử giống nhau
- ✅ **Truy cập theo index**: Có thể truy cập phần tử bằng chỉ số
- ✅ **Null values**: Cho phép giá trị null

---

## 3. ArrayList

`ArrayList` là implementation phổ biến nhất của `List`, sử dụng mảng động.

### Khai báo và khởi tạo
```java
import java.util.ArrayList;
import java.util.List;

// Cách 1: Khai báo với ArrayList
ArrayList<String> list1 = new ArrayList<>();

// Cách 2: Khai báo với interface List (khuyến khích)
List<String> list2 = new ArrayList<>();

// Cách 3: Khởi tạo với kích thước ban đầu
List<Integer> list3 = new ArrayList<>(100);
```

### Các phương thức cơ bản

#### Thêm phần tử
```java
List<String> fruits = new ArrayList<>();

// Thêm vào cuối
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Orange");

// Thêm vào vị trí cụ thể
fruits.add(1, "Mango");  // ["Apple", "Mango", "Banana", "Orange"]

// Thêm nhiều phần tử
List<String> moreFruits = Arrays.asList("Grape", "Kiwi");
fruits.addAll(moreFruits);
```

#### Truy cập phần tử
```java
// Lấy phần tử theo index
String first = fruits.get(0);  // "Apple"

// Lấy kích thước
int size = fruits.size();  // 6

// Kiểm tra rỗng
boolean isEmpty = fruits.isEmpty();  // false

// Kiểm tra tồn tại
boolean hasApple = fruits.contains("Apple");  // true

// Tìm vị trí
int index = fruits.indexOf("Banana");  // 2
int lastIndex = fruits.lastIndexOf("Apple");  // 0
```

#### Cập nhật phần tử
```java
// Thay đổi phần tử tại index
fruits.set(0, "Pineapple");  // Thay "Apple" bằng "Pineapple"
```

#### Xóa phần tử
```java
// Xóa theo index
fruits.remove(0);  // Xóa phần tử đầu tiên

// Xóa theo giá trị
fruits.remove("Banana");  // Xóa "Banana" đầu tiên tìm thấy

// Xóa tất cả
fruits.clear();
```

---

## 4. Duyệt List

### Cách 1: For loop truyền thống
```java
List<String> names = Arrays.asList("An", "Bình", "Châu");

for (int i = 0; i < names.size(); i++) {
    System.out.println(i + ": " + names.get(i));
}
```

### Cách 2: Enhanced for (for-each)
```java
for (String name : names) {
    System.out.println(name);
}
```

### Cách 3: Iterator
```java
import java.util.Iterator;

Iterator<String> iterator = names.iterator();
while (iterator.hasNext()) {
    String name = iterator.next();
    System.out.println(name);
}
```

### Cách 4: forEach với Lambda (Java 8+)
```java
names.forEach(name -> System.out.println(name));

// Hoặc method reference
names.forEach(System.out::println);
```

---

## 5. ArrayList với các kiểu dữ liệu

### Với số nguyên
```java
List<Integer> numbers = new ArrayList<>();
numbers.add(10);
numbers.add(20);
numbers.add(30);

// Tính tổng
int sum = 0;
for (int num : numbers) {
    sum += num;
}
System.out.println("Tổng: " + sum);  // 60
```

### Với Object
```java
class Student {
    String name;
    double gpa;
    
    Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }
}

List<Student> students = new ArrayList<>();
students.add(new Student("An", 8.5));
students.add(new Student("Bình", 9.0));

for (Student s : students) {
    System.out.println(s.name + ": " + s.gpa);
}
```

---

## 6. Sắp xếp List

### Sắp xếp với Collections.sort()
```java
import java.util.Collections;

List<Integer> numbers = new ArrayList<>(Arrays.asList(5, 2, 8, 1, 9));

// Sắp xếp tăng dần
Collections.sort(numbers);
System.out.println(numbers);  // [1, 2, 5, 8, 9]

// Sắp xếp giảm dần
Collections.sort(numbers, Collections.reverseOrder());
System.out.println(numbers);  // [9, 8, 5, 2, 1]
```

### Sắp xếp với Comparator
```java
List<Student> students = new ArrayList<>();
students.add(new Student("An", 8.5));
students.add(new Student("Bình", 9.0));
students.add(new Student("Châu", 7.5));

// Sắp xếp theo GPA giảm dần
students.sort((s1, s2) -> Double.compare(s2.gpa, s1.gpa));
```

---

## 7. So sánh ArrayList và LinkedList

| Tiêu chí | ArrayList | LinkedList |
|----------|-----------|------------|
| Cấu trúc | Mảng động | Danh sách liên kết |
| Truy cập (get) | O(1) - Nhanh | O(n) - Chậm |
| Thêm/Xóa đầu | O(n) - Chậm | O(1) - Nhanh |
| Thêm/Xóa cuối | O(1) - Nhanh | O(1) - Nhanh |
| Bộ nhớ | Ít hơn | Nhiều hơn |

### Khi nào dùng?
- **ArrayList**: Truy cập nhiều, thêm/xóa cuối
- **LinkedList**: Thêm/xóa đầu/giữa nhiều

---

## 8. Ví dụ thực tế

### Quản lý danh sách sản phẩm
```java
import java.util.*;

class Product {
    String name;
    double price;
    
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
}

public class Main {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();
        
        // Thêm sản phẩm
        products.add(new Product("Laptop", 25000000));
        products.add(new Product("Phone", 15000000));
        products.add(new Product("Tablet", 10000000));
        
        // Tính tổng giá trị
        double total = 0;
        for (Product p : products) {
            total += p.price;
        }
        System.out.println("Tổng: " + total);
        
        // Tìm sản phẩm đắt nhất
        Product maxProduct = products.get(0);
        for (Product p : products) {
            if (p.price > maxProduct.price) {
                maxProduct = p;
            }
        }
        System.out.println("Đắt nhất: " + maxProduct.name);
    }
}
```

---

## Tổng kết

| Phương thức | Mô tả |
|-------------|-------|
| `add(e)` | Thêm phần tử vào cuối |
| `add(index, e)` | Thêm phần tử vào vị trí |
| `get(index)` | Lấy phần tử tại vị trí |
| `set(index, e)` | Cập nhật phần tử |
| `remove(index)` | Xóa phần tử theo vị trí |
| `remove(e)` | Xóa phần tử theo giá trị |
| `size()` | Lấy số phần tử |
| `contains(e)` | Kiểm tra tồn tại |
| `indexOf(e)` | Tìm vị trí phần tử |
| `clear()` | Xóa tất cả |
