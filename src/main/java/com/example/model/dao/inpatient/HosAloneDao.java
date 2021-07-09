package com.example.model.dao.inpatient;

import com.example.model.pojos.inpatient.HosAlone;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface HosAloneDao {
    //查询住院单
    public List<HosAlone> allHos(String param);
    //新增住院单
    public void addHos(HosAlone hosAlone);
}
