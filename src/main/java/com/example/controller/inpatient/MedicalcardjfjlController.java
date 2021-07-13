package com.example.controller.inpatient;

import com.example.model.pojos.inpatient.Medicalcardjfjl;
import com.example.model.servers.inpatient.MedicalcardjfjlServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class MedicalcardjfjlController {
    @Autowired
    MedicalcardjfjlServer meds;
    //新增缴费记录
    @PostMapping("/add-med")
    public void addJfjl(@RequestBody Medicalcardjfjl med){
        meds.addJfjl(med);
    }
    //查询缴费记录
    @PostMapping("selPay")
    public List<Medicalcardjfjl> selPay(@RequestBody Medicalcardjfjl med){
        return meds.selPay(med);
    }
}
