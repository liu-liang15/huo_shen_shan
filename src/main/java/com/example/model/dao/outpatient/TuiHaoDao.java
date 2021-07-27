package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.model.pojos.outpatient.Tuihao;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TuiHaoDao extends BaseMapper<Tuihao> {
    List<Tuihao> findAllTuiHao(String param);
    void insertTuiHao(Tuihao tuihao);

}
