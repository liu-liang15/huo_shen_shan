package com.example.model.dao.system;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.model.pojos.system.KeShi;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface KeShiDao extends BaseMapper<KeShi> {
    List<KeShi> selectQb(String shou);
}
