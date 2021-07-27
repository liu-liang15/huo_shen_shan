package com.example.controller.inpatient;

import com.alibaba.fastjson.JSON;
import com.example.model.pojos.inpatient.SurDrug;
import com.example.model.pojos.inpatient.SurItem;
import com.example.model.pojos.inpatient.SurXh;
import com.example.model.servers.inpatient.SurItemServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class SurItemController {
    @Autowired
    SurItemServer surItemServer;
    //新增手术
    @PostMapping("/addSur")
    public void addSur(@RequestBody Map<String,Object>map){
        String str= JSON.toJSONString(map.get("sur"));
        SurItem surItem=JSON.parseObject(str,SurItem.class);
        String str2= JSON.toJSONString(map.get("surXhs"));
        List<SurXh>list=JSON.parseArray(str2,SurXh.class);
        String str3= JSON.toJSONString(map.get("surDrug"));
        List<SurDrug>list2=JSON.parseArray(str3,SurDrug.class);
        surItemServer.addSur(surItem,list,list2);
    }
    //查看手术
    @GetMapping("/selSur")
    public List<SurItem> selSur(){
        return surItemServer.selSur();
    }
    //修改手术
    @PostMapping("/upDateSur")
    public void upDateSur(@RequestBody Map<String,Object>map){
        String str= JSON.toJSONString(map.get("sur"));
        SurItem surItem=JSON.parseObject(str,SurItem.class);
        String str2= JSON.toJSONString(map.get("surXhs"));
        List<SurXh>list=JSON.parseArray(str2,SurXh.class);
        String str3= JSON.toJSONString(map.get("surDrug"));
        List<SurDrug>list2=JSON.parseArray(str3,SurDrug.class);
        surItemServer.upDateSur(surItem,list,list2);
    }
}
