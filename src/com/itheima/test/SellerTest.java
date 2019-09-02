package com.itheima.test;

import com.itheima.decorator.Decorator;
import com.itheima.item.Coconut;
import com.itheima.item.MilkTea;
import com.itheima.item.Pearl;
import com.itheima.seller.Beverage;

import java.util.ArrayList;

public class SellerTest {

    public static void main(String[] args) {
        Beverage beverage = new MilkTea();
        Decorator decorator = new Pearl(beverage);
        System.out.println(decorator.cost());
        Decorator decorator1 = new Coconut(decorator);
        System.out.println(decorator1.cost());

        int[] ints = new int[4];

        ArrayList<String> strings = new ArrayList<>();

    }
}
