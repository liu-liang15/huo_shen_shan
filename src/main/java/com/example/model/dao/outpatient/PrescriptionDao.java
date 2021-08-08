package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.model.pojos.outpatient.Prescription;
import com.example.model.pojos.outpatient.Prescriptiondetails;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PrescriptionDao extends BaseMapper<Prescription> {
    void insertChufang(Prescription p);

    void insertChufangXQ(Prescriptiondetails p);
}
