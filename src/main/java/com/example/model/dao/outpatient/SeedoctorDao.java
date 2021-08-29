package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.model.pojos.outpatient.Casehistorydetails;
import com.example.model.pojos.outpatient.Seedoctor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SeedoctorDao extends BaseMapper<Seedoctor> {
    List<Seedoctor> findseedoctor(int param);

    void insertJiuZhenJiLu(Seedoctor seedoctor);
}
