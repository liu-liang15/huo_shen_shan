package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.model.pojos.outpatient.Casehistory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CasehistoryDao extends BaseMapper<Casehistory> {
    List<Casehistory> findAllCaseHistory(String param);
}
