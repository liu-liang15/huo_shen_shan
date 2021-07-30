package com.example.model.dao.hyj;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.model.pojos.hyj.AssayPro;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AssayProMapper extends BaseMapper<AssayPro> {
    public List<AssayPro> findAllPro();
}
