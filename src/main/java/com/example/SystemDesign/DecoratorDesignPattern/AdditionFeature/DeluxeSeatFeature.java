package com.example.SystemDesign.DecoratorDesignPattern.AdditionFeature;

import com.example.SystemDesign.DecoratorDesignPattern.Base.BaseCar;

public class DeluxeSeatFeature extends Features{
    public BaseCar baseCar;
    public DeluxeSeatFeature(BaseCar baseCar){
        this.baseCar = baseCar;
    }
    @Override
    public int cost() {
        return baseCar.cost() + 500; // 500 extra for good deluxe seat.....
    }
}
