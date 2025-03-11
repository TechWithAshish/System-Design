package com.example.SystemDesign.DecoratorDesignPattern;

import com.example.SystemDesign.DecoratorDesignPattern.AdditionFeature.AlloyWheelFeature;
import com.example.SystemDesign.DecoratorDesignPattern.AdditionFeature.DeluxeSeatFeature;
import com.example.SystemDesign.DecoratorDesignPattern.AdditionFeature.MusicFeature;
import com.example.SystemDesign.DecoratorDesignPattern.AdditionFeature.SunRoofFeature;
import com.example.SystemDesign.DecoratorDesignPattern.Base.BaseCar;
import com.example.SystemDesign.DecoratorDesignPattern.Base.SwiftLXI;
import com.example.SystemDesign.DecoratorDesignPattern.Base.SwiftVXI;
import com.example.SystemDesign.SolutionRunner;

public class DecoratorSolutionRunner implements SolutionRunner {
    @Override
    public void run() {
        BaseCar swiftLXI = new SwiftLXI();
        BaseCar swiftVXI = new SwiftVXI();

        // let's add feature in these base model....
        BaseCar upgradedSwiftLXICar = new AlloyWheelFeature(new MusicFeature(new SunRoofFeature(swiftLXI)));
        System.out.println("So, swiftLXI with alloy wheel, Music system and Sunroof will cost you "+ upgradedSwiftLXICar.cost());
        BaseCar upgradedSwiftVXICar = new DeluxeSeatFeature(new MusicFeature(swiftVXI));
        System.out.println("So, swiftVXI with Deluxe seat and Music system will cost you "+ upgradedSwiftVXICar.cost());

    }
}
