package com.example.model.dao.system;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.model.pojos.system.QuanXian;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author 刘亮
 * @date 2021年 07月22日16:51
 */
@Mapper
public interface QuanXianDao extends BaseMapper<QuanXian> {
    /**
     * 查询岗位所拥有的权限
     * @param parentId
     * @param gwId
     * @return
     */
    List<QuanXian> getqx33(@Param("parentId") String parentId,@Param("gwId") String gwId);
}
