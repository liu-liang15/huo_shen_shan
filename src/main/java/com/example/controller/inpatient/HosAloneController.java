package com.example.controller.inpatient;

import com.alibaba.fastjson.JSONObject;
import com.example.model.pojos.inpatient.HosAlone;
import com.example.model.servers.inpatient.HosAloneServer;
import lombok.val;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class HosAloneController {
    @Autowired
    HosAloneServer hosAloneServer;
    @GetMapping("/hos")
    public List<HosAlone> allHos(String param){
        return hosAloneServer.allHos(param);
    }
    @RequestMapping("/add-hos")
    public void addHos(@RequestBody HosAlone hosalone){
        //HosAlone hosAlone = JSONObject.parseObject(hosalone, HosAlone.class);
        hosAloneServer.addHos(hosalone);
    }
}