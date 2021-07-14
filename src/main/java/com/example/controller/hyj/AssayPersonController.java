package com.example.controller.hyj;

import com.example.model.pojos.hyj.Assay_person;
import com.example.model.servers.hyj.Assay_maService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
public class AssayPersonController {
    @Autowired
    Assay_maService assayMaService;
    @GetMapping("find")
    public List<Assay_person> findAll(){
        return assayMaService.findAll();
    }
    @RequestMapping("addPerson")
    public String addPerson(@RequestBody Assay_person assayPerson){
        assayMaService.addPerson(assayPerson);
        return "ok";
    }
    @RequestMapping("delPerson")
    public String delPerson(@RequestBody Assay_person assayPerson){
        assayMaService.delPerson(assayPerson);
        return "ok";
    }
    @RequestMapping("likeFindPerson")
    public List<Assay_person> likeFindPerson(@RequestBody Assay_person assayPerson){
        return assayMaService.likeFindPerson(assayPerson);
    }
    @RequestMapping("timeChoose")
    public List<AssayPerson> timeChoose(@RequestBody AssayPerson assayPerson){
        return assayMaService.timeChoose(assayPerson);
    }
}
