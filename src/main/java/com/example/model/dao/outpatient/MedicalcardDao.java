package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.model.pojos.outpatient.Medicalcard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MedicalcardDao extends BaseMapper<Medicalcard> {
    List<Medicalcard> findAllMedicalcard(String param);
}
