package com.example.SystemDesign.DecoratorDesignPattern.AdditionFeature;

import com.example.SystemDesign.DecoratorDesignPattern.Base.BaseCar;

public class MusicFeature extends Features{
    public BaseCar baseCar;
    public MusicFeature(BaseCar baseCar){
        this.baseCar = baseCar;
    }
    @Override
    public int cost() {
        return baseCar.cost() + 100; // a hundred rupees extra for music system.
    }
}
