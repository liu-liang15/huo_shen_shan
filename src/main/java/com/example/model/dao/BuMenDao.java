package com.example.model.dao;

import com.example.model.pojos.BuMen;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BuMenDao {
    int deleteByPrimaryKey(Integer bmId);

    int insert(BuMen record);

    BuMen selectByPrimaryKey(Integer bmId);

    List<BuMen> selectByAll();

    int updateByPrimaryKeySelective(BuMen record);

}