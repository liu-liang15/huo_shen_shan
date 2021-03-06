package com.example.controller.inpatient;

import com.alibaba.fastjson.JSON;
import com.example.model.pojos.inpatient.Bed;
import com.example.model.pojos.inpatient.BedCzRec;
import com.example.model.services.inpatient.BedServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

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
    public void updateBed(@RequestBody Map<String, Object> map){
        System.out.println("进方法"+map.get("bedRec"));
        String str= JSON.toJSONString(map.get("bed"));
        Bed bed= JSON.parseObject(str,Bed.class);
        String str2= JSON.toJSONString(map.get("bedRec"));
        BedCzRec bedCzRec= JSON.parseObject(str2,BedCzRec.class);

        if(bed.getBedZt().equals("0")){
            bed.setBedZt("1");
            bedCzRec.setBedCzType("停用");
        }else if(bed.getBedZt().equals("1")){
            bed.setBedZt("0");
            bedCzRec.setBedCzType("启用");
        }
        bedServer.updateBed(bed,bedCzRec);
    }
    @PostMapping("/updateBed2")
    public void updateBed2(@RequestBody Bed bed){
        bedServer.updateBed2(bed);
    }
    //查看住院单详情
    @GetMapping("/hosXq")
    public List<Bed> hosXq(String param){
        return bedServer.hosXq(param);
    }
}
