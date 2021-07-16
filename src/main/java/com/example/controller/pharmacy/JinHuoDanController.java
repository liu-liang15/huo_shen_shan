package com.example.controller.pharmacy;

import com.example.model.pojos.pharmacy.CaiGoJh;
import com.example.model.pojos.pharmacy.YaoPingXx;
import com.example.model.servers.pharmacy.JinHuoDanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class JinHuoDanController {
    @Autowired
    JinHuoDanService jinHuoDanService;
    @RequestMapping("add-jhd")
    public String addDrug(@RequestBody CaiGoJh caiGoJh){
        try {
            jinHuoDanService.addJHD(caiGoJh);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }

    }
}
