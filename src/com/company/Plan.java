package com.company;

abstract class Plan {
    protected double rate;
    abstract void GetRate();

    public void CalculateBill(int units){
        System.out.println("Value of rate is" + this.rate);
        System.out.println("total bill is" + (units*rate));
    }
}
