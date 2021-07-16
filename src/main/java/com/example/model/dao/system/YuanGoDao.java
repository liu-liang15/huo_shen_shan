package com.example.model.dao.system;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.model.pojos.system.YuanGo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface YuanGoDao extends BaseMapper<YuanGo> {


    List<YuanGo> selectByAll01();

    List<YuanGo> selectByAll02();

}