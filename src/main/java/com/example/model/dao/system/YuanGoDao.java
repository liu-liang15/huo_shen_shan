package com.example.model.dao.system;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.model.pojos.system.YuanGo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface YuanGoDao extends BaseMapper<YuanGo> {
    int deleteByPrimaryKey(Integer ygId);

    int insert(YuanGo record);

    int insertSelective(YuanGo record);

    List<YuanGo> selectByAll();

    int updateByPrimaryKeySelective(YuanGo record);

    int updateByPrimaryKey(YuanGo record);
}