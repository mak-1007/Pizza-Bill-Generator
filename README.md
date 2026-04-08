# 🍕 Pizza Bill Generator

A simple Java-based application to generate pizza bills based on user choices like extra cheese, toppings, and takeaway.

---

## 📌 Problem Statement

Ek pizza cafe me do types ke pizza hote hain:

* Regular Pizza
* Deluxe Pizza

Dono pizza ke **veg aur non-veg variants** hote hain.

---

## 💰 Pricing

* Veg Pizza = 300
* Non-Veg Pizza = 400
* Extra Cheese = 80

**Extra Toppings:**

* Veg = 70

* Non-Veg = 120

* Paper Bag = 20

---

## ⚙️ Requirements

* User extra cheese aur toppings add kar sakta hai
* Deluxe pizza me cheese aur toppings **default added** honge
* Same cheez multiple times add karne par price duplicate nahi hona chahiye
* Takeaway ke liye paper bag charge add hoga
* Final bill generate karna hai

---

## 🧱 Classes Used

* `Pizza` → Base class (handles pricing & logic)
* `DeluxPizza` → Inherits Pizza (default cheese + toppings)
* `Main` → Driver class (testing & execution)

---

## 🧠 Concepts Used

* Object-Oriented Programming (OOP)
* Inheritance
* Encapsulation
* Method Design
* Boolean Flags (to prevent duplicate additions)

---

## 📌 Sample Output

```
Base Price: 300
Extra Cheese: 80
Extra Toppings: 70
Paper Bag: 20
Total Price: 470
```

---

## 🚀 How to Run

1. Clone the repository:

```
git clone https://github.com/your-username/pizza-bill-generator.git
```

2. Open in IntelliJ / Eclipse

3. Run the `Main.java` file

---

## 🔍 Features

✔ Prevents duplicate addition of toppings/cheese
✔ Supports veg & non-veg variants
✔ Deluxe pizza auto-adds extras
✔ Clean bill generation
✔ Easy to extend (can add cart, multiple pizzas, etc.)

---

## 📈 Future Improvements

* Add multiple pizza ordering (cart system)
* Convert into Spring Boot REST API
* Add database (MySQL / MongoDB)
* Add UI (Web / Android)

---

## 👨‍💻 Author

**Aman**

---

## ⭐ If you like this project

Give it a ⭐ on GitHub and share it!
