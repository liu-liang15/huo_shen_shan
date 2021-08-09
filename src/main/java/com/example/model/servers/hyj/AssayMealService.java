package com.example.model.servers.hyj;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
    //删除套餐
    public void delMeal(AssayMeal assayMeal){
        assayMealMapper.delMeal(assayMeal);
        assayMealMapper.delMiddle(assayMeal);
    }
    //模糊查找套餐
    public List<AssayMeal> likeFind(AssayMeal assayMeal){
        QueryWrapper<AssayMeal> wrapper = new QueryWrapper<>();
        wrapper.like("assay_meal_name",assayMeal.getAssayMealName());
        return assayMealMapper.selectList(wrapper);
    }
}