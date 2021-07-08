package com.example.model.dao;

import com.example.model.pojos.GoYingShang;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * GoYingShangDao继承基类
 */
@Mapper
public interface GoYingShangDao{
    List<GoYingShang> findAll();
    void insert(GoYingShang goYingShang);
}
