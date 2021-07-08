package com.example.controller;

import com.example.model.pojos.GoYingShang;
import com.example.model.servers.GoYingShangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
public class GoYingShangController {
    @Autowired
    GoYingShangService goYingShangService;

    @RequestMapping("upplier-mgr")
    public List<GoYingShang> findAll(){
        return goYingShangService.findAll();
    }

    @RequestMapping("add-supplier")
    public String addSupplier(@RequestBody GoYingShang goYingShang){
        try {
            goYingShangService.insert(goYingShang);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }
}
