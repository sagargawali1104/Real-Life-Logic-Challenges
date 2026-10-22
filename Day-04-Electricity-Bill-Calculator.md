# ⚡ Day 4: Electricity Bill Calculator

**Difficulty:** Basic  
**Language:** Java  
**Series:** Code Army — Real-Life Logic Building

## 📌 Problem Statement

Create an Electricity Bill Calculator using Java. The program accepts the number of electricity units consumed and calculates the total bill based on the following rates.

## 💰 Electricity Charges

- First 100 units: ₹5 per unit
- Next 100 units (101–200): ₹7 per unit
- Above 200 units: ₹10 per unit
- Fixed charge: ₹50

**Important:** These are progressive slab rates. Each rate applies only to the units within that slab.

## 📋 Requirements

1. Accept electricity units consumed from the user.
2. Reject negative units.
3. Calculate charges using the correct slabs.
4. Add the fixed charge of ₹50.
5. Display the units consumed, energy charges, fixed charge, and final bill.

## 🧮 Formula

Final Bill = Energy Charges + Fixed Charge

## 🧪 Examples

### Example 1

Input:
- Units consumed: 80

Calculation:
- Energy charges = 80 × ₹5 = ₹400
- Fixed charge = ₹50

Output:
- Energy Charges: ₹400
- Fixed Charge: ₹50
- Final Bill: ₹450

### Example 2

Input:
- Units consumed: 150

Calculation:
- First 100 units = 100 × ₹5 = ₹500
- Next 50 units = 50 × ₹7 = ₹350
- Fixed charge = ₹50

Output:
- Energy Charges: ₹850
- Fixed Charge: ₹50
- Final Bill: ₹900

### Example 3

Input:
- Units consumed: 250

Calculation:
- First 100 units = 100 × ₹5 = ₹500
- Next 100 units = 100 × ₹7 = ₹700
- Remaining 50 units = 50 × ₹10 = ₹500
- Fixed charge = ₹50

Output:
- Energy Charges: ₹1700
- Fixed Charge: ₹50
- Final Bill: ₹1750

### Example 4: Invalid Input

Input:
- Units consumed: -10

Output:
- Invalid units consumed

## 🎯 Challenge

Implement this program in Java using `Scanner`, variables, arithmetic operators, `if-else` conditions, and input validation.

Try solving the problem yourself before checking a solution.

---

**Code Army | Learn • Practice • Revise • Improve**
