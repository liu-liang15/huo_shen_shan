package com.example.model.dao.inpatient;

import com.example.model.pojos.inpatient.ConsApp;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ConsAppDao {
    //新增住院手术申请单
    public void addConsApp(ConsApp consApp);
    //查看手术申请单
    public List<ConsApp> selConsApp();
}
