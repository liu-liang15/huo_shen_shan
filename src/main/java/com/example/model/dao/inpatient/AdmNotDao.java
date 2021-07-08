package com.example.model.dao.inpatient;

import com.example.model.pojos.inpatient.AdmNot;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdmNotDao {
    //查询所有住院通知单
    List<AdmNot> selAdm(String param);
}
