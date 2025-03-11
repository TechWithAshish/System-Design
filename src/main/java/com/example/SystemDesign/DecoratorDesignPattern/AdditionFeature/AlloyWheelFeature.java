package com.example.SystemDesign.DecoratorDesignPattern.AdditionFeature;

import com.example.SystemDesign.DecoratorDesignPattern.Base.BaseCar;

public class AlloyWheelFeature extends Features{
    public BaseCar baseCar;
    public AlloyWheelFeature(BaseCar baseCar){
        this.baseCar = baseCar;
    }


    @Override
    public int cost() {
        return baseCar.cost() + 1000; // 1000 extra for alloy wheels
    }
}
