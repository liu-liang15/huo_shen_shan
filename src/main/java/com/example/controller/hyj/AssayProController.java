package com.example.controller.hyj;

import com.example.model.pojos.hyj.AssayMeal;
import com.example.model.pojos.hyj.AssayPro;
import com.example.model.pojos.hyj.AssayType;
import com.example.model.servers.hyj.AssayMealService;
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
    @Autowired
    AssayMealService assayMealService;
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
    //模糊查询项目列表
    @RequestMapping("likeData")
    public List<AssayPro> likeData(@RequestBody AssayPro assayPro){
        return assayProService.likeData(assayPro);
    }
    //查询项目类型
    @RequestMapping("findType")
    public List<AssayType> findType(){
        return assayProService.findType();
    }
    //项目套餐和项目表多对多查询
    @RequestMapping("findMeal")
    public List<AssayMeal> findMeal(){
        return assayMealService.findMeal();
    }
    @RequestMapping("addMeal")
    public void addMeal(@RequestBody AssayMeal assayMeal){
        assayMealService.addMeal(assayMeal);
    }
}
