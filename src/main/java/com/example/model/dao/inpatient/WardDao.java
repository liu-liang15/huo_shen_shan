package com.example.model.dao.inpatient;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface WardDao {
    //新增病房
    public void addWard();
}
