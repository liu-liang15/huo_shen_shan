package com.example.model.dao.hyj;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.model.pojos.hyj.AssayBlip;
import com.example.model.pojos.hyj.AssayMealBlip;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AssayBlipMapper {

    public void addMealBlip(AssayMealBlip assayMealBlip);

    public List<AssayMealBlip> findMealBlip();

    public void delMealBlip(AssayMealBlip assayMealBlip);
}
