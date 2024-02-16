package com.driver;

public class DeluxePizza extends Pizza {

    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        this.price = isVeg ? 300 : 400; // set base price for deluxe pizza
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }
}
