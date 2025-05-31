package com.example.SystemDesign.AdapterDesignPattern.Adapter;

import com.example.SystemDesign.AdapterDesignPattern.Service.UtilityService;
import com.example.SystemDesign.AdapterDesignPattern.ThirdPartyService.Service;

public class UtilityAdapter implements UtilityService {

    private Service service;
    public UtilityAdapter(){
        this.service = new Service();
    }

    @Override
    public String checkBill() {
        String response = service.utilityResponse();
        // modify response according to our application code...
        return response.replaceAll("</?body>", "");
    }
}
