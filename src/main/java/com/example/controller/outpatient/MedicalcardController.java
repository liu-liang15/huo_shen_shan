package com.example.controller.outpatient;

import com.example.model.pojos.outpatient.Medicalcard;
import com.example.model.servers.outpatient.MedicalcardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/outpatient")
public class MedicalcardController {
    @Autowired
    MedicalcardService medicalcardService;

    @GetMapping("/findAllMedicalcard")
    public List<Medicalcard> findAllMedicalcard(String param){
        return medicalcardService.findAllMedicalcard(param);
    }
}
