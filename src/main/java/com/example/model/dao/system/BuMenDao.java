package com.example.model.dao.system;

import com.example.model.pojos.system.BuMen;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BuMenDao {
    int deleteByPrimaryKey(Integer bmId);

    int insert(BuMen record);

    BuMen selectByPrimaryKey(Integer bmId);

    List<BuMen> selectByAll(String shou);

    int updateByPrimaryKeySelective(BuMen record);

}