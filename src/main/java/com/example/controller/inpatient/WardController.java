package com.example.controller.inpatient;

import com.example.model.pojos.inpatient.Ward;
import com.example.model.servers.inpatient.WardServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class WardController {
    @Autowired
    WardServer wardServer;
    //新增病房
    @PostMapping("/addWard")
    public void addWard(@RequestBody Ward ward){
        wardServer.addWard(ward);
    }
    //查看病房
    @GetMapping("/ward")
    public List<Ward> selWard(String param){
        return wardServer.selWard(param);
    }
    //修改病房
    @PostMapping("/updateWard")
    public void updateWard(@RequestBody Ward ward){
        wardServer.updateWard(ward);
    }
}
