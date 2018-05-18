package com.example.dgl.recipizeras;

/**
 * Created by dgl on 09-05-2018.
 */

public class Ingredient {
    public String name;
    public String amount;
    public String unit;

    public Ingredient(String name, String amount, String unit){
        this.name = name;
        this.amount = amount;
        this.unit = unit;

    }

    @Override
    public String toString(){
        return this.name + " " + this.amount + " " + unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
