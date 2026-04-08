package PizzaBillGenerator;

public class Pizza {

    // Base prices and charges
    private int basePrice;
    private int cheesePrice = 80;
    private int toppingsPrice;
    private int bagPrice = 20;

    // Final bill and total
    private String bill;
    private int totalPrice;

    // Flags to avoid duplicate additions
    private boolean isCheeseAdded;
    private boolean isToppingsAdded;
    private boolean isBagAdded;
    private boolean isBillGenerated;

    // Constructor to initialize pizza type (veg / non-veg)
    public Pizza(boolean isVeg) {

        if (isVeg) {
            // Veg pizza pricing
            basePrice = 300;
            toppingsPrice = 70;
        } else {
            // Non-veg pizza pricing
            basePrice = 400;
            toppingsPrice = 120;
        }

        // Initial total price = base price
        totalPrice = basePrice;

        // Initialize flags
        isCheeseAdded = false;
        isToppingsAdded = false;
        isBagAdded = false;
        isBillGenerated = false;
    }

    // Add extra cheese only once
    public void addExtraCheese() {
        if (!isCheeseAdded) {
            totalPrice += cheesePrice;
            isCheeseAdded = true;
        }
    }

    // Add extra toppings only once
    public void addExtraToppings() {
        if (!isToppingsAdded) {
            totalPrice += toppingsPrice;
            isToppingsAdded = true;
        }
    }

    // Add takeaway bag charge only once
    public void addTakeAway() {
        if (!isBagAdded) {
            totalPrice += bagPrice;
            isBagAdded = true;
        }
    }

    // Generate and return bill
    public String getBill() {

        // Prevent regenerating bill multiple times
        if (isBillGenerated) {
            return bill;
        }
        //initialize bill
        bill = "";

        // Base price
        bill += "Base Price: " + basePrice + "\n";

        // Optional additions
        if (isCheeseAdded) {
            bill += "Extra Cheese: " + cheesePrice + "\n";
        }

        if (isToppingsAdded) {
            bill += "Extra Toppings: " + toppingsPrice + "\n";
        }

        if (isBagAdded) {
            bill += "Paper Bag: " + bagPrice + "\n";
        }

        // Final total
        bill += "Total Price: " + totalPrice;

        isBillGenerated = true;

        return bill;
    }
}