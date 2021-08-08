package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.model.pojos.outpatient.Assay;
import com.example.model.pojos.outpatient.Examinedetails;
import com.example.model.pojos.outpatient.Examineorder;
import com.example.model.pojos.outpatient.Labworkdetails;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ExamineorderDao extends BaseMapper<Examineorder> {
    void insertExamineorder(Examineorder examineorder);

    void insertExaminedetails(Examinedetails examinedetails);
}
