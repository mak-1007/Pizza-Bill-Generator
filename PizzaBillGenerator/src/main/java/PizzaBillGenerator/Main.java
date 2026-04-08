package PizzaBillGenerator;

public class Main {

    public static void main(String[] args) {

        Pizza pizza = new Pizza(true);
        pizza.addExtraCheese();
        pizza.addExtraToppings();
        pizza.addTakeAway();

        System.out.println(pizza.getBill());

        System.out.println("------");

        DeluxPizza dp = new DeluxPizza(false);
        dp.addTakeAway();

        System.out.println(dp.getBill());
    }
}