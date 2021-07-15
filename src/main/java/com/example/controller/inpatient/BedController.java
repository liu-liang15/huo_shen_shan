package com.example.controller.inpatient;

import com.example.model.pojos.inpatient.Bed;
import com.example.model.servers.inpatient.BedServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class BedController {
    @Autowired
    BedServer bedServer;
    //查看床位
    @GetMapping("/selBed")
    public List<Bed> selBed(String param){
        System.out.println("这是一个"+param);
        return bedServer.selBed(param);
    }
    //新增床位
    @PostMapping("/addBed")
    public void addBed(@RequestBody Bed bed){
        bedServer.addBed(bed);
    }

}
