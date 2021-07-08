package com.example.model.dao.pharmacy;

import com.example.model.pojos.pharmacy.GoYingShang;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface GoYingShangDao {
    //查询所有供应商
    List<GoYingShang> findAll();
    //新增供应商
    void insert(GoYingShang goYingShang);
    //修改供应商信息
    void update(GoYingShang goYingShang);
}
