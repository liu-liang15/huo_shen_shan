package com.example.controller.outpatient;

import com.alibaba.fastjson.JSONObject;
import com.example.model.pojos.outpatient.Hospreg;
import com.example.model.pojos.outpatient.Patient;
import com.example.model.servers.outpatient.HospregService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/outpatient")
public class HospregController {
    @Autowired
    HospregService hopregService;

    //查询所有挂号记录
    @GetMapping("/findAllHopreg")
    public List<Hospreg> findAllHopreg(String param){
        return hopregService.findAllHopreg(param);
    }

    //新增挂号
    @GetMapping("/insertHospreg")
    public void insertHospreg(String hospreg){
        Hospreg hospreg1 = JSONObject.parseObject(hospreg,Hospreg.class);
        hospreg1.setHoregNo("MZ"+getDateNo());
        hospreg1.setHoregType("初诊");
        hospreg1.setHoregMoney(3);
        hospreg1.setHoregDate(new Date());
        hospreg1.setHoregState(1);
        hospreg1.setHoregOperator("张三");
        System.out.println(hospreg1);
        hopregService.insertHospreg(hospreg1);
    };


    //年月日时分秒
    public String getDateNo(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MMddHHmmss");
        String dateNowStr = sdf.format(d);
        return dateNowStr;
    }
}
