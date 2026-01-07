# Phương thức toString() trong Java

## Giới thiệu
`toString()` là phương thức của class `Object` (class cha của tất cả các class trong Java). Phương thức này trả về biểu diễn String của một object, rất hữu ích khi debug hoặc hiển thị thông tin.

---

## 1. toString() mặc định

Mọi object đều có method `toString()` kế thừa từ `Object`:

```java
class Student {
    String name;
    int age;
    
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

Student sv = new Student("An", 20);
System.out.println(sv.toString());
// Output: Student@1b6d3586 (tên class + @ + hashcode)

// Khi dùng println, toString() được gọi tự động
System.out.println(sv);  // Tương đương sv.toString()
```

---

## 2. Override toString()

Để hiển thị thông tin có ý nghĩa, cần **override** method `toString()`:

```java
class Student {
    String name;
    int age;
    double gpa;
    
    Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    
    @Override
    public String toString() {
        return "Student{name='" + name + "', age=" + age + ", gpa=" + gpa + "}";
    }
}

Student sv = new Student("An", 20, 8.5);
System.out.println(sv);
// Output: Student{name='An', age=20, gpa=8.5}
```

---

## 3. Các cách viết toString()

### Cách 1: Nối chuỗi đơn giản
```java
@Override
public String toString() {
    return "Student{name='" + name + "', age=" + age + "}";
}
```

### Cách 2: Dùng String.format()
```java
@Override
public String toString() {
    return String.format("Student{name='%s', age=%d, gpa=%.2f}", 
                         name, age, gpa);
}
```

### Cách 3: Dùng StringBuilder (hiệu quả hơn)
```java
@Override
public String toString() {
    return new StringBuilder()
        .append("Student{")
        .append("name='").append(name).append("'")
        .append(", age=").append(age)
        .append(", gpa=").append(gpa)
        .append("}")
        .toString();
}
```

---

## 4. toString() với các kiểu dữ liệu

### Wrapper classes
```java
Integer num = 123;
System.out.println(num.toString());  // "123"

Double d = 3.14;
System.out.println(d.toString());  // "3.14"

Boolean b = true;
System.out.println(b.toString());  // "true"
```

### Arrays
```java
int[] arr = {1, 2, 3, 4, 5};

// toString() mặc định - không hữu ích
System.out.println(arr.toString());  // [I@1b6d3586

// Dùng Arrays.toString()
System.out.println(Arrays.toString(arr));  // [1, 2, 3, 4, 5]

// Mảng 2D
int[][] matrix = {{1, 2}, {3, 4}};
System.out.println(Arrays.deepToString(matrix));  // [[1, 2], [3, 4]]
```

### Collections
```java
List<String> list = Arrays.asList("A", "B", "C");
System.out.println(list.toString());  // [A, B, C]

Map<String, Integer> map = new HashMap<>();
map.put("a", 1);
map.put("b", 2);
System.out.println(map.toString());  // {a=1, b=2}
```

---

## 5. toString() trong Class lồng nhau

```java
class Address {
    String city;
    String street;
    
    Address(String city, String street) {
        this.city = city;
        this.street = street;
    }
    
    @Override
    public String toString() {
        return "Address{city='" + city + "', street='" + street + "'}";
    }
}

class Person {
    String name;
    Address address;
    
    Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    
    @Override
    public String toString() {
        return "Person{name='" + name + "', address=" + address + "}";
    }
}

Address addr = new Address("Hà Nội", "123 Hoàng Hoa Thám");
Person p = new Person("An", addr);
System.out.println(p);
// Output: Person{name='An', address=Address{city='Hà Nội', street='123 Hoàng Hoa Thám'}}
```

---

## 6. toString() với List của Object

```java
class Product {
    String name;
    double price;
    
    Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    @Override
    public String toString() {
        return name + ": " + price + "đ";
    }
}

List<Product> products = new ArrayList<>();
products.add(new Product("Laptop", 25000000));
products.add(new Product("Phone", 15000000));

System.out.println(products);
// Output: [Laptop: 2.5E7đ, Phone: 1.5E7đ]

// In từng sản phẩm
for (Product p : products) {
    System.out.println(p);  // Gọi toString()
}
```

---

## 7. Best Practices

### ✅ Nên làm
```java
// Luôn override toString() cho class quan trọng
@Override
public String toString() {
    return "Student{" +
           "id=" + id +
           ", name='" + name + '\'' +
           ", gpa=" + gpa +
           '}';
}

// Dùng @Override annotation
@Override
public String toString() { ... }
```

### ❌ Không nên làm
```java
// Không bao gồm thông tin nhạy cảm
@Override
public String toString() {
    return "User{password='" + password + "'}";  // Tệ!
}

// Không để null gây lỗi
@Override
public String toString() {
    return name.toUpperCase();  // Lỗi nếu name = null
}

// Cách an toàn hơn
@Override
public String toString() {
    return "User{name='" + (name != null ? name : "N/A") + "'}";
}
```

---

## 8. Ví dụ hoàn chỉnh

```java
class Employee {
    private int id;
    private String name;
    private String department;
    private double salary;
    
    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
    
    @Override
    public String toString() {
        return String.format(
            "Employee[ID=%d, Name=%s, Dept=%s, Salary=%.2f]",
            id, name, department, salary
        );
    }
}

// Sử dụng
Employee emp = new Employee(1, "Nguyễn Văn A", "IT", 15000000);
System.out.println(emp);
// Output: Employee[ID=1, Name=Nguyễn Văn A, Dept=IT, Salary=15000000.00]

// Debug
List<Employee> employees = new ArrayList<>();
employees.add(new Employee(1, "An", "IT", 15000000));
employees.add(new Employee(2, "Bình", "HR", 12000000));
System.out.println("Danh sách nhân viên: " + employees);
```

---

## Tổng kết

| Tình huống | Giải pháp |
|------------|-----------|
| Object tự định nghĩa | Override `toString()` |
| Mảng primitive | `Arrays.toString(arr)` |
| Mảng 2D | `Arrays.deepToString(arr)` |
| Collections | Tự động dùng `toString()` của phần tử |
| Debug | In trực tiếp object với `println()` |
