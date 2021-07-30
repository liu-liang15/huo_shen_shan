package com.example.controller.outpatient;

import com.example.model.pojos.outpatient.Casehistorydetails;
import com.example.model.pojos.outpatient.Seedoctor;
import com.example.model.servers.outpatient.CasehistoryDetailsService;
import com.example.model.servers.outpatient.SeedoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/outpatient")
public class SeedoctorController {
    @Autowired
    SeedoctorService seedoctorService;

    //查询就诊记录
    @GetMapping("/findseedoctor")
    public List<Seedoctor> findseedoctor(String param){
        int i = Integer.parseInt(param);
        return seedoctorService.findseedoctor(i);
    }

}
