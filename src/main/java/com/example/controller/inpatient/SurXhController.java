package com.example.controller.inpatient;

import com.example.model.pojos.inpatient.SurXh;
import com.example.model.services.inpatient.SurXhServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class SurXhController {
    @Autowired
    SurXhServer surXhServer;
    //查看对应手术耗材
    @RequestMapping("/selSurXh")
    public List<SurXh> selSurxh(int param){
        return surXhServer.selSurxh(param);
    }
}
