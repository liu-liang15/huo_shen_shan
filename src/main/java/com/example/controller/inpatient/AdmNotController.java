package com.example.controller.inpatient;

import com.example.model.pojos.inpatient.AdmNot;
import com.example.model.services.inpatient.AdmNotServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class AdmNotController {
    @Autowired
    AdmNotServer admNotServer;
    //查询住院单
    @GetMapping("/adm")
    public List<AdmNot> selAdm(String param){
        return admNotServer.allAdm(param);
    }
}
