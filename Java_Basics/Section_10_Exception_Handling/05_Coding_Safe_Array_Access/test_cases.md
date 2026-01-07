# Test Cases - Safe Array Access

## TC1 (Visible)

### Input
```
5
10 20 30 40 50
2
```

### Expected Output
```
30
```

---

## TC2 (Visible)

### Input
```
3
1 2 3
10
```

### Expected Output
```
Error: Index out of bounds
```

---

## TC3 (Visible)

### Input
```
4
5 10 15 20
-1
```

### Expected Output
```
Error: Index out of bounds
```

---

## TC4 (Hidden)

### Input
```
5
100 200 300 400 500
0
```

### Expected Output
```
100
```

---

## TC5 (Hidden)

### Input
```
5
100 200 300 400 500
4
```

### Expected Output
```
500
```

---

## TC6 (Hidden)

### Input
```
5
100 200 300 400 500
5
```

### Expected Output
```
Error: Index out of bounds
```

---

## TC7 (Hidden)

### Input
```
1
42
0
```

### Expected Output
```
42
```
