package com.example.model.servers.hyj;

import com.example.model.dao.hyj.AssayMealMapper;
import com.example.model.pojos.hyj.AssayMeal;
import com.example.model.pojos.hyj.AssayPro;
import com.example.model.pojos.hyj.MealMiddlePro;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AssayMealService {
    @Resource
    AssayMealMapper assayMealMapper;
    public List<AssayMeal> findMeal(){
        return assayMealMapper.findMeal();
    }
    //新增套餐
    public void addMeal(AssayMeal assayMeal){
        assayMealMapper.insert(assayMeal);
        assayMealMapper.addMiddle(assayMeal.getAssayMealId(),assayMeal.getAssayPros());
    }
}
