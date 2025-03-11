package com.example.SystemDesign.DecoratorDesignPattern.AdditionFeature;

import com.example.SystemDesign.DecoratorDesignPattern.Base.BaseCar;

public class SunRoofFeature extends Features{

    public BaseCar baseCar;
    public SunRoofFeature(BaseCar baseCar){
        this.baseCar = baseCar;
    }

    @Override
    public int cost() {
        return baseCar.cost() + 750; // 750 extra for sunroof feature...
    }
}
