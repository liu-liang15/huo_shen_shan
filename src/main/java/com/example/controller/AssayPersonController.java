package com.example.controller;

import com.example.model.servers.Assay_maService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@CrossOrigin
@RestController
public class AssayPersonController {
    @Autowired
    Assay_maService assayMaService;
    @GetMapping("find")
    public Map<String,Object> findPerson(Integer pageNo,Integer size){
        return assayMaService.findAll(pageNo, size);
    }
}
