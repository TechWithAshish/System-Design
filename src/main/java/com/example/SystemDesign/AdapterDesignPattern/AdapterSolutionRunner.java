package com.example.SystemDesign.AdapterDesignPattern;

import com.example.SystemDesign.AdapterDesignPattern.Adapter.UtilityAdapter;
import com.example.SystemDesign.AdapterDesignPattern.Service.UtilityService;
import com.example.SystemDesign.AdapterDesignPattern.ThirdPartyService.Service;
import com.example.SystemDesign.SolutionRunner;

public class AdapterSolutionRunner implements SolutionRunner {
    @Override
    public void run() {
        UtilityService utilityService = new UtilityAdapter();
        Service service = new Service();

        System.out.println("Here, both Utility Service and Third party service both are incompatible so we uses Adapter here");

        System.out.println("3rd party service :- "+service.utilityResponse());
        System.out.println("Utility Service which calls 3rd party service response :- "+utilityService.checkBill());
    }
}
