# Máy Tính Cơ Bản

## Mô tả bài toán
Viết chương trình nhập vào 2 số nguyên và thực hiện các phép tính cơ bản: cộng, trừ, nhân, chia (chia nguyên), và chia lấy dư.

## Yêu cầu
1. Nhập 2 số nguyên a và b
2. Tính và in ra kết quả 5 phép tính theo format yêu cầu

## Định dạng Input
- Dòng 1: Số nguyên a
- Dòng 2: Số nguyên b (b ≠ 0)

## Định dạng Output
In ra 5 dòng theo thứ tự:
- Dòng 1: `a + b = [kết quả]`
- Dòng 2: `a - b = [kết quả]`
- Dòng 3: `a * b = [kết quả]`
- Dòng 4: `a / b = [kết quả]` (chia nguyên)
- Dòng 5: `a % b = [kết quả]` (chia lấy dư)

## Ví dụ

**Input:**
```
10
3
```

**Output:**
```
10 + 3 = 13
10 - 3 = 7
10 * 3 = 30
10 / 3 = 3
10 % 3 = 1
```

**Input:**
```
8
4
```

**Output:**
```
8 + 4 = 12
8 - 4 = 4
8 * 4 = 32
8 / 4 = 2
8 % 4 = 0
```

## Gợi ý
- Sử dụng `scanner.nextInt()` để nhập số nguyên
- Sử dụng các toán tử `+`, `-`, `*`, `/`, `%`
- Lưu ý: `/` với số nguyên sẽ cho kết quả chia nguyên
