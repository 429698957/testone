package com.itheima.item;

import com.itheima.decorator.Decorator;
import com.itheima.seller.Beverage;

public class Coconut extends Decorator {
    public Coconut(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost()+2.5;
    }
}
