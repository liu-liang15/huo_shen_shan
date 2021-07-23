package com.example.controller.outpatient;

import com.example.model.pojos.outpatient.Casehistory;
import com.example.model.pojos.outpatient.Casehistorydetails;
import com.example.model.servers.outpatient.CasehistoryDetailsService;
import com.example.model.servers.outpatient.CasehistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/outpatient")
public class CasehistoryDetailsController {
    @Autowired
    CasehistoryDetailsService casehistoryDetailsService;

    //查询所有病历
    @GetMapping("/findCasehisDetails")
    public List<Casehistorydetails> findCasehisDetails(String param){
        int i = Integer.parseInt(param);
        return casehistoryDetailsService.findCasehisDetails(i);
    }

}
