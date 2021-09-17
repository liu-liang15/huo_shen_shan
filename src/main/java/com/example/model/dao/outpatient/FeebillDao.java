package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.model.pojos.outpatient.Assay;
import com.example.model.pojos.outpatient.Feebill;
import com.example.model.pojos.outpatient.Labworkdetails;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface FeebillDao extends BaseMapper<Feebill> {
    List<Feebill> findFeebillByNo();
    List<Feebill> findAllDFYP();
}
