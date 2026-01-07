# Test Cases - Validate Phone

## TC1 (Visible)

### Input
```
0901234567
```

### Expected Output
```
Valid
```

---

## TC2 (Visible)

### Input
```
1234567890
```

### Expected Output
```
Invalid
```

---

## TC3 (Visible)

### Input
```
0312345678
```

### Expected Output
```
Valid
```

---

## TC4 (Hidden)

### Input
```
0512345678
```

### Expected Output
```
Valid
```

---

## TC5 (Hidden)

### Input
```
0112345678
```

### Expected Output
```
Invalid
```

---

## TC6 (Hidden)

### Input
```
090123456
```

### Expected Output
```
Invalid
```

---

## TC7 (Hidden)

### Input
```
09012345678
```

### Expected Output
```
Invalid
```

---

## TC8 (Hidden)

### Input
```
0789999999
```

### Expected Output
```
Valid
```
