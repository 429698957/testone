package com.itheima.item;

import com.itheima.decorator.Decorator;
import com.itheima.seller.Beverage;

public class Pearl extends Decorator {
    public Pearl(Beverage beverage) {
        super(beverage);
    }

    @Override
    public double cost() {
        return beverage.cost()+3;
    }
}
