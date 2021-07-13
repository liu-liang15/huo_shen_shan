package com.example.controller.inpatient;

import com.example.model.servers.inpatient.WardServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
public class WardController {
    @Autowired
    WardServer wardServer;
    //新增病房
    @PostMapping("/addWard")
    public void addWard(){
        wardServer.addWard();
    }
}
