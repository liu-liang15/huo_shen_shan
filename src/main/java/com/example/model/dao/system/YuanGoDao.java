package com.example.model.dao.system;

import com.example.model.pojos.system.YuanGo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface YuanGoDao {
    int deleteByPrimaryKey(Integer ygId);

    int insert(YuanGo record);

    int insertSelective(YuanGo record);

    List<YuanGo> selectByAll();

    int updateByPrimaryKeySelective(YuanGo record);

    int updateByPrimaryKey(YuanGo record);
}