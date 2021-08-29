package com.example.controller.hyj;

import com.example.model.pojos.hyj.AssayBlip;
import com.example.model.pojos.hyj.AssayMeal;
import com.example.model.pojos.hyj.AssayMealBlip;
import com.example.model.servers.hyj.AssayBlipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class AssayBlipController {
    @Autowired
    AssayBlipService assayBlipService;
    @RequestMapping("addMealBlip")
    public void addBlip(@RequestBody AssayMealBlip assayMealBlip){
        assayBlipService.addMealBlip(assayMealBlip);
    }
    @RequestMapping("findMealBlip")
    public List<AssayMealBlip> findMealBlip(){
        return assayBlipService.findMealBlip();
    }
    @RequestMapping("delMealBlip")
    public void delMealBlip(@RequestBody AssayMeal assayMeal){
        assayBlipService.delMealBlip(assayMeal);
    }
}
