package com.itheima.decorator;

import com.itheima.seller.Beverage;

public abstract class Decorator implements Beverage {

    protected Beverage beverage;
    public Decorator(Beverage beverage){
        this.beverage = beverage;
    }
}
