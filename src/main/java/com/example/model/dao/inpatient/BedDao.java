package com.example.model.dao.inpatient;

import com.example.model.pojos.inpatient.Bed;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface BedDao {
    //查看床位
    public List<Bed> selBed(String wardNo);
    //新增床位
    public void addBed(Bed bed);
}
