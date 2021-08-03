package com.example.model.dao.inpatient;

import com.example.model.pojos.inpatient.DocExe;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DocExeDao {
    //新增待执行医嘱
    public void addDocExe(String param);
    //查看所有医嘱
    public List<DocExe> selDocExe(String param);
    //查看是否有今天医嘱
    public List<DocExe> nowDocExe(String param);

}
