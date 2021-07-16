package com.example.controller.inpatient;

import com.example.model.pojos.inpatient.Bed;
import com.example.model.servers.inpatient.BedServer;
import lombok.val;
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
    public List<Bed> selBed(String param,String zt){

        return bedServer.selBed(param,zt);
    }
    //新增床位
    @PostMapping("/addBed")
    public void addBed(@RequestBody Bed bed){
        bedServer.addBed(bed);
    }
    //查看患者与床位
    @GetMapping("/allocBed")
    public List<Bed> allocBed(String param){
        return bedServer.allocBed(param);
    }
    @PostMapping("/updateBed")
    public void updateBed(@RequestBody Bed bed){
        if(bed.getBedZt().equals("0")){
            bed.setBedZt("1");
        }else if(bed.getBedZt().equals("1")){
            bed.setBedZt("0");
        }
        bedServer.updateBed(bed);
    }
    @PostMapping("/updateBed2")
    public void updateBed2(@RequestBody Bed bed){
        bedServer.updateBed2(bed);
    }
}
