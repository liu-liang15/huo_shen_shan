package com.example.controller.hyj;

import com.example.model.pojos.hyj.AssayPro;
import com.example.model.servers.hyj.AssayProService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class AssayProController {
    @Autowired
    AssayProService assayProService;
    @RequestMapping("findAll")
    public List<AssayPro> findAll(){
        return assayProService.findAll();
    }
    @RequestMapping("del")
    public String del(@RequestBody AssayPro assayPro){
        assayProService.del(assayPro);
        return "ok";
    }
    @RequestMapping("update")
    public String update(@RequestBody AssayPro assayPro){
        assayProService.update(assayPro);
        return "ok";
    }
    @RequestMapping("findById")
    public AssayPro findById(@RequestBody AssayPro assayPro){
        return assayProService.findById(assayPro);
    }
    @RequestMapping("insert")
    public void insert(@RequestBody AssayPro assayPro){
        assayProService.insert(assayPro);
    }
}
