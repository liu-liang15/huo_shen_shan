package com.example.model.dao.inpatient;

import com.example.model.pojos.inpatient.BedRec;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BedRecDao {
    public void addBedRec(String bedNo,String resNo);
    public List<BedRec> selBedRec(BedRec bedRec);
}
