package com.example.SystemDesign.StrategyDesignPattern.Solution.Strategy;

public class SportyStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("This is sport drive mode.....");
    }
}
