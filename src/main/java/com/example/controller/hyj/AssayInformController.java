package com.example.controller.hyj;

import com.example.model.pojos.hyj.AssayMeal;
import com.example.model.pojos.hyj.AssayPerson;
import com.example.model.pojos.hyj.AssayRes;
import com.example.model.services.hyj.AssayResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class AssayInformController {
    @Autowired
    AssayResService assayResService;
    @RequestMapping("findRes")
    public List<AssayPerson> findRes(@RequestBody AssayPerson assayPerson){
        return assayResService.findRes(assayPerson);
    }
    @RequestMapping("findMealPro")
    public List<AssayMeal> findMealPro(@RequestBody AssayMeal assayMeal){
        return assayResService.findMealPro(assayMeal);
    }
    @RequestMapping("findPersonRes")
    public List<AssayPerson> findPersonRes(){
        return assayResService.findPersonRes();
    }
    @RequestMapping("findEnterRes")
    public List<AssayPerson> findEnterRes(){
        return assayResService.findEnterRes();
    }
    @RequestMapping("addRes")
    public void addRes(@RequestBody AssayRes assayRes){
        assayResService.addRes(assayRes);
    }
    @RequestMapping("editOneK")
    public void editOneK(@RequestBody AssayRes assayRes){
        assayResService.editOneK(assayRes);
    }
    @RequestMapping("editZeroK")
    public void editZeroK(@RequestBody AssayRes assayRes){
        assayResService.editZeroK(assayRes);
    }
    @RequestMapping("delPersonRes")
    public void delPersonRes(@RequestBody AssayRes assayRes){
        assayResService.delPersonRes(assayRes);
    }
}
