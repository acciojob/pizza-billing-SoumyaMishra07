package com.driver;

public class Pizza {
    protected int price;
    protected Boolean isVeg;
    protected String bill;
    protected boolean extraCheeseAdded;
    protected boolean extraToppingsAdded;
    protected boolean paperBagAdded;

    public Pizza(Boolean isVeg)
    {
        this.isVeg = isVeg;
        this.price = isVeg ? 300 : 400;
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice()
    {
        return this.price;
    }

    public void addExtraCheese(){
        if (!extraCheeseAdded)
        {
            this.price += 80;
            this.bill += "Extra Cheese Added: 80\n";
            extraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if (!extraToppingsAdded)
        {
            this.price += isVeg ? 70 : 120;
            this.bill += "Extra Toppings Added: " + (isVeg ? 70 : 120) + "\n";
            extraToppingsAdded = true;
        }
    }

    public void addTakeaway()
    {
        if (!paperBagAdded)
        {
            this.price += 20;
            this.bill += "Paperbag Added: 20\n";
            paperBagAdded = true;
        }
    }

    boolean isBill = false;
    public String getBill()
    {
        if(isBill == false){
            isBill = true;
            this.bill += "Total Price: " + this.price + "\n";
            return this.bill;
        }
        return this.bill;
    }
}