package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.model.pojos.outpatient.Assay;
import com.example.model.pojos.outpatient.Labworkdetails;
import com.example.model.pojos.outpatient.Prescription;
import com.example.model.pojos.outpatient.Prescriptiondetails;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AssayDao extends BaseMapper<Assay> {
    void insertAssayCF(Assay assay);

    void insertLabworkdetailsCF(Labworkdetails l);
}
