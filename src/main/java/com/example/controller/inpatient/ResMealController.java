package com.example.controller.inpatient;

import com.alibaba.fastjson.JSON;
import com.example.model.pojos.hyj.AssayMeal;
import com.example.model.pojos.inpatient.DocAdv;
import com.example.model.servers.inpatient.ResMealServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class ResMealController {
    @Autowired
    ResMealServer resMealServer;
    //新增检验项目并新增消费记录
    @PostMapping("/addResMeal")
    public void addDocExe(@RequestBody Map<String,Object>map){
        String str= JSON.toJSONString(map.get("docAdv"));
        DocAdv docAdv =JSON.parseObject(str,DocAdv.class);
        String str2=JSON.toJSONString(map.get("checkHuaYan"));
        List<AssayMeal>list=JSON.parseArray(str2, AssayMeal.class);
        resMealServer.addResMeal(docAdv,list);
    }
}
