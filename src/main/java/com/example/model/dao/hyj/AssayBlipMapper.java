package com.example.model.dao.hyj;

import com.example.model.pojos.hyj.AssayMeal;
import com.example.model.pojos.hyj.AssayMealBlip;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AssayBlipMapper {

    public void addMealBlip(AssayMealBlip assayMealBlip);

    public List<AssayMealBlip> findMealBlip();

    public void delMealBlip(AssayMeal assayMeal);
}
