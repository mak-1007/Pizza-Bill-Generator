package PizzaBillGenerator;

public class DeluxPizza extends  Pizza{

    public DeluxPizza(boolean isVeg){
        super(isVeg);
        addExtraCheese();
        addExtraToppings();

    }

}
