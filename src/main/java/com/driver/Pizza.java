package com.driver;

public class Pizza {

    protected int price;
    protected Boolean isVeg;
    protected String bill;
    protected boolean extraCheeseAdded;
    protected boolean extraToppingsAdded;
    protected boolean paperBagAdded;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        this.price = isVeg ? 300 : 400; // set base price for regular pizza
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if (!extraCheeseAdded) {
            this.price += 80;
            this.bill += "Extra Cheese Added: 80\n";
            extraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if (!extraToppingsAdded) {
            this.price += isVeg ? 70 : 120;
            this.bill += "Extra Toppings Added: " + (isVeg ? 70 : 120) + "\n";
            extraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        if (!paperBagAdded) {
            this.price += 20;
            this.bill += "Paperbag Added: 20\n";
            paperBagAdded = true;
        }
    }

    public String getBill(){
        // your code goes here
        this.bill += "Total Price: " + this.price + "\n";
        return this.bill;
    }
}
