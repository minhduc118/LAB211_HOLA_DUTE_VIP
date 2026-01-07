# Test Cases - String to Number

## TC1 (Visible)

### Input
```
123
```

### Expected Output
```
123
```

---

## TC2 (Visible)

### Input
```
abc
```

### Expected Output
```
Error: Invalid number format
```

---

## TC3 (Visible)

### Input
```
-456
```

### Expected Output
```
-456
```

---

## TC4 (Hidden)

### Input
```
12.5
```

### Expected Output
```
Error: Invalid number format
```

---

## TC5 (Hidden)

### Input
```
0
```

### Expected Output
```
0
```

---

## TC6 (Hidden)

### Input
```
999999
```

### Expected Output
```
999999
```

---

## TC7 (Hidden)

### Input
```
12abc
```

### Expected Output
```
Error: Invalid number format
```

---

## TC8 (Hidden)

### Input
```

```

### Expected Output
```
Error: Invalid number format
```
