package com.example.model.dao.inpatient;

import com.example.model.pojos.inpatient.Ward;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface WardDao {
    //新增病房
    public void addWard(Ward ward);
    //查看病房
    public List<Ward> selWard(String param);
    //修改病房
    public void updateWard(Ward ward);
}
