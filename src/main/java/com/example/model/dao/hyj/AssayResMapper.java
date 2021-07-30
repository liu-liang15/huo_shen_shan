package com.example.model.dao.hyj;

import com.example.model.pojos.hyj.AssayMeal;
import com.example.model.pojos.hyj.AssayPerson;
import com.example.model.pojos.hyj.AssayRes;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AssayResMapper {
    public List<AssayPerson> findRes(AssayPerson assayPerson);
    public List<AssayMeal> findMealPro(AssayMeal assayMeal);
    public List<AssayPerson> findPersonRes();
    public List<AssayPerson> findEnterRes();
    public void addRes(@Param("list") List<AssayRes> assayRes);
    public void editOneK(int assayPersonId);
    public void editZeroK(int assayPersonId);
    public void delPersonRes(AssayRes assayRes);
}
