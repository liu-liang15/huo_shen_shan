package com.example.model.servers.hyj;

import com.example.model.dao.hyj.AssayBlipMapper;
import com.example.model.pojos.hyj.AssayBlip;
import com.example.model.pojos.hyj.AssayMeal;
import com.example.model.pojos.hyj.AssayMealBlip;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AssayBlipService {
    @Resource
    AssayBlipMapper assayBlipMapper;
    public void addMealBlip(AssayMealBlip assayMealBlip){
        assayBlipMapper.addMealBlip(assayMealBlip);
    };
    public List<AssayMealBlip> findMealBlip(){
        return assayBlipMapper.findMealBlip();
    }
    public void delMealBlip(AssayMeal assayMeal){
        assayBlipMapper.delMealBlip(assayMeal);
    }
}
