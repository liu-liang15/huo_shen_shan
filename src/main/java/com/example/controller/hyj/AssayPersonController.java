package com.example.controller.hyj;

import com.example.model.pojos.hyj.AssayPerson;
import com.example.model.services.hyj.AssayMaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class AssayPersonController {
    @Autowired
    AssayMaService assayMaService;
    @GetMapping("find")
    public List<AssayPerson> findAll(){
        return assayMaService.findAll();
    }
    @RequestMapping("addPerson")
    public String addPerson(@RequestBody AssayPerson assayPerson){
        assayMaService.insert(assayPerson);
        return "ok";
    }
    @RequestMapping("delPerson")
    public String delPerson(@RequestBody AssayPerson assayPerson){
        assayMaService.delPerson(assayPerson);
        return "ok";
    }
    @RequestMapping("likeFindPerson")
    public List<AssayPerson> likeFindPerson(@RequestBody AssayPerson assayPerson){
        return assayMaService.likeFindPerson(assayPerson);
    }
    @RequestMapping("timeChoose")
    public List<AssayPerson> timeChoose(@RequestBody AssayPerson assayPerson){
        return assayMaService.timeChoose(assayPerson);
    }
}
