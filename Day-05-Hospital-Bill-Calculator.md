# 🏥 Day 5: Hospital Appointment & Bill Calculator

**Difficulty:** Basic to Medium  
**Language:** Java  
**Series:** Code Army — Real-Life Logic Building

## 📌 Problem Statement

Create a Hospital Consultation Bill Calculator using Java.

The program accepts the patient's name, consultation type, and number of medical tests. It calculates the consultation fee, test charges, discount, and final amount payable.

## 💰 Hospital Charges

| Consultation Type | Consultation Fee |
|---|---:|
| General | ₹300 |
| Specialist | ₹700 |
| Emergency | ₹1500 |

**Additional Charges:**
- Each medical test costs ₹200.
- If the total bill before discount is more than ₹2000, apply a 10% discount.
- Otherwise, no discount is applied.

## 📋 Requirements

1. Accept the patient's name.
2. Accept the consultation type.
3. Accept the number of medical tests.
4. Reject invalid consultation types.
5. Reject negative test quantities.
6. Calculate the consultation fee.
7. Calculate the total test charges.
8. Calculate the total bill before discount.
9. Apply the discount according to the rules.
10. Display the patient's name, consultation fee, test charges, discount, and final bill.

## 🧮 Formulas

Total Test Charges = Number of Tests × ₹200

Total Bill = Consultation Fee + Test Charges

Discount = Total Bill × 10 / 100 (only when Total Bill > ₹2000)

Final Bill = Total Bill − Discount

## 🧪 Examples

### Example 1: General Consultation

**Input:**
- Patient Name: Rahul
- Consultation Type: General
- Number of Tests: 2

**Output:**
```text
Patient Name: Rahul
Consultation Fee: ₹300
Test Charges: ₹400
Total Bill: ₹700
Discount: ₹0
Final Bill: ₹700
```

### Example 2: Specialist Consultation

**Input:**
- Patient Name: Priya
- Consultation Type: Specialist
- Number of Tests: 8

**Output:**
```text
Patient Name: Priya
Consultation Fee: ₹700
Test Charges: ₹1600
Total Bill: ₹2300
Discount: ₹230
Final Bill: ₹2070
```

### Example 3: Emergency Consultation

**Input:**
- Patient Name: Amit
- Consultation Type: Emergency
- Number of Tests: 4

**Output:**
```text
Patient Name: Amit
Consultation Fee: ₹1500
Test Charges: ₹800
Total Bill: ₹2300
Discount: ₹230
Final Bill: ₹2070
```

### Example 4: Invalid Consultation Type

**Input:**
```text
Consultation Type: Normal
```

**Output:**
```text
Invalid consultation type
```

### Example 5: Invalid Test Quantity

**Input:**
```text
Number of Tests: -2
```

**Output:**
```text
Invalid number of tests
```

## 🎯 Challenge

Implement this program in Java.

**Concepts Practised:**
- Scanner
- Variables and data types
- String methods
- if-else conditions
- Arithmetic operators
- Percentage calculation
- Input validation

**Code Army | Learn • Practice • Revise • Improve**
