package com.example.controller.inpatient;

import com.example.model.pojos.inpatient.BedRec;
import com.example.model.servers.inpatient.BedRecServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class BedRecController {
    @Autowired
    BedRecServer bedRecServer;
    @GetMapping("/selBedRec")
    public List<BedRec> selBedRec(){
        return bedRecServer.selBedRec();
    }
}
