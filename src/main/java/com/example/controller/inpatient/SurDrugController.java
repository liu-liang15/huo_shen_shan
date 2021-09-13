package com.example.controller.inpatient;

import com.example.model.pojos.inpatient.SurDrug;
import com.example.model.services.inpatient.SurDrugServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class SurDrugController {
    @Autowired
    SurDrugServer surDrugServer;
    //查看对应手术的药品
    @GetMapping("/selSurDrug")
    public List<SurDrug> selSurDrug(long param){
        return surDrugServer.selSurDrug(param);
    }
}
