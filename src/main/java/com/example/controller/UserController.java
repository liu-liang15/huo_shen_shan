package com.example.controller;

import com.example.model.servers.Assay_maService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@CrossOrigin
@RestController
public class UserController {
    @Autowired
    Assay_maService assayMaService;

    @RequestMapping("/find")
    public Map<String, Object> findPerson(Integer pageNo,Integer size){

        return assayMaService.findAll(pageNo,size);
    }
}
