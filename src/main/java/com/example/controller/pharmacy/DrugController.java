package com.example.controller.pharmacy;

import com.example.model.pojos.pharmacy.*;
import com.example.model.servers.pharmacy.DrugService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class DrugController {
    @Autowired
    DrugService drugService;

    @RequestMapping("spec")
    public   List<YaoPingGg> findAllSpec(){
        return drugService.findAllSpec();
    };
    @RequestMapping("sort")
    public  List<YaoPingLb> findAllSort(){
        return drugService.findAllSort();
    };
    @RequestMapping("type")
    public List<YaoPingLx> findAllType(){
        return drugService.findAllType();
    };
    @RequestMapping("drug")
    public  List<YaoPingXx> findAllDrug(@RequestBody YaoPingXx yaoPingXx){
        System.out.println(yaoPingXx.getDrugState());
        return drugService.findAllDrug(yaoPingXx);
    };
}
