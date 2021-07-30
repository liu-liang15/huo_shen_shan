package com.example.controller.outpatient;

import com.example.model.pojos.outpatient.Casehistory;
import com.example.model.pojos.outpatient.Hospregcate;
import com.example.model.servers.outpatient.CasehistoryService;
import com.example.model.servers.outpatient.HospregcateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/outpatient")
public class CasehistoryController {
    @Autowired
    CasehistoryService casehistoryService;

    //查询所有病历
    @GetMapping("/findAllCaseHistory")
    public List<Casehistory> findAllCaseHistory(String param){
        return casehistoryService.findAllCaseHistory(param);
    }

}
