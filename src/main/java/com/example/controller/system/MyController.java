package com.example.controller.system;

import com.example.model.pojos.system.BuMen;
import com.example.model.pojos.system.YuanGo;
import com.example.model.servers.system.BuMenservers;
import com.example.model.servers.system.YuanGoservers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class MyController {
    @Autowired
    BuMenservers buMenservers;

    @Autowired
    YuanGoservers yuanGoservers;

    @GetMapping("/getbumen")
    public List<BuMen> getbm(){
        return buMenservers.getbm();
    }

    @PostMapping("getyg")
    public List<YuanGo> getYg(){
        return yuanGoservers.getYuanGo();
    }

    @PostMapping("insertBm")
    public int insertyg(@RequestBody BuMen buMen){
        System.err.println(buMen);
        return buMenservers.insert(buMen);
    }


}
