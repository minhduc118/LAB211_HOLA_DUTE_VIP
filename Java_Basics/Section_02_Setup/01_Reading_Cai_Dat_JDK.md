# Cài Đặt JDK (Java Development Kit)

## JDK là gì?
JDK (Java Development Kit) là bộ công cụ cần thiết để phát triển ứng dụng Java, bao gồm:
- **JRE** (Java Runtime Environment): Môi trường chạy Java
- **JVM** (Java Virtual Machine): Máy ảo Java
- **Compiler** (javac): Biên dịch source code
- **Tools**: Các công cụ phát triển

## Bước 1: Tải JDK

### Option 1: Oracle JDK
- Truy cập: [Oracle JDK Download](https://www.oracle.com/java/technologies/downloads/)
- Chọn phiên bản phù hợp với hệ điều hành

### Option 2: OpenJDK (Khuyến nghị)
- Truy cập: [Adoptium](https://adoptium.net/)
- Chọn phiên bản LTS (Long Term Support): Java 17 hoặc 21

## Bước 2: Cài đặt JDK
1. Chạy file installer đã tải
2. Nhấn Next và chọn đường dẫn cài đặt
3. Mặc định: `C:\Program Files\Java\jdk-xx`

## Bước 3: Cấu hình biến môi trường

### Windows:
```
1. Mở System Properties → Advanced → Environment Variables

2. Thêm biến JAVA_HOME:
   - Variable name: JAVA_HOME
   - Variable value: C:\Program Files\Java\jdk-xx

3. Thêm vào PATH:
   - %JAVA_HOME%\bin
```

### macOS/Linux:
```bash
# Thêm vào file ~/.bashrc hoặc ~/.zshrc
export JAVA_HOME=/usr/lib/jvm/java-xx
export PATH=$PATH:$JAVA_HOME/bin

# Áp dụng thay đổi
source ~/.bashrc
```

## Bước 4: Kiểm tra cài đặt

Mở Terminal/Command Prompt và chạy:
```bash
java -version
javac -version
```

**Kết quả mong đợi:**
```
java version "17.0.x" 2024-xx-xx LTS
Java(TM) SE Runtime Environment (build 17.0.x+xx)
Java HotSpot(TM) 64-Bit Server VM (build 17.0.x+xx, mixed mode)
```

✅ Nếu thấy thông tin version, bạn đã cài đặt thành công!
