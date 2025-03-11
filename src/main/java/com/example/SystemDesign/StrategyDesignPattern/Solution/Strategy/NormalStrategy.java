package com.example.SystemDesign.StrategyDesignPattern.Solution.Strategy;

public class NormalStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("This is normal drive mode....");
    }
}
