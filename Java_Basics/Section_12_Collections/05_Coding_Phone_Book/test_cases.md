# Test Cases - Phone Book

## TC1 (Visible)

### Input
```
3
An 0901234567
Binh 0912345678
Chau 0923456789
Binh
```

### Expected Output
```
0912345678
```

---

## TC2 (Visible)

### Input
```
2
Nam 0987654321
Lan 0976543210
Hung
```

### Expected Output
```
Not found
```

---

## TC3 (Visible)

### Input
```
4
Alice 1234567890
Bob 0987654321
Charlie 1122334455
David 5566778899
Alice
```

### Expected Output
```
1234567890
```

---

## TC4 (Hidden)

### Input
```
1
Test 1111111111
Test
```

### Expected Output
```
1111111111
```

---

## TC5 (Hidden)

### Input
```
3
A 111
B 222
C 333
D
```

### Expected Output
```
Not found
```

---

## TC6 (Hidden)

### Input
```
5
An 1111
Binh 2222
Chau 3333
Dung 4444
Em 5555
Em
```

### Expected Output
```
5555
```
