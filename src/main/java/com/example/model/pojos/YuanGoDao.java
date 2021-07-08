package com.example.model.pojos;

import com.example.model.pojos.YuanGo;

public interface YuanGoDao {
    int deleteByPrimaryKey(Integer ygId);

    int insert(YuanGo record);

    int insertSelective(YuanGo record);

    YuanGo selectByPrimaryKey(Integer ygId);

    int updateByPrimaryKeySelective(YuanGo record);

    int updateByPrimaryKey(YuanGo record);
}