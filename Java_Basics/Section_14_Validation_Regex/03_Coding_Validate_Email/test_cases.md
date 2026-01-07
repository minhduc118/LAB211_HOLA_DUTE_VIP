# Test Cases - Validate Email

## TC1 (Visible)

### Input
```
test@email.com
```

### Expected Output
```
Valid
```

---

## TC2 (Visible)

### Input
```
invalid.email
```

### Expected Output
```
Invalid
```

---

## TC3 (Visible)

### Input
```
user123@domain.org
```

### Expected Output
```
Valid
```

---

## TC4 (Hidden)

### Input
```
a@b.co
```

### Expected Output
```
Valid
```

---

## TC5 (Hidden)

### Input
```
test@
```

### Expected Output
```
Invalid
```

---

## TC6 (Hidden)

### Input
```
@domain.com
```

### Expected Output
```
Invalid
```

---

## TC7 (Hidden)

### Input
```
user.name+tag@example.com
```

### Expected Output
```
Valid
```

---

## TC8 (Hidden)

### Input
```
test@domain
```

### Expected Output
```
Invalid
```
