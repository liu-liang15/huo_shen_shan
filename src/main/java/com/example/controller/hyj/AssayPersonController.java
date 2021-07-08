package com.example.controller.hyj;

import com.example.model.pojos.hyj.Assay_person;
import com.example.model.servers.hyj.Assay_maService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping("addPerson")
    public String addPerson(@RequestBody Assay_person assayPerson){
        assayMaService.addPerson(assayPerson);
        return "ok";
    }
}
