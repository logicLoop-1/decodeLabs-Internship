# ATM Interface

A console-based ATM simulator built in Java, demonstrating **Object-Oriented Programming (OOP)** .

## 📌 About

The goal of this project is to simulate a real ATM interface where a user can authenticate with a PIN, check their balance, deposit money, and withdraw money.

## 🏗️ How it works

1. Startup — Main creates a BankAccount and an ATM, then starts the session.
2. Login — The user enters a PIN (up to 3 tries). ATM passes it to account.validatePin(), which checks it internally and returns just true/false — the actual PIN is never exposed.
3. Menu Loop — ATM repeatedly shows a menu and safely reads the user's choice, re-prompting instead of crashing on invalid input.
4. Transaction — For deposits/withdrawals, ATM reads the amount and hands it to BankAccount, which checks the rules (positive amount, sufficient balance) and returns true/false.
5. Result & Repeat — ATM displays the outcome (success or error) and loops back to the menu until the user chooses to exit.

### Why this structure?

| Class | Responsibility | Knows about |
|---|---|---|
| `BankAccount` | Stores balance & PIN, applies deposit/withdraw rules | Nothing about menus, Scanner, or console output |
| `ATM` | Displays menus, reads user input, validates it | Talks *to* `BankAccount`, never touches its private data directly |
| `Main` | Boots up the program | Only creates a `BankAccount` and an `ATM`, then starts it |

## 🖥️ Sample Session

```
Enter your PIN: 1234
PIN accepted. Welcome!

===== DecodeLabs ATM =====
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Choose an option: 1
Your current balance is: $500.00

===== DecodeLabs ATM =====
1. Check Balance
2. Deposit
3. Withdraw
4. Exit
Choose an option: 3
Enter amount: $9999
Withdrawal failed. Insufficient funds.
```

