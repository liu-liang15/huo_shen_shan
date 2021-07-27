package com.example.controller.inpatient;

import com.example.model.pojos.inpatient.WardRec;
import com.example.model.servers.inpatient.WardRecServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class WardRecController {
    @Autowired
    WardRecServer wardRecServer;
    @GetMapping("/selWardRec")
    //查询病房修改日志
    public List<WardRec> selWardRec(){
        return wardRecServer.selWardRec();
    }
}
