package com.example.controller.inpatient;

import com.example.model.pojos.inpatient.BedCzRec;
import com.example.model.servers.inpatient.BedCzRecServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class BedCzRecController {
    @Autowired
    BedCzRecServer bedCzRecServer;
    @GetMapping("/selBedCzRec")
    public List<BedCzRec> selBedCzRec(){
        return bedCzRecServer.selBedCzRec();
    }
}
