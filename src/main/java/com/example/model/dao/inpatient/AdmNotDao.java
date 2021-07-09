package com.example.model.dao.inpatient;

import com.example.model.pojos.inpatient.AdmNot;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AdmNotDao {
    //查询住院通知单
    public List<AdmNot> selAdm(String param);
    //修改住院通知单状态
    public void alterAdm(String hosNo);
}
