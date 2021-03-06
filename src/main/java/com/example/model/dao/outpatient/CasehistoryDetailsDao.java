package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.model.pojos.outpatient.Casehistorydetails;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CasehistoryDetailsDao extends BaseMapper<Casehistorydetails> {
    List<Casehistorydetails> findCasehisDetails(int param);

    void insertBingLiXQ(Casehistorydetails casehistorydetails);
}
